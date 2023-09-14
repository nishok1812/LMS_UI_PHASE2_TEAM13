package com.lmsuiphase2.pageobjects;

//import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
//import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
//import com.lmsuiphase2.utilities.ExcelUtils;
//import com.lmsuiphase2.apphooks.Hooks;
//import com.lmsuiphase2.driverfactory.DriverFactory;
//import com.lmsuiphase2.pageobjects.StudentPage_PO;
//import com.lmsuiphase2.utilities.CommonUtils;
//import com.lmsuiphase2.pageobjects.Common_PO;
//import com.thoughtworks.qdox.model.expression.GreaterEquals;

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

//import java.util.List;

//import io.netty.handler.timeout.TimeoutException;

public class StudentPage_PO {

WebDriver driver;
	
	private static final Logger LOG= LogManager.getLogger(StudentPage_PO.class);

	public static final String DashboardPageUrl = "https://lms.herokuapp.com/dashboard/";;

		
	
	@FindBy		(xpath = "//h2[text()='Manage Program']") WebElement programHeader;
	@FindBy	(xpath = "") WebElement  programFooter;
	@FindBy	(xpath = "")WebElement paginatorText;
	@FindBy	(xpath = "") WebElement StudentTab;
	@FindBy (id="") WebElement SelectStudentName;
	@FindBy (id="") WebElement SelectbatchId;
	@FindBy (linkText = "Class") WebElement ClassLink;
	@FindBy (linkText = "Student") WebElement StudentLink;
	@FindBy (linkText = "Program") WebElement ProgramLink;
	@FindBy (linkText = "Batch") WebElement BatchLink;
	@FindBy (linkText = "User") WebElement UserLink;
	@FindBy (linkText = "Attendance") WebElement AttendanceLink;
	@FindBy (linkText = "Assignment") WebElement Assignment;
	@FindBy (xpath="//button[@type='button']") WebElement AddNewClass;
	@FindBy (xpath="//button1[@type='button']") WebElement DeleteAll;
	@FindBy (xpath="//*[@id='oldSelectMenu']")WebElement StudentDropdown;
	@FindBy (xpath="//*[@id='oldSelectMenu']")WebElement BatchIdDropdown;
	@FindBy (id="searchbox") WebElement SearchBox;
	
	String title;
    
    XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;
	XSSFRow row;
    public String expectedUrl = "https://lms.herokuapp.com/student/";
	//String excelpath = "src\\test\\resources\\data\\Datavalues.xlsx";
	//Excelreader reader = new Excelreader();	
	//LinkedHashMap<String, String> testdata;
    
    public StudentPage_PO(WebDriver driver) {
    	this.driver = driver;
		PageFactory.initElements(driver, this);
		Actions act = new Actions(driver);
			}
    
    public void clickStudentLink()
	{
    	StudentLink.click();
	}
    
//    public void StudentNavigaTime()
//    {
//    timeBeforePageLoad = System.currentTimeMillis();
//	student_Link.click();
//	timeAfterPageLoad = System.currentTimeMillis();
//	timeTakenForPageLoad = timeAfterPageLoad - timeBeforePageLoad;
//    }
    
    public void isDropdownDisplayed()
    {
    	boolean search= StudentDropdown.isDisplayed();
	}
    
