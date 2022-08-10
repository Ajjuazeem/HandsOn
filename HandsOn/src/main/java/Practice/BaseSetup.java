package Practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseSetup {
	
	public static WebDriver driver;
	
	
	public static String getdata(String key) throws IOException {
		String Value;
		FileReader file = new FileReader("C:\\Users\\PERSONAL-LAPTOP\\eclipse-workspace\\HandsOn\\Test.Properties");
		Properties p = new Properties();
		p.load(file);
		Value = p.getProperty(key);
		return Value;
		
		
	}
	
	public static WebDriver Multibrowser() throws IOException {
		String browser =  getdata("browser");
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium learning\\Browsers Driver\\chromeupdated driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.geckodriver.driver", "F:\\Selenium learning\\Browsers Driver\\chromeupdated driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}
		
	
		
	
}
