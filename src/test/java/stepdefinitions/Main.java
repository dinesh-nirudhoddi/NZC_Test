package stepdefinitions;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.WebElementFacade;
import pageobjects.MainPage;

public class Main {
	private static List<String> myStringList = new ArrayList<String>();
	private static String EverydayAccBalance, BillsAccBalance, TransferAmount;
	
	MainPage Main;	
	
	@Given("^I am on the TradeMe Homepage$")
	public void i_am_on_the_TradeMe_Homepage() {
		Main.open();
		System.out.println(Main.getUrl());
		assertTrue(Main.getUrl().contains("tmsandbox"));
	}

	@When("^I Search for Shoes$")
	public void i_Search_for_Shoes() {
		Main.searchString.sendKeys("Shoes");
		Main.searchButton.click();
	}

	@When("^I verify the number of listings displayed$")
	public void i_verify_the_number_of_listings_displayed() {
		Main.searchResult.getText();
		System.out.println("Search result is: " + Main.searchResult.getText());
		//Asserting only partial string as the count changes on every day
		assertTrue(Main.searchResult.getText().contains("results for 'Shoes'"));
	}

	@When("^I select the appropriate first listing$")
	public void i_select_the_appropriate_first_listing() {
		// to click on the first item from the search result
		System.out.println("Item desc - "+Main.getSearchResultByTitle.getText().trim());
		Main.firstListing.get(0).click();
		System.out.println(Main.getUrl());
	}

	@Then("^I verify the key details$")
	public void i_verify_the_key_details() {
		//assertTrue()
	}
}
