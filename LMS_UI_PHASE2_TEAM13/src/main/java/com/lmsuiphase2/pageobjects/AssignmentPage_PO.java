package com.lmsuiphase2.pageobjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lmsuiphase2.utilities.CommonUtils;

public class AssignmentPage_PO {
	
	WebDriver driver;
	public Actions action;
	
	@FindBy (xpath = "//button//span[text()='A New Assignment']") 
	WebElement addNewAssignment_Btn;
    
	@FindBy (xpath="//*[contains(text(),'In total there are')]")
	WebElement table_Footer_Total;
	
	@FindBy (xpath="//*[contains(text(),'Showing')]")
	WebElement table_Footer_entries;
	
	@FindBy (xpath="//*[contains(text(),'<<')]")
	WebElement paginationControl;
	
	@FindBy (xpath = "//button//span[text()='A New Assignment']") 
	WebElement navigation_header;
    
	@FindBy (xpath="//*[contains(text(),'In total there are')]")
	WebElement AssignmentName;
	
	@FindBy (xpath="//*[contains(text(),'Showing')]")
	WebElement AssignmentDescription;
	
	@FindBy (xpath="//*[contains(text(),'<<')]")
	WebElement AssignmentDueDate;
	
	@FindBy (xpath="//*[contains(text(),'Showing')]")
	WebElement AssignmentGrade;
	
	@FindBy (xpath="//*[contains(text(),'<<')]")
	WebElement Edit_delete;
	
	@FindBy(xpath = "//div[@class='rt-tbody']/div[1]/div[1]//button[text()='Delete']")
	WebElement singleDelete_Btn;
	
	@FindBy (xpath = "//div[text()='success']")
	WebElement successMsg;
	
	@FindBy(xpath="//*[@class='main-header']")
	public
	WebElement manage_AssignmentPg_Header;
	
	@FindBy(xpath = "//div[text()='Assignment Name']")
	public
	WebElement assignmentName_ColumnName;
	
	@FindBy(xpath = "//div[text()='Assignment Description']")
	public
	WebElement assignmentDescription_ColumnName;
	
	@FindBy(xpath = "//div[text()='Assignment Due Date']")
	public
	WebElement assignmentDueDate_ColumnName;
	
	@FindBy(xpath = "//div[text()='Assignment Grade']")
	public
	WebElement assignmentGrade_ColumnName;
	
	@FindBy (xpath = "//div[@class='oxd-table']")
	public
	WebElement dataTable;
	
	@FindBy(xpath = "//div[text()='Edit/Delete']")
	public
	WebElement editdelete_ColumnName;
	
	@FindBy (xpath = "//input[@type='checkbox']//..//i")
	public
	WebElement multiSelect_Checkbox;
	
	
	
	
	
	@FindBy (xpath = "//button//span[text()='save']") 
	WebElement save_Btn;
	
	@FindBy (xpath = "//button//span[text()='cancel']") 
	WebElement cancel_Btn;
	
	@FindBy (xpath = "//button//span[text()='close']") 
	WebElement close_Btn;
	
	@FindBy (xpath = "//div[text()='errormessage']")
	WebElement errMsg;
	
	@FindBy (xpath = "//div[text()='success']")
	WebElement successMesg;
	
	@FindBy	 (xpath = "//button//span[text()='Edit']") 
	WebElement editBtn;
	
	@FindBy(xpath="//div[text()='Select a Program Name']")
	public
	WebElement programName_DropDown;
	
	@FindBy(xpath="//div[text()='Select Batch']")
	public
	WebElement batchNumber_DropDown;
	
	@FindBy(xpath="//div[@class='oxd-assignment-name-input']")
	WebElement assignmentName_TextBox;
	
	@FindBy(xpath="//div[@class='oxd-assignment-description-input']")
	WebElement assignmentDescription_TextBox;
	
	@FindBy(xpath="//div[@class='oxd-grade_By-input']")
	WebElement gradeBy_TextBox;
	
	@FindBy(xpath="//div[@class='oxd-assignment-due-date-input']")
	WebElement assignmentDueDate_TextBox;
	
	@FindBy(xpath="//div[@class='oxd-assignment-file1-input']")
	WebElement assignmentFile1_TextBox;
	
	@FindBy(xpath="//div[@class='oxd-assignment-file2-input']")
	WebElement assignmentFile2_TextBox;
	
	@FindBy(xpath="//div[@class='oxd-assignment-file3-input']")
	WebElement assignmentFile3_TextBox;
	
	@FindBy(xpath="//div[@class='oxd-assignment-file4-input']")
	WebElement assignmentFile4_TextBox;
	
	@FindBy(xpath="//div[@class='oxd-assignment-file5-input']")
	WebElement assignmentFile5_TextBox;
	
	public int winHeight; 
	public int winWidth;
	public int xPos;
	public int yPos; 
	public int eleHeight;
	public int eleWidth;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;
	XSSFRow row;
	
	@FindBy	(xpath = "//h2[text()='Manage Assignment']") WebElement assignmentHeader;
	
	WebElement AssignmentDetailPopup = driver.findElement(By.id("assignmentDetailsPopup"));
	
	public String manageAssignmentText = "Manage Assignment";
	public String titleText = "LMS - Learning Management System";
	public String assignmentNameText = "Assignment Name";
	public String assignmentDescriptionText = "AssignmentDescription";
	public String assignmentDueDateText = "Assignment Due Date";
	public String assignmentGradeText = "AssignmentGrade";
	
	
	
