package resourcess;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	public WebDriver driver;
	public Properties prop;
	public ExcelHanler1 excelHanler1;
	private String username;
	private String password;
	private String  browser;
	private int implicitwait;
	
	public String basepath=System.getProperty("user.dir");
public WebDriver initilizeDriver() throws IOException {
excelHanler1=new ExcelHanler1();
excelHanler1.handleExcel();
	log.debug("Initializing Driver");
 prop=new Properties();
	String Propertiespath=basepath+"\\src\\main\\java\\resourcess\\data.properties";
FileInputStream fis=new FileInputStream(Propertiespath);
prop.load(fis);
String browsername=prop.getProperty("browser");
if(browsername.equals("chrome")) {
	System.setProperty("WebDriver.chrome.driver", basepath+"\\chromedriver.exe");
	driver=new ChromeDriver();
}
else if(browsername.equals("firefox")) {
	System.setProperty("WebDriver.firefox.driver", basepath+"\\firefoxdriver.exe");
	driver=new FirefoxDriver();
}
else if(browsername.equals("edge")) {
	System.setProperty("WebDriver.firefox.driver", basepath+"\\edgedriver.exe");
	driver=new EdgeDriver();
}
else {
	log.error("invalid browser,please specify correct browser name in the properties file"); 
	Assert.assertFalse(true, "please specify correct browser name in the properties file");
}
	driver.manage().window().maximize();
log.info("window maximize");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
log.debug("Implicit wait set as 10 second");
log.info("Successfully initiated driver,browser launched successfully ");
return driver;

}
public static Logger getLog() {
	return log;
}
public WebDriver getDriver() {
	return driver;
}
public Properties getProp() {
	return prop;
}
public ExcelHanler1 getExcelHanler1() {
	return excelHanler1;
}
public String getUsername() {
	return username;
}
public String getPassword() {
	return password;
}
public String getBrowser() {
	return browser;
}
public int getImplicitwait() {
	return implicitwait;
}
public String getBasepath() {
	return basepath;
}
public String getScreenshot(String testName,WebDriver driver) throws IOException {
	File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String screenshotPath=basepath+"\\Screenshots\\"+testName+"screenshot.png";
FileUtils.copyFile(src, new File(screenshotPath));
return screenshotPath;
}
}

