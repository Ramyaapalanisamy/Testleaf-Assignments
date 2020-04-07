package week1.day4;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentday4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver","chromedriver.exe");
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
		System.out.println("entered");
		driver.findElementByLinkText("CRM/SFA").click();
		System.out.println("entered1");
		driver.findElementByXPath("///*[@id=\"ext-gen644\"]").click();
		System.out.println("exit");

		// click on create lead
		//driver.findElementByLinkText("Create Lead").click();*/
		//Launch the browser
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().window().maximize();

				// to launch the URL
				driver.get("http://leaftaps.com/opentaps/control/main");
				//driver.navigate().to("http://leaftaps.com/opentaps/control/main");

				//Enter the username
				driver.findElementById("username").sendKeys("DemoSalesManager");

				//Enter the password
				driver.findElementById("password").sendKeys("crmsfa");

				//Click Login
				driver.findElementByClassName("decorativeSubmit").click();


				//Click crm/sfa link
				driver.findElementByLinkText("CRM/SFA").click();


				Thread.sleep(4000);

				//click on Create Lead
				driver.findElementByLinkText("Leads").click();

				Thread.sleep(4000);

				//click on Find Lead
				driver.findElementByLinkText("Find Leads").click();

				Thread.sleep(4000);

				//click on email
				driver.findElementByXPath("//*[text()='Email']").click();

				Thread.sleep(4000);

				//Enter email
				driver.findElementByName("emailAddress").sendKeys("as@test.com");	

				//click Find Lead
				driver.findElementByXPath("(//*[text()='Find Leads'])[3]").click();

				Thread.sleep(4000);

				//Capture name of First Resulting lead
				String FN1  = driver.findElementByXPath("(//a[@class='linktext'])[6]").getText()	;			
				System.out.println(FN1);

				//Click First Resulting lead
				driver.findElementByXPath("(//a[@class='linktext'])[6]").click();

				//Click Duplicate Lead
				driver.findElementByXPath("//a[text()='Duplicate Lead']").click();

				//Verify the title as 'Duplicate Lead'
				String Title1 = driver.getTitle();
				String Title2 = "Duplicate Lead | opentaps CRM";
				if(Title1.equalsIgnoreCase(Title2))
				{
					System.out.println("Title is displayed as Duplicate Lead");
				}
				else
				{
					System.out.println("Title is not displayed as 'Duplicate Lead");
				}

				//Click on Create Lead
				driver.findElementByClassName("smallSubmit").click();


				//Confirm the duplicated lead name is same as captured name
				String FN2 = driver.findElementById("viewLead_firstName_sp").getText();

				if (FN2.equalsIgnoreCase(FN1))
				{
					System.out.println("Duplicated lead name is same as Original Name");
				}
				else
				{
					System.out.println("Duplicated lead name is not same as Original Name");
				}

				driver.close();
			}
	}
	

