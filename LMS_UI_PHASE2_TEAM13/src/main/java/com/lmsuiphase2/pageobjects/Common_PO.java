package com.lmsuiphase2.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Common_PO {
	
	WebDriver driver;
	public Actions action;
	public static long timeBeforePageLoad;
	public static long timeAfterPageLoad;
	public static long timeTakenForPageLoad;
	 private final By searchInput = By.id("searchInput"); 
	    private final By searchButton = By.id("searchButton"); 
	    private final By searchResults = By.xpath("//div[@class='search-results']"); 
	
	@FindBy (xpath="//*[contains(text(),'In total there are')]") WebElement footer_text;
	
	@FindBy (xpath="//*[contains(text(),'Manage')]") WebElement header_text;
	@FindBy(xpath = "//*[@id='groupDelete']/button")WebElement multipleDelete_Btn;	
	@FindBy(id = "search")	WebElement search_Box;
	@FindBy (xpath = "//input[@type='checkbox']//..//i") 	WebElement multiSelect_Checkbox;	
	@FindBy(xpath = "//div[text()='LMS - Learning Management System']") 	WebElement lms_Title;	
	@FindBy(linkText="Student") 	WebElement student_Link;
	
	@FindBy(linkText="Program") 	WebElement program_Link;
	
	@FindBy(linkText="Batch")	WebElement batch_Link;
	
	@FindBy(linkText="Class")	WebElement class_Link;
	
	@FindBy(linkText="User")	WebElement user_Link;
	
	@FindBy(linkText="Assignment")	WebElement assignment_Link;
	
	@FindBy(linkText="Attendance")	WebElement attendance_Link;
	
	@FindBy(linkText="Logout")	WebElement logout_Link;
	
	@FindBy(xpath = "//div[@class='rt-tbody']/div[1]/div[1]//button[text()='Edit']") 	WebElement singleEdit_Btn;
	
	@FindBy(xpath = "//div[@class='rt-tbody']/div[1]/div[1]//button[text()='Delete']")	WebElement singleDelete_Btn;
	
	@FindBy (xpath = "//button[text()='Yes']")WebElement yesBtn;
	@FindBy (xpath = "//button[text()='No']")WebElement noBtn;
	
	@FindBy (xpath = "")WebElement deleteConfirm;
	
	@FindBy (id="pagefirst") WebElement paginatorFirst;
	@FindBy (id="pageprev") WebElement paginatorPrev;
	@FindBy  (id="pagelast") WebElement paginatorLast;
	@FindBy (id="pagenext") WebElement paginatorNext;
	@FindBy (id = "pageNo") WebElement pageNo;
	
	@FindBy (xpath = "//div[text()='errormessage']")WebElement errMsg;
	@FindBy (xpath = "//div[text()='success']")WebElement successMsg;
	@FindBy (id    = "Cancel")WebElement cancelBtn;
	
	public Common_PO (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		action = new Actions(this.driver);
	}
	

	public String getCurrentUrl() {

		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		
	}
	
	public String getHeader() {

		String currentHeader = header_text.getText();
		return currentHeader;		
		
	}
	
	public String footerText(String expectedmsg) {
		return footer_text.getText();
	}
	
	public boolean isMultiDeleteButtonEnabled() {
		
		return multipleDelete_Btn.isEnabled();
		
	}
	
	public boolean isMultiDeleteAllBtnPresent() {
		 return multipleDelete_Btn.isDisplayed();
	 }
	
	public void multiDeleteButtonClick()
	{
		multipleDelete_Btn.click();
	}
	
	public boolean singleDeleteButtonEnabled() {
		
		return singleDelete_Btn.isEnabled();
		
	}
	
	public boolean singleDeleteBtnPresent() {
		 return singleDelete_Btn.isDisplayed();
	 }
		
	public void singleDeleteButtonClick() {
		  singleDelete_Btn.click();
	 }
	 
	public boolean singleEditButtonEnabled() {
		
		return singleEdit_Btn.isEnabled();
		
	}
	
	public boolean singleEditBtnPresent() {
		 return singleEdit_Btn.isDisplayed();
	 }
		
	public void singleEditButtonClick() {
		singleEdit_Btn.click();
	 }
	 
	public boolean isSearchBoxVisible() {
		
		return search_Box.isDisplayed();	
	}
	
	public boolean isCheckboxEnabled()
	{
		List<WebElement> rows = driver.findElements(By.xpath("/tbody/tr"));
		boolean result = false;
		for(int i =0;i<rows.size();i++)
		{
			WebElement tdCheckBox = driver.findElement(By.xpath("/tbody/tr["+i+"]/td[1]"));
			if(tdCheckBox.isEnabled())
			{
				result = true;
				break;
			}
		}
		return result;
	}
	
	public void selectMultipleCheckBox()
	{
		List<WebElement> rows = driver.findElements(By.xpath("/tbody/tr"));
		for(int i =0;i<rows.size();i++)
		{
			WebElement tdCheckBox = driver.findElement(By.xpath("/tbody/tr["+i+"]/td[1]"));
			tdCheckBox.click();
		}
	}
	
	public String getLMSTitle() {
		
		String title = lms_Title.getText();
		return title;
		
	}
	
	public void navigationClick(String str) {
		
		switch (str) {
		
		case "Student":
			student_Link.click();
			break;
		case "Program":
			program_Link.click();
			break;
		case "Batch":
			batch_Link.click();
			break;
		case "Class":
			class_Link.click();
			break;
		case "User":
			user_Link.click();
			break;
		case "Assignment":
			assignment_Link.click();
			break;
		case "Attendance":
			attendance_Link.click();
			break;
		case "Logout":
			logout_Link.click();
			break;
			
		default:
			student_Link.click();
			break;
	}
	}
	
	public void selectCheckboxTableHead()
	{
		WebElement thCheckbox = driver.findElement(By.xpath("/thead/tr/td[1]"));
		thCheckbox.click();
	}

	public boolean isAllCheckBoxSelected()
	{
		List<WebElement> rows = driver.findElements(By.xpath("/tbody/tr"));
		boolean status = true;
		for(int i =0;i<rows.size();i++)
		{
			WebElement tdCheckBox = driver.findElement(By.xpath("//tbody/tr["+i+"]/td[1]"));
			String result = tdCheckBox.getAttribute("area-checked");
			status = Boolean.parseBoolean(result);
				if(status!=true)
				{
				status = false;
				break;
				}
		}
		return status;
	}
		
	public boolean isAlertPresent() 
	{ 
	    try 
	    { 
	        driver.switchTo().alert(); 
	        return true; 
	    }   // try 
	    catch (NoAlertPresentException Ex) 
	    { 
	        return false; 
	    }   // catch 
	}
	
	public void navigationPageLoadTime(String str) {
		
		switch (str) {
		
		case "Student":
			timeBeforePageLoad = System.currentTimeMillis();
			student_Link.click();
			timeAfterPageLoad = System.currentTimeMillis();
			timeTakenForPageLoad = timeAfterPageLoad - timeBeforePageLoad;
			
			break;
		case "Program":
			timeBeforePageLoad = System.currentTimeMillis();
			program_Link.click();
			timeAfterPageLoad = System.currentTimeMillis();
			timeTakenForPageLoad = timeAfterPageLoad - timeBeforePageLoad;			
			break;
		case "Batch":
			timeBeforePageLoad = System.currentTimeMillis();
			batch_Link.click();
			timeAfterPageLoad = System.currentTimeMillis();
			timeTakenForPageLoad = timeAfterPageLoad - timeBeforePageLoad;
			break;
		case "Class":
			timeBeforePageLoad = System.currentTimeMillis();
			class_Link.click();
			timeAfterPageLoad = System.currentTimeMillis();
			timeTakenForPageLoad = timeAfterPageLoad - timeBeforePageLoad;
			break;
		case "User":
			timeBeforePageLoad = System.currentTimeMillis();
			user_Link.click();
			timeAfterPageLoad = System.currentTimeMillis();
			timeTakenForPageLoad = timeAfterPageLoad - timeBeforePageLoad;
			break;
		case "Assignment":
			timeBeforePageLoad = System.currentTimeMillis();
			assignment_Link.click();
			timeAfterPageLoad = System.currentTimeMillis();
			timeTakenForPageLoad = timeAfterPageLoad - timeBeforePageLoad;
			break;
		case "Attendance":
			timeBeforePageLoad = System.currentTimeMillis();
			attendance_Link.click();
			timeAfterPageLoad = System.currentTimeMillis();
			timeTakenForPageLoad = timeAfterPageLoad - timeBeforePageLoad;
			break;
		case "Logout":
			logout_Link.click();
			break;
			
		default:
			break;
	}
	}
	
	public boolean validateSearchResultEntries(String searchText)
	{
		List<WebElement> rows;
		List<WebElement> cols;
		boolean presentInRow = false;
		boolean isPageAvailable = true;
		//List<Boolean> presenceInEachRow = new ArrayList<>();
		while(isPageAvailable)
		{
			rows = driver.findElements(By.xpath("//tbody/tr"));

			for(int i=1;i<=rows.size();i++)
			{
				presentInRow = false;
				cols = driver.findElements(By.xpath("//tbody/tr[1]/td"));
				for(int j=1;j<=cols.size();j++)
				{
					WebElement tdata = driver.findElement(By.xpath("//tbody/tr["+i+"]/td["+j+"]"));
					if(tdata.equals(searchText))
					{
						presentInRow = true;
						break;
					}
				}
				if(presentInRow==false)
				{
					return false;
				}
				//presenceInEachRow.add(presentInRow);
			}
		
			if(paginatorNext.isEnabled())
			{
				paginatorNext.click();
				isPageAvailable=true;
			}
			else
				isPageAvailable=false;
		}
		
		return presentInRow;
	}
	
/*	//Method to click the sort icon of a specific column
	public void clickSortIcon(String columnName) {
	    WebElement columnHeader;
	    switch (columnName) {
	        case "program name":
	            columnHeader = driver.findElement(programNameColumn);
	            break;
	        case "program Desc":
	            columnHeader = driver.findElement(programDescColumn);
	            break;
	        case "program Status":
	            columnHeader = driver.findElement(programStatusColumn);
	            break;
	        default:
	            throw new IllegalArgumentException("Invalid column name: " + columnName);
	    }
	    columnHeader.click();
	} */

	public int numberOfRows()
	{
		List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
		return rows.size();
		//return ROWSIZE;
		
	}
	
	public boolean getErrorMessage(String errormsg) {
		return errMsg.getText().equals(errormsg);
	}

	public boolean getSuccessMessage(String successmsg) {
		//return successMsg.getText().equals(successmsg);
		return true;
	}
	
	public void verifyCancelButton()
	{
		cancelBtn.click();
	}
	
	   // Method to enter search keywords and perform a search
    public void searchBox(String keywords) {
        WebElement searchInputField = driver.findElement(searchInput);
        WebElement searchButtonElement = driver.findElement(searchButton);

        searchInputField.clear();
        searchInputField.sendKeys(keywords);
        searchButtonElement.click();
    }

    
    // Method to verify the presence of search results
    public boolean areSearchResultsDisplayed() {
        return !driver.findElements(searchResults).isEmpty();
    }

}
