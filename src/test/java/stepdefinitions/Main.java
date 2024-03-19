package stepdefinitions;

import static org.junit.Assert.*;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.MainPage;

public class Main {
	private static String resultTitle;
	
	MainPage mainPage;	
	
	@Given("^I am on the TradeMe Homepage$")
	public void i_am_on_the_TradeMe_Homepage() {
		mainPage.open();
		System.out.println(mainPage.getUrl());
		assertTrue(mainPage.getUrl().contains("tmsandbox"));
	}

	@When("^I Search for Shoes$")
	public void i_Search_for_Shoes() {
		mainPage.searchString.sendKeys("Shoes");
		mainPage.searchButton.click();
	}

	@When("^I verify the number of listings displayed$")
	public void i_verify_the_number_of_listings_displayed() {
		mainPage.searchResult.getText();
		System.out.println("Search result is: " + mainPage.searchResult.getText());
		//Asserting only partial string as the count changes on every day
		assertTrue(mainPage.searchResult.getText().contains("results for 'Shoes'"));
	}

	@When("^I select the appropriate first listing$")
	public void i_select_the_appropriate_first_listing() {
		// to click on the first item from the search result
		resultTitle = mainPage.getSearchResultByTitle.getText().trim();
		System.out.println("Item desc - "+mainPage.getSearchResultByTitle.getText().trim());
		mainPage.firstListing.get(0).click();
		System.out.println(mainPage.getUrl());
	}

	@Then("^I verify the key details$")
	public void i_verify_the_key_details() {
		mainPage.productTitle.waitUntilVisible();		
		assertTrue(mainPage.productTitle.isVisible());
		
		assertTrue(mainPage.productTitle.getText().contains(resultTitle));
		
		for(WebElement element: mainPage.productDetails) {
			System.out.println(element.getText().trim());
			assertTrue(element.isDisplayed());
		}
		
	
		
		

	}
}
