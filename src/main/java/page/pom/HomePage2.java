package page.pom;

import base.pom.ProjectSpecificMethods;

public class HomePage2 extends ProjectSpecificMethods {

	public OpportunitiesPage clickOpportunitiesbutton() {
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//span[text() = 'Opportunities']"));
        return new OpportunitiesPage();
	}

}
