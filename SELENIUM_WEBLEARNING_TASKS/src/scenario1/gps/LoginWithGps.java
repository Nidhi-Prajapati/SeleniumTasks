package scenario1.gps;

import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithGps {

	public static void main(String[] args) {

		// setting up webdriver
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// after setting up webdriver locate webelement of gps login user and password

		driver.get("http://www.ourgoalplan.com/Login.aspx");
		driver.findElement(By.xpath("//input[@id='txtName']")).sendKeys("nidhip"); // enter username
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Jaimatadi@64"); // enter pass
		driver.findElement(By.xpath("//input[@value='Login']")).click(); // click on login
        // verify that you are successfully logged in
		String title = driver.getTitle();
		if (title.contains("Nidhi Prajapati")) {
			System.out.println("SUCCESSFULLY LOGIN");
		}

		//verify gps date with  system date
		String gpsdate = driver.findElement(By.xpath("//span[@id='lblGoalDate']")).getText();
		System.out.println("TODAY'S DATE IS " + " " + gpsdate);
		
		
		
		
		
		
		//verify that "abcrakadabrakadabra" is not present in goal sheet
		String findword = "abcrakadabrakadabra";
		String PageSource = driver.getPageSource();
		
		if(PageSource.contains(findword)) {
			System.out.println("abcrakadabrakadabra is present");
		}else {
			System.out.println("abcrakadabrakadabra is not present");
		}
		
		
		
		//verify that LEAD name is not blank
		
		int size = driver.findElements(By.xpath("//a[contains(@href,'PublicProfile.aspx?id=6')]")).size();
		
		for(int i=0;i<size;i++) {
			String  name = driver.findElements(By.xpath("//a[contains(@href,'PublicProfile.aspx?id=6')]")).get(i).getText();	
			System.out.println(name);
		}
		List<WebElement> leadname = driver.findElements(By.xpath("//a[contains(@href,'PublicProfile.aspx?id=6')]"));
		    if(leadname==null) {
		    	System.out.println("lead name is blank");
		    }else {
		    	System.out.println("lead name is NOT  blank");
		    }
		    
		    
		    
		//Send message to one user and verify the same message is received to the other user.  
		    //click on message link
		    driver.findElement(By.xpath("//a[@href='Message.aspx']")).click();
		    
		    
		    
		  
		    
		    
		    
		    
		    
		    
		    
	    
	    	driver.close();
	
		
		
	}

}
