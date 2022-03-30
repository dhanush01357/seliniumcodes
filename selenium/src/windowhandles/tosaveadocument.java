package windowhandles;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tosaveadocument {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//input[@name=\"fileupload\"]")).sendKeys("C:\\New folder");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@value=\"submit\"]")).click();
	}

}
