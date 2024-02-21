package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class AppFactory {
    static AppiumDriver driver;

    public static void ios_launchapp() throws MalformedURLException {
        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName("iPhone 15")
                .setPlatformVersion("17.2")
                .setBundleId("com.apple.Preferences");

        driver = new IOSDriver(new URL("http://127.0.0.1:4723/"),options);
        AppDriver.setDriver(driver);
        System.out.println("IOSDriver is set");
    }
}
