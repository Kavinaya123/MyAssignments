package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	     driver.get("http://leaftaps.com/opentaps/control/main");

	             driver.manage().window().maximize();
	             driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	             driver.findElement(By.id("password")).sendKeys("crmsfa");
	             driver.findElement(By.className("decorativeSubmit")).click();
	             driver.findElement(By.linkText("CRM/SFA")).click();
	             driver.findElement(By.linkText("Leads")).click();
	             driver.findElement(By.linkText("Create Lead")).click();
	             driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
	             driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Kavinaya");
	             driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Murali");
	             driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Kavinaya123");
	             
	             driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	             driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation");
	             driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Kavi123@testleaf.com");
	             
	             
	             WebElement value = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	             Select state =new Select(value);
	             state.selectByVisibleText("New York");
	             
	             driver.findElement(By.className("smallSubmit")).click();
	             
	             driver.findElement(By.linkText("Edit")).click();
	             driver.findElement(By.id("updateLeadForm_description")).click();
	             driver.findElement(By.id("updateLeadForm_description")).clear();
	          
	             
	             driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Testing");
	             driver.findElement(By.className("smallSubmit")).click();
	             
	             System.out.println(driver.getTitle());
	             driver.close();
	             
	             

	}

}
