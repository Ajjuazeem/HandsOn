package Practice;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws IOException {
		WebDriver driver = BaseSetup.Multibrowser();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--start-Maximized");
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement drop = driver.findElement(By.id("dropdown1"));
		Select sl = new Select(drop);
		sl.selectByValue("3");
		WebElement slopt = sl.getFirstSelectedOption();
		System.out.println(slopt.getText());
		List<WebElement> allopt = sl.getOptions();
		System.out.println(allopt.size());
		for(int i=0;i<allopt.size();i++) {
			System.out.println(allopt.get(i).getText());
		}

	}

}
