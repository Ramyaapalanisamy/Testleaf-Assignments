package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learninglist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1) https://erail.in/trains-between-stations/mgr-chennai-ctr-MAS/ksr-bengaluru-SBC
		//2) Click on Sort on Date
		//3) Get all the Train Names
		//   Xpath: //div[@id='divTrainsList']//td[@class=''][2] 
		//   findElements -> List<WebElement>
		//4) Create another List using ArrayList (trainNames)
		//5) for each loop : List<WebElement>
		//6) You will get each WebElement : get its text 
		//7) Add the text to your created list (trainNames.add())
		//8) After the loop ends, sort it
		//9) Print it with the loop!!
		
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://erail.in/trains-between-stations/mgr-chennai-ctr-MAS/ksr-bengaluru-SBC");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	
		
		driver.findElementByXPath("//label[text()='Sort on Date']").click();
		
		
		/*List<WebElement> trains = driver.findElementsByXPath("//div[@id='divTrainsList']//td[@class=''][2]");
		System.out.println(trains.size());
		//List<String> trains1 = new ArrayList<String>();
		
		for (WebElement names : trains) {
			String names1 = names.getText();
			
			System.out.println(names1);
			
		}
		
		List<String> names1 = new ArrayList<String>();*/
		
List<WebElement> alltrains = driver.findElementsByXPath("//div[@id='divTrainsList']//td[@class=''][2]");
		
		ArrayList<String>newalltrains=new ArrayList<String>();
		
		for (WebElement trainname : alltrains) 
		{
			System.out.println("trainname is"+trainname.getText());
			
			newalltrains.add(trainname.getText());
			 //newalltrains.add(trainname);
			
		}
		
		Collections.sort(newalltrains);
		
		for (String train : newalltrains)
		{
		System.out.println("after sorting"+train);	
		}
	
	}
}
