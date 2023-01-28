package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.FindAll;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage() {
		
		this.driver = driver;
	}
	
	@FindBy(how = How.ID,using = "username")
	WebElement user_Name;
	
	@FindBy(id="password")
	WebElement user_Password;
	
	@FindAll(
			{

		@FindBy(id="login"),
		@FindBy(name="login_1")
			}
			)
	WebElement login_btn;
	
	public void loginAction(String uName, String pwd)
	
	{
		user_Name.sendKeys(uName);
		user_Password.sendKeys(pwd);
		login_btn.click();
		
	}
	
	
	
}
