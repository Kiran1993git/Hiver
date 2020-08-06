package com.qatest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qatest.Base.BaseClass;

public class GmailAccountPage extends BaseClass {

	@FindBy(xpath = "//div[@id='hq-accounts-icon']")
	private WebElement hiverBTn;
	
	@FindBy(xpath="//div[@class='account-option-icon-label admin-guider']")
	private WebElement adminBtn;

	public GmailAccountPage() {

	}

	public GmailAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnHiverBtn() {
		hiverBTn.click();
	}
	public void clickOnAdminBtn() {
		adminBtn.click();
	}

}
