package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class get_options {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("(//a[@href=\"/books\"])[3]")).click();
	WebElement sortby=driver.findElement(By.xpath("//select[@name=\"products-orderby\"]"));
	Select element=new Select(sortby);
	Thread.sleep(3000);
	List<WebElement> options=element.getOptions();
	
	for(int i=0;i<options.size();i++)
	{
		WebElement sortby1=driver.findElement(By.xpath("//select[@name=\"products-orderby\"]"));
		Select element1=new Select(sortby1);
		element1.selectByIndex(i);
	}
}
}
