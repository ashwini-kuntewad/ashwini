package testclass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestclassTNG2 {
	@Parameters({"browser"})
	@BeforeTest
	public void beforetest(String browserName)
	{
		if (browserName.equals("Chrome"))
		{
			System.out.println("Opening the Chrome browser");
		}
		else if(browserName.equals("firefox"))
		{
			System.out.println("Opening the firefox browser");
		}
		else if(browserName.equals("edge"))
		{
			System.out.println("Opening the edge browser");
		}
}
}