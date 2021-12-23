package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchKudos {
	public WebDriver driver;
	By sendk = By.xpath("//a[@class='nav-item nav-link']");
	By search = By.id("email_address");
	By card = By.xpath("//p/i[.='\"Exceptional Work\"']");
	By cmnt = By.id("comment");
	By sendbtn = By.cssSelector(".btn-primary");
	By error1 = By.xpath("//center[normalize-space()='Mailer Error: SMTP connect() failed.']");
	By close = By.cssSelector(".close");
	By erro2 = By.xpath("//center[normalize-space()='Please enter any comment.']");
	public SearchKudos(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement sendk() {
		return driver.findElement(sendk);
	}
	
	public WebElement search() {
		return driver.findElement(search);
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
		public WebElement error1() {
			return driver.findElement(error1);
}
		public WebElement erro2() {
			return driver.findElement(erro2);
		}
		public WebElement close() {
			return driver.findElement(close);
	}
}
