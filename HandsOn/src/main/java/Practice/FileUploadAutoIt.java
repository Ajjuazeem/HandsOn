package Practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FileUploadAutoIt {

	public static void main(String[] args) throws InterruptedException {
		
		try {
			WebDriver driver = BaseSetup.Multibrowser();
			driver.get("https://djangovinoth.pythonanywhere.com/FileUploadDownload/");
			WebElement choose = driver.findElement(By.xpath("//input[@class='btn btn-info']"));
			Actions act = new Actions(driver);
			act.moveToElement(choose).click().build().perform();
			Thread.sleep(3000);
			Runtime.getRuntime().exec("F:\\Selenium learning\\Fileuploadcard.exe");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
