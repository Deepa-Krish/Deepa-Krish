package parallelpage.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.pom.ProjectSpecificMethods;
import parallebase.pm.ParaProjectSpecificMethods;

public class ParaHomePage extends ParaProjectSpecificMethods{
	
	public ParaHomePage(ChromeDriver driver) {
    	this.driver = driver;
    }
	
	
	public ParaHomePage clickSwitchToLightningOptionP() {
		List<WebElement> text1 = driver.findElementsByXPath("//a[@class = 'switch-to-lightning']");
		if(text1.size() != 0) {
			driver.findElementByXPath("//a[@class = 'switch-to-lightning']").click();
			}
		return this;
	}

	public ParaHomePage clickAppLaunchericonP() {
		driver.findElementByClassName("slds-icon-waffle").click();
        return this;
	}
    public ParaAppLauncherPage clickViewAppOptionP() {
    	driver.findElementByXPath("//button[text()='View All']").click();
    	return new ParaAppLauncherPage(driver);
	}

}
