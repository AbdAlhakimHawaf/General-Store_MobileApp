package steps;

import activities.A03_CartTab;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import static base.TestBase.driver;

public class D05_FinalizePurchaseStepDef {
    A03_CartTab CartTabObject = new A03_CartTab(driver);
    @Given("User Is in Cart Tab")
    public void userIsInCartTab() {
        Assert.assertEquals(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")).getText(), "Cart");
    }

    @When("Start To read Condition")
    public void startToReadCondition() {
       CartTabObject.LongPressOnTermsAndConditions(3000);
       driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }

    @And("Choose to Send Me Emails")
    public void chooseToSendMeEmails() {
        CartTabObject.ClickOnSendMeCheckBox();
    }

    @Then("User Is Redirected to Browser")
    public void userIsRedirectedToBrowser() {
        CartTabObject.ClickOnVisitToButton();
    }
}
