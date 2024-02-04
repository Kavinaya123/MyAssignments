package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	
	

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.linkText("Phone")).click();
        //driver.findElement(By.className("phoneNumber")).click();
        driver.findElement(By.name("phoneNumber")).sendKeys("10002");
        
        
        driver.findElement(By.id("ext-gen334")).click();
        Thread.sleep(2000);
        	
        
        driver.findElement(By.xpath("//a[text()='14962']")).click();
        
        driver.findElement(By.className("subMenuButtonDangerous")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.name("id")).sendKeys("14962");
        driver.findElement(By.id("ext-gen334")).click();
        driver.findElement(By.linkText("No records to display"));
        
        driver.close();
        
        
        
		
		

	}

}
