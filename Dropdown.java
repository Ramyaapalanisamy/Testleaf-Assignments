package week2.day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
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
		driver.findElementByLinkText("Create Lead").click();
		// type company name
		driver.findElementById("createLeadForm_companyName").sendKeys("CVS Health");
		//type first name
		driver.findElementById("createLeadForm_firstName").sendKeys("Ramyaa");
		//type last name
		driver.findElementById("createLeadForm_lastName").sendKeys("Hariharan");
		// click on create lead button
		driver.findElementByClassName("smallSubmit").click();
		
		//to select source dropdown
		
		WebElement dropdown = driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']");
		Select dd = new Select(dropdown);
		dd.selectByVisibleText("Employee");
		
		////To Select Industry
		WebElement dropdown1= driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd1 = new Select(dropdown1);
		
		////To get the Count
		List<WebElement> options = dd1.getOptions();
		int count = options.size();
		dd1.selectByIndex(count-1);
		
		
		
		Thread.sleep(5000);//wait for 5 seconds
		driver.close();

	}

}
