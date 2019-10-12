package pomPages;

import projectBase.ProjectSpecificMethods;

public class ThirdPage extends ProjectSpecificMethods{

	
	
	public ThirdPage EntersearchName(String sname) {
		driver.findElementById("vendorName").sendKeys(sname);
		
		return this;}
		
		
		public FourthPage EntersearchButton() {
		driver.findElementById("buttonSearch").click();
		
		return new FourthPage();
	
}
}