package FirstTestNGpackage;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sun.tools.javac.util.List;

//import com.sun.tools.javac.util.List;

public class ThirdTestNG 
{
  	public WebDriver myDriver;	
    public String baseUrl = "https://crm.plscare.com/login";
    public WebElement Master;
    
    
	@BeforeTest
	public void openBrowser() 
	{	
		 System.setProperty("webdriver.chrome.driver", "D:\\AJAY\\SOFTWARE\\ChromeDriver\\chromedrivers.exe");
		 myDriver = new ChromeDriver();
		 myDriver.manage().window().maximize();
		 myDriver.get(baseUrl);
	} 
		
	@Test
	public void verifyHomepageTitle() 
	{
	   String expectedTitle = "[AdminLTE 3 | Validation Form]";
	   String actualTitle = myDriver.getTitle();
	   Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	
	@Test
	public void Login() throws InterruptedException
	{
	    //Clear the EMAIL Fields and INPUTTED NEW  EMAIL ID 
		myDriver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).clear();
        WebElement email=myDriver.findElement(By.xpath("//input[@id='exampleInputEmail1']"));
        email.sendKeys("sa@mailinator.com");
		Thread.sleep(3000);
				
        //Clear the PASSWORD  Fields and INPUTTED NEW  PASSWORD 
		myDriver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).clear();
		WebElement Psd=myDriver.findElement(By.xpath("//input[@id='exampleInputPassword1']"));
		Psd.sendKeys("admin@123");
		Thread.sleep(3000);
		
		myDriver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
				
		
		
		WebElement select = myDriver.findElement(By.xpath("//body/div[2]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]"));
		List <WebElement> options = select.findElements(By.tagName("p"));

		for (WebElement option : options) {

		    if("Masters".equals(option.getText()))

		        option.click();   

		}
		
		
		WebElement categoriesDropDown = myDriver.findElement(By.className("nav-item has-treeview menu-open"));
		categoriesDropDown.click();
				
		Select categories = new Select(categoriesDropDown);
		categories.selectByValue("Masters");
		
		//List<WebElement> allSelectedOptions = categories.getAllSelectedOptions();
		

		/*
		 * List<WebElement> optionsList = categories.getOptions();
		 * System.out.println(“The options list : “); for (WebElement option :
		 * optionsList) { System.out.println(option.getText());
		 */


		
		/*
		 * WebElement Masters = myDriver.findElement(By.xpath(
		 * "//body/div[2]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/p[1]/i[1]"
		 * )); Actions action= new Actions(myDriver);
		 * action.moveToElement(Masters).perform();
		 */
		
	}
		
	
	@Test
	public void masterMenu()
	{
		
		WebElement Masters = myDriver.findElement(By.xpath("//body/div[2]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/p[1]/i[1]"));
		 Actions action= new Actions(myDriver);
		 action.moveToElement(Masters).perform();
		 
		 
		
		
		   
		  WebElement Master= myDriver.findElement(By.xpath("//body/div[2]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]"));
		   Master.click();
		   
		   WebElement jobcard= myDriver.findElement(By.xpath("//p[contains(text(),'Customer Detail')]"));
		   jobcard.click();
		   
		   WebElement custdet= myDriver.findElement(By.xpath("//p[contains(text(),'Customer Detail')]"));
		   custdet.click();
		   
		   WebElement Addcust= myDriver.findElement(By.xpath("//button[contains(text(),'New Customer')]"));
		   Addcust.click();
		   		   
		   
		   WebElement custType= myDriver.findElement(By.xpath("//option[contains(text(),'Individual')]"));
		   custType.click();
		   //Thread.sleep(2000);
		   
		   WebElement custName= myDriver.findElement(By.xpath("//body/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]"));
		   custName.sendKeys("AJAY");
		  // Thread.sleep(1000);
		   
		   WebElement custDob= myDriver.findElement(By.xpath("//input[@id='dob_date']"));
		   custDob.click();
		   //Thread.sleep(1000);
		   
			/*
			 * WebElement Addcust=
			 * myDriver.findElement(By.xpath("//button[contains(text(),'New Customer')]"));
			 * Addcust.click();
			 * 
			 * WebElement Addcust=
			 * myDriver.findElement(By.xpath("//button[contains(text(),'New Customer')]"));
			 * Addcust.click();
			 * 
			 * WebElement Addcust=
			 * myDriver.findElement(By.xpath("//button[contains(text(),'New Customer')]"));
			 * Addcust.click();
			 * 
			 * WebElement Addcust=
			 * myDriver.findElement(By.xpath("//button[contains(text(),'New Customer')]"));
			 * Addcust.click();
			 * 
			 * WebElement Addcust=
			 * myDriver.findElement(By.xpath("//button[contains(text(),'New Customer')]"));
			 * Addcust.click();
			 * 
			 * WebElement Addcust=
			 * myDriver.findElement(By.xpath("//button[contains(text(),'New Customer')]"));
			 * Addcust.click();
			 * 
			 * WebElement Addcust=
			 * myDriver.findElement(By.xpath("//button[contains(text(),'New Customer')]"));
			 * Addcust.click();
			 */	   
		   
	}
	
	
	
}
