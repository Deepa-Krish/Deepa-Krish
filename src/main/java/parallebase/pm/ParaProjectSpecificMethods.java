package parallebase.pm;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import readExcel.utils.PomReadExcelSheetCommon;
//import readExcelFromBaseClass.Commondata.ReadExcelSheetCommon;

public class ParaProjectSpecificMethods {
	public ChromeDriver driver;
//	public String excelFileName;


	@BeforeMethod(alwaysRun=true)
	public void preCondition() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	//  
	//            @AfterMethod(alwaysRun=true)
	//             public void postCondition() throws InterruptedException {
	//	         Thread.sleep(5000);
	//		     driver.close();
	//  }

//	@DataProvider(name = "fetchData")
//	public String[][] sendDataToTest() throws IOException {
//		//ReadExcelSheetCommon re = new ReadExcelSheetCommon();
//		// return re.pomreadData(excelFileName);
//		return PomReadExcelSheetCommon.pomreadData(excelFileName);
//	}	
}
