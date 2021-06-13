package page.pom;

import org.testng.Assert;

import base.pom.ProjectSpecificMethods;

public class WorkTypePage extends ProjectSpecificMethods {
     String  getWorkTypeCompleteThisFiledErrorMessage;
	public WorkTypePage clickWorkTypeNewButton() {
		driver.findElementByXPath("//div[text() = 'New']").click();	
		return this;
	}
	public WorkTypePage enterWorkTypeName() {
		driver.findElementByXPath("(//input[@type = 'text'])[3]").sendKeys("Bootcamp");
		return this;
	}
	public WorkTypePage clickWorkTypeSaveButton() {
		driver.findElementByXPath("//button[@title = 'Save']").click();
		return this;
	}
	public WorkTypePage getWorkTypeCompleteThisFiledErrorMessage() {
		getWorkTypeCompleteThisFiledErrorMessage = driver.findElementByXPath("//li[text()='Complete this field.']").getText();
		System.out.println(getWorkTypeCompleteThisFiledErrorMessage);
		return this;
	}

    public WorkTypePage verifyWorkTypeCompleteThisFiledErrorMessage() {
    Assert.assertEquals(getWorkTypeCompleteThisFiledErrorMessage, "Complete this field.");
	return this;
} 
}
