package Utils;

import java.io.IOException;
import pageObjects.PageObjectManager;

public class TestSetup {
	public TestBase testbase;
	public PageObjectManager pageobjectmanager;
	public GeneralUtils generalutils;

	public TestSetup() throws IOException {
		testbase = new TestBase();
		pageobjectmanager = new PageObjectManager(testbase.WebDriverManager());
		generalutils = new GeneralUtils(testbase.WebDriverManager());
	}

}
