package Practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium learning\\Browsers Driver\\chromeupdated driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("cricket"+Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,1000)");
		
		TakesScreenshot sc = (TakesScreenshot)driver;
		File take = sc.getScreenshotAs(OutputType.FILE);
		File save = new File("C:\\Users\\PERSONAL-LAPTOP\\eclipse-workspace\\HandsOn\\src\\test\\resources\\Screenshot\\test.png");
		FileUtils.copyDirectory(take, save);
		

	}

}
