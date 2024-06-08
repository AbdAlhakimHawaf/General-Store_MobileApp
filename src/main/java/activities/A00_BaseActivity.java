package activities;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class A00_BaseActivity {
    AndroidDriver driver;

    public A00_BaseActivity(AndroidDriver Driver) {
        this.driver=Driver;
    }
    public void scrollToElementView(String Text) {
        try {
            driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                            ".scrollIntoView(new UiSelector().textContains(\"" + Text + "\").instance(0));"));
        } catch (Exception e) {
            System.out.println("Scrolling failed: " + e.getMessage());
        }
    }

    public void ClickOnElement(By ElementLocator){
       // scrollToElementView(ElementLocator);
//        new WebDriverWait(driver, Duration.ofSeconds(30))
//                .until(ExpectedConditions.presenceOfElementLocated(ElementLocator));
        driver.findElement(ElementLocator).click();
    }
    public void SetElementText(By ElementLocator , String Text){
        driver.findElement(ElementLocator).sendKeys(Text);
    }

    public void LongPress(WebElement Element , int Time){
        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) Element).getId() , "duration" , Time
        ));
    }

}
