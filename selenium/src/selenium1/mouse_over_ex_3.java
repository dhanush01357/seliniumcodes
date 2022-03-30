package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_over_ex_3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		WebElement jobsearch=driver.findElement(By.xpath("//a[@data-check=\"menutab\"]"));
		action.moveToElement(jobsearch).build().perform();
		driver.findElement(By.xpath(""))

}
}