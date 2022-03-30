package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class fruits {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Dell/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/dropDown%20(1).html");
	WebElement manual=driver.findElement(By.xpath("//select[@id=\"m1\"]"));
	Select fruits=new Select(manual);
	fruits.selectByValue("6");
	Thread.sleep(3000);
	
	fruits.selectByIndex(2);
	Thread.sleep(2000);
	
	fruits.selectByVisibleText("Orange");
	fruits.deselectByValue("6");
	Thread.sleep(3000);
	fruits.deselectByIndex(2);
	Thread.sleep(3000);
	fruits.deselectByVisibleText("Orange");
}
}