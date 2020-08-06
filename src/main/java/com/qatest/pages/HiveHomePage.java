package com.qatest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qatest.Base.BaseClass;

public class HiveHomePage extends BaseClass {

	@FindBy(xpath = "//div[@class='h-trow h-pointer']")
	private WebElement listOfSharedMail;

	@FindBy(xpath = "//li[@name='sharedmailbox']")
	private WebElement sharedBTn;

	@FindBy(xpath = "//span[text()='Auto Responder']")
	private WebElement autoResponder;

	@FindBy(xpath = "//label[@for='checkbox-default-3']")
	private WebElement checkBox;
	
	@FindBy(xpath="//iframe[@title=\"Rich Text Editor, editor2\"]")
	private WebElement editorFrame;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement saveBTn;
	
	@FindBy(xpath="//div[text()='Auto Responder text edited']")
	private WebElement toastMessageVerify;

	public HiveHomePage() {
		// TODO Auto-generated constructor stub
	}

	public HiveHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnSharedBtn() {
		sharedBTn.click();
	}

	public void clickOnSharedMailBoxFromList() {
		listOfSharedMail.click();
	}

	public void clickOnAutoResponder() {
		autoResponder.click();
	}

	public void selectCheckBox() {
		checkBox.click();
	}
	
    public void frameShift(WebDriver driver) {
    	driver.switchTo().frame(0);
    	
    }
    public void enterMessage() {
    	editorFrame.sendKeys("Hi Hiver User");
    }
    public void clickOnSaveBTn() {
    	saveBTn.click();
    }
    public void verifyToastMessage() {
    	String actualMessage ="Auto Responder text edited";
    	
    	Assert.assertEquals(actualMessage, toastMessageVerify.getText());
    	System.out.println(toastMessageVerify.getText());
    }
}
