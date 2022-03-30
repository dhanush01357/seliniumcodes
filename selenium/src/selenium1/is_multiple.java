package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class is_multiple {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dell/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/dropDown%20(1).html");
		WebElement manual=driver.findElement(By.xpath("//select[@id=\"m1\"]"));
		Select fruits=new Select(manual);
		System.out.println(fruits.isMultiple());

}
}