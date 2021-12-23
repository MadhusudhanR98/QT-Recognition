package AutomationAssignment.QTRecognition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.Login;
import resources.base;

public class LoginPage extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());

	public void login() throws IOException {
		driver=intializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("Entered Login Page");
		Login l = new Login(driver);
    l.getusername().sendKeys("madhu.sudhan@qualitestgroup.com");
	l.getpassword().sendKeys("P@ssw0rd");
	log.info("Username and Password entered");
	l.getsubmit().click();
	log.info("Successfully logged-In");
	}
	@AfterTest
	public void close() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
		log.info("Closed current window");
	}
	@Test
	public void validLogin() throws InterruptedException, IOException {
		login();
		log.info("Successfully logged-In");
		//close();
		log.info("Closed current window");
	}
	@Test
	public void invalidLogin() throws IOException, InterruptedException {
		login();
		log.info("Successfully logged-In");
		Login l = new Login(driver);
    l.getusername().sendKeys("madhu");
	l.getpassword().sendKeys("P@ssw0rd");
	log.info("Username and Password entered");
	l.getsubmit().click();
	log.info("clicked on login button");
	l.errorMessage();
	log.error("Invalid username or password message displayed successfully");
	close();
	}	
	
@Test
public void titleName() throws IOException, InterruptedException {
	driver=intializeDriver();
	log.info("driver is initialized");
	driver.get(prop.getProperty("url"));
	log.info("Entered Login Page");
	String title = driver.getTitle();
	Assert.assertEquals(title, "QTRecognition");
	log.info("Successfully validated Title");
	close();
}
@Test
public void getgoldColour() throws IOException, InterruptedException  {
	driver=intializeDriver();
	log.info("driver is initialized");
	driver.get(prop.getProperty("url"));
	log.info("Entered Login Page");
	Login l = new Login(driver);
	String gclr = l.goldColor().getCssValue("background-color");
		String ghx = Color.fromString(gclr).asHex().toUpperCase();
	Assert.assertEquals(ghx, "#FECC160");
	log.error("Gold clr is not matched with QT approved primary clr");
	close();
	
}
@Test
public void getnavyColour() throws IOException, InterruptedException {
	driver=intializeDriver();
	log.info("driver is initialized");
	driver.get(prop.getProperty("url"));
	log.info("Entered Login Page");
	Login l = new Login(driver);
	String nclr = l.navyColor().getCssValue("background-color");
	String nhx = Color.fromString(nclr).asHex().toUpperCase();
	Assert.assertEquals(nhx, "#2A2559");
	log.info("Successfully Navy clr is  matched with QT approved primary clr");
	close();
}
@Test
public void getwhiteColour() throws IOException, InterruptedException {
	driver=intializeDriver();
	log.info("driver is initialized");
	driver.get(prop.getProperty("url"));
	log.info("Entered Login Page");
	Login l = new Login(driver);
String wclr =l.whiteColor().getCssValue("background-color");
String whx=Color.fromString(wclr).asHex().toUpperCase();
Assert.assertEquals(whx, "#939598");
log.error("White clr is not matched with QT approved primary clr");
close();
}



}
