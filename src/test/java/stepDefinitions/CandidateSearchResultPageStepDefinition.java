package stepDefinitions;

import Utils.TestSetup;
import io.cucumber.java.en.Then;
import pageObjects.CandidateSearchResultPage;

public class CandidateSearchResultPageStepDefinition {
	TestSetup testsetup;
	public CandidateSearchResultPage candidatesearchresultpage;

	public CandidateSearchResultPageStepDefinition(TestSetup testsetup) {
		this.testsetup = testsetup;
		this.candidatesearchresultpage = testsetup.pageobjectmanager.getCandidateSearchResultPage();
	}

	@Then("I should get a list of jobs which matches my {string} preference")
	public void i_should_get_a_list_of_jobs_which_matches_my_location_preferences(String string) {
		candidatesearchresultpage.validateSearchResult(string);
	}

	@Then("I should get a list of jobs which matches my {string}, {string} and {string} preferences")
	public void i_should_get_a_list_of_jobs_which_matches_my_and_preferences(String jobtitle, String location,
			String payrange) {

		candidatesearchresultpage.validateMultipleSearchResult(jobtitle, location, payrange);
	}

	@Then("sort my search results with the newest Date Posted")
	public void sort_my_search_results_with_the_newest_date_posted() {
		candidatesearchresultpage.validateNewestDatePostedSortBy();
	}

}
