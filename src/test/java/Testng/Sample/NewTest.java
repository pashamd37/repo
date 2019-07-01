package Testng.Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver ;
  @Test(priority = 0)
  public void open() {
	  String baseUrl = "https://www.myntra.com/";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohammadp\\Desktop\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
  }
  
  @Test(priority = 1)
  public void login() {
	  driver.findElement(By.cssSelector("a[href='/shop/men']")).click();
	  driver.findElement(By.cssSelector("a[href='/men-casual-shoes?src=sNav']")).click();
	  
  
  
  
  }
  
  
}
