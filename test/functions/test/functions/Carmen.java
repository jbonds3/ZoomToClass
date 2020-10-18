package test.functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Carmen {
	public static void main (String[] args) {
		try {
			  //Sets the webdriver.chrome.driver key to the absolute path below
			  
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\JBonds\\Documents\\NSBE TORCH\\Selenium\\chromedriver_win32v85\\chromedriver.exe");
			  
			  //BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			  //System.out.print("What do you want to search?: ");
			  //String inputStr = input.readLine();
			  
			  //Instantiates a WebDriver object 
			  Map<String, Object> prefs = new HashMap<String, Object>();
			  prefs.put("profile.default_content_setting_values.notifications", 2);
			  ChromeOptions options = new ChromeOptions();
			  options.setExperimentalOption("prefs", prefs);
			  WebDriver driver = new ChromeDriver(options);
 
			  String username = "bonds.20@osu.edu", password = "Family10000!";
					  
			  WebAction.CarmenLogin(driver, username, password);
			  
			  driver.quit();
		  } catch (InterruptedException e) {
			  System.out.println("Woah There Buddy!!!!");
		  } catch (InvalidArgumentException e) {
			  System.err.println("\n\nCheck your driver.get() argument!!!");
		  //} catch (IOException e) { e.printStackTrace();
		}
	}
}
