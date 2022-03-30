package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_by_visability {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[@href=\"/books\"])[3]")).click();
		WebElement element=driver.findElement(By.xpath("//select[@name=\"products-orderby\"]"));
	Select optins=new Select(element);
	optins.selectByVisibleText("Name: A to Z");
	}

}
