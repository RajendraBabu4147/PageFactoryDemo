package testCases;

 

import java.net.MalformedURLException;
import java.net.URL;

 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

 


public class SeleniumGridDemo {

    static WebDriver driver;

 

    public static void main(String[] args) throws MalformedURLException 
    {
       String url = "http://adactinhotelapp.com";
       String node = "http://192.168.0.104:4444/wd/hub";

       //ChromeOptions opt = new ChromeOptions();
       EdgeOptions opt1 = new EdgeOptions();
       driver = new RemoteWebDriver(new URL(node),opt1);
       driver.navigate().to(url);
       String title = driver.getTitle();


    }

 

}