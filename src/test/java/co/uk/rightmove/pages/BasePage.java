package co.uk.rightmove.pages;

import co.uk.rightmove.commons.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverManager {

    public BasePage() {
        PageFactory.initElements(driver, this);
    }
    private Select select;

    public String BASE_URL = "https://www.rightmove.co.uk/";

    public void launchURL() {
        driver.get(BASE_URL);
    }

    public void selectByText(WebElement element, String text){
        select = new Select(element);
        select.selectByVisibleText(text);
    }


}
