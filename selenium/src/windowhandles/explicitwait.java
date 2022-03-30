package windowhandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		WebDriverWait wait =new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href=\"/login\"]")));
		driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
		driver.findElement(By.id("Email")).sendKeys("dhanush01357@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Denmark#321");
		driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]")).click();
}
}