package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		try {
			if (driver == null) {
				if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
					driver = new ChromeDriver();
				}
				if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
					driver = new FirefoxDriver();
				}
			}

		} catch (Exception e) {
			System.out.println("Exception occurred while initializing WebDriver: " + e.getMessage());
			e.printStackTrace();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(prop.getProperty("URL"));
		return driver;

	}

}
