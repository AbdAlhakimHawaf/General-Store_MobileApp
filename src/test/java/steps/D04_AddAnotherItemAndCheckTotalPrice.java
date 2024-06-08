package steps;

import activities.A02_HomeTab;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import static base.TestBase.driver;

public class D04_AddAnotherItemAndCheckTotalPrice {
    A02_HomeTab HomeTabObject = new A02_HomeTab(driver);
    @Given("User Return To Home Tab")
    public void userReturnToHomeTab() {
        driver.pressKey(new KeyEvent(AndroidKey.BACK) );
        Assert.assertEquals(driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/toolbar_title\"]")).getText(),"Products");
    }

    @When("Add Another Item")
    public void addAnotherItem() throws InterruptedException {
        HomeTabObject.scrollToElementView("Converse All Star");
    HomeTabObject.ClickOnAddToCartItemOfConverseAllStar();
    }

    @And("User go To Cart Tab the New Item Is There")
    public void userGoToCartTabTheNewItemIsThere() {
        HomeTabObject.ClickOnCartButton();
    }

    @Then("Total Price is the Sum of to Items")
    public void totalPriceIsTheSumOfToItems() {
        int size = driver.findElements(By.xpath("//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productPrice\"]")).size();
        Double TotalActualPrice=0.0;
        for(int i=0; i<size ; i++) {
            String ItemTextPrice = driver.findElements(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productPrice\"]")).get(i).getText();
            Double ItemPrice = Double.parseDouble(ItemTextPrice.substring(1));
            TotalActualPrice += ItemPrice;
        }
    String TotalTextPrice = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
    Double TotalPrice = Double.parseDouble(TotalTextPrice.substring(2));

    Assert.assertEquals(TotalPrice,TotalActualPrice);

    }
}
