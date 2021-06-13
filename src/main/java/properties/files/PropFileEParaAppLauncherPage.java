package properties.files;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base.pom.EParaProjectSpecificMethods;
import base.pom.ProjectSpecificMethods;
import parallebase.pm.ParaProjectSpecificMethods;

public class PropFileEParaAppLauncherPage extends PropertiesFilesBasePOM {
    
public PropFileEParaAppLauncherPage(ChromeDriver driver) {
   	this.driver = driver;
//    	this.prop = Prop;
   }
	
	public PropFileEParaHomePage2 clickSalesButtonPEPropFile(){
		//driver.findElementByXPath("//p[text()='Sales']").click();
		driver.findElementByXPath(PropertiesFilesBasePOM.readObjectPropFiles("PropFileEParaHomePage2.ClickSalesOption.Xpath", "//p[text()='Sales']")).click();
       // return new PropFileEParaHomePage2(driver,prop);
        return new PropFileEParaHomePage2(driver);
	}
	
	public PropFileEParaWorkTypePage clickWorkTypePEPropFile() {
	//WebElement worktype = driver.findElementByXPath("//p[text() = 'Work Types']");
	WebElement worktype = driver.findElementByXPath(PropertiesFilesBasePOM.readObjectPropFiles("PropFileEParaWorkTypePage.ClickWorkTypeOption,Xpath", "//p[text() = 'Work Types']"));
	Actions action = new Actions(driver);
	action.moveToElement(worktype).click().perform();
    //return new PropFileEParaWorkTypePage(driver,prop);
    return new PropFileEParaWorkTypePage(driver);
}
}