    public  void StudentBrokenLinksValidation() {
        
   	 List<WebElement> links = driver.findElements(By.tagName("a")); // Find all the links on the dashboard page using the anchor <a> tag
for (WebElement link : links) {  // Iterate through the links and validate them
           String url = link.getAttribute("href");
           if (url != null && !url.isEmpty()) {
               try {
                   // Create a URL object
                   URL linkUrl = new URL(url);

                   // Open a connection to the URL
                   HttpURLConnection connection = (HttpURLConnection) linkUrl.openConnection();
                   connection.setRequestMethod("HEAD");

                   // Get the HTTP response code
                   int responseCode = connection.getResponseCode();

                   // Check for broken links (response code other than 200 OK)
                   if (responseCode != 200) {
                       System.out.println("Broken Link Found: " + url + " (HTTP Response Code: " + responseCode + ")");
                   }

                   // Close the connection
                   connection.disconnect();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       }

      }
//    //public boolean StudentvalidateTextSpellingAndSpacing(List<WebElement> lmsTextTitles) {
//        boolean allTextValid = true;
//
//        for (WebElement lmsTextTitle : lmsTextTitles) {
//            try {
//                String text = lmsTextTitle.getText();
//
//                
//            //    boolean isSpellingValid = isSpacingValid(text);
//
//                
//             //   boolean isSpacingValid = isSpacingValid(text); 
//
//              //  if (!isSpellingValid || !isSpacingValid) {
//                 
//                    System.out.println("Text validation issues in: " + text); // Log the validation issues
//                    allTextValid = false;
//                }
//            } catch (Exception e) { // Handle any exceptions that may occur during text retrieval
//                
//                System.out.println("Error while processing text: " + e.getMessage());
//                allTextValid = false;
//            }
//        }
//
//        return allTextValid;
//    }
//    
    public void verifyColorStudent() {

		WebElement StudentnameColor = driver.findElement(By.id("04"));

		String colorCode = StudentnameColor.getCssValue("color");

		System.out.println("Color code is" + colorCode);

		String expectedColorCode = "gray";
		Assert.assertEquals(colorCode, expectedColorCode);
		// Asserting actual and expected color codes
		

	}

	public void verifyColorBatch() {

		WebElement BatchIdColor = driver.findElement(By.id("04"));

		String colorCode = BatchIdColor.getCssValue("color");

		System.out.println("Color code is" + colorCode);

		String expectedColorCode = "gray";
		Assert.assertEquals(colorCode, expectedColorCode);
		// Asserting actual and expected color codes
		

		
	}
    
	public void BatchiddropDownNo() {

		String arr[] = { "Select", "01", "02", "03" };
		WebElement dropDownBid = driver.findElement(By.id("02"));
		Select s = new Select(dropDownBid);
		List<WebElement> options = s.getOptions();
		boolean match = false;
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText() + " == " + arr[i]);
			if (options.get(i).getText().equals(arr[i])) {

				match = true;
			}

			Assert.assertTrue(match);
		}
	}
	
	public void studentDropDownLabel() {

		WebElement StudentDDLabel = driver.findElement(By.name("name"));
		System.out.println("Name of the Email Textbox is:- " + StudentDDLabel.getAttribute("Select Student Name"));
	}
	public void batchidDropDownLabel() {

		WebElement batchidlabel = driver.findElement(By.name("name"));
		System.out.println("Name of the Email Textbox is:- " + batchidlabel.getAttribute("Select Batch Id"));
	}
	
	public void DropdownscrollDownStudent() {

		WebElement targetElement = driver.findElement(By.id(""));

		Actions actions = new Actions(driver);
		actions.scrollToElement(targetElement).perform();
	}

	
	public void DropdownscrollDownbatchId() {

		WebElement targetElementbatch = driver.findElement(By.id(""));

		Actions actions = new Actions(driver);
		actions.scrollToElement(targetElementbatch).perform();
	}
	
