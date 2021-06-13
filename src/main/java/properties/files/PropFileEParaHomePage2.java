package properties.files;

import org.openqa.selenium.chrome.ChromeDriver;

import base.pom.EParaProjectSpecificMethods;
import base.pom.ProjectSpecificMethods;
import parallebase.pm.ParaProjectSpecificMethods;

public class PropFileEParaHomePage2 extends PropertiesFilesBasePOM {

	public PropFileEParaHomePage2(ChromeDriver driver) {
    	this.driver = driver;
//    	this.prop = Prop;
   }
	
	public PropFileEParaOpportunitiesPage clickOpportunitiesbuttonPEPropFile() {
		//driver.executeScript("arguments[0].click();",driver.findElementByXPath("//span[text() = 'Opportunities']"));
		driver.executeScript("arguments[0].click();",driver.findElementByXPath(PropertiesFilesBasePOM.readObjectPropFiles("PropFileEParaOpportunitiesPage.ClickOpportunityButton.Xpath", "//span[text() = 'Opportunities']")));
		//return new PropFileEParaOpportunitiesPage(driver,prop);
		return new PropFileEParaOpportunitiesPage(driver);
	}

}
