package AutomationAssignment.QTRecognition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObjects.Login;
import pageObjects.RecentContacts;
import resources.base;

public class RecentContactsPage extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());

	
	public void login() throws IOException {
		driver=intializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("Entered Login Page");
		Login l = new Login(driver);
    l.getusername().sendKeys("madhu.sudhan@qualitestgroup.com");
	l.getpassword().sendKeys("P@ssw0rd");
	l.getsubmit().click();
	log.info("Successfully logged-In");
	}
	public void close() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
		log.info("Current window closed");
	}
	@Test
	public void recentPage() throws IOException, InterruptedException {
		login();
		RecentContacts rc = new RecentContacts(driver);
		rc.paperSend().click();
		log.info("Clicked on paper send icon");
		rc.card().click();
		rc.cmnt().click();
		rc.sendbtn().click();
		log.info("Successfully sent kudos");
		close();
		
	}
}
