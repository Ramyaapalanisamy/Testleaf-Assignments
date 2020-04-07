package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editleadusingonlyxpath {

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

		
		//enter first name
		driver.findElementByXPath("//div[@id='x-form-el-ext-gen248']/input").sendKeys("ramyaa");
		
		//click find leads
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		//click on the first lead
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
		//verify title
		
		String Title1 = driver.getTitle();
		
		String ExpectdTitle = "View Lead | opentabs CRM";

		if(Title1.equalsIgnoreCase(ExpectdTitle))
		{
			System.out.println("Title Verfied");
		}
		else
		{
			System.out.println("Not Matched");
		}

		
		//click edit
		driver.findElementByXPath("//a[text()='Edit']").click();
		
		//change the company name/update
		
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("mannarandco");
		//click submit
		
		driver.findElementByXPath("//input[@class='smallSubmit'][1]").click();
		
		WebElement CompanyName = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']");
		//confirm the changed name
		String CName = CompanyName.getText();
		String Expected = CompanyName.getText();
		if (Expected.equals(CName))
		{
			System.out.println("Company Name Verfied");
		}
		else
		{
			System.out.println("Incorrect Company Name");
		}
		
		

		//close the browser
		
		
		driver.close();

	}


	}


