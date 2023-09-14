package com.lmsuiphase2.pageobjects;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import com.lmsuiphase2.utilities.CommonUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lmsuiphase2.utilities.CommonUtils;



public class AttendancePage_PO {

	WebDriver driver;

	@FindBy(xpath = "//div[text()='LMS - Learning Management System']")
	WebElement lms_Title;

	@FindBy(linkText="Student")
	WebElement student_Link;

	@FindBy(linkText="Program")
	WebElement program_Link;

	@FindBy(linkText="Batch")
	WebElement batch_Link;

	@FindBy(linkText="Class")
	WebElement class_Link;

	@FindBy(linkText="User")
	WebElement user_Link;

	@FindBy(linkText="Assignment")
	WebElement assignment_Link;

	@FindBy(linkText="Attendance")
	WebElement attendance_Link;

	@FindBy(linkText="Logout")
	WebElement logout_Link;

	@FindBy(xpath="//*[@class='main-header']")
	public
	WebElement manage_AttendancePg_Header;

	@FindBy(id = "search")
	WebElement search_Box;

	@FindBy (xpath = "//button//span[text()='A New Attendance']") 
	WebElement addNewAttendance_Btn;

	@FindBy (xpath = "//input[@type='checkbox']//..//i")
	public
	WebElement multiSelect_Checkbox;

	@FindBy (xpath = "//div[@class='main-table'][1]//input[@type='checkbox']//..//i[1]")
	WebElement singleSelect_Checkbox;

	@FindBy (xpath = "//div[@class='oxd-table']")
	public
	WebElement dataTable;

	@FindBy(xpath = "//*[@id='groupDelete']/button")
	WebElement multipleDelete_Btn;

	@FindBy(xpath = "//div[text()='Class ID']")
	public
	WebElement classId_ColumnName;

	@FindBy(xpath = "//div[text()='Class ID']//div[@class='table-header-sort']/i")
	WebElement classId_SortBtn;

	@FindBy(xpath = "//div[text()='Student ID']")
	public
	WebElement studentId_ColumnName;

	@FindBy(xpath = "//div[text()='Student ID']//div[@class='table-header-sort']/i")
	WebElement studentId_SortBtn;

	@FindBy(xpath = "//div[text()='Present']")
	public
	WebElement present_ColumnName;

	@FindBy(xpath = "//div[text()='Present']//div[@class='table-header-sort']/i")
	WebElement present_SortBtn;

	@FindBy(xpath = "//div[text()='Edit/Delete']")
	public
	WebElement editdelete_ColumnName;

	@FindBy(xpath = "//div[@class='rt-tbody']/div[1]/div[1]//button[text()='Edit']")
	WebElement singleEdit_Btn;

	@FindBy(xpath = "//div[@class='rt-tbody']/div[1]/div[1]//button[text()='Delete']")
	WebElement singleDelete_Btn;

	@FindBy (id="pageno")
	public
	WebElement pageNo;

	@FindBy (id="pagefirst")
	public
	WebElement pageFirst_Link;

	@FindBy (id="pageprev")
	public
	WebElement pagePrev_Link;

	@FindBy (id="pagelast")
	public
	WebElement pageLast_Link;

	@FindBy (id="pagenext")
	public
	WebElement pageNext_Link;

	@FindBy (id="pageinfo")
	public
	WebElement pageInfo_Link;

	@FindBy (id="entryX")
	public
	WebElement entryX;

	@FindBy (id="entryY")
	public
	WebElement entryY;

	@FindBy (id="entryZ")
	public
	WebElement entryZ;

	@FindBy(xpath="//*[@class='table-footer']")
	public
	WebElement table_Footer;

	@FindBy(xpath="//label[text()='Program Name']")
	public
	WebElement programName_Label;

	@FindBy(xpath="//label[text()='Class Name']")
	public
	WebElement className_Label;

	@FindBy(xpath="//label[text()='Student Name']")
	public
	WebElement studentName_Label;

	@FindBy(xpath="//label[text()='Attendance Name']")
	public
	WebElement attendance_Label;

	@FindBy(xpath="//label[text()='Attendance Date']")
	public
	WebElement attendanceDate_Label;

	@FindBy(xpath="//div[text()='Select a Program Name']")
	public
	WebElement programName_DropDown;

	@FindBy(xpath="//span[text()='Aug23-ScriptScouts-SDET-20-010']")
	WebElement programName_DropDownSelect;

	@FindBy(xpath="//div[text()='Select students']")
	public
	WebElement studentName_DropDown;

	@FindBy(xpath="//span[text()='Alexa']")
	WebElement studentName_DropDownSelect;

	@FindBy(xpath="//div[text()='Select Class Name']")
	public
	WebElement className_DropDown;

	@FindBy(xpath="//span[text()='Java']")
	WebElement className_DropDownSelect;

	@FindBy(xpath="//div[text()='Select Attendance']")
	public
	WebElement attendance_DropDown;

	@FindBy(xpath="//span[text()='Present']")
	WebElement attendance_DropDownSelect;

	@FindBy(xpath="//div[@class='oxd-date-input']")
	WebElement attendanceDate_TextBox;

	@FindBy (xpath = "//button//span[text()='close']") 
	public
	WebElement close_Btn;

	@FindBy (xpath = "//button//span[text()='save']") 
	public
	WebElement save_Btn;

