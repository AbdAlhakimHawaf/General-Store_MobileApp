package steps;

import activities.A01_LoginTab;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static base.TestBase.driver;

public class D02_ValidLoginStepDef {
    A01_LoginTab LoginTabObject = new A01_LoginTab(driver);
    @Given("User Open the app and cchange Country to Egypt")
    public void userOpenTheAppAndCchangeCountryToEgypt() {
        LoginTabObject.ClickOnCountryList();
        LoginTabObject.scrollToElementView("Egypt");
        LoginTabObject.ClickOnEgyptCountry();
    }
    @When("Entering Name")
    public void enteringName() {
        String Text = "Hana";
        LoginTabObject.SetNameField(Text);
    }

    @And("Choosing Female")
    public void choosingFemale() {
        LoginTabObject.ChooseFemale();
    }

    @And("Clicking on Login BButton")
    public void clickingOnLoginBButton() {
        LoginTabObject.ClickOnLetsShop();
    }

    @Then("Home Page Will Open")
    public void homePageWillOpen() {
        String HomeTabAssertion = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/toolbar_title\"]")).getText();
        Assert.assertEquals(HomeTabAssertion,"Products");
    }


}
