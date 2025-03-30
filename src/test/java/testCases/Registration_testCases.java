package testCases;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.Registration_pageObjects;

public class Registration_testCases {
	@Test
	public void Registration () {
		System.setProperty("webdriver.firefox.driver", "\"C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe\"");
		WebDriver driver = new FirefoxDriver();
			driver.get("https://adactinhotelapp.com/index.php");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			PageFactory.initElements(driver, Registration_pageObjects.class);
			Registration_pageObjects.NewUser.click();
			Registration_pageObjects.UserName.sendKeys("Rajiruby29");
			Registration_pageObjects.Password.sendKeys("Rajiruby");
			Registration_pageObjects.RePassword.sendKeys("Rajiruby");
			Registration_pageObjects.FullName.sendKeys("Raji");
			Registration_pageObjects.Email.sendKeys("Rajiruby29@gmail.com");
			Registration_pageObjects.TermsandConditions.click();
			Registration_pageObjects.Register.click();
			Registration_pageObjects.captcha.getText();
			Registration_pageObjects.WriteCaptcha.sendKeys(Registration_pageObjects.captcha.getText());
			System.out.println("Sign in Successfully");
			driver.close();
			}
	
}

