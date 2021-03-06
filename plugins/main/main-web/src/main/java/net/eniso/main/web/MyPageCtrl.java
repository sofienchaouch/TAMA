package net.eniso.main.web;

import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import net.vpc.app.vainruling.core.service.CorePlugin;
import net.vpc.app.vainruling.VrOnPageLoad;
import net.vpc.app.vainruling.VrPage;
import net.eniso.main.service.*;


/**
 * MyPage component implementation.
 * A component is an MVC component defining a Controller (this class), a Model 
 * (sub class Model) and a view (url path to xhtml file)
 * 
 * @author sofiene
 */
@VrPage(
        // bind controller to the menu
        menu = "/MyMenu",
        // bind controller to the xhtml page
        url = "modules/main/my-page",
        // define security access user should have to use this component
        securityKey = "Custom.Page.my-page"
)
@Controller
public class MyPageCtrl {
    private static final Logger log = Logger.getLogger(MyPageCtrl.class.getName());

    private final Model model = new Model();

    @Autowired
    private CorePlugin core;

    @Autowired
    private MyAppMainPlugin main;
    
    public Model getModel() {
        return model;
    }
    

    /**
     * Page initialization.
     * Called when subsequent menu is clicked or the controller is invoked
     * via url /p/MyPage
     * controller url can accept config as json bound to the 'a' http request parameter
     * Example : /p/MyPage?a={'initialCounter':15}
     * When subsequent menu is clicked, config param is passed as bare null!
     * @param conf initialization config.
     */
    @VrOnPageLoad
    private void init(Config conf) {
        if (conf != null) {
            getModel().setCounter(conf.initialCounter);
        }
        getModel().setMessage("Hello World from " + core.getCurrentUserLogin());
    }

    /**
     * controller action
     * @return counter value
     */
    public String onUpdateCounter() {
        //update model
        getModel().setCounter(getModel().getCounter() + 1);
        //return to the same page
        return null;
    }

    /**
     * Model Class for the current Controller (MVC Pattern enforced)
     */
    public static class Model {

        private String message;
        private int counter;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getCounter() {
            return counter;
        }

        public void setCounter(int counter) {
            this.counter = counter;
        }

    }

    /**
     * Config Class for the current Controller
     */
    public static class Config {

        int initialCounter;
    }

    
    
    
}