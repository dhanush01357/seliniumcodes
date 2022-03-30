package windowhandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demofacebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		String parent=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]")).click();
		
Set<String> child=driver.getWindowHandles();
for(String handle : child)
{
	if(!handle.equals(parent))
	{
		driver.switchTo().window(handle);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("45678398");
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]")).sendKeys("books");
	}
}
}
}
