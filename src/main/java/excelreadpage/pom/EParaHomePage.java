package excelreadpage.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.pom.EParaProjectSpecificMethods;
import base.pom.ProjectSpecificMethods;
import parallebase.pm.ParaProjectSpecificMethods;

public class EParaHomePage extends EParaProjectSpecificMethods{
	
	public EParaHomePage(ChromeDriver driver) {
    	this.driver = driver;
    }
	
	
	public EParaHomePage clickSwitchToLightningOptionPE() {
		List<WebElement> text1 = driver.findElementsByXPath("//a[@class = 'switch-to-lightning']");
		if(text1.size() != 0) {
			driver.findElementByXPath("//a[@class = 'switch-to-lightning']").click();
			}
		return this;
	}

	public EParaHomePage clickAppLaunchericonPE() {
		driver.findElementByClassName("slds-icon-waffle").click();
        return this;
	}
    public EParaAppLauncherPage clickViewAppOptionPE() {
    	driver.findElementByXPath("//button[text()='View All']").click();
    	return new EParaAppLauncherPage(driver);
	}

}
