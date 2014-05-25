/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("ComponentGroup", com.codename1.ui.ComponentGroup.class);
        UIBuilder.registerCustomComponent("Tabs", com.codename1.ui.Tabs.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Dialog", com.codename1.ui.Dialog.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("List", com.codename1.ui.List.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "CheckIn";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("ComponentGroup", com.codename1.ui.ComponentGroup.class);
        UIBuilder.registerCustomComponent("Tabs", com.codename1.ui.Tabs.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Dialog", com.codename1.ui.Dialog.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("List", com.codename1.ui.List.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "CheckIn");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.Label findCol1TitleScratched(Component root) {
        return (com.codename1.ui.Label)findByName("col1TitleScratched", root);
    }

    public com.codename1.ui.Label findCol1TitleScratched() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("col1TitleScratched", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("col1TitleScratched", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findTabAbsent(Component root) {
        return (com.codename1.ui.Container)findByName("tabAbsent", root);
    }

    public com.codename1.ui.Container findTabAbsent() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("tabAbsent", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("tabAbsent", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findCol4TitleScratched(Component root) {
        return (com.codename1.ui.Label)findByName("col4TitleScratched", root);
    }

    public com.codename1.ui.Label findCol4TitleScratched() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("col4TitleScratched", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("col4TitleScratched", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findCol3TitleScratched(Component root) {
        return (com.codename1.ui.Label)findByName("col3TitleScratched", root);
    }

    public com.codename1.ui.Label findCol3TitleScratched() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("col3TitleScratched", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("col3TitleScratched", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findTabPresent(Component root) {
        return (com.codename1.ui.Container)findByName("tabPresent", root);
    }

    public com.codename1.ui.Container findTabPresent() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("tabPresent", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("tabPresent", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findMode(Component root) {
        return (com.codename1.ui.Label)findByName("mode", root);
    }

    public com.codename1.ui.Label findMode() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("mode", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("mode", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findTitlesAbsent(Component root) {
        return (com.codename1.ui.Container)findByName("titlesAbsent", root);
    }

    public com.codename1.ui.Container findTitlesAbsent() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("titlesAbsent", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("titlesAbsent", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findId(Component root) {
        return (com.codename1.ui.Label)findByName("id", root);
    }

    public com.codename1.ui.Label findId() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("id", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("id", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findPrenom(Component root) {
        return (com.codename1.ui.Label)findByName("prenom", root);
    }

    public com.codename1.ui.Label findPrenom() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("prenom", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("prenom", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton(Component root) {
        return (com.codename1.ui.Button)findByName("Button", root);
    }

    public com.codename1.ui.Button findButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findCol2TitleScratched(Component root) {
        return (com.codename1.ui.Label)findByName("col2TitleScratched", root);
    }

    public com.codename1.ui.Label findCol2TitleScratched() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("col2TitleScratched", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("col2TitleScratched", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findCol2TitleAbsent(Component root) {
        return (com.codename1.ui.Label)findByName("col2TitleAbsent", root);
    }

    public com.codename1.ui.Label findCol2TitleAbsent() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("col2TitleAbsent", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("col2TitleAbsent", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel3(Component root) {
        return (com.codename1.ui.Label)findByName("Label3", root);
    }

    public com.codename1.ui.Label findLabel3() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.List findListAbsent(Component root) {
        return (com.codename1.ui.List)findByName("listAbsent", root);
    }

    public com.codename1.ui.List findListAbsent() {
        com.codename1.ui.List cmp = (com.codename1.ui.List)findByName("listAbsent", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.List)findByName("listAbsent", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel2(Component root) {
        return (com.codename1.ui.Label)findByName("Label2", root);
    }

    public com.codename1.ui.Label findLabel2() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findFencerList(Component root) {
        return (com.codename1.ui.Container)findByName("FencerList", root);
    }

    public com.codename1.ui.Container findFencerList() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("FencerList", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("FencerList", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findCol3TitleAbsent(Component root) {
        return (com.codename1.ui.Label)findByName("col3TitleAbsent", root);
    }

    public com.codename1.ui.Label findCol3TitleAbsent() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("col3TitleAbsent", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("col3TitleAbsent", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.List findListPresent(Component root) {
        return (com.codename1.ui.List)findByName("listPresent", root);
    }

    public com.codename1.ui.List findListPresent() {
        com.codename1.ui.List cmp = (com.codename1.ui.List)findByName("listPresent", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.List)findByName("listPresent", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblURL(Component root) {
        return (com.codename1.ui.Label)findByName("lblURL", root);
    }

    public com.codename1.ui.Label findLblURL() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("lblURL", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("lblURL", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel4(Component root) {
        return (com.codename1.ui.Label)findByName("Label4", root);
    }

    public com.codename1.ui.Label findLabel4() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel5(Component root) {
        return (com.codename1.ui.Label)findByName("Label5", root);
    }

    public com.codename1.ui.Label findLabel5() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label5", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label5", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findTitreLigne(Component root) {
        return (com.codename1.ui.Label)findByName("titre_ligne", root);
    }

    public com.codename1.ui.Label findTitreLigne() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("titre_ligne", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("titre_ligne", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findTabScratched(Component root) {
        return (com.codename1.ui.Container)findByName("tabScratched", root);
    }

    public com.codename1.ui.Container findTabScratched() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("tabScratched", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("tabScratched", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findNom(Component root) {
        return (com.codename1.ui.Label)findByName("nom", root);
    }

    public com.codename1.ui.Label findNom() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("nom", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("nom", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel11(Component root) {
        return (com.codename1.ui.Label)findByName("Label11", root);
    }

    public com.codename1.ui.Label findLabel11() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label11", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label11", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findCol4TitleAbsent(Component root) {
        return (com.codename1.ui.Label)findByName("col4TitleAbsent", root);
    }

    public com.codename1.ui.Label findCol4TitleAbsent() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("col4TitleAbsent", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("col4TitleAbsent", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findTitlesScratched(Component root) {
        return (com.codename1.ui.Container)findByName("titlesScratched", root);
    }

    public com.codename1.ui.Container findTitlesScratched() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("titlesScratched", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("titlesScratched", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComponentGroup findComponentGroup(Component root) {
        return (com.codename1.ui.ComponentGroup)findByName("ComponentGroup", root);
    }

    public com.codename1.ui.ComponentGroup findComponentGroup() {
        com.codename1.ui.ComponentGroup cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Tabs findCheckinTabs(Component root) {
        return (com.codename1.ui.Tabs)findByName("checkinTabs", root);
    }

    public com.codename1.ui.Tabs findCheckinTabs() {
        com.codename1.ui.Tabs cmp = (com.codename1.ui.Tabs)findByName("checkinTabs", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Tabs)findByName("checkinTabs", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findTabSettings(Component root) {
        return (com.codename1.ui.Container)findByName("tabSettings", root);
    }

    public com.codename1.ui.Container findTabSettings() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("tabSettings", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("tabSettings", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findEventList(Component root) {
        return (com.codename1.ui.Container)findByName("EventList", root);
    }

    public com.codename1.ui.Container findEventList() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("EventList", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("EventList", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findSource(Component root) {
        return (com.codename1.ui.Label)findByName("source", root);
    }

    public com.codename1.ui.Label findSource() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("source", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("source", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findPaiement(Component root) {
        return (com.codename1.ui.Label)findByName("paiement", root);
    }

    public com.codename1.ui.Label findPaiement() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("paiement", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("paiement", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findClub(Component root) {
        return (com.codename1.ui.Label)findByName("club", root);
    }

    public com.codename1.ui.Label findClub() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("club", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("club", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer41(Component root) {
        return (com.codename1.ui.Container)findByName("Container41", root);
    }

    public com.codename1.ui.Container findContainer41() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container41", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container41", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel(Component root) {
        return (com.codename1.ui.Label)findByName("Label", root);
    }

    public com.codename1.ui.Label findLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.List findListScratched(Component root) {
        return (com.codename1.ui.List)findByName("listScratched", root);
    }

    public com.codename1.ui.List findListScratched() {
        com.codename1.ui.List cmp = (com.codename1.ui.List)findByName("listScratched", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.List)findByName("listScratched", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findCol1TitleAbsent(Component root) {
        return (com.codename1.ui.Label)findByName("col1TitleAbsent", root);
    }

    public com.codename1.ui.Label findCol1TitleAbsent() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("col1TitleAbsent", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("col1TitleAbsent", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPrefURL(Component root) {
        return (com.codename1.ui.TextField)findByName("prefURL", root);
    }

    public com.codename1.ui.TextField findPrefURL() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("prefURL", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("prefURL", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findRanking(Component root) {
        return (com.codename1.ui.Label)findByName("ranking", root);
    }

    public com.codename1.ui.Label findRanking() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("ranking", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("ranking", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.List findCompList(Component root) {
        return (com.codename1.ui.List)findByName("compList", root);
    }

    public com.codename1.ui.List findCompList() {
        com.codename1.ui.List cmp = (com.codename1.ui.List)findByName("compList", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.List)findByName("compList", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComponentGroup findComponentGroup2(Component root) {
        return (com.codename1.ui.ComponentGroup)findByName("ComponentGroup2", root);
    }

    public com.codename1.ui.ComponentGroup findComponentGroup2() {
        com.codename1.ui.ComponentGroup cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup2", aboutToShowThisContainer);
        }
        return cmp;
    }

    protected void exitForm(Form f) {
        if("CheckIn".equals(f.getName())) {
            exitCheckIn(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("EventList".equals(f.getName())) {
            exitEventList(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("SplashDialog".equals(f.getName())) {
            exitSplashDialog(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("FencerList".equals(f.getName())) {
            exitFencerList(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitCheckIn(Form f) {
    }


    protected void exitEventList(Form f) {
    }


    protected void exitSplashDialog(Form f) {
    }


    protected void exitFencerList(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("CheckIn".equals(f.getName())) {
            beforeCheckIn(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("EventList".equals(f.getName())) {
            beforeEventList(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("SplashDialog".equals(f.getName())) {
            beforeSplashDialog(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("FencerList".equals(f.getName())) {
            beforeFencerList(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeCheckIn(Form f) {
    }


    protected void beforeEventList(Form f) {
    }


    protected void beforeSplashDialog(Form f) {
    }


    protected void beforeFencerList(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("CheckIn".equals(c.getName())) {
            beforeContainerCheckIn(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("EventList".equals(c.getName())) {
            beforeContainerEventList(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("SplashDialog".equals(c.getName())) {
            beforeContainerSplashDialog(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("FencerList".equals(c.getName())) {
            beforeContainerFencerList(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerCheckIn(Container c) {
    }


    protected void beforeContainerEventList(Container c) {
    }


    protected void beforeContainerSplashDialog(Container c) {
    }


    protected void beforeContainerFencerList(Container c) {
    }

    protected void postShow(Form f) {
        if("CheckIn".equals(f.getName())) {
            postCheckIn(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("EventList".equals(f.getName())) {
            postEventList(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("SplashDialog".equals(f.getName())) {
            postSplashDialog(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("FencerList".equals(f.getName())) {
            postFencerList(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postCheckIn(Form f) {
    }


    protected void postEventList(Form f) {
    }


    protected void postSplashDialog(Form f) {
    }


    protected void postFencerList(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("CheckIn".equals(c.getName())) {
            postContainerCheckIn(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("EventList".equals(c.getName())) {
            postContainerEventList(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("SplashDialog".equals(c.getName())) {
            postContainerSplashDialog(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("FencerList".equals(c.getName())) {
            postContainerFencerList(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerCheckIn(Container c) {
    }


    protected void postContainerEventList(Container c) {
    }


    protected void postContainerSplashDialog(Container c) {
    }


    protected void postContainerFencerList(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("CheckIn".equals(rootName)) {
            onCreateCheckIn();
            aboutToShowThisContainer = null;
            return;
        }

        if("EventList".equals(rootName)) {
            onCreateEventList();
            aboutToShowThisContainer = null;
            return;
        }

        if("SplashDialog".equals(rootName)) {
            onCreateSplashDialog();
            aboutToShowThisContainer = null;
            return;
        }

        if("FencerList".equals(rootName)) {
            onCreateFencerList();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateCheckIn() {
    }


    protected void onCreateEventList() {
    }


    protected void onCreateSplashDialog() {
    }


    protected void onCreateFencerList() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("CheckIn".equals(f.getName())) {
            getStateCheckIn(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("EventList".equals(f.getName())) {
            getStateEventList(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("SplashDialog".equals(f.getName())) {
            getStateSplashDialog(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("FencerList".equals(f.getName())) {
            getStateFencerList(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateCheckIn(Form f, Hashtable h) {
    }


    protected void getStateEventList(Form f, Hashtable h) {
    }


    protected void getStateSplashDialog(Form f, Hashtable h) {
    }


    protected void getStateFencerList(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("CheckIn".equals(f.getName())) {
            setStateCheckIn(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("EventList".equals(f.getName())) {
            setStateEventList(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("SplashDialog".equals(f.getName())) {
            setStateSplashDialog(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("FencerList".equals(f.getName())) {
            setStateFencerList(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateCheckIn(Form f, Hashtable state) {
    }


    protected void setStateEventList(Form f, Hashtable state) {
    }


    protected void setStateSplashDialog(Form f, Hashtable state) {
    }


    protected void setStateFencerList(Form f, Hashtable state) {
    }

    protected boolean setListModel(List cmp) {
        String listName = cmp.getName();
        if("listAbsent".equals(listName)) {
            return initListModelListAbsent(cmp);
        }
        if("listPresent".equals(listName)) {
            return initListModelListPresent(cmp);
        }
        if("listScratched".equals(listName)) {
            return initListModelListScratched(cmp);
        }
        if("compList".equals(listName)) {
            return initListModelCompList(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelListAbsent(List cmp) {
        return false;
    }

    protected boolean initListModelListPresent(List cmp) {
        return false;
    }

    protected boolean initListModelListScratched(List cmp) {
        return false;
    }

    protected boolean initListModelCompList(List cmp) {
        return false;
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("CheckIn")) {
            if("listAbsent".equals(c.getName())) {
                onCheckIn_ListAbsentAction(c, event);
                return;
            }
            if("listPresent".equals(c.getName())) {
                onCheckIn_ListPresentAction(c, event);
                return;
            }
            if("listScratched".equals(c.getName())) {
                onCheckIn_ListScratchedAction(c, event);
                return;
            }
            if("compList".equals(c.getName())) {
                onCheckIn_CompListAction(c, event);
                return;
            }
            if("prefURL".equals(c.getName())) {
                onCheckIn_PrefURLAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onCheckIn_ButtonAction(c, event);
                return;
            }
        }
    }

      protected void onCheckIn_ListAbsentAction(Component c, ActionEvent event) {
      }

      protected void onCheckIn_ListPresentAction(Component c, ActionEvent event) {
      }

      protected void onCheckIn_ListScratchedAction(Component c, ActionEvent event) {
      }

      protected void onCheckIn_CompListAction(Component c, ActionEvent event) {
      }

      protected void onCheckIn_PrefURLAction(Component c, ActionEvent event) {
      }

      protected void onCheckIn_ButtonAction(Component c, ActionEvent event) {
      }

}
