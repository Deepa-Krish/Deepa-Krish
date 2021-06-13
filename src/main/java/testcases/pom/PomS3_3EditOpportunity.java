package testcases.pom;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.pom.ProjectSpecificMethods;
import page.pom.LoginPage;

public class PomS3_3EditOpportunity extends ProjectSpecificMethods {
	
//	@BeforeTest
//	public void setFileName() {
//		excelFileName = "ExcelReadingS3_3EditOpportunity";
//	}
//	
//	@Test(dataProvider = "fetchData")
	@Test
	
	public void runPomS3_3EditOpportunity() throws InterruptedException {

		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickSwitchToLightningOption()
		.clickAppLaunchericon()
		.clickViewAppOption()
		.clickSalesButton()
		.clickOpportunitiesbutton()
		.enterOpprtunitiesSearchList()
		.clickOpportunitiesDropDownicon()
		.clickOpportunitiesEditicon()
		.enterOpportunitiesCloseDate()
		.clickOpportunitiesStagePerceptionAnalysis()
		.clickOpportunitiesDeliveryInstallationStatusInProgress()
		.enterOpportunitiesDescription()
		.clickOpportunitiesSaveButton()
		.getOpportunityStage()
		.verifyOpportunityStage();
		
	}

}