	public void TexttoSearch(String SearchField, String ReturnField)
	{
		WebElement searchBox = driver.findElement(By.id("searchbox")); // Replace with the actual ID of the search box
	    searchBox.clear();
	    searchBox.sendKeys(SearchField);
	 
	}
	
public void SearchboxBatchId() {
		
		WebElement SearchBoxBatchid = driver.findElement(By.xpath("//div[@id='peopleglobalsearchbox']//input"));

		if (SearchBoxBatchid.isDisplayed()) {
			System.out.println("Search button is enabled " + SearchBoxBatchid.isDisplayed());
		} else {
			System.out.println("Search button is enabled" + SearchBoxBatchid.isDisplayed());
		}

		// Verify that the “Search” Box is enabled
		if (SearchBoxBatchid.isEnabled()) {
			System.out.println("Search button is enabled " + SearchBoxBatchid.isEnabled());
			SearchBoxBatchid.sendKeys("Selenium");
		} else {
			System.out.println("SSearch button is enabled " + SearchBoxBatchid.isEnabled());
		}

		System.out.println("Successful Execution of Test.");

	}

public void SearchboxStudentName() {
	WebElement SearchboxStudentName= driver.findElement(By.xpath("//div[@id='peopleglobalsearchbox']//input"));

		if (SearchboxStudentName.isDisplayed()) {
			System.out.println("Search button is enabled " + SearchboxStudentName.isDisplayed());
		} else {
			System.out.println("Search button is enabled" + SearchboxStudentName.isDisplayed());
		}

		// Verify that the “Search” Box is enabled
		if (SearchboxStudentName.isEnabled()) {
			System.out.println("Search button is enabled " + SearchboxStudentName.isEnabled());
			SearchboxStudentName.sendKeys("Selenium");
		} else {
			System.out.println("SSearch button is enabled " + SearchboxStudentName.isEnabled());
		}

		System.out.println("Successful Execution of Test.");

	}

public void SelectStudentName()	{
	
	 
	 Select select = new Select(driver.findElement(By.xpath("//select")));
	 WebElement option = select.getFirstSelectedOption();
	 
// WebElement option1 = select.selectByIndex(1);
	 String defaultItem = option.getText();
	 System.out.println(defaultItem );
}

public void SelectBatchId() {
	 Select select = new Select(driver.findElement(By.xpath("//batch")));
	 WebElement option = select.getFirstSelectedOption();
	 
// WebElement option1 = select.selectByIndex(1);
	 String defaultItem = option.getText();
	 System.out.println(defaultItem );

}
//public void SelectStudentName()
//{
	
//String retiveValue = select.selectByIndex(0);
//	System.out.println("retriveValue");
//}
    //===================================================================================//
//	public void StudentDropdowndatatype()
//	{
//		//List<WebElement> rows = driver.findElements(By.xpath("/tbody/tr"));
//		//Select objSelect = new Select(driver.findElements(By.id(SelectStudentName)));
//		//objSelect.getAllSelectedOptions();
//	}
//	
////	public void Login()
////	{
////		driver.get(loginPageURL);
////	}
////	
//	public void batchDropdowndatatype()
//	{
//		//WebElement objSelect =  (WebElement) driver.findElements(By.id("StudentName"));
//		//objSelect.getAllSelectedOptions();
//		
//	}
//	
//	
//	
//	
//
//	
	
//		
//	
//	
//
//	public void SelectBatchId() {
//		
//		{
//			String retiveValue = Select.selectByIndex(0);
//			System.out.println("retriveValue");
//		}
//	}
//
//	
////	}
//	
//
//	public Boolean findDropdownElement() {
//		// TODO Auto-generated method stub
//By elementLocator = By.id("StudentID");
//		
//
//
//		try {
//		    wait.until(ExpectedConditions.presenceOfElementLocated(elementLocator));
//		    System.out.println("Element exists");
//		} catch (TimeoutException e) {
//		    System.out.println("Element does not exist");
//		}
//		return null;
//	}
//
//	public void spellcheck_student() {
//		
//		string StudentName ; 
//
//		String excelpath = "src\\test\\resources\\data\\Datavalues.xlsx";
//		Excelreader reader = new Excelreader();	
//		LinkedHashMap<String, String> testdata;
//		testdata = reader.readexcelsheet(excelpath,Student,0);
//		StudentName = testdata.get("StudentName");
//		
//	SelectStudentName.sendKeys("StudentName");
//	 String retiveValue = Select.selectByIndex(0);
//	
//	
//	
//	
//	}
//
////	public void Dropdownscrolldown() {
////		// TODO Auto-generated method stub
////		List<WebElement> rows = driver.findElements(By.id("StudentName"));
////		for(int=i;i<rows.size();i++)
////		{
////			{ 
////				 
////			       String value=  locator.getText();
////			    {
////			    action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
////			    
////			    if(value.equalsIgnoreCase("x"))
////			                {
////			                    
////			                    break;
////			                }
////			                else
////			                {
////			                	WebElement.click();
////			                }
////			    }
////			
////		}
////	}
////}
//
//	
//	public void Alphabetinsearch() {
//		
//		testdata = reader.readexcelsheet(excelpath,Student,4);
//		SelectStudentName = testdata.get("StudentName");
//		
//	SelectStudentName.sendKeys("SelectStudentName");
//	
//	}
//
//	public void RetriveName() {
//		
//		SelectStudentName.sendKeys("StudentName");
//		 String retiveValue = Select.selectByIndex(0);
//	}
//
//	public void RetriveID() {
//		
//		
//		testdata = reader.readexcelsheet(excelpath,Student,2);
//		SelectbatchId = testdata.get("BatchID");
//		
//		SelectbatchId .sendKeys("SelectbatchId ");
//		String retiveValue = Select.selectByIndex(0);
//	}
//
//	public void OnlyStudentName() {
//		
//		testdata = reader.readexcelsheet(excelpath,Student,0);
//		SelectStudentName = testdata.get("StudentName");
//		String retiveValue = Select.selectByIndex(0);
//	}
//
//	public void OnlyBatchID() {
//		
//		testdata = reader.readexcelsheet(excelpath,Student,2);
//		SelectbatchId = testdata.get("BatchID");
//		
//		SelectbatchId .sendKeys("SelectbatchId ");
//		String retiveValue = Select.selectByIndex(0);
//	}
//
//	public void BothNameID() {
//		
//		SelectbatchId = testdata.get("BatchID");
//		SelectStudentName = testdata.get("StudentName");
//		SelectbatchId .sendKeys("SelectbatchId ");
//		SelectStudentName.sendKeys("SelectStudentName");
//		String retiveValue = Select.selectByIndex(0);
//		
//	}
//	
//}

public void StudentvalidateTextSpellingAndSpacing(Object object) {
	// TODO Auto-generated method stub
	
}


}
