package excelreadpage.pom;

import org.openqa.selenium.chrome.ChromeDriver;

import base.pom.EParaProjectSpecificMethods;
import base.pom.ProjectSpecificMethods;
import parallebase.pm.ParaProjectSpecificMethods;

public class EParaHomePage2 extends EParaProjectSpecificMethods {

	public EParaHomePage2(ChromeDriver driver) {
    	this.driver = driver;
    }
	
	public EParaOpportunitiesPage clickOpportunitiesbuttonPE() {
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//span[text() = 'Opportunities']"));
        return new EParaOpportunitiesPage(driver);
	}

}
