package excelreadtestcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.pom.EParaProjectSpecificMethods;
import base.pom.ProjectSpecificMethods;
import excelreadpage.pom.EParaLoginPage;
import page.pom.LoginPage;
import parallebase.pm.ParaProjectSpecificMethods;
import parallelpage.pom.ParaLoginPage;

public class EParaPomS3_3EditOpportunity extends EParaProjectSpecificMethods {
	
	@BeforeTest
	public void setFileName() {
		excelFileName = "editOpportunity";
	}
	
	@Test(dataProvider = "fetchData")
	
	public void runEParaPomS3_3EditOpportunity(String opportunitySearchName,String opportunityDate,String opportunityDescription) throws InterruptedException {

		new EParaLoginPage(driver)
		.enterUsernamePE("matschie@testleaf.com")
		.enterPasswordPE("India@123")
		.clickLoginButtonPE()
		.clickSwitchToLightningOptionPE()
		.clickAppLaunchericonPE()
		.clickViewAppOptionPE()
		.clickSalesButtonPE()
		.clickOpportunitiesbuttonPE()
		.enterOpprtunitiesSearchListPE(opportunitySearchName)
		.clickOpportunitiesDropDowniconPE()
		.clickOpportunitiesEditiconPE()
		.enterOpportunitiesCloseDatePE(opportunityDate)
		.clickOpportunitiesStagePerceptionAnalysisPE()
		.clickOpportunitiesDeliveryInstallationStatusInProgressPE()
		.enterOpportunitiesDescriptionPE(opportunityDescription)
		.clickOpportunitiesSaveButtonPE()
		.getOpportunityStagePE()
		.verifyOpportunityStagePE();
		
	}

}
