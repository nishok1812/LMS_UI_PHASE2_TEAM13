package com.lmsuiphase2.pageobjects;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.Assert;
import org.bouncycastle.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.lmsuiphase2.utilities.ExcelUtils;
import com.lmsuiphase2.driverfactory.DriverFactory;
import com.lmsuiphase2.pageobjects.Common_PO;
import org.openqa.selenium.support.PageFactory;
import com.lmsuiphase2.utilities.CommonUtils;
import org.openqa.selenium.support.ui.Select;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class ClassPage_PO {
WebDriver driver;
	
	private static final Logger LOG= LogManager.getLogger(ClassPage_PO.class);

	public static final String DashboardPageUrl = "https://lms.herokuapp.com/dashboard/";;
	
	@FindBy (linkText = "Class") WebElement ClassLink;
	@FindBy (linkText = "Student") WebElement StudentLink;
	@FindBy (linkText = "Program") WebElement ProgramLink;
	@FindBy (linkText = "Batch") WebElement BatchLink;
	@FindBy (linkText = "User") WebElement UserLink;
	@FindBy (linkText = "Attendance") WebElement AttendanceLink;
	@FindBy (linkText = "Assignment") WebElement Assignment;
	@FindBy (xpath="//button[@type='button']") WebElement AddNewClass;
	@FindBy (xpath="//button1[@type='button']") WebElement DeleteAll;
	@FindBy (id="searchbox") WebElement SearchBox;
	@FindBy (xpath="//*[text()='Manage Class']") WebElement ClassHeader;
	@FindBy (xpath = "//*[@id ='edit']/tbody/tr[1]") WebElement EditClass1;
	@FindBy (xpath = "//*[@id ='edit']/tbody/tr[2]") WebElement EditClass2;
	@FindBy (xpath = "//*[@id ='edit']/tbody/tr[3]") WebElement EditClass3;
	@FindBy (xpath = "//*[@id ='delete']/tbody/tr[2]/td[1]") WebElement DeleteClass1;
	@FindBy (xpath = "//*[@id ='delete']/tbody/tr[2]/td[2]") WebElement DeleteClass2;
	@FindBy (xpath = "//*[@id ='delete']/tbody/tr[2]/td[3]") WebElement DeleteClass3;
	@FindBy (xpath = "//*[@id ='sort']/tbody/tr[1]/td[1]") WebElement BatchIdSort;
	@FindBy ( xpath = "//*[@id ='sort']/tbody/tr[1]/td[2]") WebElement ClassNoSort;
    @FindBy ( xpath = "//*[@id ='sort']/tbody/tr[1]/td[3]") WebElement ClassDateSort;
    @FindBy ( xpath = "//*[@id ='sort']/tbody/tr[1]/td[4]") WebElement ClassTopicSort;
    @FindBy ( xpath = "//*[@id ='sort']/tbody/tr[1]/td[5]") WebElement StaffIdSort;
    @FindBy ( xpath = "//*[@id ='sort']/tbody/tr[1]/td[6]") WebElement DescriptionSort;
    @FindBy ( xpath = "//*[@id ='sort']/tbody/tr[1]/td[7]") WebElement CommentSort;
    @FindBy ( xpath = "//*[@id ='sort']/tbody/tr[1]/td[8]") WebElement NoteSort;
    @FindBy ( xpath = "//*[@id ='sort']/tbody/tr[2]/td[1]") WebElement RecordingSort;
    @FindBy ( xpath ="//ul[@class='pagination-list']/li") WebElement Paginator;
    @FindBy (xpath ="//*[@id=’edit’]/tbody/tr[1]/td[10]") WebElement EditClass;
	@FindBy (xpath ="//*[@id=’delete’]/tbody/tr[1]/td[11]")WebElement DeleteClass;
    @FindBy (id="BatchId") WebElement BatchId;
    @FindBy (id="Number of Classes") WebElement NoOfClasses;
    @FindBy (id= "Date") WebElement ClassDate;
    @FindBy (id="Topic") WebElement ClassTopic;
    @FindBy (id ="StaffId") WebElement StaffId;
    @FindBy (id = "Description") WebElement ClassDesc;
    @FindBy (id = "Comments") WebElement Comments;
    @FindBy (id = "Notes") WebElement Notes;
    @FindBy (id= "Record") WebElement Recording;
    @FindBy(id = "EditHeader")WebElement EditHeader;
	@FindBy(id="DeleteHeader")WebElement DeleteHeader;
    @FindBy (xpath="//button[@type='save']") By  SaveBtn;
    @FindBy (xpath ="//button[@type= 'cancel']") WebElement CancelBtn;
    @FindBy (id="ConfirmedCheckbox") WebElement CheckboxAll;
    @FindBy(xpath ="//[@id='entry-form']") WebElement NumberEntries;
    @FindBy(xpath="//a[text()='number of classes']") WebElement classesCount;
    @FindBy(xpath = "//*[@id='class']") WebElement dataTable;
    @FindBy (xpath= "//a[text()='ClassDetails']") WebElement ClassDetails;
    @FindBy (xpath ="//*[@class-details-popup inputtype='text']") WebElement TextBox;
    @FindBy (xpath = "//a[@class='batch-box dropdown-toggle']")WebElement BatchDropDown;
	@FindBy (xpath= "//a[@class='staff-box dropdown-toggle']")WebElement  StaffDropDown ;
	@FindBy (xpath="//table[@class='calendar-table']") WebElement Calendar;
	@FindBy (xpath="//button[@type='button'][text()='Close']") WebElement CloseBtn;
	@FindBy (xpath="//input[@class='Batch Id']") WebElement BatchIdTextBox;
	@FindBy (xpath= "//input[@class='Class No']") By ClassNoTextBox;
	@FindBy (xpath="//input[@class='Class Date']") By ClassDateTextBox;
	@FindBy (xpath ="//input[@class='Class Topic']") WebElement ClassTopicTextBox ;
	@FindBy (xpath ="//input[@class='Description']") WebElement DescriptionTextBox ;
	@FindBy (xpath= "//input[@class='Comments']") WebElement CommentsTextBox;
	@FindBy (xpath="//input[@class='Notes']") WebElement NotesTextBox;
	@FindBy (xpath="//input[@class='Recording']") WebElement RecordingTextBox  ;
	@FindBy (xpath="//input[@class='Staff id']") WebElement StaffIdTextBox;
    @FindBy (xpath ="//date-picker .right-arrow") WebElement DatePickerRightArrow;
    @FindBy (xpath="//button[@type='button'][text()='yes']") WebElement Yes;
    @FindBy (xpath="//button[@type='button'][text()='no']") WebElement No;
    @FindBy (xpath="//div[@class='pagination']//a[@class='right']")WebElement RightArrowPagination;
    @FindBy (xpath="//div[@class='pagination']//a[@class='left']") WebElement LeftArrowPagination;
	@FindBy (xpath="//button[@type='button'][text()='Student']") WebElement Student;	
	@FindBy (xpath="//button[@type='button'][text()='Program']") WebElement Program;	
	@FindBy (xpath="//button[@type='button'][text()='Batch']") WebElement Batch;	
	@FindBy (xpath="//button[@type='button'][text()='User']") WebElement User;	
	@FindBy (xpath="//div[date-picker-left-arrow") WebElement DatepickerLeftArrow;
	@FindBy (xpath= "/date-picker-prevmonth") WebElement DatePickerPreviousMonth;
	@FindBy (xpath= "/date-picker-nextmonth") WebElement DatePickerNextMonth;
	@FindBy (xpath="//button[@type='button'][text()='Attendance']") WebElement Attendance;	
	@FindBy (xpath="//button[@type='button'][text()='Logout']") WebElement Logout;
	
    //public String currentUrl= Common_PO.getCurrentUrl();
    String title;
    //String excelURL = CommonUtils.getexcelfilepath();
    XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;
	XSSFRow row;
    public String expectedUrl = "https://lms.herokuapp.com/class/";
    
    
    
    public ClassPage_PO(WebDriver driver) {
    	this.driver = driver;
		PageFactory.initElements(driver, this);
		Actions act = new Actions(driver);
			}
	//public String currentpage()
//	{
	//	driver.get(currentUrl);
	//	return currentUrl;
	//}
	    
	public void clickClassLink()
	{
		ClassLink.click();
	}
	
	public void getClassPageLoadTime()
	{
		
	}

   /* public String getHeader() {
    	String header = Common_PO.getHeader();
    	return header;
    }*/
    
    public void getAllTextForFields() {
   
	}
    
    public void isSearchBoxDisplayed()
    {
    	boolean search= SearchBox.isDisplayed();
	}
    
    public void addNewClassBtn() {
    	AddNewClass.isDisplayed();
    }
    public List<Object> verifyColumnHeaderText()  {
		
		List<Object> colheaderlist= new ArrayList<Object>();
		colheaderlist.add(BatchId.getText());
		colheaderlist.add(NoOfClasses.getText());
		colheaderlist.add(ClassDate.getText());
		colheaderlist.add(ClassTopic.getText());
		colheaderlist.add(StaffId.getText());
		colheaderlist.add(ClassDesc.getText());
		colheaderlist.add(Comments.getText());
		colheaderlist.add(Notes.getText());
		colheaderlist.add(Recording.getText());
		colheaderlist.add(EditHeader.getText());
		colheaderlist.add(DeleteHeader.getText());
		
		return colheaderlist;
    }
    public void editClass1()
    {
    
       EditClass1.isDisplayed();
    }
    public void editClass2()
    {
    
       EditClass2.isDisplayed();
    }
    public void editClass3()
    {
    
       EditClass3.isDisplayed();
    }
    public void deleteClass1()
    {
    
       DeleteClass1.isDisplayed();
    }
    public void deleteClass2()
    {
    
       DeleteClass2.isDisplayed();
    }
    public void deleteClass3()
    {
    
       DeleteClass3.isDisplayed();
    }
    public void batchidSort()
    {
    	BatchIdSort.isDisplayed();
    }
    public void classnoSort() 
    {
    	ClassNoSort.isDisplayed();
    }
    public void classdateSort() 
    {
    	ClassDateSort.isDisplayed();
    }
    public void classtopicSort() 
    {
    	ClassTopicSort.isDisplayed();
    }
    public void staffidSort() 
    {
    	StaffIdSort.isDisplayed();
    }
    public void descriptionSort() 
    {
    	DescriptionSort.isDisplayed();
    }
    public void commentSort() 
    {
    	CommentSort.isDisplayed();
    }
    public void noteSort() 
    {
    	NoteSort.isDisplayed();
    }
    public void recordingSort() 
    {
    	RecordingSort.isDisplayed();
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

public String NumberEntries()
{
	return NumberEntries.getText();
}
public int rowCount()
{
	List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table-list']/tbody/tr"));
	return rows.size();
}

public void pagination()
{
	Paginator.isDisplayed();
}
public String classesnumber()
{
 return classesCount.getText();
 
}
public void TexttoSearch(String SearchField, String ReturnField)
{
	WebElement searchBox = driver.findElement(By.id("searchbox")); // Replace with the actual ID of the search box
    searchBox.clear();
    searchBox.sendKeys(SearchField);
 
}
public boolean DataTableEmpty()
{
	dataTable.isDisplayed();
    String dataTableText = dataTable.getText().trim();
    return dataTableText.isEmpty();
	
}	
public void addNewClass()
{
	AddNewClass.click();
}
public boolean ClassDetails()
{
	return ClassDetails.isDisplayed();
}
public boolean EditClass()
{
	return EditClass1.isDisplayed();
}

public boolean DeleteClass()
{
	return DeleteClass.isDisplayed();
}
public boolean BatchId()
{
	return BatchId.isDisplayed();
}
public boolean NoOfClasses()
{
	return NoOfClasses.isDisplayed();
}
public boolean ClassDate()
{
	return ClassDate.isDisplayed();
}
public boolean ClassTopic()
{
	return ClassTopic.isDisplayed();
}
public boolean StaffId()
{
	return StaffId.isDisplayed();
}
public boolean ClassDesc()
{
	return ClassDesc.isDisplayed();
}
public boolean Notes()
{
	return Notes.isDisplayed();
}
public boolean Comments()
{
	return Comments.isDisplayed();

}
 public boolean Recording()
 {
	 return Recording.isDisplayed();
 }
 public List<WebElement> TextBox()
 
 {
	 	List<WebElement> textboxes = new ArrayList<>();
		textboxes.add(TextBox);
		 return textboxes;
					 
 }
 public boolean batchdropdown()
 {
	return ((WebElement) BatchDropDown).isDisplayed();
 }
 public boolean staffdropdown()
 {
	return StaffDropDown.isDisplayed();
 }

public boolean calendaricon()
{
	return Calendar.isDisplayed();
}
public boolean save()
{
	return((WebElement) SaveBtn).isDisplayed();
}
public boolean cancel()
{
	return CancelBtn.isDisplayed();
}
public boolean close()
{
	return CloseBtn.isDisplayed();
}

public void clickdatepicker()
{
	Calendar.click();
}
public void clickrightarrowdatepicker()
{
	DatePickerRightArrow.click();
}
public void clickleftarrowdatepicker()
{
	DatepickerLeftArrow.click();
}
public void clickCancel()
{
	 CancelBtn.click();
}

public void click_edit()
{
	EditClass.click();
}
public void click_edit1()
{
	 EditClass1.click();
}
public void click_edit2()
{
	 EditClass2.click();
}
public void click_edit3()
{
	 EditClass3.click();
}
/*public void ExcelReader(String sheetName, Integer rowNo) throws IOException {

	File src = new File(CommonUtils.getexcelfilepath());
	FileInputStream fileInput = new FileInputStream(src);
	workbook = new XSSFWorkbook(fileInput);
	sheet = workbook.getSheet(sheetName);

	cell = sheet.getRow(rowNo).getCell(0);
	((WebElement) BatchDropDown).click();
	Select sel1 =new Select(BatchDropDown);
	sel1.selectByVisibleText(cell.getStringCellValue());

	cell = sheet.getRow(rowNo).getCell(1);
	ClassNoTextBox.sendKeys ;
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


}*/


public void BatchIdDropDown(List<String> batchid) throws InterruptedException
{
 Select dropdown = new Select(driver.findElement((By) BatchDropDown));
 for (String id : batchid) {

       dropdown.selectByValue(id);
}
}
public void ClassNoTextBox() throws InterruptedException
{
}
public void ClassDateCalender(List<String> classdate) throws InterruptedException
{
  WebElement classdatetextbox = driver.findElement(ClassDateTextBox);
  classdatetextbox.click();
 for (String date: classdate) {
	 By dateLocator = By.xpath("//td[@data-date='" + date + "']");
	 WebElement dateElement = driver.findElement(dateLocator);
        dateElement.click();
 }
}
public void StaffIdDropDown(List<String> staffid) throws InterruptedException
{
 Select dropdown = new Select(driver.findElement((By) BatchDropDown));
 for (String id : staffid) {

       dropdown.selectByValue(id);
}}
 public void Click_Save() throws InterruptedException
	{
	 driver.findElement(SaveBtn).click();
					
}
 
 public void Click_BatchDropDown()
 {
 	((WebElement) BatchDropDown).click();
 }
public String DataTableBatchId() {
	String batches = BatchId.getText();
    return batches;

}
public List<WebElement> BatchDropDownText()
{
 Select dropdown = new Select(driver.findElement((By) BatchDropDown));

     List<WebElement> options = dropdown.getOptions();

    return options;
}

public List<WebElement> StaffIdDropDownText()
	{
	 Select dropdown = new Select(driver.findElement((By) StaffDropDown));

        List<WebElement> options = dropdown.getOptions();

       return options;
}

}
    
    
    

