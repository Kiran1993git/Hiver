package com.qatest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qatest.Base.BaseClass;

public class GmailLoginPage extends BaseClass{
	@FindBy(id="identifierId")
	private WebElement gmailIdTB;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement nextBTn;
	
	@FindBy(name="password")
	private WebElement pwdTB;
	
	public GmailLoginPage() {
		
	}
    public GmailLoginPage(WebDriver driver) {
    	this.driver = driver;
		PageFactory.initElements(driver, this);
    }
    
    public void enterGmailId() {
    	gmailIdTB.sendKeys("kirandg1993@gmail.com");
    }
    public void clickOnNextButton() {
    	nextBTn.click();
    }
    public void enterGmailPwd() {
    	pwdTB.sendKeys("kirandeepa");
    }
}
