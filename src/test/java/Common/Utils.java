package Common;

import base.AppDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utils {
    public static void waitUntil(WebElement element) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        new WebDriverWait(AppDriver.getDriver(), Duration.ofSeconds(200)).until(ExpectedConditions.visibilityOf(element));
    }
    public static void waitUntil(WebElement element, Integer wait) {
        new WebDriverWait(AppDriver.getDriver(), Duration.ofSeconds(wait)).until(ExpectedConditions.visibilityOf(element));
    }
    public static void waitUntilClickable(WebElement element) throws InterruptedException {
        Thread.sleep(1000);
        new WebDriverWait(AppDriver.getDriver(), Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(element));
    }
}
