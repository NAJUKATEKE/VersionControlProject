package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangehrmForgotPasswordPage {
	WebDriver driver;
//private By textResetPassword=By.xpath("//h6[text()='Reset Password']");
//private By textUsername=By.name("username");
//private By btnResetPassword = By.xpath("//button[text()=' Reset Password ']");
//private By txtLinkSentMessage = By.xpath("//h6[contains(normalize-space(),'successfully')]");
@FindBy(xpath="//h6[text()='Reset Password']")
private WebElement textResetPassword;

@FindBy(name="username")	
private WebElement textUsername;

@FindBy(xpath="//button[text()=' Reset Password ']")
private WebElement btnResetPassword;
		
@FindBy(xpath="//h6[contains(normalize-space(),'successfully')]")
private WebElement txtLinkSentMessage;

	
public OrangehrmForgotPasswordPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
public WebElement getTxtResetPassword() {
return textResetPassword;
}
public WebElement getTxtBoxUsername() {
return textUsername;
}
public WebElement getBtnResetPassword() {
return btnResetPassword;
}
public WebElement getTxtLinkSentMessage() {
return txtLinkSentMessage;
}
}
