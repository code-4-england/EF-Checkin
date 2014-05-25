/**
 * Your application code goes here
 */
package userclasses;

import com.codename1.io.Log;
import com.codename1.io.Preferences;
import com.codename1.ui.Component;
import com.codename1.ui.Dialog;
import com.codename1.ui.Display;
import com.codename1.ui.Form;
import com.codename1.ui.List;
import com.codename1.ui.Tabs;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.SelectionListener;
import com.codename1.ui.list.DefaultListModel;
import com.codename1.ui.util.Resources;
import com.virttrade.cdn.common.CallBack;
import com.virttrade.cdn.common.JSONDAO;
import generated.StateMachineBase;
import java.util.Hashtable;

/**
 *
 * @author Your name here
 */
public class StateMachine
        extends StateMachineBase
        implements CallBack
{

    private JSONDAO listJSONDAO;
    private JSONDAO listEventsJSONDAO;

    public StateMachine(String resFile)
    {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }

    /**
     * this method should be used to initialize variables instead of the
     * constructor/class scope to avoid race conditions
     */
    @Override
    protected void initVars(Resources res)
    {
        java.util.List entryList;
    }

    private int _buildListModel(List listCmp, String filter)
    {
//        Log.p("_buildListModel: filter = " + filter);
        if (listCmp != null)
        {
            listCmp.setModel(new com.codename1.ui.list.DefaultListModel(getListJsonDAO().filteredRead(filter)));

            int size = listCmp.getModel().getSize();

            Tabs t = findCheckinTabs();

            if (filter.equals("/absent"))
            {
                t.setTabTitle("Absent (" + size + ")", t.getTabIcon(0), 0);
            }
            else if (filter.equals("/present"))
            {
                t.setTabTitle("Present (" + size + ")", t.getTabIcon(1), 1);
            }
            else if (filter.equals("/scratched"))
            {
                t.setTabTitle("Scratched (" + size + ")", t.getTabIcon(2), 2);
            }

            return size;
        }
        else
        {
            Log.p("_buildListModel: listCmp for " + filter + " is null");
            return 0;
        }
    }

    private int _buildListEventsModel(List listCmp, String filter)
    {
        Log.p("_buildListEventsModel: filter = " + filter);
        if (listCmp != null)
        {
            listCmp.setModel(new DefaultListModel(getListEventsJsonDAO().filteredRead(filter)));

            int size = listCmp.getModel().getSize();
            // work out how to select the current row
//            String wp = Preferences.get("wp", null);
//            
//            if (!"0".equals(wp))
//            {
//                int target = Integer.parseInt(wp);
//                
//                for (int i=0;i<listCmp.getModel().getSize();i++)
//                {
//                    Hashtable h = listCmp.getModel().getItemAt(i);
//                    
//                    int id = Integer.parseInt((String) h.get("id"));
//                    
//                    if (id == target) {
//                        listCmp.getModel().setSelectedIndex(i);
//                    }
//                }
//            }
            return size;
        }
        else
        {
            Log.p("_buildListEnventsModel: listCmp is null");
            return 0;
        }
    }

    @Override
    protected void onCheckIn_ListAbsentAction(Component c, ActionEvent event)
    {

//        event.isLongEvent();
        List l = (List) c;

        int i = l.getSelectedIndex();

        Hashtable listItem = (Hashtable) l.getSelectedItem();

        Dialog.show("index: " + i + " id: " + listItem.get("id"), "Hello", "OK", null);

        listJSONDAO.check((String) listItem.get("id"));
        ctrlF5();

//        l.getModel().removeItem(i);
//                listJSONDAO = null;
    }

    @Override
    protected void onCheckIn_CompListAction(Component c, ActionEvent event)
    {

        List compList = (List) c;
        Hashtable item = (Hashtable) compList.getSelectedItem();

        String wp = (String) item.get("id");
        String titre_ligne = (String) item.get("titre_ligne");

        Preferences.set("wp", wp);
        Preferences.set("titre_ligne", titre_ligne);

        setTitles(Display.getInstance().getCurrent());

        Dialog.show("Preference Set", "Competition is now " + titre_ligne, "OK", null);

        ctrlF5();
    }

    @Override
    protected void onCheckIn_ListPresentAction(Component c, ActionEvent event)
    {

        List l = findListPresent();
//        int i = l.getSelectedIndex();
        Hashtable listItem = (Hashtable) l.getSelectedItem();
//        Dialog.show("index: " + i + " id: " + listItem.get("id"), "Hello", "OK", null);   
        listJSONDAO.uncheck((String) listItem.get("id"));
        ctrlF5();
    }

    @Override
    protected boolean initListModelListAbsent(List cmp)
    {
//        Log.p("initListModelListAbsent: calling _buildListModel");
//        return _buildListModel(cmp, "/absent");
        return true;
    }

    @Override
    protected boolean initListModelListPresent(List cmp)
    {
//        Log.p("initListModelListPresent: calling _buildListModel");
//        return _buildListModel(cmp, "/present");
        return true;
    }

    @Override
    protected boolean initListModelListScratched(List cmp)
    {
//        Log.p("initListModelListScratched: calling _buildListModel");
//        return _buildListModel(cmp, "/scratched");
        return true;
    }

    @Override
    protected boolean initListModelCompList(List cmp)
    {
//        Log.p("initListModelCompList: calling _buildListEventsModel");
//        return _buildListEventsModel(cmp, "/events");
        return true;
    }

//    @Override
//    protected void onCheckIn_PrefURLAction(Component c, ActionEvent event)
//    {
//        customEventHandlerClass.myHandleEvent(c, event);
//        _buildListEventsModel(findCompList(), "/events");
//        ctrlF5();
//    }

    @Override
    protected void postCheckIn(Form f)
    {
        Dialog d = (Dialog) createContainer(fetchResourceFile(), "SplashDialog");
        d.setTimeout(1500);

        d.show();

        try
        {
            TextField tf = findPrefURL();
            tf.setText(Preferences.get("URL", "http://svn.englandfencing.org.uk:22080/json.cgi"));
        }
        catch (NullPointerException nullPointerException)
        {
            Log.p("postCheckIn: findPrefURL: Caught a null pointer");
        }

        try
        {
            findCheckinTabs().addSelectionListener(new SelectionListener()
            {
                public void selectionChanged(int oldSelected, int newSelected)
                {
                    Log.p("postCheckIn: SelectionListener: tab selected: " + newSelected);
                    if (newSelected == 3)
                    {
                        _buildListEventsModel(findCompList(), "/events");
                    }
                }
            });
        }
        catch (NullPointerException nullpointerexception)
        {
            Log.p("postCheckIn: findCheckInTabs: Caught a null pointer");
        }

        ctrlF5();
    }

    private JSONDAO getListEventsJsonDAO()
    {
        Log.p("getListEventsJsonDAO starting");
        if (listEventsJSONDAO == null)
        {
            Log.p("getListEventsJsonDAO: DAO was null");
            String url = Preferences.get("URL", "http://svn.englandfencing.org.uk:22080/json.cgi");
            String wp = Preferences.get("wp", "0");

            listEventsJSONDAO = new JSONDAO(JSONDAO.ACTION_LIST_EVENTS, this, url, JSONDAO.ACTION_LIST_EVENTS, wp);

        }
        return listEventsJSONDAO;
    }

    private JSONDAO getListJsonDAO()
    {
        Log.p("getListJsonDAO starting");
        if (listJSONDAO == null)
        {
            Log.p("getListJsonDAO: DAO was null");
            String url = Preferences.get("URL", "http://svn.englandfencing.org.uk:22080/json.cgi");
            String wp = Preferences.get("wp", "1");

            listJSONDAO = new JSONDAO(JSONDAO.ACTION_LIST, this, url, JSONDAO.ACTION_LIST, wp);
        }
        return listJSONDAO;
    }

    private void ctrlF5()
    {
        listJSONDAO = null;

        _buildListModel(findListAbsent(), "/absent");
        _buildListModel(findListPresent(), "/present");
        _buildListModel(findListScratched(), "/scratched");
    }

    public void callBack(final String callbackId)
    {
        Display.getInstance().callSerially(new Runnable()
        {
            public void run()
            {
                if (JSONDAO.ACTION_LIST_EVENTS == callbackId)
                {
                    Log.p("buiding events list from callback");
                    _buildListEventsModel(findCompList(), "/events");
                }
                else
                {
                    Log.p("buiding list models from callback");
                    _buildListModel(findListAbsent(), "/absent");
                    _buildListModel(findListPresent(), "/present");
                    _buildListModel(findListScratched(), "/scratched");
                }
            }
        });
    }

    private void setTitles(Form form)
    {
//        findTitleAbsent()

        String title = Preferences.get("titre_ligne", "");

        form.setTitle(title + " Check In");
    }

    @Override
    protected void beforeCheckIn(Form f)
    {

        setTitles(f);

    }

    @Override
    protected void onCheckIn_ButtonAction(Component c, ActionEvent event)
    {
        TextField tf = findPrefURL();
        String url = tf.getText().trim();

        System.out.println("Name: " + tf.getName());
        System.out.println("New Text: " + url);

        Preferences.set("URL", tf.getText().trim());
        Dialog.show("Preference Set", "URL is now " + url, "OK", null);
        _buildListEventsModel(findCompList(), "/events");
        ctrlF5();
    }
}
