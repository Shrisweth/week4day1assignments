package week4.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyValueAssignment {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://buythevalue.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		
		driver.findElement(By.xpath("//a[contains(text(),'URBAN FIT X SMART WATCH')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']")).sendKeys("600118");
		driver.findElement(By.xpath("//input[@value='Check']")).click();
		driver.findElement(By.xpath("//button[@id='product-add-to-cart']")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'View')])[2]")).click();
		driver.findElement(By.xpath("//input[@id='checkout']")).click();
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		
		
		
	}
	
	
	
	
	
	
	
}
