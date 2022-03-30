package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_over_ex_2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		Actions action =new Actions(driver);
		WebElement electronic=driver.findElement(By.xpath("//a[@href=\"/electronics\"]"));
		action.moveToElement(electronic).build().perform();
		WebElement note=driver.findElement(By.xpath("//a[@href=\"/cell-phones\"]"));
		action.moveToElement(note).click().perform();

}
}
