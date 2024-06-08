package steps;

import activities.A02_HomeTab;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import static base.TestBase.driver;

public class D03_AddItemToCartStepDef {
    A02_HomeTab HomeTabObject = new A02_HomeTab(driver);
    @Given("User Is in Home Tab")
    public void userIsInHomeTab() {
        String HomeTabAssertion = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/toolbar_title\"]")).getText();
        Assert.assertEquals(HomeTabAssertion,"Products");
    }

    @When("Find Item and Add it To Cart")
    public void findItemAndAddItToCart() throws InterruptedException {
        HomeTabObject.scrollToElementView("Jordan 6 Rings");
        HomeTabObject.ClickOnAddToCartItemOfJordanLiftOff();
    }

    @Then("Item Is Added Successfully")
    public void itemIsAddedSuccessfully() {
        HomeTabObject.ClickOnCartButton();
    Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productName\"])[1]")).getText(), "Jordan Lift Off");
    }
}
