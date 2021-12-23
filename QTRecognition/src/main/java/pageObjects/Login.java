package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
public WebDriver driver;

 By username = By.xpath("//input[@name='username']");
 By password = By.xpath("//input[@name='pass']");
 By submit = By.xpath("//button[@type='submit']");
 By goldColor= By.xpath("//div[@class='myHeading']");
 By navyColor=By.xpath("//button[@type='submit']");
 By whiteColor= By.xpath("//body");

public Login(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}

public WebElement getusername() {
	return driver.findElement(username);
	 }
 public WebElement getpassword() {
		return driver.findElement(password);
		 }
 public WebElement getsubmit() {
		return driver.findElement(submit);
		 }
 public WebElement goldColor() {
		return driver.findElement(goldColor);
	}
	public WebElement navyColor() {
		return driver.findElement(navyColor);
	}
	public WebElement whiteColor() {
		return driver.findElement(whiteColor);
	}
	public void errorMessage() {
	 driver.switchTo().alert().accept();
	}
}
