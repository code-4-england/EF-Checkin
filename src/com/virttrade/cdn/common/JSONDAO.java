/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.virttrade.cdn.common;

import com.codename1.io.ConnectionRequest;
import com.codename1.io.Log;
import com.codename1.io.NetworkManager;
import com.codename1.processing.Result;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

/**
 *
 * @author psmith
 */
public class JSONDAO {
    
    public static final String ACTION_LIST        = "list" ;
    public static final String ACTION_LIST_EVENTS = "listevents" ;
    
    public static final String ACTION_CHECK       = "check" ;
    public static final String ACTION_UNCHECK     = "uncheck" ;
    
    public static final String ACTION_SCRATCH     = "scratch" ;
    public static final String ACTION_UNSCRATCH   = "unscratch" ;
    
    private final Object lock = new Object();
    private final String baseURL;
    private final String action;
    private final String wp;
    
    private boolean dirty = true;
    private Result result;
    
    private final String callbackId;
    private final CallBack callback;
    
    
    public JSONDAO(String callbackId, CallBack callback, String baseURL, String action, String wp)
    {
        this.callbackId = callbackId;
        this.callback = callback;

        this.baseURL = baseURL;
        this.action = action;
        this.wp = wp;

        Log.p("JSONDAO: constructor calling readJSON");
        readJSON();
    }

    //Call to read the data 
    private void readJSON()
    {
        Log.p("readJSON called: dirty = " + dirty);
        
        synchronized(lock)
        {
            if(dirty)
            {
                Log.p("readJSON: creating new connection request");
                ConnectionRequest request = new ConnectionRequest() 
                {
                    @Override
                    protected void readResponse(InputStream input) throws IOException 
                    {
                        result = Result.fromContent(input, Result.JSON);
                        dirty = false;
                    }

                    @Override
                    protected void postResponse() {
                        Log.p("readJSON: postReponse: calling callback");
                        callback.callBack(callbackId);
                    }
                };

                //Create the read list URL
                StringBuffer sb = new StringBuffer(baseURL);
                sb.append("?action=").append(action);
                
                if(ACTION_LIST.equals(action))
                {
                   sb.append("&wp=").append(wp); 
                }
                
                if(ACTION_LIST_EVENTS.equals(action))
                {
                    //No further addition to URI
                }

                request.setUrl(sb.toString());
                request.setContentType("application/json");
                request.addRequestHeader("Accept", "application/json");
                request.setPost(false);
                request.setDuplicateSupported(true);
                    
                NetworkManager.getInstance().addToQueue(request);
            }
            else
            {
                Log.p("readJSON: not creating new connection request");
            }
        }
    }
    
    public Vector filteredRead(String filter)
    {
        Vector filteredResult = new Vector();

        // readJSON() removed here
        //Apply filter here to get the Vector
//        Log.p("filteredRead: filter = " + filter);
        if(result  != null)
        {
            java.util.List dataList = result.getAsArray(filter);
            filteredResult = new Vector(dataList);
        }
        //Turn it in to a Vector

        //Put your code to 
        return filteredResult;
    }

    public boolean check(String id)
    {
        return update(ACTION_CHECK, id);
    }
    
    public boolean uncheck(String id)
    {
        return update(ACTION_UNCHECK, id);
    }
    
    public boolean scratch(String id)
    {
        return update(ACTION_SCRATCH, id);
    }
    
    public boolean unscratch(String id)
    {
        return update(ACTION_UNSCRATCH, id);
    }
    
    private boolean update(String action, String id)
    {
        boolean retVal = false;
        
        synchronized (lock) {

            ConnectionRequest request = new ConnectionRequest() {
                @Override
                protected void readResponse(InputStream input) throws IOException {
                    result = Result.fromContent(input, Result.JSON);
                }
            };
                
            //Create the read list URL
            StringBuffer sb = new StringBuffer(baseURL);
            sb.append("?action=").append(action);
            sb.append("&wp=").append(wp); 
            
            sb.append("&id=").append(id); 

            request.setUrl(sb.toString());
            request.setContentType("application/json");
            request.addRequestHeader("Accept", "application/json");
            request.setPost(false);

            NetworkManager.getInstance().addToQueue(request);
            
            //If successful save
//            dirty = true;
        }
        
        return retVal;
    }

}
