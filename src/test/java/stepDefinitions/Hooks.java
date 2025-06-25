package stepDefinitions;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import Utils.TestSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	WebDriver driver;
	TestSetup testsetup;

	public Hooks(TestSetup testsetup) {
		this.testsetup = testsetup;
	}

	@After
	public void afterScenario() throws IOException {
		testsetup.testbase.WebDriverManager().quit();
	}

	@AfterStep
	public void addScreenshot(Scenario scenario) throws WebDriverException, IOException {
		if (scenario.isFailed()) {
			File sourcePath = ((TakesScreenshot) testsetup.testbase.WebDriverManager())
					.getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent, "image/png", "image");
		}

	}
}
