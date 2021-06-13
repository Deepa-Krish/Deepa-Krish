package parallelpage.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.pom.ProjectSpecificMethods;
import page.pom.OpportunitiesPage;
import parallebase.pm.ParaProjectSpecificMethods;

public class ParaOpportunitiesPage extends ParaProjectSpecificMethods{
   String getOppStageText;
   
   public ParaOpportunitiesPage(ChromeDriver driver) {
   	this.driver = driver;
   }
   
	public ParaOpportunitiesPage enterOpprtunitiesSearchListP() {
		driver.findElementByXPath("(//input[@type= 'search'])[2]").sendKeys("Salesforce Automation By DKK", Keys.ENTER);
		return this;
	}

	public ParaOpportunitiesPage clickOpportunitiesDropDowniconP() throws InterruptedException {
		Thread.sleep(2000);
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//div[@data-aura-class = 'forceVirtualAction']//a"));
		return this;
	}
	
	public ParaOpportunitiesPage clickOpportunitiesEditiconP() {
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//a[@title= 'Edit']"));
		return this;
	}
	
	public ParaOpportunitiesPage enterOpportunitiesCloseDateP() {
		WebElement input1 = driver.findElementByXPath("//input[@name= 'CloseDate']");
		input1.clear();
		input1.sendKeys("6/9/2021");
		return this;
	}
	public ParaOpportunitiesPage clickOpportunitiesStagePerceptionAnalysisP() throws InterruptedException {
		driver.findElementByXPath("(//input[contains(@class,'slds-input slds-combobox__input')])[4]").click();
		Thread.sleep(2000);
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//lightning-base-combobox-item[@data-value = 'Perception Analysis']"));
		Thread.sleep(3000);
		return this;
	}
	public ParaOpportunitiesPage clickOpportunitiesDeliveryInstallationStatusInProgressP() throws InterruptedException {
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//label[text()='Delivery/Installation Status']/following::input"));
		driver.findElementByXPath("//span[@title ='In progress']").click();
		Thread.sleep(2000);
		return this;
	}
	public ParaOpportunitiesPage enterOpportunitiesDescriptionP() {
		driver.findElementByXPath("//textarea[@class ='slds-textarea']").sendKeys("Adding Description");
		return this;
	}
	public ParaOpportunitiesPage clickOpportunitiesSaveButtonP() {
		driver.findElementByXPath("//button[@name ='SaveEdit']").click();
		return this;
	}
	public ParaOpportunitiesPage getOpportunityStageP() {
	getOppStageText = driver.findElementByXPath("//span[text()='Perception Analysis']").getText();
	System.out.println(getOppStageText);
	return this;
}
	public ParaOpportunitiesPage verifyOpportunityStageP() {
		Assert.assertEquals(getOppStageText, "Perception Analysis");
		return this;
	}
	
}
