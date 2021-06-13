package excelreadpage.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base.pom.EParaProjectSpecificMethods;
import base.pom.ProjectSpecificMethods;
import parallebase.pm.ParaProjectSpecificMethods;

public class EParaAppLauncherPage extends EParaProjectSpecificMethods {
    
	public EParaAppLauncherPage(ChromeDriver driver) {
    	this.driver = driver;
    }
	
	public EParaHomePage2 clickSalesButtonPE(){
		driver.findElementByXPath("//p[text()='Sales']").click();
        return new EParaHomePage2(driver);
	}
	
	public EParaWorkTypePage clickWorkTypePE() {
	WebElement worktype = driver.findElementByXPath("//p[text() = 'Work Types']");
	Actions action = new Actions(driver);
	action.moveToElement(worktype).click().perform();
    return new EParaWorkTypePage(driver);
}
}
