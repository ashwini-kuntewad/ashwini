package testclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testutility.StaticBrowser;

public class TestclassTNGG1 {

	@BeforeClass
	public void beforeClass()
	{
		WebDriver driver = StaticBrowser.openBrowser("edge", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("beforeClass of class1");
	}
	
	@BeforeMethod
	public void beforeMehod()
	{
		System.out.println("beforeMethod of class1");
	}
	
	@Test
	public void test1() throws InterruptedException
	{
		System.out.println("test1 of class1");

	}
	

	@Test
	public void test2()
	{
		System.out.println("test2 of class1");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass");
	}
	

	
}




