package pageObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CandidateSearchResultPage {

	WebDriver driver;
	By searchResultHeading = By.id("search-results-heading");
	By sortBy = By.id("sort");
	By searchResult = By.cssSelector(".nhsuk-list.search-results");

	public CandidateSearchResultPage(WebDriver driver) {
		this.driver = driver;

	}

	public void validateSearchResult(String string) {
		validateSearchResultHeading(string);
	}

	public void validateMultipleSearchResult(String jobtitle, String location, String payrange) {
		List<String> values = new ArrayList<String>();
		values.add(jobtitle);
		values.add(location);
		values.add(payrange);
		validateMultipleSearchResultHeading(values);
	}

	public void validateSearchResultHeading(String string) {
		String actualSearchResultHeading = driver.findElement(searchResultHeading).getText();
		Assert.assertTrue((actualSearchResultHeading.contains("jobs found"))
				|| (actualSearchResultHeading.contains("job found")));
		if (!string.contains("£"))
			Assert.assertTrue(actualSearchResultHeading.contains(string));
		Assert.assertTrue(driver.findElement(searchResult).isDisplayed());

	}

	public void validateMultipleSearchResultHeading(List<String> values) {
		String actualSearchResultHeading = driver.findElement(searchResultHeading).getText();
		Assert.assertTrue((actualSearchResultHeading.contains("jobs found"))
				|| (actualSearchResultHeading.contains("job found")));
		Iterator<String> it = values.iterator();
		while (it.hasNext()) {

			if (!it.next().contains("£"))
				Assert.assertTrue(actualSearchResultHeading.contains(it.next()));
		}
		Assert.assertTrue(driver.findElement(searchResult).isDisplayed());
	}

	public void validateNewestDatePostedSortBy() {
		Select select = new Select(driver.findElement(sortBy));
		Assert.assertTrue(select.getFirstSelectedOption().getText().equals("Date Posted (newest)"));
	}
}
