package properties.files;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.pom.EParaProjectSpecificMethods;
import base.pom.ProjectSpecificMethods;
import page.pom.OpportunitiesPage;
import parallebase.pm.ParaProjectSpecificMethods;

public class PropFileEParaOpportunitiesPage extends PropertiesFilesBasePOM{
   String getOppStageText;
   
	public PropFileEParaOpportunitiesPage(ChromeDriver driver) {
	this.driver = driver;
//	this.prop = Prop;
}
   
	public PropFileEParaOpportunitiesPage enterOpprtunitiesSearchListPEPropFile(String opportunitySearchName) {
		driver.findElementByXPath("(//input[@type= 'search'])[2]").sendKeys(opportunitySearchName, Keys.ENTER);
		return this;
	}

	public PropFileEParaOpportunitiesPage clickOpportunitiesDropDowniconPEPropFile() throws InterruptedException {
		Thread.sleep(2000);
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//div[@data-aura-class = 'forceVirtualAction']//a"));
		return this;
	}
	
	public PropFileEParaOpportunitiesPage clickOpportunitiesEditiconPEPropFile() {
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//a[@title= 'Edit']"));
		return this;
	}
	
	public PropFileEParaOpportunitiesPage enterOpportunitiesCloseDatePEPropFile(String opportunityDate) {
		WebElement input1 = driver.findElementByXPath("//input[@name= 'CloseDate']");
		input1.clear();
		input1.sendKeys(opportunityDate);
		return this;
	}
	public PropFileEParaOpportunitiesPage clickOpportunitiesStagePerceptionAnalysisPEPropFile() throws InterruptedException {
		driver.findElementByXPath("(//input[contains(@class,'slds-input slds-combobox__input')])[4]").click();
		Thread.sleep(2000);
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//lightning-base-combobox-item[@data-value = 'Perception Analysis']"));
		Thread.sleep(3000);
		return this;
	}
	public PropFileEParaOpportunitiesPage clickOpportunitiesDeliveryInstallationStatusInProgressPEPropFile() throws InterruptedException {
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//label[text()='Delivery/Installation Status']/following::input"));
		driver.findElementByXPath("//span[@title ='In progress']").click();
		Thread.sleep(2000);
		return this;
	}
	public PropFileEParaOpportunitiesPage enterOpportunitiesDescriptionPEPropFile(String opportunityDescription) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElementByXPath("//textarea[@class ='slds-textarea']").sendKeys(opportunityDescription);
		return this;
	}
	public PropFileEParaOpportunitiesPage clickOpportunitiesSaveButtonPEPropFile() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElementByXPath("//button[@name ='SaveEdit']").click();
		return this;
	}
	public PropFileEParaOpportunitiesPage getOpportunityStagePEPropFile() {
	getOppStageText = driver.findElementByXPath("//span[text()='Perception Analysis']").getText();
	System.out.println(getOppStageText);
	return this;
}
	public PropFileEParaOpportunitiesPage verifyOpportunityStagePEPropFile() {
		Assert.assertEquals(getOppStageText, "Perception Analysis");
		return this;
	}
	
}
