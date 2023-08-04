package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage 
{
	//it is weblement repo
	
	



	@FindBy(xpath="[@name='username']") private WebElement usnTB;
	@FindBy(xpath="..*[contains(@class,initial)]") private WebElement pssTB;
	@FindBy(id="keepLoggedIncheckBox") private WebElement loginButtun;
	@FindBy(partialLinkText ="ActimindInc." ) private WebElement actmindLink;
	
	
	
	
	//insiliation
	
	public Loginpage(WebElement usnTB, WebElement pssTB, WebElement loginButtun, WebElement actmindLink) {
		super();
		this.usnTB = usnTB;
		this.pssTB = pssTB;
		this.loginButtun = loginButtun;
		this.actmindLink = actmindLink;
	}

	
	//utilization
	
	
	
	public WebElemet getActimindLink()
	{
		return actmindLink;
		
	}
	
	
	
	
	
	
	//opretionl

}
