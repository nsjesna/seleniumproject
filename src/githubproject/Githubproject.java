package githubproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Githubproject {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
		System.out.println("Open Facebookpage");
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		

	}

}
