package scenario1.gps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fb_scn2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// setting up webdriver
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//login to facebook
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9354274863");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Jaimatadi@64");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();

		// verify logged in user name
		String name = driver.findElement(By.xpath("//a[@title='Nidhi Nid']")).getText();
		if (name.equals("Nidhi Nid")) {
			System.out.println("USER VERIFIED");
		} else {
			System.out.println("USER Not VERIFIED");
		}

		// verification of send messages

		Thread.sleep(45000);
//            driver.findElement(By.xpath("//a[@name='mercurymessages']")).click();
//            Thread.sleep(45000);

		WebDriverWait wait = new WebDriverWait(driver, 20);

		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@name='mercurymessages")));
		element.click();
		driver.findElement(By.xpath("//a[text()='New Message']")).click();
		Thread.sleep(45000);
		driver.findElement(By.xpath("//div[@class='clearfix uiTokenizer uiInlineTokenizer']")).sendKeys("Mukesh soni");
		Thread.sleep(45000);
		driver.findElement(By.xpath("//div[@class='clearfix uiTokenizer uiInlineTokenizer']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='notranslate _5rpu']/div[1]")).sendKeys("hello");
		driver.findElement(By.xpath("//div[@class='notranslate _5rpu']/div[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
		

	}

}
