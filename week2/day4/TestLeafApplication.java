package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.Select;

public class TestLeafApplication {

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
	             driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	             driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kavinaya");
	             driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Murali");
	             //driver.findElement(By.className("smallSubmit")).click();
	           //locating the dropdown element then return as a webelement
	             WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	             //Create obj for Select
	             Select employee =new Select(source);
	             //methods to pick the specific option
	             employee.selectByIndex(3);
	             
	             WebElement value = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	             Select automobile =new Select(value);
	             automobile.selectByVisibleText("Automobile");
	             
	             WebElement text = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	             Select corporation =new Select(text);
	             corporation.selectByValue("OWN_SCORP");
	             
	             driver.findElement(By.className("smallSubmit")).click();
	             //String title=driver.getTitle();
	             //System.out.println(title);
	             
	             System.out.println(driver.getTitle());
	             driver.close();    

	}	

}
