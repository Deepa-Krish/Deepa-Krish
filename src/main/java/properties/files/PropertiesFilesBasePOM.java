package properties.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;
import readExcel.utils.PomReadExcelSheetCommon;

public class PropertiesFilesBasePOM {
	
    public static ChromeDriver driver;
	public String excelFileName;
    public static Properties prop;
     
    public static String readConfigPropFiles(String key) {
		 prop = new Properties();
		String value = null;
		try {
			FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
			prop.load(fis);
			value = prop.getProperty(key);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       return value;
	}
	
	public static String readObjectPropFiles(String fileName, String key) {
		Properties prop = new Properties();
		String value = null;
		try {
			FileInputStream fis = new FileInputStream("./src/main/resources/ObjectRepositories/"+fileName+".properties");
			prop.load(fis);
			value = prop.getProperty(key);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       return value;
	}
	


	@BeforeMethod(alwaysRun=true)
	public void preCondition() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		//driver.get(prop.getProperty("url"));
		driver.get(readConfigPropFiles("url"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	//  
	//            @AfterMethod(alwaysRun=true)
	//             public void postCondition() throws InterruptedException {
	//	         Thread.sleep(5000);
	//		     driver.close();
	//  }

	@DataProvider(name = "fetchData")
	public String[][] sendDataToTest() throws IOException {
		//ReadExcelSheetCommon re = new ReadExcelSheetCommon();
		// return re.pomreadData(excelFileName);
		return PomReadExcelSheetCommon.pomreadData(excelFileName);
	}	
}
