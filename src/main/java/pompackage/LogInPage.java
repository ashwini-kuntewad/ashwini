package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class LogInPage {
	      WebDriver driver;
		  @FindBy(xpath="//input[@name='username']")
		  private WebElement username;
		  
		  @FindBy(xpath="//input[@name='password']")
		  private WebElement password;
		  
		  @FindBy(xpath="//button[@type='submit']")
		  private WebElement loginButton;
		  


		

		
		public LogInPage(WebDriver driver)
		  {
			
			 this.driver=driver;
			 PageFactory.initElements(driver,this);
		  }

		  public void sendUsername(String uName) throws InterruptedException 
		  {
			  Thread.sleep(1000);
			 
			  username.sendKeys(uName);
		  }
		  
		 public void sendPassword(String pwd)
		 {
			  password.sendKeys(pwd);
		 }
		 public void ClickonLoginButton()
		 {
			  loginButton.click();
		 }

		 
		

		public boolean checkVisibilityOfAdminTab() {
			// TODO Auto-generated method stub
			return false;
		}


	
		}


	







