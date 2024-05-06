package APITesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M_B_X {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Sveltetech\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://37.120.234.16:3004");
		driver.manage().window().maximize();
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("tejas");  // put the Username
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456"); // put the password
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click(); // click the login  button
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(null));
		

	}

}
