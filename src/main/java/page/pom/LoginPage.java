package page.pom;

import base.pom.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	//String getOppStageText;
	public LoginPage enterUsername() {
		driver.findElementById("username").sendKeys("matschie@testleaf.com");
		return this;
	}
	
	public LoginPage enterPassword() {
		driver.findElementById("password").sendKeys("India@123");
		return this;
	}
	
	public HomePage clickLoginButton() {
		driver.findElementById("Login").click();
		return new HomePage();
	}

}
