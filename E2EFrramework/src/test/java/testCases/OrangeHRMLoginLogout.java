package testCases;


	import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objectRepository.OrangeHRMHomepage;
import objectRepository.OrangeHRMLoginPage;
import resourcess.Base;

	public class OrangeHRMLoginLogout extends Base {
		public static Logger log=LogManager.getLogger(OrangeHRMLoginLogout.class.getName());
		
		
		public WebDriver driver;
		OrangeHRMLoginPage lp;
		OrangeHRMHomepage hp;
		@BeforeClass
		public void launchOrangeHRM() throws IOException {
			driver=initilizeDriver();
			log.debug("loading page object element");
			lp=new OrangeHRMLoginPage(driver);
			 hp=new OrangeHRMHomepage(driver);
			log.debug("page object element loaded successfully");
			driver.get(prop.getProperty("url"));
			
			 

		}
		@Test
		public void loginLogoutTest() throws InterruptedException {
			Thread.sleep(3000);
			boolean isOnLogin=	lp.getTextLoginHeading().isDisplayed();
			Assert.assertTrue(isOnLogin, "StepFail:Not on Login page");
			log.info("steppass:currently on login page");
			
			lp.getTextBoxUsername().sendKeys(prop.getProperty("username"));
			lp.getTextBoxPassword().sendKeys(prop.getProperty("password"));
			lp.getBtnLogin().click();
			
		boolean 	isOnHome=hp.getTextPIMHeader().isDisplayed();
		Assert.assertTrue(false, "Stepfail:not on homepage");
		log.error("Stepfail:not on homepage");
		log.info("step pass:currently on homepage");
		
		
		 WebElement  loggedInUserElement=	hp.getTextLoggedInUser();
		 String loggedInUser=loggedInUserElement.getText();
		 log.info("loggedInUser:"+loggedInUser);
		 loggedInUserElement.click();
		 hp.getLnkLogout().click();
		 isOnLogin=	lp.getTextLoginHeading().isDisplayed();
		 Assert.assertTrue(isOnLogin, "Stepfail:not on login page after logut");
		 log.error("Stepfail:not on login page after logut");
		 log.info("currently on login page after logout");
		 
		}
		@AfterClass
		public void closeOrangeHRM() {
			driver.quit();
		}
	}

