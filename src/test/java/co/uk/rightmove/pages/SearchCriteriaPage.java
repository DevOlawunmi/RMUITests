package co.uk.rightmove.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCriteriaPage extends BasePage {
    public SearchCriteriaPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "radius")
    WebElement searchRadiusField;
    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement acceptCookies;
    @FindBy(id = "minPrice")
    WebElement minPriceSelect;
    @FindBy(id = "maxPrice")
    WebElement maxPriceSelect;
    @FindBy(id = "minBedrooms")
    WebElement minBedroomsSelect;
    @FindBy(id = "maxBedrooms")
    WebElement maxBedroomsSelect;


    public void SelectRadius(String radius) {
        selectByText(searchRadiusField,radius );
    }

    public void ClickAcceptCookies(){
        acceptCookies.click();

    }
    public void selectMinBed(String minBed){
        selectByText(minBedroomsSelect, minBed);

    }
    public void selectMaxBed(String maxBed){
        selectByText(maxBedroomsSelect, maxBed);
    }

    public void selectMinPrice(String minPrice){
        selectByText(minPriceSelect,minPrice);

    }
    public void selectMaxPrice(String maxPrice){
        selectByText(maxPriceSelect,maxPrice);

    }
}
