package Practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseSetup {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = BaseSetup.Multibrowser();
		driver.get("https://djangovinoth.pythonanywhere.com/login/");
		driver.manage().window().maximize();
//		WebDriverWait wait = new WebDriverWait(driver, null);
//		wait.until(ExpectedConditions.alertIsPresent());
		
		
		
		WebElement Uname = driver.findElement(By.id("id_username"));
		Uname.sendKeys(getdata("username"));
		WebElement Pword = driver.findElement(By.id("id_password"));
		Pword.sendKeys(getdata("password"));
		WebElement Lbutton = driver.findElement(By.xpath("//button[@class='btn btn-outline-info']"));
		Lbutton.click();
		
	}

}
