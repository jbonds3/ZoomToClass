import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static void main(String[] args) {
		  try {
			  //Sets the webdriver.chrome.driver key to the absolute path below
			  
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\JBonds\\Documents\\NSBE TORCH\\Selenium\\chromedriver_win32v85\\chromedriver.exe");
			  
			  BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			  System.out.print("What do you want to search?: ");
			  String inputStr = input.readLine();
			  
			  //Instantiates a WebDriver object 
			  WebDriver driver = new ChromeDriver();
			  
			  //sends the HTTP (protocol) to server
			  driver.get("http://www.google.com");
			  
			  //5 sec (argument is milliseconds)
			  Thread.sleep(5000);  // Let the user actually see something!
			  
			  
			  
			  WebElement searchBox = driver.findElement(By.name("q"));
			  
			  //sends string "ChromeDriver"
			  searchBox.sendKeys(inputStr);
			  searchBox.submit();
			  Thread.sleep(5000);  // Let the user actually see something!
			  driver.quit();
		  } catch (InterruptedException e) {
			  System.out.println("Woah There Buddy!!!!");
		  } catch (InvalidArgumentException e) {
			  System.err.println("\n\nCheck your driver.get() argument!!!");
		  } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

