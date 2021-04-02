package FirstTestNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestng
{
	public WebDriver aahDriver ; 

	/*
	 * @BeforeTest public void beforeMethodFun() {
	 * System.out.println("STARTING TESTNG CODE NOW !"); }
	 */
   
    @Test    
	public void Loginfirst() throws InterruptedException
	{
		  	// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "D:\\AJAY\\SOFTWARE\\ChromeDriver\\chromedrivers.exe");
				WebDriver aahDriver = new ChromeDriver();
			
				aahDriver.manage().window().maximize();
				//aahDriver.get("https://allaboardhealth.com/DBS/6eaD1eFcda308Ec");   ADMIN URL
				
				//Hit the LOGIN url in Browser
				aahDriver.get("https://allaboardhealth.com/login");
		        Thread.sleep(3000);
		        
		        //CLick on SIGNIN Menu 
		        aahDriver.findElement(By.xpath("//a[contains(text(),'Sign-In')]")).click();
		        Thread.sleep(3000);
		        
		        //Clear the EMAIL Fields and INPUTTED NEW  EMAIL ID 
		        aahDriver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).clear();
		        WebElement email=aahDriver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]"));
				email.sendKeys("mok@logixbuilt.com");
				Thread.sleep(3000);
						
		        //Clear the PASSWORD  Fields and INPUTTED NEW  PASSWORD 
				aahDriver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).clear();
				WebElement Passu=aahDriver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]"));
				Passu.sendKeys("Testing@123");
				Thread.sleep(3000);
				
				aahDriver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]")).click();
				Thread.sleep(5000);			  
	  }
    
	    @AfterTest
	    public void terminateBrowser()
	    {	    			
	        this.aahDriver.close();
	    }
}
