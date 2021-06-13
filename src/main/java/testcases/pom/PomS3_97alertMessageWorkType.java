package testcases.pom;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.pom.ProjectSpecificMethods;
import page.pom.LoginPage;

public class PomS3_97alertMessageWorkType extends ProjectSpecificMethods {

//	@BeforeTest
//	public void setFileName() {
//  excelFileName = " ??";
//	}

//	@Test(dataProvider = "fetchData")
	@Test
	public void runPomS3_97alertMessageWorkType() {
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickSwitchToLightningOption()
		.clickAppLaunchericon()
		.clickViewAppOption()
		.clickWorkType()
		.clickWorkTypeNewButton()
		.enterWorkTypeName()
		.clickWorkTypeSaveButton()
		.getWorkTypeCompleteThisFiledErrorMessage()
		.verifyWorkTypeCompleteThisFiledErrorMessage();

	}
}