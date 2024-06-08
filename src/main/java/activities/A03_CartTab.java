package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class A03_CartTab extends A00_BaseActivity {
    public A03_CartTab(AndroidDriver Driver) {
        super(Driver);
    }
    By TermsAndConditions = By.id("com.androidsample.generalstore:id/termsButton");
    public void LongPressOnTermsAndConditions(int Time){
        LongPress(driver.findElement(TermsAndConditions),Time);
    }
    By SendMeCheckBox = AppiumBy.xpath("//android.widget.CheckBox[@text=\"Send me e-mails on discounts related to selected products in future\"]");
    public void ClickOnSendMeCheckBox(){
        ClickOnElement(SendMeCheckBox);
    }
    By VisitToButton = By.id("com.androidsample.generalstore:id/btnProceed");
    public void ClickOnVisitToButton(){
        ClickOnElement(VisitToButton);
    }

}
