package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;	

public class NewTest {
	
	WebDriver driver = new ChromeDriver();
	String username="";
	String password="";
	
	@BeforeClass
	public void init()
	{	/* Admin Page*/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to("http://sh2-com.digitalhospitality.com/admin/login");
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("C:\\Users\\gaurav.kulshrestha\\eclipse-workspace\\webSite\\com.websiteTestSite\\Dashboard.png"));
		}
		catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	/*Title Defined*/
	@Test(priority=0)
	public void CheckTitle() {
		String actualtile = driver.getTitle();
		String expectedtitle = "Sparkling Hill Resort  | Login";
		if(actualtile.equalsIgnoreCase(expectedtitle)) 
			System.out.println("Title Not Matched");
		else
			System.out.println("Title matched");
			
						
		}
	
	/*Check Validation Messages*/
	@Test(priority=1)
	public void ValidationMessage() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div/button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Form Validate");
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("C:\\Users\\gaurav.kulshrestha\\eclipse-workspace\\webSite\\com.websiteTestSite\\FormValidate.png"));
		}
		catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	/* On admin Page Login Credentials */
	@Test(priority=2)
	public void Login() 
	{
		driver.findElement(By.id("UserName")).sendKeys("digitalhospitality");
		driver.findElement(By.id("Password")).sendKeys("Admin123");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div/button")).click();
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("C:\\Users\\gaurav.kulshrestha\\eclipse-workspace\\webSite\\com.websiteTestSite\\AfterLogin.png"));
		}
		catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	/* login check*/
	@Test(priority=3)
	public void DashboardLoadpage()
	{		//select counter
			List<WebElement> tdlist = driver.findElements(By.cssSelector(".table"));
			for(WebElement el: tdlist)  {
			    System.out.println(el.getText()); 
			    File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				try {
					FileUtils.copyFile(srcFile, new File("C:\\Users\\gaurav.kulshrestha\\eclipse-workspace\\webSite\\com.websiteTestSite\\BookingCounters.png"));
				}
				catch (IOException e) {
					e.printStackTrace();
					// TODO: handle exception
				}
			}	   
			
			
		}
	@Test(priority=4)
	public void Myaccounts()
	{
		driver.findElement(By.xpath("/html/body/div[1]/div/aside/section/ul/li[2]/a/span[1]")).click();
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("C:\\Users\\gaurav.kulshrestha\\eclipse-workspace\\webSite\\com.websiteTestSite\\Myaccount.png"));
		}
		catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		driver.findElement(By.xpath("//*[@id='anchrPassword']")).click();
		File srcFilea = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFilea, new File("C:\\Users\\gaurav.kulshrestha\\eclipse-workspace\\webSite\\com.websiteTestSite\\Password.png"));
		}
		catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	@Test(priority=5)
	public void changePasswordchack()
	{driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div/section/div/div/div[5]/span/button")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(srcFile, new File("C:\\Users\\gaurav.kulshrestha\\eclipse-workspace\\webSite\\com.websiteTestSite\\ChangePasswordwindows.png"));
	}
	catch (IOException e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.id("password")).sendKeys("Admin123");
	driver.findElement(By.id("confirmPassword")).sendKeys("Admin123");
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div/section/div/div/div[5]/span/button")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	File srcFilea = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(srcFilea, new File("C:\\Users\\gaurav.kulshrestha\\eclipse-workspace\\webSite\\com.websiteTestSite\\PasswordResetSuccessfully1.png"));
	}
	catch (IOException e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}

	@Test(priority=6)
	public void LoginHistory() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"anchrHistory\"]")).click();
		Thread.sleep(500);
		File srcFilea = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFilea, new File("C:\\Users\\gaurav.kulshrestha\\eclipse-workspace\\webSite\\com.websiteTestSite\\PasswordResetSuccessfully1\\LoginHistory.png"));
		}
		catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
  @AfterTest
  public void Exitnow() {
	  driver.close();
  }
 
}
