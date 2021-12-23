package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public WebDriver driver;
	public Properties prop;
public WebDriver intializeDriver() throws IOException {

	 prop = new Properties();
	FileInputStream fs= new FileInputStream("D:\\new eclip\\QTRecognition\\src\\main\\java\\data.properties");
	prop.load(fs);
	String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\new eclip\\QTRecognition\\softwares\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	else if(browserName.equals("firefox")) {
		//firefox
	}
	else{
		//IE
	}
driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
return driver;
		
	
}
}
