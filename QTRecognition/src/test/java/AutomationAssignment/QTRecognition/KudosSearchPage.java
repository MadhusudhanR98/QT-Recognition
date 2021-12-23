package AutomationAssignment.QTRecognition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.KudosSearch;
import pageObjects.Login;
import resources.base;

public class KudosSearchPage extends base {
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
	public void close() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
		log.info("Current window closed");
	}
	@Test
	public void kudosSearch1() throws IOException, InterruptedException {
		login();
		Thread.sleep(1000);
		KudosSearch k = new KudosSearch(driver);
		 boolean ksdisp = k.ks().isDisplayed();
		 Assert.assertTrue(ksdisp);
		 log.info("Kudos search option is displayed");
		 close();
		 log.info("Current window closed");
	}
@Test	
public void kudosSearch2() throws IOException, InterruptedException {
	login();
	KudosSearch k = new KudosSearch(driver);
k.ks().click();
log.info("Clicked on Kudos search");
k.sb().sendKeys("Dilip Raj  (dilip.raj@qualitestgroup.com)");
log.info("Employee name is passed");
k.si().click();
log.info("Clicked on Search button");
boolean ldis = k.l().isDisplayed();
Assert.assertTrue(ldis);
log.info("List of employee kudos is displayed");
close();
log.info("Current window closed");
}
}	
	
	
	
	
	
	
	

