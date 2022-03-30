package selenium1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		Actions action =new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.F5).perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		action.sendKeys(Keys.F5).perform();
		
		

}
}