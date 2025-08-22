package automationproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// to call firefox driver
System.setProperty("webdriver.gecko.driver", "D:\\selenium files\\geckodriver.exe");

      // Launch Firefox browser
WebDriver driver = new FirefoxDriver();

     // Navigate to the website
driver.get("https://www.saucedemo.com/");

	// close timer
//Thread.sleep(2000);

  //to locate web elements
WebElement user = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));

  //to enter the data
Thread.sleep(1000);
user.sendKeys("standard_user");
Thread.sleep(1000);
pass.sendKeys("secret_sauce");




WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
Thread.sleep(1000);

  //to click the login button
login.click();

String url = driver.getCurrentUrl();
System.out.println("url is: "+ url);

// to verify if the login url and homepage url is same or not
if
(url.equals("https://www.saucedemo.com/inventory.html"))
{System.out.println("The url is same as login page = failed");}
else
{System.out.println("Logged in successfully = passed");}	

WebElement hammenu = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));



if
(hammenu.isDisplayed())  //to verify the button is there (.isDisplayed)
	{System.out.println("hammenu is visible = passed");}
else
	{System.out.println("hammenu is not visisble = failed");}
Thread.sleep(1000);
hammenu.click();
Thread.sleep(1000);
WebElement Logout = driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
Logout.click();
Thread.sleep(1000);
driver.close();
	}

}
