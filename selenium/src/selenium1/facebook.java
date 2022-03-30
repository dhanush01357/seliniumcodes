package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("dhanush");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("s");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("90087654");
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("denmark321");
		WebElement date=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select dropdown=new Select(date);
		dropdown.selectByVisibleText("3");
		
		WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select dropdown2=new Select(month);
		dropdown2.selectByVisibleText("Jul");
		
		WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select dropdown3=new Select(year);
		dropdown3.selectByVisibleText("1998");		
}
}