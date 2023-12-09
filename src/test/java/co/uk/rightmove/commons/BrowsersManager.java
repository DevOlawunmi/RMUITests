package co.uk.rightmove.commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class BrowsersManager extends DriverManager{
    public WebDriver initChrome(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable notifications");
        return new ChromeDriver(options);
    }

    public WebDriver initEdge(){
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }

    public void launchBrowser(String browser){
        switch (browser){
            case "Chrome":
                driver = initChrome();
                break;
            case "Edge":
                driver = initEdge();
                break;
            default:
                driver = initChrome();
                break;
        }


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().window().maximize();

    }

    public void quitBrowser(){
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
