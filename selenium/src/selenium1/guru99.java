package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class guru99 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		 WebElement demo=driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
		Thread.sleep(3000);
		 action.doubleClick(demo).perform();
		Thread.sleep(3000);
		

}
}