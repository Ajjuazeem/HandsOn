package Practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScript {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = BaseSetup.Multibrowser();
		driver.get("https://www.flypgs.com/en");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement downloadlink = driver.findElement(By.xpath("//a[@href='https://app.adjust.com/v2st1jv_9kcu1ql']"));
		
		
		JavascriptExecutor jav = (JavascriptExecutor)driver;
//		jav.executeScript("window.scrollBy(0,800)");
//		jav.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		jav.executeScript("arguments[0].scrollIntoView()", downloadlink);
	}

}
