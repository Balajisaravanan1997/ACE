package pomPages;


import projectBase.ProjectSpecificMethods;

public class FirstPage extends ProjectSpecificMethods{
	
	public FirstPage enterUserName(String Username) {
		driver.findElementById("email").sendKeys(Username);
		
		return this;
	}
	public FirstPage enterPassword(String Password) {
		driver.findElementById("password").sendKeys(Password);
		
		return this;
	}
	
	public SeconPage enterclick() {
		driver.findElementById("buttonLogin").click();
		
		return new SeconPage();
	}


}
