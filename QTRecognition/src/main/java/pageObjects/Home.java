package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	public WebDriver driver;
By name=By.xpath("//div[1]/div[1]/div[1]/h5[@class='header-font-size']");
By image=By.xpath("//img[@src='img\\\\avatar.svg']");


public Home(WebDriver driver) {
	this.driver=driver;
}

public WebElement name() {
return	driver.findElement(name);
}
public WebElement verifyImage() {
return	driver.findElement(image);
}


}
