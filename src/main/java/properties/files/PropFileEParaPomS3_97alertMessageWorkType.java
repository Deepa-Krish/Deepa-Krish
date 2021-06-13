package properties.files;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.pom.EParaProjectSpecificMethods;
import base.pom.ProjectSpecificMethods;
import excelreadpage.pom.EParaLoginPage;
import page.pom.LoginPage;
import parallebase.pm.ParaProjectSpecificMethods;
import parallelpage.pom.ParaLoginPage;

public class PropFileEParaPomS3_97alertMessageWorkType extends PropertiesFilesBasePOM {

	@BeforeTest
	public void setFileName() {
  excelFileName = "workTypeErrorMessage";
	}

	@Test(dataProvider = "fetchData")
	
	public void runPropFilesEParaPomS3_97alertMessageWorkType(String workTypeName) {
		//new EParaLoginPage(driver,prop)
		new EParaLoginPage(driver)
		.enterUsernamePE(PropertiesFilesBasePOM.readConfigPropFiles("username"))
		.enterPasswordPE(PropertiesFilesBasePOM.readConfigPropFiles("password"))
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