package Practice;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownWoutSelect {

	public static void main(String[] args) throws IOException {
		WebDriver driver = BaseSetup.Multibrowser();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		List<WebElement> ws = driver.findElements(By.xpath("//select[@name='dropdown3']//option"));
		System.out.println(ws.size());
		for(int i=0;i<ws.size();i++) {
			if(ws.get(i).getText().equalsIgnoreCase("Loadrunner")) {
				ws.get(i).click();
				break;
			}
		
		}

	}

}
