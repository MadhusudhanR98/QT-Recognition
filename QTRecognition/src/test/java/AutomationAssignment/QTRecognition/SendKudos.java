package AutomationAssignment.QTRecognition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Login;
import pageObjects.SearchKudos;
import resources.base;

public class SendKudos extends base {
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
	public void validSendKudos() throws IOException, InterruptedException {
		login();
		SearchKudos s= new SearchKudos(driver);
		s.sendk().click();
		log.info("Clicked on send kudos");
		s.search().sendKeys("Dilip Raj  (dilip.raj@qualitestgroup.com)");
		log.info("Entered employee name");
		s.card().click();
		log.info("Selected a card");
		s.cmnt().sendKeys("good work");
		log.info("Entered comment");
		s.sendbtn().click();
		log.info("Clicked on Send button");
		Thread.sleep(5000);
	    String b = s.error1().getText();
		if (b.contains("Mailer Error: SMTP connect() failed.")) {
		Assert.assertTrue(false);
	}
		log.error(b);
	close();
	log.info("Current window closed");
	}
	@Test
	public void invalidSendKudos() throws IOException, InterruptedException {
		login();
		SearchKudos s= new SearchKudos(driver);
		s.sendk().click();
		log.info("Clicked on send kudos");
		s.search().sendKeys("Dilip Raj  (dilip.raj@qualitestgroup.com)");
		log.info("Entered employee name");
		s.card().click();
		log.info("Selected a card");
		s.sendbtn().click();
		log.info("Clicked on Send button");
		Thread.sleep(5000);
		String e = s.erro2().getText();
		Assert.assertEquals(e, "Please enter any comment.");
		log.error(e);
		close();
		log.info("Current window closed");
	}

	}

