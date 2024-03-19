package pageobjects;

import java.util.List;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("https://www.tmsandbox.co.nz/a/")

public class MainPage extends PageObject{ 
	
	@FindBy(id = "search")
	public WebElementFacade searchString;
	
	@FindBy(css = "button.o-button2--primary")
	public WebElementFacade searchButton;
	
	@FindBy(css = "div.tm-search-header__footer-container h3")
	public WebElementFacade searchResult;	
	
	@FindBy(css = "div.tm-marketplace-search-card__wrapper a")
	public List<WebElementFacade> firstListing;	
	
	
	@FindBy(css ="div.tm-marketplace-search-card__wrapper a div.tm-marketplace-search-card__title") 
	public WebElementFacade getSearchResultByTitle;
	
	@FindBy(css ="h1.tm-marketplace-buyer-options__listing_title") 
	public WebElementFacade productTitle;
	
	@FindBy(css ="div.tm-marketplace-listing-body__item div.o-rack-item__primary-body") 
	public List<WebElementFacade> productDetails;
	 
	//h1.tm-marketplace-buyer-options__listing_title
	
	public String getUrl() {
		return getDriver().getCurrentUrl();
	}
	
	
	
}
