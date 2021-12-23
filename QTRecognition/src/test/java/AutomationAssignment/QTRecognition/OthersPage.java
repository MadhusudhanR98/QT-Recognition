package AutomationAssignment.QTRecognition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import pageObjects.Login;
import pageObjects.Others;
import pageObjects.SearchKudos;
import resources.base;

public class OthersPage extends base{
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
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
	@Test
	public void kudosFromMe() throws IOException, InterruptedException {
		Others o =new Others(driver);
		o.kudosFromMe().click();
		log.info("Clicked on Kudos from me option");
		Thread.sleep(1000);
		boolean list = o.kList().isDisplayed();
		Assert.assertTrue(list);
		log.info("Successfully Kudos from me list is displayed");
	}
	@Test
	public void kudosToMe() throws IOException, InterruptedException {
		Others o =new Others(driver);
		o.kudosToMe().click();
		log.info("Clicked on Kudos to me option");
		Thread.sleep(1000);
		boolean list = o.kList().isDisplayed();
		Assert.assertTrue(list);
		log.info("Successfully Kudos to me list is displayed");
	}
	@Test
	public void activity() throws IOException, InterruptedException {
		Others o =new Others(driver);
		o.activity().click();
		log.info("Clicked on activity option");
		Thread.sleep(1000);
		boolean list = o.kList().isDisplayed();
		Assert.assertTrue(list);
		log.info("Successfully recent acticity list is displayed");
	}
	@Test
	public void count() throws IOException, InterruptedException {
		Others o =new Others(driver);
		Thread.sleep(1000);
	String[] arr = o.count().getText().split(" ");
	Thread.sleep(1000);
	int pCount = Integer.parseInt(arr[0]);
	log.info("Succesfully grabbed current count");
	SearchKudos sk = new SearchKudos(driver);
	sk.sendk().click();
	log.info("Clicked on send kudos");
	sk.search().sendKeys("Dilip Raj  (dilip.raj@qualitestgroup.com)");
	log.info("Entered employee name");
	sk.card().click();
	log.info("Selected a card");
	sk.cmnt().sendKeys("good work");
	log.info("Entered comment");
	sk.sendbtn().click();
	log.info("Clicked on Send button");
	sk.close();
	log.info("Clicked on close icon");
	driver.navigate().refresh();
	log.info("Successfully current page is refreshed");
	o.activity().click();
	log.info("Clicked on activity option");
	Thread.sleep(4000);
	String[] arr1 = o.count().getText().split(" ");
	Thread.sleep(1000);
	int aCount = Integer.parseInt(arr1[0]);
	log.info("Succesfully grabbed after count");
		if(aCount<pCount) {
		Assert.assertTrue(false);
			}
		log.info("Succesfully count is increased");
	}
	@Test
	public void kudosToMyself() {
		SearchKudos sk = new SearchKudos(driver);
		sk.sendk().click();
		log.info("Clicked on send kudos");
		sk.search().sendKeys("Madhu Sudhan M  (madhu.sudhan@qualitestgroup.com)");
		log.info("Entered ourself name");
		sk.card().click();
		log.info("Selected a card");
		sk.cmnt().sendKeys("good work");
		sk.sendbtn().click();
		 String b = sk.error1().getText();
			if (b.contains("Mailer Error: SMTP connect() failed.")) {
			Assert.assertTrue(false);
			}
			log.error("Kudus to myself sent");
		sk.close();
		log.info("Clicked on close icon");
	}
	@AfterTest
	public void close() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
		log.info("Current window closed");
	}
	
	
}
