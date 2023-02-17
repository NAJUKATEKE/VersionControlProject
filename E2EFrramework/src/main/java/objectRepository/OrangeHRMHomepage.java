package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMHomepage {
WebDriver driver;
//private By textPIMHeader=By.xpath("//h6[text()='PIM']");
//private By textLoggedInUser=By.xpath("//img[@alt='profile picture']");
//private  By lnkLogout=By.linkText("Logout");
@FindBy(xpath="//h6[text()='PIM']")
private WebElement textPIMHeader;

@FindBy(xpath="//img[@alt='profile picture']")
 private WebElement textLoggedInUser;

@FindBy(linkText="Logout")
private WebElement lnkLogout;

public  OrangeHRMHomepage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public WebElement getTextPIMHeader() {
	return textPIMHeader;
}
public WebElement getTextLoggedInUser() {
	return textLoggedInUser;
}
public WebElement getLnkLogout() {
	return lnkLogout;
}



}
