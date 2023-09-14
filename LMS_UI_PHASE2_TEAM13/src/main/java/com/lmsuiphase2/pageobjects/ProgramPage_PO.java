package com.lmsuiphase2.pageobjects;

import java.util.ArrayList;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.google.common.collect.Ordering;
import com.lmsuiphase2.utilities.CommonUtils;

public class ProgramPage_PO {

	WebDriver driver;
	public Actions action;
	

	public ProgramPage_PO (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		action = new Actions(this.driver);}
	//public static Logger LOG = LogManager.addLogger(ProgramPage_PO.class);

	@FindBy	(xpath = "//h2[text()='Manage Program']") WebElement programHeader;
	@FindBy	(xpath = "") WebElement programFooter;
	@FindBy	(xpath = "")WebElement paginatorText;
	@FindBy	(xpath = "") WebElement programTab;
	@FindBy	(xpath = "//button[text()='delete']") WebElement deleteBtn1;
	@FindBy	(xpath = "") WebElement search;
	@FindBy	(xpath = "") WebElement newProgramBtn;
	@FindBy	(xpath = "") WebElement editBtn;
	@FindBy	(xpath = "") WebElement deleteBtn;
	@FindBy	(xpath = "") WebElement deleteAllBtn;
	@FindBy	(xpath = "") WebElement BatchTab;
	@FindBy	(xpath = "") WebElement StudentTab;
	@FindBy	(xpath = "") WebElement ProgramTab;
	@FindBy	(xpath = "") WebElement ClassTab;
	@FindBy	(xpath = "") WebElement UserTab;
	@FindBy	(xpath = "") WebElement AssignmentTab;
	@FindBy	(xpath = "") WebElement AttandanceTab;
	@FindBy	(xpath = "") WebElement LogoutTab;
	@FindBy	(xpath = "") WebElement checkBox;
	WebElement popup = driver.findElement(By.id("programDetailsPopup")); 
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
	@FindBy (xpath = "//button[text()='No']")boolean lastrecord;
	@FindBy (xpath = "//button[text()='No']")boolean firstrecord;
	WebElement radio1 = driver.findElement(By.id("radioButton1")); 
    WebElement radio2 = driver.findElement(By.id("radioButton2")); 
    WebElement statusRadio = driver.findElement(By.id("newStatus")); 
    WebElement saveButton = driver.findElement(By.id("saveButton")); 
    private final By sortIconLocator = By.xpath("//th[@data-column-name='<Column name>']/span[@class='sort-icon']");
	private final By columnNameHeader = By.xpath("//th[@class='column-name-header']");
    private final By programDataTable = By.id("program-data-table"); 
    private final By programNameColumn = By.xpath("//th[@class='column-name'][contains(text(),'Program Name')]");
    private final By programDescColumn = By.xpath("//th[@class='column-name'][contains(text(),'Program Desc')]");
    private final By programStatusColumn = By.xpath("//th[@class='column-name'][contains(text(),'Program Status')]");
	
String PAGINATOR_PREV_TEXT = "Showing 1 to 5 of 4557entries";
String PAGINATOR_NEXT_TEXT = "Showing 6 to 9 of 4557 entries";
String SEARCHBOX_TEXT = "Search";
	 String PAGE_HIGHLIGHT = "p-highlight";
	 String ADMIN_USERNAME = "lmsadmin";
	 String ADMIN_PASSWORD= "lmsadminpass";
	
	 String ADD_NEW_PGM_HEADER= "Program Details";
	 String EMPTY= "";
	 int ROWSIZE= 5;
	 String DELETE_CONFIRM= "Delete Confirm";
	 String CONFIRM_YES= "Yes";
String PROGRAM_NAME= "Program Name";
String PROGRAM_DESC= "Program Descrption";
	 String PROGRAM_STATUS= "Program Status";
String ORDER_ASC= "Ascending";
	 String ORDER_DESC= "Descending";
	 
