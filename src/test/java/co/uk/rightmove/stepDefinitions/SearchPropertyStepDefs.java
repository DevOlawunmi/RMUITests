package co.uk.rightmove.stepDefinitions;

import co.uk.rightmove.pages.BasePage;
import co.uk.rightmove.pages.HomePage;
import co.uk.rightmove.pages.SearchCriteriaPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class SearchPropertyStepDefs extends BasePage {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    SearchCriteriaPage searchCriteriaPage = PageFactory.initElements(driver,SearchCriteriaPage.class);
    @Given("I navigate to the homepage")
    public void i_navigate_to_the_homepage() {
        launchURL();
    }

    @When("I enter {string} in the search bar")
    public void i_enter_in_the_search_bar(String location) {
        homePage.enterSearchTerm(location);
    }

    @When("I click on {string}")
    public void i_click_on(String forSaleButton) {
        homePage.clickSearchButton(forSaleButton);

    }


    @Then("the search criteria page is displayed")
    public void theSearchCriteriaPageIsDisplayed() {
    }

    
    @When("select the search radius as {string}")
    public void select_the_search_radius_as(String radius) {
       searchCriteriaPage.SelectRadius(radius);
    }
    @When("I select the minimum price range as {string}")
    public void i_select_the_minimum_price_range_as(String string) {
        searchCriteriaPage.selectMinPrice(string);
    }
    @When("I select the maximum price range as {string}")
    public void i_select_the_maximum_price_range_as(String string) {
        searchCriteriaPage.selectMaxPrice(string);
    }
    @When("I select the min number of bedrooms as {string}")
    public void i_select_the_min_number_of_bedrooms_as(String string) {
        searchCriteriaPage.selectMinBed(string);
    }
    @When("I select the max number of bedrooms as {string}")
    public void i_select_the_max_number_of_bedrooms_as(String string) {
        searchCriteriaPage.selectMaxBed(string);
    }
    @When("I select the property type {string}")
    public void i_select_the_property_type(String string) {

    }
    @When("I select added to site {string}")
    public void i_select_added_to_site(String string) {

    }
    @When("I click find properties")
    public void i_click_find_properties() {

    }
    @Then("the property details page is displayed")
    public void the_property_details_page_is_displayed() {

    }

    @When("I click accept cookies")
    public void iClickAcceptCookies() {
    searchCriteriaPage.ClickAcceptCookies();
    }


}
