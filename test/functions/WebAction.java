import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebAction {
	public static void CarmenLogin(WebDriver driver, String username, String password) throws InterruptedException {
		 //sends the HTTP (protocol) to server
		driver.get("https://carmen.osu.edu/#");
  
		//5 sec (argument is milliseconds)
		Thread.sleep(5000);  // Let the user actually see something!
  
		WebElement loginBtn = driver.findElement(By.cssSelector("button[class='button-primary login-button ng-scope']"));
		loginBtn.click();
  
		Thread.sleep(3000);
		
		//sends string "ChromeDriver"
		WebElement usernameTextBox = driver.findElement(By.id("username"));
		usernameTextBox.sendKeys(username);
		
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		passwordTextBox.sendKeys(password);		
  
		Thread.sleep(3000); 
		
		WebElement userPassLoginBtn = driver.findElement(By.id("submit"));
		userPassLoginBtn.click();
		
		Thread.sleep(5000);  
		
		String url = driver.getCurrentUrl(), newURL = url;
		while (newURL.equals(url)) {
			newURL = driver.getCurrentUrl();
			Thread.sleep(5000);
		}		
		Thread.sleep(3000);
		driver.get("https://osu.instructure.com/courses/81841");
		
		Thread.sleep(3000);
		driver.get("https://osu.instructure.com/courses/81841/external_tools/36903");
		
		Thread.sleep(3000);
		driver.get("https://applications.zoom.us/lti/rich/j/92169149257?oauth_consumer_key=hlU9DDPaTK-zCwFZDX-7fw&lti_scid=2d1f1f7b731cd04f36ce39e8c6a0a6ce2cf152020e95bfee30badd4b39ec21ea");
		
		Thread.sleep(7000);
		Robot rt;
		try {
			rt = new Robot();
			rt.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			rt.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			rt.keyPress(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		Thread.sleep(3600000);
		
	}
}