	public AssignmentPage_PO (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		action = new Actions(this.driver);
	}
	
	public boolean isAddNewAssignmentBtnVisible() {
		
		return addNewAssignment_Btn.isDisplayed();	
			
	}
	
	public boolean isSortIconsVisible() {
	    List<WebElement> sortIcons = driver.findElements(By.xpath("//table[@id='yourTableId']//th[@class='sortable']/span[@class='sort-icon']"));
	    return !sortIcons.isEmpty();
	}
	
	public String getEntriesFooter() {		
		
		return table_Footer_entries.getText();
	}
	
	public String getTotalFooter() {
		
		return table_Footer_Total.getText();
		
	}
	
	public boolean isPaginationVisible() {
		
		return paginationControl.isDisplayed();
	}
	
	public void addNewAssignmentBtnClick() {
		
		addNewAssignment_Btn.click();
		
	}
	
	public void singleDeleteBtnClick() {
		
		singleDelete_Btn.click();
		
	}
	
	public void acceptAlert() {
		
		driver.switchTo().alert().accept();
		
	}
	
	public void dismissAlert() {
		
		driver.switchTo().alert().dismiss();
		
	}
	
	public String getSuccessMessage() {
		
		String Msg = successMsg.getText();
		return Msg;
		
	}
	
	public boolean isAssignmentDetailsPopupVisible() {
		
		  return AssignmentDetailPopup.isDisplayed();
		}
	
	public String getHeader() {
		
				String currentHeader = manage_AssignmentPg_Header.getText();
				return currentHeader;
				
	}

	public int AssignmentDetailsPopupTextBoxCount() {
		
		  int size = 0;
		  if(AssignmentDetailPopup.isDisplayed()) {
			  List<WebElement> textBoxCount = driver.findElements(By.xpath("//input[@type=’text’"));
			  size = textBoxCount.size();
		  }
		  return size;
	}
	
	public boolean AssignmentDetailsPopupSaveBtn() {
		
		return save_Btn.isDisplayed();
		
	}
	
	public boolean AssignmentDetailsPopupCancelBtn() {
		
		return cancel_Btn.isDisplayed();
		
	}

	public boolean AssignmentDetailsPopupCloseBtn() {
		
		return close_Btn.isDisplayed();
		
	}
	
	public boolean getErrorMessage(String errormsg) {
		return errMsg.getText().equals(errormsg);
	}

	public boolean getSuccessMessage(String successmsg) {
		return true;
	}
	
	public void clickCancelonPop() {
		
		cancel_Btn.click();
	}
	
	public boolean isAssignmentmDetailsClosed()
	{
		try {
			assignmentHeader.getText();
			return false;
		}
		catch(Exception NoSuchElementException){
			return true;
		}
	}
	
	public void verifyAssignEditButton()
	{
		editBtn.click();
	}
	
	public void ExcelReader(String sheetName, Integer rowNo) throws IOException {

		File src = new File(CommonUtils.excelFilePath);
		FileInputStream fileInput = new FileInputStream(src);
		workbook = new XSSFWorkbook(fileInput);
		sheet = workbook.getSheet(sheetName);

		cell = sheet.getRow(rowNo).getCell(0);
		programName_DropDown.click();
		Select sel1 =new Select(programName_DropDown);
		sel1.selectByVisibleText(cell.getStringCellValue());

		cell = sheet.getRow(rowNo).getCell(1);
		batchNumber_DropDown.click();
		Select sel3 =new Select(batchNumber_DropDown);
		sel3.selectByVisibleText(cell.getStringCellValue());

		cell = sheet.getRow(rowNo).getCell(2);
		assignmentName_TextBox.sendKeys(cell.getStringCellValue());
		
		cell = sheet.getRow(rowNo).getCell(3);
		assignmentDescription_TextBox.sendKeys(cell.getStringCellValue());
		 
		cell = sheet.getRow(rowNo).getCell(4);
		gradeBy_TextBox.sendKeys(cell.getStringCellValue());
		
		cell = sheet.getRow(rowNo).getCell(5);
		assignmentDueDate_TextBox.sendKeys(cell.getStringCellValue());
		
		cell = sheet.getRow(rowNo).getCell(4);
		assignmentDescription_TextBox.sendKeys(cell.getStringCellValue());
		
		cell = sheet.getRow(rowNo).getCell(5);
		assignmentFile1_TextBox.sendKeys(cell.getStringCellValue());
		
		cell = sheet.getRow(rowNo).getCell(6);
		assignmentFile2_TextBox.sendKeys(cell.getStringCellValue());
		
		cell = sheet.getRow(rowNo).getCell(7);
		assignmentFile3_TextBox.sendKeys(cell.getStringCellValue());
		
		cell = sheet.getRow(rowNo).getCell(8);
		assignmentFile4_TextBox.sendKeys(cell.getStringCellValue());
		
		cell = sheet.getRow(rowNo).getCell(9);
		assignmentFile5_TextBox.sendKeys(cell.getStringCellValue());

		

		save_Btn.click();


	}

	public boolean isDataTableEmpty() 
	{ 
		try 
		{ 
			int noOfRows = driver.findElements(By.xpath("//div[@class='oxd-table']")).size();
			if (noOfRows == 0)
				return true; 
		}   // try 
		catch (Exception Ex) 
		{ 
			return false; 
		}   // catch 
		return false;
	}

	public String getErrorMessage() {

		String Msg = errMsg.getText();
		return Msg;

	}

}
	
	
	
	
	
	
	
	


	
	



