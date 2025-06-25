package Utils;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralUtils {
	static WebDriver driver;

	public GeneralUtils(WebDriver driver) {
		GeneralUtils.driver = driver;

	}

	public static WebDriverWait waitExplicit() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		return wait;
	}

}
