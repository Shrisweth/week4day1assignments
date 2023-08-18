package week4.day1.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAssignment {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		/*
		 * driver.findElement(By.xpath("(//span[contains(text(),'Open')])[1]")).click();
		 * 
		 * Set<String> win = driver.getWindowHandles(); ArrayList<String> winHandle =
		 * new ArrayList<String>(win); driver.switchTo().window(winHandle.get(1));
		 * System.out.println(driver.getTitle()); 
		 * driver.close();
		 */

		
		/*
		 * driver.findElement(By.xpath("(//span[contains(text(),'Open')])[2]")).click();
		 * Set<String> wind = driver.getWindowHandles();
		 * System.out.println(wind.size()); ArrayList<String> winHand = new
		 * ArrayList<String>(wind); String title1 =
		 * driver.switchTo().window(winHand.get(1)).getTitle();
		 * System.out.println("The child title is" +title1); String title3 =
		 * driver.switchTo().window(winHand.get(2)).getTitle();
		 * System.out.println("Te third title is" +title3); String title2 =
		 * driver.switchTo().window(winHand.get(0)).getTitle();
		 * System.out.println("Te parent title is" +title2); driver.close();
		 */  
		  // Incase here if you want to close other windows except the parent window, we have to iterate with for loop
		  
		  
		//  driver.findElement(By.xpath("(//span[contains(text(),'Open')])[2]")).click();
		//  Set<String> winds = driver.getWindowHandles();
		  //System.out.println(winds.size()); 
		  //ArrayList<String> winHands = new ArrayList<String>(wind); 
		 //for (int i = 1; i<winHands.size(); i++) {
			// driver.switchTo().window(winHands.get(i));
//driver.close();

/*driver.findElement(By.xpath("//span[contains(text(),'Close Windows')]")).click();	
Set<String> handles = driver.getWindowHandles();
System.out.println(handles.size());
ArrayList<String> handle = new ArrayList<String>(handles);
for (int i = 1; i < handle.size(); i++) {
 driver.switchTo().window(handle.get(i));
 driver.close();
*/
 
 driver.findElement(By.xpath("//span[contains(text(),'Open with delay')]")).click();
 
 Thread.sleep(5000);
 Set<String> han = driver.getWindowHandles();
 System.out.println(han.size());
 ArrayList<String> hans = new ArrayList<String>(han);
 for (int i = 1; i <hans.size() ; i++) {
 driver.switchTo().window(hans.get(i));
 driver.close();
 
 }

	}
}

	
