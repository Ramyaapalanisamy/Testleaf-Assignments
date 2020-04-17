package week3.day3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mergelead {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	
		
		// find username
		WebElement eleUserName = driver.findElementById("username");
		
		eleUserName.clear();//clear
		eleUserName.sendKeys("DemoSalesManager");//type
		
		// find the password and interact
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		// click on the login
		driver.findElementByClassName("decorativeSubmit").click();
		
		// click on CRM SFA
		driver.findElementByLinkText("CRM/SFA").click();

		// click on create lead
		driver.findElementByXPath("//a[text()='Leads']").click();
		
		// click on merge lead
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		
		// click on from lead img
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		
		Thread.sleep(2000);
		Set<String> win = driver.getWindowHandles();
	    List<String> list = new ArrayList<String>(win);
	    driver.switchTo().window(list.get(1));
	
	
	    Thread.sleep(2000);
		//type first name
		WebElement firstname = driver.findElementByXPath("(//div[@class='x-form-element']//input)[2]");
		firstname.sendKeys("Ramyaa");
		firstname.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		//click on find leads
		driver.findElementByXPath("(//button[@class='x-btn-text'])[1]").click();
		Thread.sleep(2000);
		// click on the first lead id
		WebElement id = driver.findElementByXPath("(//a[@class='linktext'])[1]");
		String text = id.getText();
		id.click();
				
		System.out.println(text);
		Thread.sleep(2000);
		
		 driver.switchTo().window(list.get(0));
		Thread.sleep(2000);
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		Thread.sleep(2000);

		Set<String> win1 = driver.getWindowHandles();
	    List<String> list1 = new ArrayList<String>(win1);
	    driver.switchTo().window(list1.get(1));
	
	    Thread.sleep(2000);
	    WebElement fname = driver.findElementByXPath("(//div[@class='x-form-element']//input)[2]");
		fname.sendKeys("Babu");
		fname.sendKeys(Keys.TAB);
		
		//click on find leads
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		Thread.sleep(2000);
		// click on the first lead id
		//driver.findElementByXPath("(//td[contains(@class,'x-grid3-col x-grid3-cell')]//div)[1]").click();
		Thread.sleep(2000);
		
		driver.switchTo().window(list1.get(0));
		Thread.sleep(2000);
	    
	    driver.findElementByXPath("//a[text()='Merge']").click();
	    Thread.sleep(2000);
	    Alert alert = driver.switchTo().alert();
	    Thread.sleep(2000);
	    alert.accept();
	    
	    
	    
	    driver.findElementByXPath("//a[text()='Find Leads']").click();
	    driver.findElementByXPath("//input[@name='id']").sendKeys(text);
	    driver.findElementByXPath("//button[text()='Find Leads']").click();
	    
	    
	    // take a snapshot
	    
	    File Src = driver.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./snaps/img.png");
	    FileUtils.copyFile(Src, dest);
	    
	    driver.close();
	    
	    
	}
 
}
