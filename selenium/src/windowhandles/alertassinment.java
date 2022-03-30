package windowhandles;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertassinment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	Alert a=driver.switchTo().alert();
	a.accept();
	a.accept();
	//driver.close();


}
}