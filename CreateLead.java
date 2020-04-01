package week1.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

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
Thread.sleep(5000);//wait for 5 seconds
driver.close();




	}

}
