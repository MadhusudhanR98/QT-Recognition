package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KudosSearch {
WebDriver driver;

By ks= By.xpath("//a[@onclick='searchKudosByUser()']");
By sb = By.id("s_e_add");
By si = By.xpath("//button[@onclick='kudosSearch()']");
By l = By.id("shoutout_to_me");


public KudosSearch(WebDriver driver) {
	this.driver = driver;
}
public WebElement ks() {
	return driver.findElement(ks);
}
public WebElement sb() {
	return driver.findElement(sb);
}
public WebElement si() {
	return driver.findElement(si);
}
public WebElement l() {
	return driver.findElement(l);
}


}
