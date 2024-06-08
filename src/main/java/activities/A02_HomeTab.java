package activities;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.time.Duration;

public class A02_HomeTab extends A00_BaseActivity{
    public A02_HomeTab(AndroidDriver Driver) {
        super(Driver);
    }
//By JordanLiftOffItem = By.xpath("//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productName\" and @text=\"Jordan Lift Off\"]");
 //  By AddToCartItemOfJordanLiftOff = By.xpath("(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[3]");
    public void ClickOnAddToCartItemOfJordanLiftOff() throws InterruptedException {
       // ClickOnElement(AddToCartItemOfJordanLiftOff);
        int Size = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
        for(int i = 0 ; i<Size;i++){
            String ProdName = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
             if(ProdName.equalsIgnoreCase("Jordan Lift Off"))
                 driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
        }
        Thread.sleep(Duration.ofSeconds(3));
    }
    public void ClickOnAddToCartItemOfConverseAllStar() throws InterruptedException {
        // ClickOnElement(AddToCartItemOfJordanLiftOff);
        int Size = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
        for(int i = 0 ; i<Size;i++){
            String ProdName = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
            if(ProdName.equalsIgnoreCase("Converse All Star"))
                driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
        }
        Thread.sleep(Duration.ofSeconds(3));
    }
    By CartButton = By.xpath("//android.widget.ImageButton[@resource-id=\"com.androidsample.generalstore:id/appbar_btn_cart\"]");
    public void ClickOnCartButton(){
        ClickOnElement(CartButton);
    }
}



