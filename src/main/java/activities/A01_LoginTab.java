package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class A01_LoginTab extends A00_BaseActivity{
    public A01_LoginTab(AndroidDriver Driver) {
        super(Driver);
    }

    By CountryList = By.id("com.androidsample.generalstore:id/spinnerCountry");
    public void ClickOnCountryList(){
        ClickOnElement(CountryList);
    }
    By EgyptCountry = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Egypt\"]");
    public void ClickOnEgyptCountry(){
        ClickOnElement(EgyptCountry);
    }
    By NameField = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.androidsample.generalstore:id/nameField\"]");
    public void SetNameField(String Text){
        SetElementText(NameField , Text);
    }
    By FemaleChose = By.id("com.androidsample.generalstore:id/radioFemale");
    public void ChooseFemale(){
        ClickOnElement(FemaleChose);
    }
    By LetsShop = By.id("com.androidsample.generalstore:id/btnLetsShop");
    public void ClickOnLetsShop(){
        ClickOnElement(LetsShop);
    }



}
