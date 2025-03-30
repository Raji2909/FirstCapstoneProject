package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration_pageObjects {
	@FindBy(xpath="//*[@id=\"login_form\"]/table/tbody/tr[7]/td/a")
	 public static WebElement NewUser;
	@FindBy(xpath="//*[@id=\"username\"]")
	 public static WebElement UserName;
	@FindBy(xpath="//*[@id=\"password\"]")
	 public static WebElement Password;
	@FindBy(xpath="//*[@id=\"re_password\"]")
	 public static WebElement RePassword;
	@FindBy(xpath="//*[@id=\"full_name\"]")
	public static WebElement FullName;
	@FindBy(xpath="//*[@id=\"email_add\"]")
	public static WebElement Email;
	@FindBy(xpath="//*[@id=\"captcha\"]")
	public static WebElement captcha;
	@FindBy(xpath="//*[@id=\"captcha-form\"]")
	public static WebElement WriteCaptcha;
	@FindBy(xpath="//*[@id=\"tnc_box\"]")
	public static WebElement TermsandConditions ;
	@FindBy(xpath="//*[@id=\"Submit\"]")
	public static WebElement Register;
}
