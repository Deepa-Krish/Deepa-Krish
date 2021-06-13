package excelreadpage.pom;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.pom.EParaProjectSpecificMethods;
import base.pom.ProjectSpecificMethods;
import parallebase.pm.ParaProjectSpecificMethods;

public class EParaWorkTypePage extends EParaProjectSpecificMethods {
     String  getWorkTypeCompleteThisFiledErrorMessage;
     
     public EParaWorkTypePage(ChromeDriver driver) {
     	this.driver = driver;
     }
     
	public EParaWorkTypePage clickWorkTypeNewButtonPE() {
		driver.findElementByXPath("//div[text() = 'New']").click();	
		return this;
	}
	public EParaWorkTypePage enterWorkTypeNamePE(String workTypeName) {
		driver.findElementByXPath("(//input[@type = 'text'])[3]").sendKeys(workTypeName);
		return this;
	}
	public EParaWorkTypePage clickWorkTypeSaveButtonPE() {
		driver.findElementByXPath("//button[@title = 'Save']").click();
		return this;
	}
	public EParaWorkTypePage getWorkTypeCompleteThisFiledErrorMessagePE() {
		getWorkTypeCompleteThisFiledErrorMessage = driver.findElementByXPath("//li[text()='Complete this field.']").getText();
		System.out.println(getWorkTypeCompleteThisFiledErrorMessage);
		return this;
	}

    public EParaWorkTypePage verifyWorkTypeCompleteThisFiledErrorMessagePE() {
    Assert.assertEquals(getWorkTypeCompleteThisFiledErrorMessage, "Complete this field.");
	return this;
} 
}
