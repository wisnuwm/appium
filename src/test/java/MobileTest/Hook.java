package MobileTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
    @Before
    public void initDriverApps() throws Exception {
        InitDriver.openApp();
    }
    @After
    public void closeDriverApps(){
        InitDriver.closeApp();
    }
}
