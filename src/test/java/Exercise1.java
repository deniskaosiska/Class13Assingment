import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class Exercise1 {
    private static RemoteWebDriver driver;

    @BeforeClass
    public static void beforeClass() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("username", "oauth-denis.kozyra-c069b");
        capabilities.setCapability("accessKey", "e0ea2cab-faf4-40de-8b7f-3249279b5eac");
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("platform", "Windows 10");
        capabilities.setCapability("version", "91.0");
        capabilities.setCapability("build", "Onboarding Sample App - Java-TestNG");
        capabilities.setCapability("name", "Denis test");
        driver = new RemoteWebDriver(new URL("http://ondemand.saucelabs.com/wd/hub"), capabilities);
    }

    @Test
    public void Test(){
        driver.get("https://buyme.co.il/");

    }

    @AfterClass
    public static void afterClass() {
        driver.quit();
    }

}

