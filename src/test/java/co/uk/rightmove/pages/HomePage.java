package co.uk.rightmove.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage{
    public HomePage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(className = "searchPanelControls")
    List<WebElement> searchButtons;
    @FindBy(name = "typeAheadInputField")
    WebElement searchField;


    public void enterSearchTerm(String location) {
        searchField.sendKeys(location);
    }

    public SearchCriteriaPage clickSearchButton(String buttonName)
    {
        if(searchButtons.size()>0){
            for (WebElement ele:searchButtons
            )
            {
                if(ele.getText().trim().equals(buttonName)){
                    ele.click();
                    break;
                }
            }
        }
        return new SearchCriteriaPage();
    }

}
