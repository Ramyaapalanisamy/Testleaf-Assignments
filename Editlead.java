package weekendassignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editlead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch browser
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//implicitly wait and maximize browser window
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
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
		

		driver.findElementByPartialLinkText("Leads").click();
		
		driver.findElementByPartialLinkText("Find Leads").click();

		
		//enter first name
		driver.findElementByXPath("((//label[text()='First name:'])[3]/following::input)[1]").sendKeys("Babu");
		
		//click find leads
		driver.findElementByXPath("//button[@id='ext-gen334']").click();

		//click on the first lead
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]").click();
		
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
		driver.findElementByXPath("((//div[@class='frameSectionExtra']//a)[3]").click();
		
		//change the company name/update
		
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("google");
		//click submit
		
		driver.findElementByName("submitButton").click();
		
		WebElement CompanyName = driver.findElementByXPath("//td[@id='ext-gen12']//input[1]");
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
