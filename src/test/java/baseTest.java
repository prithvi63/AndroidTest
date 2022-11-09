import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class baseTest {

    @Test
    public void appiumTest() throws MalformedURLException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("AndroidP");
        options.setApp("/Users/prithvikanumuri/IdeaProjects/AndroidTest/src/main/resources/Calculator_8.3 (477856174)_Apkpure.apk");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),options);
        driver.findElement(AppiumBy.accessibilityId("2")).click();
        driver.findElement(AppiumBy.accessibilityId("plus")).click();
        driver.findElement(AppiumBy.accessibilityId("2")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();
        Thread.sleep(2000);
       String result = driver.findElement(By.xpath("//android.widget.TextView")).getText();
       Assert.assertEquals(result,"4");
       driver.quit();

    }
}
