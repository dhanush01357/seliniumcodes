package windowhandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframe1 {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
	driver.get("http://www.globalsqa.com/demo-site/frames-and-windows/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//li[@id='iFrame']")).click();
	Thread.sleep(2000);
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='globalSqa']")));
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='s']")).sendKeys("books");
	Thread.sleep(2000);
	
	Actions action = new Actions(driver);
	WebElement all=driver.findElement(By.xpath("//span[@id='current_filter']"));
	action.moveToElement(all).build().perform();
	
	WebElement Automation =driver.findElement(By.xpath("//div[text()='Automation']"));
	action.moveToElement(Automation).click().perform();
}
}