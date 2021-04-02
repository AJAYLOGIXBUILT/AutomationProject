package FirstTestNGpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.sun.tools.javac.util;

public class SecondTestng 
{
   	  public String baseUrl = "https://allaboardhealth.com/login";
	  public WebDriver aahDriver;	     
		
	  @BeforeTest
	   public void openBrowser() 
	   {	
		 System.setProperty("webdriver.chrome.driver", "D:\\AJAY\\SOFTWARE\\ChromeDriver\\chromedrivers.exe");
		 aahDriver = new ChromeDriver();
		 aahDriver.get(baseUrl);
		} 
	   	    	      
		@Test
		public void verifyHomepageTitle() 
		 {
		   String expectedTitle = "All Aboard Health";
		   String actualTitle = aahDriver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
		 }
		   
		  @AfterMethod
		  public void loginAAH() throws InterruptedException
		   {
		            	   		   
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
		       aahDriver.close();
		 }
		 		 
}
	   
	   
