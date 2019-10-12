package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pomPages.FirstPage;
import projectBase.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	
	@BeforeTest
	public void setData() {
		excelFileName="Book1";
}

	@Test(dataProvider="fetchData")
public  void startApp(String Username,String Password,String sname) {

		new FirstPage().
		enterUserName(Username)
		.enterPassword(Password)
		.enterclick()
		.clickVevdor()
		.clicksearchVevdor()
		.EntersearchName(sname)
		.EntersearchButton();


/*driver.findElementById("buttonLogin").click();

WebElement vendor =driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[4]"));

Actions builder=new Actions(driver); 

builder.moveToElement(vendor).perform();

WebElement searchvendor =driver.findElementByLinkText("Search for Vendor");

Actions builder1=new Actions(driver); 

builder1.moveToElement(searchvendor).click().perform();

driver.findElementById("vendorName").sendKeys("Blue Lagoon");

driver.findElementById("buttonSearch").click();
*/
}

}
