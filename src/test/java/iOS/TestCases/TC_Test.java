package iOS.TestCases;

import base.AppFactory;
import base.PropertiesUtil;
import iOS.PageObject.TestObjects;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TC_Test {
    PropertiesUtil propertiesUtil;
    TestObjects test;

    @Test
    public void setup() throws MalformedURLException {
        AppFactory.ios_launchapp();
        propertiesUtil = new PropertiesUtil();
        test = new TestObjects();
    }
}
