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

public class EParaPomS3_97alertMessageWorkType extends EParaProjectSpecificMethods {

	@BeforeTest
	public void setFileName() {
  excelFileName = "workTypeErrorMessage";
	}

	@Test(dataProvider = "fetchData")
	
	public void runEParaPomS3_97alertMessageWorkType(String workTypeName) {
		new EParaLoginPage(driver)
		.enterUsernamePE("matschie@testleaf.com")
		.enterPasswordPE("India@123")
		.clickLoginButtonPE()
		.clickSwitchToLightningOptionPE()
		.clickAppLaunchericonPE()
		.clickViewAppOptionPE()
		.clickWorkTypePE()
		.clickWorkTypeNewButtonPE()
		.enterWorkTypeNamePE(workTypeName)
		.clickWorkTypeSaveButtonPE()
		.getWorkTypeCompleteThisFiledErrorMessagePE()
		.verifyWorkTypeCompleteThisFiledErrorMessagePE();

	}
}