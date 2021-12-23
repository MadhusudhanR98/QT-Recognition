package AutomationAssignment.QTRecognition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Home;
import pageObjects.Login;
import resources.base;

public class HomePage extends base{
	public static Logger log = LogManager.getLogger(base.class.getName());

	String uName="madhu.sudhan@qualitestgroup.com";
	String pwd="P@ssw0rd";
	
@BeforeTest
public void login() throws IOException {
	driver=intializeDriver();
	driver.get(prop.getProperty("url"));
	log.info("Entered Login Page");
	Login l= new Login(driver);
	l.getusername().sendKeys(uName);
	l.getpassword().sendKeys(pwd);
	log.info("Username and Password entered");
	l.getsubmit().click();
	log.info("Successfully logged-In");
}

	
	@Test
	public void validLogin() throws IOException,InterruptedException {
		Home h= new Home(driver);
	String username = h.name().getText();
	Assert.assertEquals(username, "Madhu Sudhan R");
	log.error("Name mismatched");
	}

@Test
public void activityPageImage() throws IOException, InterruptedException {
	Home h= new Home(driver);
	String imageFile = h.verifyImage().getAttribute("alt");
	if(imageFile.contains("Sample Image")) {
	Assert.assertTrue(false);
	}
	log.error("Image not uploaded");
	}

@Test
public void titleVerify() throws IOException, InterruptedException {
	String title = driver.getTitle();
	Assert.assertEquals(title, "QTRecognition");
	log.info("Successfully validated Title name");
}

@AfterTest
public void close() throws InterruptedException {
	Thread.sleep(1000);
	driver.close();
	log.info("Current window closed");
}
}

