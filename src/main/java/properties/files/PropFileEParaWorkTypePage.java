package properties.files;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.pom.EParaProjectSpecificMethods;
import base.pom.ProjectSpecificMethods;
import parallebase.pm.ParaProjectSpecificMethods;

public class PropFileEParaWorkTypePage extends PropertiesFilesBasePOM {
     String  getWorkTypeCompleteThisFiledErrorMessage;
     
	public PropFileEParaWorkTypePage(ChromeDriver driver) {
	this.driver = driver;
// 	this.prop = Prop;
 }
     
	public PropFileEParaWorkTypePage clickWorkTypeNewButtonPEPropFile() {
		//driver.findElementByXPath("//div[text() = 'New']").click();	
		driver.findElementByXPath(PropertiesFilesBasePOM.readObjectPropFiles("PropFileEParaWorkTypePage.ClickWorkTypeNewButton.Xpath", "//div[text() = 'New']")).click();
		return this;
	}
	public PropFileEParaWorkTypePage enterWorkTypeNamePEPropFile(String workTypeName) {
		//driver.findElementByXPath("(//input[@type = 'text'])[3]").sendKeys(workTypeName);
		driver.findElementByXPath(PropertiesFilesBasePOM.readObjectPropFiles("PropFileEParaWorkTypePage.EnterWorkTypeName.Xpath", "(//input[@type = 'text'])[3]")).sendKeys(workTypeName);
		return this;
	}
	public PropFileEParaWorkTypePage clickWorkTypeSaveButtonPEPropFile() {
		//driver.findElementByXPath("//button[@title = 'Save']").click();
		driver.findElementByXPath(PropertiesFilesBasePOM.readObjectPropFiles("PropFileEParaWorkTypePage.ClickWorkTypeSaveButton.Xpath", "//button[@title = 'Save']")).click();
		return this;
	}
	public PropFileEParaWorkTypePage getWorkTypeCompleteThisFiledErrorMessagePEPropFile() {
		//getWorkTypeCompleteThisFiledErrorMessage = driver.findElementByXPath("//li[text()='Complete this field.']").getText();
		getWorkTypeCompleteThisFiledErrorMessage = driver.findElementByXPath(PropertiesFilesBasePOM.readObjectPropFiles("PropFileEParaWorkTypePage.GetWorkTypeCompleteThisFiledErrorMessage.Xpath", "//li[text()='Complete this field.']")).getText();
		System.out.println(getWorkTypeCompleteThisFiledErrorMessage);
		return this;
	}

    public PropFileEParaWorkTypePage verifyWorkTypeCompleteThisFiledErrorMessagePEPropFile() {
    Assert.assertEquals(getWorkTypeCompleteThisFiledErrorMessage, "Complete this field.");
	return this;
} 
}