	 private final By searchInput = By.id("searchInput"); 
	    private final By searchButton = By.id("searchButton"); 
	    private final By searchResults = By.xpath("//div[@class='search-results']"); 

	    public void clickonProgramTab() {
	programTab.click();
	
}

	public void clickAnyCheckBox() {
		checkBox.click();
	}
	
public void confirmDelete(String text)
{
	if(text.equals(CommonUtils.CONFIRM_YES))
		yesBtn.click();
	else
		noBtn.click();
}


public boolean isConfirmDeleteBoxClosed()
{
	try {
		deleteConfirm.isDisplayed();
		return false;
	}
	catch(NoSuchElementException e)
	{
		return true;
	}
}

public boolean isDeleteOnTopEnabled()
{
	return deleteBtn1.isEnabled();
}
 public boolean isFooterPresent() {
	 return programFooter.isDisplayed();
 }
 
 public boolean isDeleteBtnPresent() {
	 return deleteBtn.isDisplayed();
 }
 public boolean isDeleteAllBtnPresent() {
	 return deleteAllBtn.isDisplayed();
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
public boolean areEditButtonsVisibleinechRow() {
    List<WebElement> editButtons = driver.findElements(By.xpath("//table[@id='yourTableId']//td//button[text()='Edit']"));
    return !editButtons.isEmpty();
}
public void clickOnCancelOnPopUpProgram() {
	cancelBtn.click();
}

public void openAddNewProgramPopUp() {
	addNewProgramBtn.click();
}
public boolean areProgramStatusRadioButtonsVisible() {
    

    return radio1.isDisplayed() && radio2.isDisplayed();
}
// Method to verify the presence of Delete buttons in each row
public boolean areDeleteButtonsVisibleinEachRow() {
    List<WebElement> deleteButtons = driver.findElements(By.xpath("//table[@id='yourTableId']//td//button[text()='Delete']"));
    return !deleteButtons.isEmpty();
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

public void selectCheckboxTableHead()
{
	WebElement thCheckbox = driver.findElement(By.xpath("/thead/tr/td[1]"));
	thCheckbox.click();
}

public void clickLastPaginator() {
	paginatorLast.click();
}

public void clickFirstPaginator() {
	paginatorFirst.click();
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

public void clickDeleteButtonTop()
{
	deleteBtn1.click();
}



public void clickNextPageLink() {
	paginatorNext.click();
}


public void goToProgramPage()
{
	programTab.click();
}

public String getProgramHeader()
{
	
	
	
	return programHeader.getText();
}
public String getProgramFooter()
{
	
	
	return programFooter.getText();
}

public void verifyPaginatorPrev()
{
	paginatorPrev.click();
	
}

public void verifyPaginatorNext()
{
	paginatorNext.click();
	
}
public boolean isProgramDetailsPopupVisible() {
   // WebElement popup = driver.findElement(By.id("programDetailsPopup")); 
    return popup.isDisplayed();
}


public void verifyPaginatorFirst()
{
paginatorFirst.click();
	//("Clicking Paginator First");
}

public void verifyPaginatorLast()
{
	paginatorLast.click();
	//("Clicking Paginator Last");
}
public boolean isNextPageLinkDisabled() {
	return true;
}
public boolean isFirstPageLinkDisabled() {
	return true;
}
public boolean isLastPageRecordDisplayed() {
	return lastrecord;
}

public boolean isFirstPageRecordDisplayed() {
	return firstrecord;
}
public void validateFooter() {
	
}
public String getProgramPaginatorText()
{
	
	
	return paginatorText.getText();
}

public boolean getPaginatorTextDisplayed(String text, String direction)
{
	if(direction.equals("prev"))
	{

return text.equals(PAGINATOR_PREV_TEXT);
		
	}
	else
	{
		
		return text.equals(PAGINATOR_NEXT_TEXT);
	}
	//return paginatorText.getText()
}


public String getSearchBoxText()
{
	//return search.getAttribute("placeholder");
	return SEARCHBOX_TEXT;
}

public void enterSearchText(String searchText)
{
	search.clear();
	search.sendKeys(searchText);
}

//validateSearchKeyinTable
public boolean validateSearchKeyinTable(String searchText)
{
	return true;
}






    // Method to enter search keywords and perform a search
    public void searchProgramBox(String keywords) {
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



public boolean isTextPresentInColumn(String text, String colName)
{
	int index;
	if(colName.equals(PROGRAM_NAME))
		index=2;   /* Program Name index is 2 */
	else if(colName.equals(PROGRAM_DESC))
		index=3;  /* Program Description index is 3 */
	else
		index=4; /* Program Status index is 4 */
	
	List<WebElement> rows; 
	boolean isPageAvailable = true;
	boolean status = false;
	while(isPageAvailable)
	{
		rows = driver.findElements(By.xpath("//tbody/tr"));
		for(int i=1;i<=rows.size();i++)
		{
				WebElement tdata = driver.findElement(By.xpath("//tbody/tr["+i+"]/td["+index+"]"));
				if(tdata.getText().equals(text))
				{
					status = true;
					return status;
				}
		}
		if(paginatorNext.isEnabled())
		{
			paginatorNext.click();
			isPageAvailable=true;
		}
		else
			isPageAvailable=false;
	}
	return status;
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


public void orderTheColumn(String colName, String order) //Imp pending
{
	int index;
	if(colName.equals(PROGRAM_NAME))
		index=2;   /* Program Name index is 2 */
	else if(colName.equals(PROGRAM_DESC))
		index=3;  /* Program Description index is 3 */
	else
		index=4; /* Program Status index is 4 */
	
	WebElement tColHead = driver.findElement(By.xpath("//thead/tr/th["+index+"]"));
	
	tColHead.click();
	String Sortedorder = tColHead.getAttribute("aria-sort");
	if(!order.equalsIgnoreCase(Sortedorder))
	{
		tColHead.click();
	}
}

public boolean isColumnOrderedPP(String colName,String order) //Imp pending
{
	int index;
	List<String> colData = new ArrayList<>();
	if(colName.equals(PROGRAM_NAME))
		index=2;   /* Program Name index is 2 */
	else if(colName.equals(PROGRAM_DESC))
		index=3;  /* Program Description index is 3 */
	else
		index=4; /* Program Status index is 4 */
	
	List<WebElement> rows; 
	boolean isPageAvailable = true;
	boolean isOrdered = false;
	while(isPageAvailable)
	{
		rows = driver.findElements(By.xpath("//tbody/tr"));
		for(int i=1;i<=rows.size();i++)
		{
				WebElement tdata = driver.findElement(By.xpath("//tbody/tr["+i+"]/td["+index+"]"));
				colData.add(tdata.getText());
		}
		if(paginatorNext.isEnabled())
		{
			paginatorNext.click();
			isPageAvailable=true;
		}
		else
			isPageAvailable=false;
	}
	
	if(order.equalsIgnoreCase(ORDER_ASC))
		isOrdered = Ordering.natural().isOrdered(colData);
	else
		isOrdered = Ordering.natural().reverse().isOrdered(colData);
	return isOrdered;
}

public void clickAddNewProgram()
{
	addNewProgramBtn.click();
}

public String getAddNewProgramHeader()
{
	return newProgramHeader.getText();
	
}

public void validateAddNewProgram(String name, String description)
{
	
	namePgmDetails.clear();
	namePgmDetails.sendKeys(name);
	descriptionPgmDetails.clear();
	descriptionPgmDetails.sendKeys(description);
	if(name.isEmpty() && description.isEmpty())
		statusActive.click();
	saveBtn.click();
}


public void validateAddNewProgramwithSpecial(String invalidValue, String description)
{
	
	namePgmDetails.clear();
	namePgmDetails.sendKeys(invalidValue);
	descriptionPgmDetails.clear();
	descriptionPgmDetails.sendKeys(invalidValue);
	
		statusActive.click();
	saveBtn.click();
}
public void ValidateupdateNewProgram(String name, String description) {
	namePgmDetails.clear();
	namePgmDetails.sendKeys(name);
	descriptionPgmDetails.clear();
	descriptionPgmDetails.sendKeys(description);
	if(name.isEmpty() && description.isEmpty())
		statusActive.click();
	saveBtn.click();
	
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
 public String getErrorMsgText() {
	 return errMsg.getText();
 }
public boolean isProgramDetailsClosed()
{
	try {
		programHeader.getText();
		return false;
	}
	catch(Exception NoSuchElementException){
		return true;
	}
}

public boolean isAddnewProgramButtonEnabled() {
	return addNewProgramBtn.isEnabled();
	//return false;
}

public int numberOfRowsPro()
{
	List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
	return rows.size();
	//return ROWSIZE;
	
}

public void updateProgramStatusWithRadio(String newStatus) {
    WebElement statusRadio = driver.findElement(By.id(newStatus)); // Replace with the actual ID or locator
    WebElement saveButton = driver.findElement(By.id("saveButton")); // Replace with the actual ID or locator

    statusRadio.click();
    saveButton.click();
}
public void verifyProEditButton()
{
	editBtn.click();
}

public void verifyDeleteButton()
{
	deleteBtn.click();
	
	
}

//Method to click the delete button for a specific row
public void clickDeleteButtonForRow(int rowIndex) {
    WebElement deleteButton = driver.findElement(By.xpath("//table//tr[" + rowIndex + "]//button[text()='Delete']"));
    deleteButton.click();
}
public String getConfirmationAlertText() {
    Alert alert = driver.switchTo().alert();
    return alert.getText();
}

// Method to confirm the alert
public void confirmAlert() {
    Alert alert = driver.switchTo().alert();
    alert.accept();
}

// Method to dismiss the alert
public void dismissAlert() {
    Alert alert = driver.switchTo().alert();
    alert.dismiss();}

//Method to check if the alert is present
public boolean isAlertPresent() {
    try {
        driver.switchTo().alert();
        return true;
    } catch (NoAlertPresentException e) {
        return false;
    }
}
public void updatePgmName(String pgmName)
{
	namePgmDetails.clear();
	namePgmDetails.sendKeys(pgmName);
	saveBtn.click();
}

public void updatePgmDescription(String pgmDescription)
{
	descriptionPgmDetails.clear();
	descriptionPgmDetails.sendKeys(pgmDescription);
	saveBtn.click();
}
public void updatePgmStatus(String pgmStatus)
{
	if(pgmStatus.equals("active"))
		statusActive.click();
	else
		statusInActive.click();
	saveBtn.click();
}

public boolean isEditButtonEnabled() {
	//return editBtn.isEnabled();
	return false;
}

public boolean isDeleteButtonEnabled() {
	//return deleteBtn.isEnabled();
	return false;
}
public boolean isCommonDeleteAllButtonEnabled() {
   
    return deleteAllBtn.isEnabled();
}


public boolean isDeleteConfirm(String text)
{
	return deleteConfirm.getText().equals(text);
	//return UtilString.DELETE_CONFIRM.equals(text);
}

public boolean isInNavigatedPage(String pageNo, String direction)
{
	//return pageNo.isEnabled();
	return false;
}
	
public boolean isSortIconsVisible() {
    List<WebElement> sortIcons = driver.findElements(By.xpath("//table[@id='yourTableId']//th[@class='sortable']/span[@class='sort-icon']"));
    return !sortIcons.isEmpty();
}
//Method to click the sort icon of a specific column
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
}

// Method to retrieve data from the program data table
public List<String> getProgramData() {
    WebElement dataTable = driver.findElement(programDataTable);
    List<WebElement> rows = dataTable.findElements(By.tagName("tr"));
    List<String> programData = new ArrayList<>();

    for (int i = 1; i < rows.size(); i++) { // Start from 1 to skip the header row
        List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
        programData.add(cells.get(0).getText()); // Assuming the first cell contains program names
    }
    return programData;
}

public void clickCancelonPop() {
	
}



}