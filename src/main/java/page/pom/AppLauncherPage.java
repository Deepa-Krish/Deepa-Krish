package page.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.pom.ProjectSpecificMethods;

public class AppLauncherPage extends ProjectSpecificMethods {

	public HomePage2 clickSalesButton(){
		driver.findElementByXPath("//p[text()='Sales']").click();
        return new HomePage2();
	}
	public WorkTypePage clickWorkType() {
	WebElement worktype = driver.findElementByXPath("//p[text() = 'Work Types']");
	Actions action = new Actions(driver);
	action.moveToElement(worktype).click().perform();
    return new WorkTypePage();
}
}