	@FindBy (xpath = "//button//span[text()='cancel']") 
	public
	WebElement cancel_Btn;

	@FindBy (xpath = "//div[text()='errormessage']")
	WebElement errMsg;

	@FindBy (xpath = "//div[text()='success']")
	WebElement successMsg;

	public String manageAttendanceText = "Manage Attendance";
	public String titleText = "LMS - Learning Management System";
	public String classIdText = "Class ID";
	public String studentIdText = "Student ID";
	public String presentText = "Present";
	public String programNameText = "Program Name";
	public String studentNameText = "Student Name";
	public String classNameText = "Class Name";
	public String attendanceText = "Attendance";
	public String attendanceDateText = "Attendance Date";
	public String validProgramName = "Sep23-ScriptScouts-SDET-15-022";

	public String expectedUrl;
	public static long timeBeforePageLoad;
	public static long timeAfterPageLoad;
	public static long timeTakenForPageLoad;
	public static int httpResponseCode;
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
	public String presentKeyword;
	public String absentKeyword;
	public String lateKeyword;
	public String excusedKeyword;
	public String classname;
	public String programname;

	public AttendancePage_PO (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	public String getCurrentUrl() {

		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	public void attendanceBtnClick() {

		timeBeforePageLoad = System.currentTimeMillis();
		attendance_Link.click();
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(30));
		wt.until(ExpectedConditions.elementToBeClickable (addNewAttendance_Btn));
		timeAfterPageLoad = System.currentTimeMillis();
		timeTakenForPageLoad = timeAfterPageLoad - timeBeforePageLoad;
	}

	public String getHeader() {

		String currentHeader = manage_AttendancePg_Header.getText();
		return currentHeader;

	}

	public int getHTTPResponseCode() throws IOException  {

		HttpURLConnection cn = (HttpURLConnection)new URL("https://lms.herokuapp.com/attandance/").openConnection();
		cn.setRequestMethod("HEAD");
		cn.connect();
		httpResponseCode = cn.getResponseCode();
		return httpResponseCode;

	}

	public boolean isAddNewAttendanceBtnVisible() {

		return addNewAttendance_Btn.isDisplayed();	

	}

	public boolean isClassSortIconVisible() {

		return classId_SortBtn.isDisplayed();	
	}

	public boolean isStudentSortIconVisible() {

		return studentId_SortBtn.isDisplayed();	
	}

	public boolean isPresentSortIconVisible() {

		return present_SortBtn.isDisplayed();	
	}

	public void addNewAttendanceBtnClick() {

		addNewAttendance_Btn.click();

	}

	public void singleDeleteBtnClick() {

		singleDelete_Btn.click();

	}

	public boolean isYesBtnInAlertPresent() 
	{ 
		try 
		{ 
			driver.switchTo().alert().accept();;
			return true; 
		}   // try 
		catch (NoAlertPresentException Ex) 
		{ 
			return false; 
		}   // catch 
	}

	public boolean isNoBtnInAlertPresent() 
	{ 
		try 
		{ 
			driver.switchTo().alert().dismiss();
			return true; 
		}   // try 
		catch (NoAlertPresentException Ex) 
		{ 
			return false; 
		}   // catch 
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

	public String getErrorMessage() {

		String Msg = errMsg.getText();
		return Msg;

	}

	public void selectCheckBoxInRow()
	{													
		List<WebElement> rows = driver.findElements(By.xpath("/tbody/tr"));
		for(int i =0;i<rows.size();i++)
		{
			WebElement singleCheckbox = driver.findElement(By.xpath("/tbody/tr["+i+"]/td[1]"));
			singleCheckbox.click();
		}
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
		className_DropDown.click();
		Select sel2 =new Select(className_DropDown);
		sel2.selectByVisibleText(cell.getStringCellValue());

		cell = sheet.getRow(rowNo).getCell(2);
		studentName_DropDown.click();
		Select sel3 =new Select(studentName_DropDown);
		sel3.selectByVisibleText(cell.getStringCellValue());

		cell = sheet.getRow(rowNo).getCell(3);
		attendance_DropDown.click();
		Select sel4 =new Select(attendance_DropDown);
		sel4.selectByVisibleText(cell.getStringCellValue());

		cell = sheet.getRow(rowNo).getCell(4);
		attendanceDate_TextBox.sendKeys(cell.getStringCellValue());

		save_Btn.click();


	}

	public void isAttendanceKeywordsPresent() {

		attendance_DropDown.click();
		Select select =new Select(attendance_DropDown);
		select.selectByIndex(0);
		presentKeyword = select.getFirstSelectedOption().getText();
		select.selectByIndex(1);
		absentKeyword = select.getFirstSelectedOption().getText();
		select.selectByIndex(2);
		lateKeyword = select.getFirstSelectedOption().getText();
		select.selectByIndex(3);
		excusedKeyword = select.getFirstSelectedOption().getText();

	}

	public void isClassNamePresent() {

		className_DropDown.click();
		Select select =new Select(className_DropDown);
		select.selectByIndex(0);
		classname = select.getFirstSelectedOption().getText();

	}

	public void isProgramNamePresent() {

		programName_DropDown.click();
		Select select =new Select(programName_DropDown);
		select.selectByIndex(0);
		programname = select.getFirstSelectedOption().getText();

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

}
