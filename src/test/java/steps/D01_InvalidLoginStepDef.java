package steps;

import activities.A01_LoginTab;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;

import static base.TestBase.driver;

public class D01_InvalidLoginStepDef {
    A01_LoginTab LoginTabObject = new A01_LoginTab(driver);

    @Given("User Open the app and change Country to Egypt")
    public void userOpenTheAppAndChangeCountryToEgypt() {
        LoginTabObject.ClickOnCountryList();
        LoginTabObject.scrollToElementView("Egypt");
        LoginTabObject.ClickOnEgyptCountry();
    }

    @When("Clicking on Login Button")
    public void clickingOnLoginButton() {
        LoginTabObject.ClickOnLetsShop();
    }

    @Then("Error Message Will Appear")
    public void errorMessageWillAppear() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement Error = driver.findElement(By.xpath("(//android.widget.Toast)[1]"));
        String ErrorMessage = Error.getAttribute("name");
        Assert.assertEquals(ErrorMessage, "Please enter your name");
    }
}
