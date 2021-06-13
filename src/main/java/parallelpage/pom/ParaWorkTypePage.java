package parallelpage.pom;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.pom.ProjectSpecificMethods;
import parallebase.pm.ParaProjectSpecificMethods;

public class ParaWorkTypePage extends ParaProjectSpecificMethods {
     String  getWorkTypeCompleteThisFiledErrorMessage;
     
     public ParaWorkTypePage(ChromeDriver driver) {
     	this.driver = driver;
     }
     
	public ParaWorkTypePage clickWorkTypeNewButtonP() {
		driver.findElementByXPath("//div[text() = 'New']").click();	
		return this;
	}
	public ParaWorkTypePage enterWorkTypeNameP() {
		driver.findElementByXPath("(//input[@type = 'text'])[3]").sendKeys("Bootcamp");
		return this;
	}
	public ParaWorkTypePage clickWorkTypeSaveButtonP() {
		driver.findElementByXPath("//button[@title = 'Save']").click();
		return this;
	}
	public ParaWorkTypePage getWorkTypeCompleteThisFiledErrorMessageP() {
		getWorkTypeCompleteThisFiledErrorMessage = driver.findElementByXPath("//li[text()='Complete this field.']").getText();
		System.out.println(getWorkTypeCompleteThisFiledErrorMessage);
		return this;
	}

    public ParaWorkTypePage verifyWorkTypeCompleteThisFiledErrorMessageP() {
    Assert.assertEquals(getWorkTypeCompleteThisFiledErrorMessage, "Complete this field.");
	return this;
} 
}
