package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import projectBase.ProjectSpecificMethods;

public class SeconPage extends ProjectSpecificMethods {
	
	public SeconPage clickVevdor() {
		WebElement vendor =driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[4]"));

		Actions builder=new Actions(driver); 

		builder.moveToElement(vendor).perform();
		
		return this;
	}
	
	public ThirdPage clicksearchVevdor() {
		WebElement searchvendor =driver.findElementByLinkText("Search for Vendor");

		Actions builder1=new Actions(driver); 

		builder1.moveToElement(searchvendor).click().perform();
		
		return new ThirdPage() ;
	}
	
	

}
