package week4.day1.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("demoSalesManager");

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		
		driver.findElement(By.linkText("CRM/SFA")).click();

		
driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();		
		
	driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]")).click();	
		
		
	driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
	Set<String> handle = driver.getWindowHandles();
		
	System.out.println(handle.size());	
	ArrayList<String> handles = new ArrayList<String>(handle);
	String title = driver.switchTo().window(handles.get(1)).getTitle();
		System.out.println(title);
		
		WebElement demo = driver.findElement(By.xpath("(((//div[@class='x-panel-mc'])[2]//table[@class='x-grid3-row-table'])[1]//a[@class='linktext'])[1]"));
		demo.click();
				driver.switchTo().window(handles.get(0));
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> handlee = driver.getWindowHandles();
			
		System.out.println(handle.size());	
		ArrayList<String> handless = new ArrayList<String>(handlee);
		String titles = driver.switchTo().window(handless.get(1)).getTitle();
			System.out.println(titles);
			

			
		WebElement demoo = driver.findElement(By.xpath("(((//div[@class='x-panel-mc'])[2]//table[@class='x-grid3-row-table'])[2]//a[@class='linktext'])[1]"));	
			demoo.click();
			
			driver.switchTo().window(handles.get(0));
driver.findElement(By.xpath("(//a[contains(text(),'Merge')])[2]")).click();
Alert alert = driver.switchTo().alert();
		String texts = alert.getText();
		System.out.println(texts);
		
	alert.accept();
	String title2 = driver.getTitle();
	System.out.println(title2);
		
		
		
	}

}
