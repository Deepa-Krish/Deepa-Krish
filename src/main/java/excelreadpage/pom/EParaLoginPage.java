package excelreadpage.pom;

import org.openqa.selenium.chrome.ChromeDriver;

import base.pom.EParaProjectSpecificMethods;
import base.pom.ProjectSpecificMethods;
import parallebase.pm.ParaProjectSpecificMethods;

public class EParaLoginPage extends EParaProjectSpecificMethods{

	public EParaLoginPage(ChromeDriver driver) {
    	this.driver = driver;
    }
	
	public EParaLoginPage enterUsernamePE(String username) {
		driver.findElementById("username").sendKeys(username);
		return this;
	}
	
	public EParaLoginPage enterPasswordPE(String password) {
		driver.findElementById("password").sendKeys(password);
		return this;
	}
	
	public EParaHomePage clickLoginButtonPE() {
		driver.findElementById("Login").click();
		return new EParaHomePage(driver);
	}

}
