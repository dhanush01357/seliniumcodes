package windowhandles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class synchrounisations {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit .SECONDS);
		driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit .SECONDS);
		driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
		driver.findElement(By.id("FirstName")).sendKeys("dhanush");
		driver.findElement(By.id("LastName")).sendKeys("s");
		driver.findElement(By.id("Email")).sendKeys("dhanusd,kdkdm1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Denmark#321");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Denmark#321");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id=\"register-button\"]")).click();
}
}