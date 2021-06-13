package paralleltestcases.pom;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.pom.ProjectSpecificMethods;
import page.pom.LoginPage;
import parallebase.pm.ParaProjectSpecificMethods;
import parallelpage.pom.ParaLoginPage;

public class ParaPomS3_3EditOpportunity extends ParaProjectSpecificMethods {
	
//	@BeforeTest
//	public void setFileName() {
//		excelFileName = "ExcelReadingS3_3EditOpportunity";
//	}
//	
//	@Test(dataProvider = "fetchData")
	@Test
	
	public void runParaPomS3_3EditOpportunity() throws InterruptedException {

		new ParaLoginPage(driver)
		.enterUsernameP()
		.enterPasswordP()
		.clickLoginButtonP()
		.clickSwitchToLightningOptionP()
		.clickAppLaunchericonP()
		.clickViewAppOptionP()
		.clickSalesButtonP()
		.clickOpportunitiesbuttonP()
		.enterOpprtunitiesSearchListP()
		.clickOpportunitiesDropDowniconP()
		.clickOpportunitiesEditiconP()
		.enterOpportunitiesCloseDateP()
		.clickOpportunitiesStagePerceptionAnalysisP()
		.clickOpportunitiesDeliveryInstallationStatusInProgressP()
		.enterOpportunitiesDescriptionP()
		.clickOpportunitiesSaveButtonP()
		.getOpportunityStageP()
		.verifyOpportunityStageP();
		
	}

}
