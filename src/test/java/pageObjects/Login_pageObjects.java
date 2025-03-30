package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_pageObjects {
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td[1]/table/tbody/tr/td/a")
	 public static WebElement Login;
	@FindBy(xpath="//*[@id=\"username\"]")
	 public static WebElement username;
	@FindBy(xpath="//*[@id=\"password\"]")
	public static WebElement pass;
	@FindBy(xpath="//*[@id=\"login\"]")
	public static WebElement loginBtn;
}
