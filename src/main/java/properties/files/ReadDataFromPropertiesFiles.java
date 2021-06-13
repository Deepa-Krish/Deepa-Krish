package properties.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromPropertiesFiles {
	//	    public static void main(String[] args) throws Exception  {
	//		FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
	//		Properties prop = new Properties();
	//		prop.load(fis);
	//		WebDriverManager.chromedriver().setup();
	//		ChromeDriver driver = new ChromeDriver();
	//		driver.manage().window().maximize();
	//		driver.get(prop.getProperty("url"));
	//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//		driver.findElementById("username").sendKeys(prop.getProperty("username"));
	//		driver.findElementById("password").sendKeys(prop.getProperty("password"));
	//		driver.findElementById("Login").click();

	public static String readConfigPropFiles(String key) {
		Properties prop = new Properties();
		String value = null;
		try {
			FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
			prop.load(fis);
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
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       return value;
	}
	
}


