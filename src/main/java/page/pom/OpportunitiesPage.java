package page.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.pom.ProjectSpecificMethods;

public class OpportunitiesPage extends ProjectSpecificMethods{
   String getOppStageText;
	public OpportunitiesPage enterOpprtunitiesSearchList() {
		driver.findElementByXPath("(//input[@type= 'search'])[2]").sendKeys("Salesforce Automation By DKK", Keys.ENTER);
		return this;
	}

	public OpportunitiesPage clickOpportunitiesDropDownicon() {
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//div[@data-aura-class = 'forceVirtualAction']//a"));
		return this;
	}
	
	public OpportunitiesPage clickOpportunitiesEditicon() {
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//a[@title= 'Edit']"));
		return this;
	}
	
	public OpportunitiesPage enterOpportunitiesCloseDate() {
		WebElement input1 = driver.findElementByXPath("//input[@name= 'CloseDate']");
		input1.clear();
		input1.sendKeys("6/9/2021");
		return this;
	}
	public OpportunitiesPage clickOpportunitiesStagePerceptionAnalysis() throws InterruptedException {
		driver.findElementByXPath("(//input[contains(@class,'slds-input slds-combobox__input')])[4]").click();
		Thread.sleep(2000);
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//lightning-base-combobox-item[@data-value = 'Perception Analysis']"));
		Thread.sleep(3000);
		return this;
	}
	public OpportunitiesPage clickOpportunitiesDeliveryInstallationStatusInProgress() throws InterruptedException {
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//label[text()='Delivery/Installation Status']/following::input"));
		driver.findElementByXPath("//span[@title ='In progress']").click();
		Thread.sleep(2000);
		return this;
	}
	public OpportunitiesPage enterOpportunitiesDescription() {
		driver.findElementByXPath("//textarea[@class ='slds-textarea']").sendKeys("Adding Description");
		return this;
	}
	public OpportunitiesPage clickOpportunitiesSaveButton() {
		driver.findElementByXPath("//button[@name ='SaveEdit']").click();
		return this;
	}
	public OpportunitiesPage getOpportunityStage() {
	getOppStageText = driver.findElementByXPath("//span[text()='Perception Analysis']").getText();
	System.out.println(getOppStageText);
	return this;
}
	public OpportunitiesPage verifyOpportunityStage() {
		Assert.assertEquals(getOppStageText, "Perception Analysis");
		return this;
	}
	
}
