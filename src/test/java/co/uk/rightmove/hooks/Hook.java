package co.uk.rightmove.hooks;

import co.uk.rightmove.commons.BrowsersManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BrowsersManager {
    @Before
    public void setUp(){
        launchBrowser("Chrome");
    }
    @After
    public void tearDown(){
        quitBrowser();
    }
}
