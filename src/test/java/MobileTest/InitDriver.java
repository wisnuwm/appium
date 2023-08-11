package MobileTest;

//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class InitDriver {
    public static AppiumDriver driver;
    public static DesiredCapabilities cap;
    public static final String APK_SAMPLE_LOGIN = System.getProperty("user.dir")+"/apps/Sample_login.apk";

    public static DesiredCapabilities Android_LaunchApp() {
        cap = new DesiredCapabilities();
        cap.setCapability("appium:automationName","UiAutomator2");
        cap.setCapability("appium:platformName","Android");
        cap.setCapability("appium:deviceName","emulator-5554");
        cap.setCapability("appium:app",APK_SAMPLE_LOGIN);
        cap.setCapability("appium:autoGrantPermissions","true");
        cap.setCapability("noReset","true");
        return cap;
    }

    public static void openApp() throws MalformedURLException, InterruptedException {
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), Android_LaunchApp());
        Thread.sleep(2000);
        System.out.println("Applikasi lauched");
    }

    public static void closeApp(){
        driver.quit();
    }


}
