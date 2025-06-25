package stepDefinitions;

import java.util.List;

import Utils.TestSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.CandidateSearchPage;

public class CandidateSearchPageStepDefinition {
	TestSetup testsetup;
	public CandidateSearchPage candidatesearchpage;

	public CandidateSearchPageStepDefinition(TestSetup testsetup) {
		this.testsetup = testsetup;
		this.candidatesearchpage = testsetup.pageobjectmanager.getCandidateSearchPage();
	}

	@Given("I am a jobseeker on NHS Jobs website")
	public void i_am_a_jobseeker_on_NHS_Jobs_website() {
		candidatesearchpage.validatePage();
		// candidatesearchpage.searchFields();
	}

	@When("I put my {string} location preference into the Search functionality")
	public void i_put_my_brimingham_location_preference_into_the_search_functionality(String location) {

		candidatesearchpage.entersLocation(location);
		candidatesearchpage.clickSearchButton();
	}

	@When("I put my {string} job title or skills preference into the Search functionality")
	public void i_put_my_job_title_skills_preference_into_the_search_functionality(String title) {
		candidatesearchpage.enterTitleSkills(title);
		candidatesearchpage.clickSearchButton();
	}

	@When("I put my {string} job reference preference into the Search functionality")
	public void i_put_my_job_reference_preference_into_the_search_functionality(String jobreference) {
		candidatesearchpage.enterJobReference(jobreference);
		candidatesearchpage.clickSearchButton();
	}

	@When("I put my {string} Employer preference into the Search functionality")
	public void i_put_my_employer_preference_into_the_search_functionality(String employer) {
		candidatesearchpage.enterEmployer(employer);
		candidatesearchpage.clickSearchButton();
	}

	@When("I put my {string} pay range preference into the Search functionality")
	public void i_put_my_pay_range_preference_into_the_search_functionality(String payrange) {
		candidatesearchpage.enterPayRange(payrange);
		candidatesearchpage.clickSearchButton();
	}

	@When("I put my Pay range, location and job title preferences into the Search functionality")
	public void i_put_my_pay_range_location_and_job_title_preferences_into_the_search_functionality(List<String> data) {
		candidatesearchpage.enterTitleSkills(data.get(0));
		candidatesearchpage.entersLocation(data.get(1));
		candidatesearchpage.enterPayRange(data.get(2));
		candidatesearchpage.clickSearchButton();
	}
}
