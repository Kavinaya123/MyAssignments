package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
     ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");


//username: demosalesmanager    password:crmsfa



        driver.manage().window().maximize();
        //Find the element then enter the username
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        //Find the element then enter the password
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        //Find the element click login
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kavinaya");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Murali");
        driver.findElement(By.className("smallSubmit")).click();
        
        
        
        
        
        
        
        //close the browser
        //driver.close();
        
        
    }


	}


