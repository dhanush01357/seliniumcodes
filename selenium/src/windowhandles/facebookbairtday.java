package windowhandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookbairtday {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		Thread.sleep(3000);
		WebElement date=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select dropdown=new Select(date);
		dropdown.selectByIndex(23);
		WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select dropdown2=new Select(month);
		dropdown2.selectByIndex(6);
		
		WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select dropdown3=new Select(year);
		dropdown3.selectByIndex(24);	
		

}
}