package windowhandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframes {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"google_esf\"]")));
driver.findElement(By.xpath("//li[@id=\"iFrame\"]")).click();
Thread.sleep(3000);
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"google_esf\"]")));
Thread.sleep(3000);
driver.findElement(By.id("s")).sendKeys("books");
Actions action =new Actions(driver);
WebElement performance=driver.findElement(By.xpath("//span[@id=\"current_filter\"]"));
action.moveToElement(performance).click().perform();

}
}