package testCases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objectRepository.OrangeHRMHomepage;
import objectRepository.OrangeHRMLoginPage;
import objectRepository.OrangehrmForgotPasswordPage;


 
	public class OHRMForgotPasswordTest {
		public static Logger Log=LogManager.getLogger(OHRMForgotPasswordTest.class.getName());
		 public WebDriver driver;
		OrangeHRMLoginPage lp;
		OrangeHRMHomepage hp;
		OrangehrmForgotPasswordPage rp;
		@BeforeClass
		public void launchOrangeHRM() {
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\Mtronics Computers\\Documents\\auto program\\chromedriver.exe");
			//Log.debug("Initilizing driver");
			//driver=new ChromeDriver();
			
			//Log.debug("maximizing browser");
			// driver.manage().window().maximize();
			 
			 Log.debug("setting implicit wait to 10 second");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				Log.debug("Page object elements loaded successfully");
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				Log.debug("loading page object elements");
				 lp=new OrangeHRMLoginPage(driver);
				 hp=new OrangeHRMHomepage(driver);
				 rp=new OrangehrmForgotPasswordPage(driver);
		}
		@Test
		public void ResetPasswordTest() {
		boolean	isOnLogin=lp.getTextLoginHeading().isDisplayed();
		Assert.assertTrue(isOnLogin, "stepfail:application failed to launch");
		Log.info("StepPass:Application successfully launched");

		lp.getTextBoxUsername().sendKeys("admin");
		lp.getTextBoxPassword().sendKeys("admin321");
		lp.getBtnLogin().click();
		boolean isErrorDisplayed=lp.getTextLoginError().isDisplayed();
		Assert.assertTrue(isErrorDisplayed, "stepfail:error massage not displayed");
		Log.info("steppass:login unsuccessful and error displayed");

		lp.getLinkForgotPassword().click();
		boolean isOnResetPassward=rp.getTxtResetPassword().isDisplayed();
		Assert.assertTrue(isOnResetPassward, "Stepfail:not on reset passward page");
		Log.info("steppass:cuurently on reset passward page");

		rp.getTxtBoxUsername().sendKeys("admin");
		rp.getBtnResetPassword().click();
		boolean isMassageSent=rp.getTxtLinkSentMessage().isDisplayed();
		Assert.assertTrue(isMassageSent, "stepfail:resent passward link not display");
		Log.info("steppass:reset passward link sent successfully");
		Log.error("stepfail:resent passward link not display");
		}
		@AfterClass
		public void CloseOrangeHRM() {
			driver.quit();
		}
		

	}
