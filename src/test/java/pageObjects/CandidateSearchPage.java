package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CandidateSearchPage {

	WebDriver driver;
	By logoIcon = By.xpath("//div[@class='nhsuk-header__logo']");
	By pageHeading = By.xpath("//h1[text()='Search for jobs in the NHS']");
	By clearfilterButton = By.id("clearFilters");
	By searchButton = By.id("search");
	By acceptCookies = By.id("accept-cookies");
	By locationSuggestiveDropdown = By.id("location");
	By titleTextbox = By.id("keyword");
	By moresearchoptionsLink = By.id("searchOptionsBtn");
	By jobreferenceTextBox = By.id("jobReference");
	By employerTextBox = By.id("employer");
	By payrangeDropdown = By.id("payRange");

	public CandidateSearchPage(WebDriver driver) {
		this.driver = driver;

	}

	public void validatePage() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(driver.findElement(logoIcon).isDisplayed());
		Assert.assertTrue(url.contains("nhs.uk/candidate/search"));
		Assert.assertTrue(driver.findElement(pageHeading).isDisplayed());
		acceptCookies();
		clearFilter();
	}

	public void entersLocation(String location) {
		driver.findElement(locationSuggestiveDropdown).sendKeys(location);
	}

	public void enterTitleSkills(String title) {
		driver.findElement(titleTextbox).sendKeys(title);
	}

	public void enterJobReference(String jobreference) {
		driver.findElement(moresearchoptionsLink).click();
		driver.findElement(jobreferenceTextBox).sendKeys(jobreference);
	}

	public void enterEmployer(String employer) {
		driver.findElement(moresearchoptionsLink).click();
		driver.findElement(employerTextBox).sendKeys(employer);
	}

	public void enterPayRange(String payrange) {
		driver.findElement(moresearchoptionsLink).click();
		Select select = new Select(driver.findElement(payrangeDropdown));
		select.selectByVisibleText(payrange);
	}

	public void acceptCookies() {
		driver.findElement(acceptCookies).click();
	}

	public void clearFilter() {
		driver.findElement(clearfilterButton).click();
	}

	public void clickSearchButton() {
		driver.findElement(searchButton).click();
	}
}
