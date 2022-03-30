package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class regstration {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("dhanush");
		driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("s");
		driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("900825567");
		driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("dhanush017@gmail.com");
		
	driver.findElement(By.xpath("//input[@name=\"address1\"]")).sendKeys("955 prakashnagar");
	driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("banglore");
	driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys("india");
	driver.findElement(By.xpath("//input[@name=\"postalCode\"]")).sendKeys("560021");
	Thread.sleep(3000);
	WebElement country=driver.findElement(By.xpath("//select[@name=\"country\"]"));
		Select dropdown=new Select(country);
		dropdown.selectByVisibleText("FRANCE");
		driver.findElement(By.id("email")).sendKeys("dhanush0135@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Denmark#321");
		driver.findElement(By.xpath("//input[@name=\"confirmPassword\"]")).sendKeys("Denmark#321");
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
	}

}
