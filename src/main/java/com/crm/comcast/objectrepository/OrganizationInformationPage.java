package com.crm.comcast.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInformationPage {
	
	@FindBy(xpath="//span[@class=\"dvHeaderText\"]")
	private WebElement SuccessMsg;
	
	public OrganizationInformationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String getSuccessMsg() {
		
	return SuccessMsg.getText();
		
	}
	

}
