package parallelpage.pom;

import org.openqa.selenium.chrome.ChromeDriver;

import base.pom.ProjectSpecificMethods;
import parallebase.pm.ParaProjectSpecificMethods;

public class ParaLoginPage extends ParaProjectSpecificMethods{

	public ParaLoginPage(ChromeDriver driver) {
    	this.driver = driver;
    }
	
	public ParaLoginPage enterUsernameP() {
		driver.findElementById("username").sendKeys("matschie@testleaf.com");
		return this;
	}
	
	public ParaLoginPage enterPasswordP() {
		driver.findElementById("password").sendKeys("India@123");
		return this;
	}
	
	public ParaHomePage clickLoginButtonP() {
		driver.findElementById("Login").click();
		return new ParaHomePage(driver);
	}

}
