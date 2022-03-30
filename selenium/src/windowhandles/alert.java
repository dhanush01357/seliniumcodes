package windowhandles;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	WebElement button= driver.findElement(By.xpath("//button[@id=\"alertBox\"]"));
Actions action=new Actions(driver);
	action.click(button).perform();
		Thread.sleep(3000);
	Alert ewb=	driver.switchTo().alert();
ewb.accept();
}
}