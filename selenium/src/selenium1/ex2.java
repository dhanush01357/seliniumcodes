package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> objlinks = driver.findElements(By.tagName("a"));
		for(int i=0;i<objlinks.size();i++)
		{
			System.out.println(objlinks.get(i).getAttribute("text"));
		}
	}
	}


