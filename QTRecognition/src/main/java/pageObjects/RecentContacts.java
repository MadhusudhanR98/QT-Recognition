package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RecentContacts {
public RecentContacts(WebDriver driver) {
this.driver= driver;
}
WebDriver driver;

By papersend = By.xpath("(//i[@class='fas fa-paper-plane'])[3]");
By sb = By.id("email_address");
By card = By.xpath("//p/i[.='\"Exceptional Work\"']");
By cmnt = By.id("comment");
By sendbtn = By.cssSelector(".btn-primary");

public WebElement paperSend() {
	return driver.findElement(papersend);
}
public WebElement sb() {
	return driver.findElement(sb);
}
public WebElement card() {
	return driver.findElement(card);
}
public WebElement cmnt() {
	return driver.findElement(cmnt);
}
public WebElement sendbtn() {
	return driver.findElement(sendbtn);
}
}
