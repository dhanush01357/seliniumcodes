package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class get_optionS_viewas {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[@href=\"/books\"])[3]")).click();
		WebElement viewas=driver.findElement(By.xpath("//select[@name=\"products-viewmode\"]"));
		Select element=new Select(viewas);
		Thread.sleep(3000);
	List<WebElement>	options=element.getOptions();
	
	for(int i=0;i<=options.size();i++)
	{
		WebElement viewas1=driver.findElement(By.xpath("//select[@name=\"products-viewmode\"]"));
		Select element1=new Select(viewas1);
		element1.selectByIndex(i);
	}
	}

}
