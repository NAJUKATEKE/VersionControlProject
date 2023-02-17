package objectRepository;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
public class OrangeHRMLoginPage {
	WebDriver driver;
	//private By textLoginHeading = By.xpath("//h5[text()='Login']");
	//private By textBoxUsername = By.name("username");
	//private By textBoxPassword = By.name("password");
	//private By btnLogin = By.xpath("//button[text()=' Login ']");
	//private By textLoginError=By.xpath("//p[text()='Invalid credentials']");
	//private By linkForgotPassword=By.xpath("//p[text()='Forgot your password? ']");
@FindBy(xpath="//h5[text()='Login']")
private WebElement textLoginHeading;

@FindBy(name="username")
private WebElement textBoxUsername;

@FindBy(name="password")
private WebElement textBoxPassword;

@FindBy(xpath="//button[text()=' Login ']")
private WebElement btnLogin;

@FindBy(xpath="//p[text()='Forgot your password? ']")
private WebElement linkForgotPassword;

@FindBy(xpath="//p[text()='Invalid credentials']")
	private WebElement textLoginError;

	public OrangeHRMLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getTextLoginError() {
		return textLoginError;
	}
	
	public WebElement getTextLoginHeading() {
		return textLoginHeading;
	}
	public WebElement getLinkForgotPassword() {
		return linkForgotPassword;
	}
	public WebElement getTextBoxUsername() {
		return textBoxUsername;
	}
	public WebElement getTextBoxPassword() {
		return textBoxPassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
