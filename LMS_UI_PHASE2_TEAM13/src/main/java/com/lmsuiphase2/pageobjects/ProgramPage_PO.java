package com.lmsuiphase2.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lmsuiphase2.utilities.CommonUtils;

public class ProgramPage_PO {

	WebDriver driver;
	public Actions action;
	

	public ProgramPage_PO (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		action = new Actions(this.driver);}
	
	
	@FindBy	(xpath = "//h2[text()='Manage Program']") WebElement programHeader;
	@FindBy	(xpath = "") WebElement programFooter;
	@FindBy	(xpath = "")WebElement paginatorText;
	@FindBy	(xpath = "") WebElement programTab;
	@FindBy	(xpath = "//button[text()='delete']") WebElement deleteBtn1;
	@FindBy	(xpath = "") WebElement search;
	@FindBy	(xpath = "") WebElement newProgramBtn;
	@FindBy	(xpath = "") WebElement editBtn;
	@FindBy	(xpath = "") WebElement deleteBtn;
	@FindBy	(xpath = "") WebElement BatchTab;
	@FindBy	(xpath = "") WebElement StudentTab;
	@FindBy	(xpath = "") WebElement ProgramTab;
	@FindBy	(xpath = "") WebElement ClassTab;
	@FindBy	(xpath = "") WebElement UserTab;
	@FindBy	(xpath = "") WebElement AssignmentTab;
	@FindBy	(xpath = "") WebElement AttandanceTab;
	@FindBy	(xpath = "") WebElement LogoutTab;
	
	@FindBy (xpath = "")WebElement paginatorFirst;
	@FindBy (xpath = "")WebElement paginatorPrev;
	@FindBy (xpath = "")WebElement paginatorLast;
	@FindBy (xpath = "")WebElement paginatorNext;
	@FindBy (xpath = "")WebElement pageNo;
	@FindBy (xpath = "")WebElement addNewProgramBtn;
	@FindBy (xpath = "")WebElement newProgramHeader;
	@FindBy (xpath = "")WebElement deleteConfirm;
	@FindBy (xpath = "")WebElement namePgmDetails;
	@FindBy (xpath = "")WebElement descriptionPgmDetails;
	@FindBy (xpath = "//button[text()='Active']")WebElement statusActive;
	@FindBy (xpath = "//button[text()='Inactive']")WebElement statusInActive;
	@FindBy (id    = "Cancel")WebElement cancelBtn;
	@FindBy (id    = "Save")WebElement saveBtn;
	@FindBy (xpath = "//div[text()='errormessage']")WebElement errMsg;
	@FindBy (xpath = "//div[text()='success']")WebElement successMsg;
	@FindBy (xpath = "//tbody/tr")WebElement row;
	@FindBy (xpath = "//button[text()='Yes']")WebElement yesBtn;
	@FindBy (xpath = "//button[text()='No']")WebElement noBtn;
	
	
public void clickobProgramTab() {
	programTab.click();
	
}
public void confirmDelete(String text)
{
	if(text.equals(CommonUtils.CONFIRM_YES))
		yesBtn.click();
	else
		noBtn.click();
}
	
}
