package parallelpage.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base.pom.ProjectSpecificMethods;
import parallebase.pm.ParaProjectSpecificMethods;

public class ParaAppLauncherPage extends ParaProjectSpecificMethods {
    
	public ParaAppLauncherPage(ChromeDriver driver) {
    	this.driver = driver;
    }
	
	public ParaHomePage2 clickSalesButtonP(){
		driver.findElementByXPath("//p[text()='Sales']").click();
        return new ParaHomePage2(driver);
	}
	
	public ParaWorkTypePage clickWorkTypeP() {
	WebElement worktype = driver.findElementByXPath("//p[text() = 'Work Types']");
	Actions action = new Actions(driver);
	action.moveToElement(worktype).click().perform();
    return new ParaWorkTypePage(driver);
}
}
