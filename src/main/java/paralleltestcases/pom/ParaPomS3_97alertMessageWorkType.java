package paralleltestcases.pom;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.pom.ProjectSpecificMethods;
import page.pom.LoginPage;
import parallebase.pm.ParaProjectSpecificMethods;
import parallelpage.pom.ParaLoginPage;

public class ParaPomS3_97alertMessageWorkType extends ParaProjectSpecificMethods {

//	@BeforeTest
//	public void setFileName() {
//  excelFileName = " ??";
//	}

//	@Test(dataProvider = "fetchData")
	@Test
	public void runParaPomS3_97alertMessageWorkType() {
		new ParaLoginPage(driver)
		.enterUsernameP()
		.enterPasswordP()
		.clickLoginButtonP()
		.clickSwitchToLightningOptionP()
		.clickAppLaunchericonP()
		.clickViewAppOptionP()
		.clickWorkTypeP()
		.clickWorkTypeNewButtonP()
		.enterWorkTypeNameP()
		.clickWorkTypeSaveButtonP()
		.getWorkTypeCompleteThisFiledErrorMessageP()
		.verifyWorkTypeCompleteThisFiledErrorMessageP();

	}
}