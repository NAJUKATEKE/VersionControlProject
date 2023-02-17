package commonLiabraries;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;

public class SeleniumLiabraries {
public static Logger log=(Logger) LogManager.getLogger(SeleniumLiabraries.class.getClass());
public void click(WebElement element) {
	element.click();
}
public void sendkeys(WebElement element,String text) {
	if(text==null || text=="") {
	log.warn("Text is empty");
	}
	element.sendKeys(text);
}
}
