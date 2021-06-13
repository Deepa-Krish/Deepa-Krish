package properties.files;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.pom.EParaProjectSpecificMethods;
import base.pom.ProjectSpecificMethods;
import parallebase.pm.ParaProjectSpecificMethods;

public class PropFileEParaHomePage extends PropertiesFilesBasePOM{
	
	public PropFileEParaHomePage(ChromeDriver driver) {
    	this.driver = driver;
//    	this.prop = Prop;
   }
	
	
	public PropFileEParaHomePage clickSwitchToLightningOptionPEPropFile() {
		//List<WebElement> text1 = driver.findElementsByXPath("//a[@class = 'switch-to-lightning']");
		List<WebElement> text1 = driver.findElementsByXPath(PropertiesFilesBasePOM.readObjectPropFiles("PropFileEParaHomePage.SwtchingToLightening.Xpath", "//a[@class = 'switch-to-lightning']"));
		if(text1.size() != 0) {
			//driver.findElementByXPath("//a[@class = 'switch-to-lightning']").click();
			driver.findElementByXPath(PropertiesFilesBasePOM.readObjectPropFiles("PropFileEParaHomePage.SwtchingToLightening.Xpath", "//a[@class = 'switch-to-lightning']")).click();
			}
		return this;
	}

	public PropFileEParaHomePage clickAppLaunchericonPEPropFile() {
		//driver.findElementByClassName("slds-icon-waffle").click();
		driver.findElementByClassName(PropertiesFilesBasePOM.readObjectPropFiles("PropFileEParaHomePage.ClickAppLauncher.Class", "slds-icon-waffle")).click();
        return this;
	}
    public PropFileEParaAppLauncherPage clickViewAppOptionPEPropFile() {
    	//driver.findElementByXPath("//button[text()='View All']").click();
    	driver.findElementByXPath(PropFileEParaHomePage.readObjectPropFiles("PropFileEParaAppLauncherPage.ViewAllInAppLauncher.Xpath", "//button[text()='View All']")).click();
         // return new PropFileEParaAppLauncherPage(driver,prop);
    	return new PropFileEParaAppLauncherPage(driver);
	}

}
