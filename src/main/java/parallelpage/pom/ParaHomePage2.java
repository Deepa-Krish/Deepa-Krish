package parallelpage.pom;

import org.openqa.selenium.chrome.ChromeDriver;

import base.pom.ProjectSpecificMethods;
import parallebase.pm.ParaProjectSpecificMethods;

public class ParaHomePage2 extends ParaProjectSpecificMethods {

	public ParaHomePage2(ChromeDriver driver) {
    	this.driver = driver;
    }
	
	public ParaOpportunitiesPage clickOpportunitiesbuttonP() {
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//span[text() = 'Opportunities']"));
        return new ParaOpportunitiesPage(driver);
	}

}
