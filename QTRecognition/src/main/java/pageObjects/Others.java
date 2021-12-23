package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Others {
WebDriver driver;
By kudosFromMe = By.xpath("//span[.='Kudos from me']");
By kList = By.id("shoutout_to_me");
By kudosToMe = By.xpath("//span[.='Kudos to me']");
By activity = By.xpath("//span[.='Activity']");
By count = By.id("todayCount");

public Others(WebDriver driver) {
	this.driver = driver;
}

public WebElement kudosFromMe() {
	return driver.findElement(kudosFromMe);
}
public WebElement kList() {
return	driver.findElement(kList);
}
public WebElement kudosToMe() {
return	driver.findElement(kudosToMe);
}
public WebElement activity() {
return	driver.findElement(activity);
}
public WebElement count() {
return	driver.findElement(count);
}
}
