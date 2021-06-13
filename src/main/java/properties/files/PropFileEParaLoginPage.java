package properties.files;

import org.openqa.selenium.chrome.ChromeDriver;

import base.pom.EParaProjectSpecificMethods;
import base.pom.ProjectSpecificMethods;
import parallebase.pm.ParaProjectSpecificMethods;

public class PropFileEParaLoginPage extends PropertiesFilesBasePOM{

	public PropFileEParaLoginPage(ChromeDriver driver) {
	this.driver = driver;
//	this.prop = Prop;
}
	
	public PropFileEParaLoginPage enterUsernamePEPropFile(String username) {
		//driver.findElementById("username").sendKeys(username);
		driver.findElementById(PropertiesFilesBasePOM.readObjectPropFiles("PropFileEParaLoginPage", "PropFileEParaLoginPage.Username.Id")).sendKeys(username);
		return this;
	}
	
	public PropFileEParaLoginPage enterPasswordPEPropFile(String password) {
		//driver.findElementById("password").sendKeys(password);
		driver.findElementById(PropertiesFilesBasePOM.readObjectPropFiles("PropFileEParaLoginPage", "PropFileEParaLoginPage.Password.Id")).sendKeys(password);;
		return this;
	}
	
	public PropFileEParaHomePage clickLoginButtonPEPropFile() {
		//driver.findElementById("Login").click();
		driver.findElementByXPath(PropertiesFilesBasePOM.readObjectPropFiles("PropFileEParaHomePage.LoginButton.Id", "Login")).click();
		//return new PropFileEParaHomePage(driver,prop);
		return new PropFileEParaHomePage(driver);
	}

}
