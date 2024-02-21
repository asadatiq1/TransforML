package iOS.PageObject;

import base.AppDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class TestObjects {
    public TestObjects(){
        PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()),this);
    }
}
