package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

public class TestBase extends AbstractTestNGCucumberTests {
    public static AndroidDriver driver;
    public AppiumServiceBuilder service;

    @BeforeTest
    public void ConfigureAppium() throws URISyntaxException, MalformedURLException {
        service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\DELL\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723) .withArgument(GeneralServerFlag.LOG_LEVEL, "debug");
        service.build().start();
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel 8 Pro API 32");
        options.setApp("C:\\Users\\DELL\\IdeaProjects\\General-Store_MobileApp\\src\\test\\resources\\General-Store.apk");
        driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @AfterTest
    public void TearDown(){
        // driver.quit();
        //  service.build().stop();
    }
}
