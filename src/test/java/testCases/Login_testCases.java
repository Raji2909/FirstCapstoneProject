package testCases;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.Login_pageObjects;
public class Login_testCases {
	@Test
	public void login() {
			System.setProperty("webdriver.firefox.driver", "\"C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe\"");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://adactinhotelapp.com/index.php");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			PageFactory.initElements(driver, Login_pageObjects.class);
		//	Login_pageObjects.Login.click();
			Login_pageObjects.username.sendKeys("Rajiruby29");
			Login_pageObjects.pass.sendKeys("Rajiruby");
			Login_pageObjects.loginBtn.click();
			System.out.println("Login Successfully");
			driver.close();
}
}