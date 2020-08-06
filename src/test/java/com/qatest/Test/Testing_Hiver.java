package com.qatest.Test;

import org.testng.annotations.Test;

import com.qatest.Base.BaseClass;
import com.qatest.pages.GmailAccountPage;
import com.qatest.pages.GmailLoginPage;
import com.qatest.pages.HiveHomePage;

public class Testing_Hiver extends BaseClass {
	//login to gmailaccount
	@Test
	public void hiverTest() {
		GmailLoginPage gmlogin = new GmailLoginPage();
		//To enter gmail ID
		gmlogin.enterGmailId();
		//To click on Next Button
		gmlogin.clickOnNextButton();
		//To enter password
		gmlogin.enterGmailPwd();
		//To click on Next button
		gmlogin.clickOnNextButton();
		
		GmailAccountPage gAccoun = new GmailAccountPage();
		//To click on hiver button in gmail box
		gAccoun.clickOnHiverBtn();
		//To select admin panel
		gAccoun.clickOnAdminBtn();
		
		HiveHomePage hHomePage = new HiveHomePage();
		//To click on the SharedMail box
		hHomePage.clickOnSharedBtn();
		//To select the SharedMailBox from the List 
		hHomePage.clickOnSharedMailBoxFromList();
		//To select check box to enable
		hHomePage.selectCheckBox();
		//Switching to frame
		hHomePage.frameShift(driver);
		//To enter the message in the editor
		hHomePage.enterMessage();
		//To click on the save button
		hHomePage.clickOnSaveBTn();
		//To verify and print the text on console
		hHomePage.verifyToastMessage();
		
	}
	

}
