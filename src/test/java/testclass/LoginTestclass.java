package testclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pompackage.LogInPage;
import testutility.ReadFileData;




public class LoginTestclass extends Baseclass {
	ReadFileData r;
	//WebDriver driver;
	LogInPage login;
	@BeforeClass
	public void beforeClass()
	{

				// login = new LogInPage(driver);

	}
	
	@BeforeMethod
	public void beforeMehod()
	{
		System.out.println("beforeMethod of class1");
	}
	
	@Test
	public void VerifyLoginFunctionalityWithCorrectData() throws InterruptedException, EncryptedDocumentException, IOException
	{ 
		 login = new LogInPage(driver);
         logger=report.createTest("Verify Login Functionality With CorrectData");
		SoftAssert s = new SoftAssert();
            login.sendUsername("Admin");
              login.sendPassword("admin123");
		
//  	         login.sendUsername(r.fetchDataFromExcel(1,0));
//     	         login.sendPassword(r.fetchDataFromExcel(1,1));
		         login.ClickonLoginButton();
		         Thread.sleep(3000);
		       //  String ExpectedURL=("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		        
		      //  String CurrentURL = driver.getCurrentUrl();
     	        boolean result=login.checkVisibilityOfAdminTab();
		      //   s.assertEquals(CurrentURL ,ExpectedURL );
     	        WebElement ele=driver.findElement(By.xpath("//img[@alt=\"client brand banner\"]/ancestor::a"));
     	        File source=ele.getScreenshotAs(OutputType.FILE);
     	        File dest=new File("C:\\Users\\Lenovo\\eclipse-workspace1\\Orangehrm\\test-output\\Screenshots\\temp.png");
     	        FileHandler.copy(source, dest);
     	        
		        System.out.println("soft assert is executed");
		        Assert.assertFalse(result);//pass
		        System.out.println("Test case ENDED");
	          s.assertAll();
	          logger.pass("Test cases is pass");
	        
	}	        
	
	        
		     	        
	
	

	@Test
	public void VerifyLoginFunctionalityWithInCorrectData()
	{
		logger = report.createTest("Verify LoginFunctionality With InCorrectData");
		Assert.fail();
	}
//	
//	@AfterMethod
//	public void afterMethod()
//	{
//		System.out.println("afterMethod");
//	}
//
//	@AfterClass
//	public void afterClass()
//	{
//		System.out.println("afterClass");
//	}
	
	
}




