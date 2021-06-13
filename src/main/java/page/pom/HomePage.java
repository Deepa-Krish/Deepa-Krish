package page.pom;

import java.util.List;

import org.openqa.selenium.WebElement;

import base.pom.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public HomePage clickSwitchToLightningOption() {
		List<WebElement> text1 = driver.findElementsByXPath("//a[@class = 'switch-to-lightning']");
		if(text1.size() != 0) {
			driver.findElementByXPath("//a[@class = 'switch-to-lightning']").click();
			}
		return this;
	}

	public HomePage clickAppLaunchericon() {
		driver.findElementByClassName("slds-icon-waffle").click();
        return this;
	}
    public AppLauncherPage clickViewAppOption() {
    	driver.findElementByXPath("//button[text()='View All']").click();
    	return new AppLauncherPage();
	}

}
