package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deleteleadusingonlyxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//implicitly wait and maximize browser window
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// find username
		

		WebElement eleUserName = driver.findElementByXPath("//input[@name='USERNAME'][1]");
		eleUserName.clear();//clear
		eleUserName.sendKeys("DemoSalesManager");//type
		
		// find the password and interact
		
		driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
		
		// click on the login
		
		driver.findElementByXPath("//input[@value='Login']").click();
		
		// click on CRM SFA
		
		driver.findElementByXPath("//div[@id='button']/a/img").click();
		

		driver.findElementByXPath("//a[text()='Leads']").click();
		
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(3000);
      Thread.sleep(3000);
      
      WebElement id = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
      String myId = id.getText();
      System.out.println(myId);
      
      Thread.sleep(3000);
                     
        driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
        Thread.sleep(3000);
        
        driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
        Thread.sleep(3000);
        
        driver.findElementByXPath("//a[text()='Find Leads']").click();
        Thread.sleep(3000);
        
        driver.findElementByXPath("//input[@name='id']").sendKeys(myId);
        Thread.sleep(3000);
        
        driver.findElementByXPath("//button[text()='Find Leads']").click();
        Thread.sleep(3000);
        
       WebElement message = driver.findElementByXPath("//div[text()='No records to display']");
       String correctMessage = message.getText();
       Thread.sleep(3000);
        
        
		
		String ExpectedMessage = "No records to display";

		if(correctMessage.equalsIgnoreCase(ExpectedMessage))
		{
			System.out.println("Record Not Found");
		}
		else
		{
			System.out.println("Record Found");
			
		}
		 Thread.sleep(3000);
     driver.close();   

}




	}


