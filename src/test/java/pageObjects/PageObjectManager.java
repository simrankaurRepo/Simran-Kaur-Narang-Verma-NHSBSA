package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	WebDriver driver;
	public CandidateSearchPage candidatesearchpage;
	public CandidateSearchResultPage candidatesearchresultpage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;

	}

	public CandidateSearchPage getCandidateSearchPage() {
		candidatesearchpage = new CandidateSearchPage(driver);
		return candidatesearchpage;
	}

	public CandidateSearchResultPage getCandidateSearchResultPage() {
		candidatesearchresultpage = new CandidateSearchResultPage(driver);
		return candidatesearchresultpage;
	}
}
