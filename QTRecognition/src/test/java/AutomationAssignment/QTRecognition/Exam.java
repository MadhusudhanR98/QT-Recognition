package AutomationAssignment.QTRecognition;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Exam {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\new eclip\\QTRecognition\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html");
		/*boolean si = driver.findElement(By.id("search-input")).isDisplayed();
Assert.assertTrue(si);
	boolean sb = driver.findElement(By.id("search-button")).isDisplayed();
	Assert.assertTrue(sb);*/
	driver.findElement(By.id("search-input")).sendKeys("isla");
	driver.findElement(By.id("search-button")).click();
	//String txt = driver.findElement(By.id("error-empty-query")).getText();
//	Assert.assertEquals(txt, "Provide some query");
	 WebElement lists = driver.findElement(By.);
	System.out.println(lists.getTagName());
	
	}
}
	/*boolean p = lists.isEmpty();
	Assert.assertFalse(p);
	driver.findElement(By.id("search-input")).sendKeys("castle");
	driver.findElement(By.id("search-button")).click();
	String no = driver.findElement(By.id("error-no-results")).getText();
	Assert.assertEquals(no, "No results");
	driver.findElement(By.id("search-input")).sendKeys("port royal");
	driver.findElement(By.id("search-button")).click();
	List<WebElement> list = driver.findElements(By.xpath("//li"));
	System.out.println();
	}
	
	  //@Test
    public void verifySearchBar(){
		boolean si = webDriver.findElement(By.id("search-input")).isDisplayed();
        
Assert.assertTrue(si);
//@Test
    public void verifySearchButton(){
	boolean sb = webDriver.findElement(By.id("search-button")).isDisplayed();
	Assert.assertTrue(sb);
    }
   // @Test
public void verifySearchQuery(){
    webDriver.findElement(By.id("search-input")).sendKeys("");
	webDriver.findElement(By.id("search-button")).click();
	String txt = webDriver.findElement(By.id("error-empty-query")).getText();
	Assert.assertEquals(txt, "Provide some query");
}
   // @Test
    public void verifySearchQuery(){
        List<WebElement> lists = webDriver.findElements(By.xpath("//li"));
	boolean p = lists.isEmpty();
	Assert.assertFalse(p);
    }
private void Systout() {
	// TODO Auto-generated method stub

} @Test
public void verifyLoginPageTitle() {
    String title = webDriver.getTitle();
    assertEquals( "", title);
}
} public void verifyIsla(){
    webDriver.findElement(By.id("search-input")).sendKeys("isla");
webDriver.findElement(By.id("search-button")).click();
   List<WebElement> lists = webDriver.findElements(By.xpath("//li"));
boolean p = lists.isEmpty();
assertEquals(p, false);*/

