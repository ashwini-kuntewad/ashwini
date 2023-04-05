package testclass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_class_testng {	
	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("beforesuit of class2");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("beforetest of class2");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass of class2");
	}
	
	@BeforeMethod
	public void beforeMehod()
	{
		System.out.println("beforeMethod of class2");
	}
	
	@Test
	public void test1() throws InterruptedException
	{
		System.out.println("test1 of class2");

	}
	

	@Test
	public void test2()
	{
		System.out.println("test2 of class2");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("aftertest of class2");
	}
	@AfterSuite
	public void suit()
	{
		System.out.println("Aftersuit of class2");
	}
	
	
}




