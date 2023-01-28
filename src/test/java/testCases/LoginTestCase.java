package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.LoginPage;

public class LoginTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.edge.driver", "C:\\ShiftGear\\Drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("http://adactinhotelapp.com");
		
		driver.manage().window().maximize();
		
		//Instantiate LoginPage
        LoginPage objLogin = PageFactory.initElements(driver, LoginPage.class);
        objLogin.loginAction("RajendraBabu07", "8J1O4L");
		

	}

}
