package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class loginusingwd {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// add system property ,browser name,path
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		
		//open chrome browser
		//chromedrive(c)-written by selenium team
		ChromeDriver driver = new ChromeDriver();
		
		
				driver.get("http://leaftaps.com/opentaps/control/main");
				
	}

}
