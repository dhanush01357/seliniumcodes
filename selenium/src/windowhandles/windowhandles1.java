package windowhandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		  
	String parenthandle=	driver.getWindowHandle();
	System.out.println(parenthandle);
	driver.findElement(By.id("newWindowBtn")).click();
	
	Set<String> childhandle=driver.getWindowHandles();
	for(String handle : childhandle) {
		
		System.out.println(handle);
		if(!handle.equals(parenthandle)) {
			driver.switchTo().window(handle);
			driver.findElement(By.id("firstName")).sendKeys("dhanush");
			driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("s");
			driver.findElement(By.id("englishchbx")).click();
			driver.findElement(By.id("email")).sendKeys("dhanush0@gmail.com");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("denmark123@");
			driver.findElement(By.xpath("//button[@id=\"registerbtn\"]")).click();
			Thread.sleep(3000);
			
			
			driver.switchTo().window(parenthandle);
			driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("dhjanjj");
		}
	}
	driver.quit();
	
	}

}
