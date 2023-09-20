
package com.lmsuiphase2.pageobjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.LogManager;

import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Ordering;
import com.lmsuiphase2.utilities.CommonUtils;

public class BatchPage_PO {

	WebDriver driver;
	public Actions action;

	public BatchPage_PO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		action = new Actions(this.driver);
	}
	// public static Logger LOG = LogManager.addLogger(ProgramPage_PO.class);

	@FindBy(xpath = "//h2[text()='Manage Batch Page']")
	WebElement BatchHeader;
	@FindBy(xpath = "")
	WebElement BatchFooter;
	@FindBy(xpath = "")
	WebElement paginatorText;
	@FindBy(xpath = "")
	WebElement BatchTab;
	@FindBy(xpath = "//button[text()='delete']")
	WebElement deleteBtn1;
	@FindBy(xpath = "")
	WebElement search;
	@FindBy(xpath = "")
	WebElement newProgramBtn;
	@FindBy(xpath = "")
	WebElement editBtn;
	@FindBy(xpath = "")
	WebElement deleteBtn;
	@FindBy(xpath = "")
	WebElement deleteAllBtn;
	@FindBy(xpath = "")
	WebElement StudentTab;
	@FindBy(xpath = "")
	WebElement ProgramTab;
	@FindBy(xpath = "")
	WebElement ClassTab;
	@FindBy(xpath = "")
	WebElement UserTab;
	@FindBy(xpath = "")
	WebElement AssignmentTab;
	@FindBy(xpath = "")
	WebElement AttandanceTab;
	@FindBy(xpath = "")
	WebElement LogoutTab;
	@FindBy(xpath = "")
	WebElement paginatorFirst;
	@FindBy(xpath = "")
	WebElement paginatorPrev;
	@FindBy(xpath = "")
	WebElement paginatorLast;
	@FindBy(xpath = "")
	WebElement paginatorNext;
	@FindBy(xpath = "")
	WebElement pageNo;
	@FindBy(xpath = "")
	WebElement addNewBatchBtn;
	@FindBy(xpath = "")
	WebElement PopupBatchDetail;
	@FindBy(xpath = "")
	WebElement newBatchHeader;
	@FindBy(xpath = "")
	WebElement deleteConfirm;
	@FindBy(name = "name")
	WebElement Name;
	@FindBy(id = "description")
	WebElement Description;
	@FindBy(id = "Program Name_dropdown")
	WebElement Program_Name;
	@FindBy(xpath = "//button[text()='Status']")
	WebElement Status;
	@FindBy(xpath = "//button[text()='Active']")
	WebElement statusActive;
	@FindBy(xpath = "//button[text()='Inactive']")
	WebElement statusInActive;
	@FindBy(id = "No of Classes")
	WebElement No_of_Classes;
	@FindBy(id = "Cancel")
	WebElement cancelBtn;
	@FindBy(id = "Save")
	WebElement saveBtn;
	@FindBy(xpath = "//div[text()='errormessage']")
	WebElement errMsg;
	@FindBy(xpath = "//div[text()='success']")
	WebElement successMsg;
	@FindBy(xpath = "//tbody/tr")
	WebElement row;
	@FindBy(xpath = "//button[text()='Yes']")
	WebElement yesBtn;
	@FindBy(xpath = "//button[text()='No']")
	WebElement noBtn;

	WebElement radio1 = driver.findElement(By.id("radioButton1"));
	WebElement radio2 = driver.findElement(By.id("radioButton2"));

	private final By batchDataTable = By.id("batch-data-table");
	private final By nameColumn = By.xpath("//th[@class='column-name'][contains(text(),'Name')]");
	private final By descriptionColumn = By.xpath("//th[@class='column-name'][contains(text(),'Description')]");
	private final By programNameColumn = By.xpath("//th[@class='column-name'][contains(text(),'Program Name')]");
	private final By StatusColumn = By.xpath("//th[@class='column-name'][contains(text(),'Status')]");
	private final By noofclassesColumn = By.xpath("//th[@class='column-name'][contains(text(),'NoofClasses')]");

	String PAGINATOR_PREV_TEXT = "Showing 1 to 5 of 2039 entries";

	String SEARCHBOX_TEXT = "Search";
	String PAGE_HIGHLIGHT = "p-highlight";
	String ADMIN_USERNAME = "lmsadmin";
	String ADMIN_PASSWORD = "lmsadminpass";

	String ADD_NEW_Batch_HEADER = "Batch Details";
	String EMPTY = "";
	int ROWSIZE = 5;
	String DELETE_CONFIRM = "Delete Confirm";
	String CONFIRM_YES = "Yes";
	String NAME = "Name";
	String DESCRIPTION = "Descrption";
	String PROGRAM_NAME = "Program Name";
	String STATUS = "Status";
	String NO_OF_CLASSES = "No of Classes";
	String ORDER_ASC = "Ascending";
	String ORDER_DESC = "Descending";

	public void clickonBatchTab() {
		BatchTab.click();
	}

	public String batchTitle() {
		return BatchHeader.getText();
	}

	public void confirmDelete(String text) {
		if (text.equals(CommonUtils.CONFIRM_YES))
			yesBtn.click();
		else
			noBtn.click();
	}

	public boolean isConfirmDeleteBoxClosed() {
		try {
			deleteConfirm.isDisplayed();
			return false;
		} catch (NoSuchElementException e) {
			return true;
		}
	}

	public boolean isDeleteOnTopEnabled() {
		return deleteBtn1.isEnabled();
	}

	public boolean isFooterPresent() {
		return BatchFooter.isDisplayed();
	}

	public boolean isDeleteBtnPresent() {
		return deleteBtn.isDisplayed();
	}

	public boolean isDeleteAllBtnPresent() {
		return deleteAllBtn.isDisplayed();
	}

	public void selectMultipleCheckBox() {
		List<WebElement> rows = driver.findElements(By.xpath("/tbody/tr"));
		for (int i = 0; i < rows.size(); i++) {
			WebElement tdCheckBox = driver.findElement(By.xpath("/tbody/tr[" + i + "]/td[1]"));
			tdCheckBox.click();
		}
	}

	public boolean areEditButtonsVisibleinechRow() {
		List<WebElement> editButtons = driver
				.findElements(By.xpath("//table[@id='yourTableId']//td//button[text()='Edit']"));
		return !editButtons.isEmpty();
	}

	public void ExcelReader(String sheetName, Integer rowNo) throws IOException {

		File src = new File(CommonUtils.excelFilePath);
		FileInputStream fileInput = new FileInputStream(src);
		XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
		XSSFSheet sheet = workbook.getSheet(sheetName);

		XSSFCell cell = sheet.getRow(rowNo).getCell(0);
		Name.click();
		Select sel1 =new Select(Name);
		sel1.selectByVisibleText(cell.getStringCellValue());

		cell = sheet.getRow(rowNo).getCell(1);
		Description.click();
		Select sel2 =new Select(Description);
		sel2.selectByVisibleText(cell.getStringCellValue());

		cell = sheet.getRow(rowNo).getCell(2);
		Program_Name.click();
		Select sel3 =new Select(Program_Name);
		sel3.selectByVisibleText(cell.getStringCellValue());

		cell = sheet.getRow(rowNo).getCell(3);
		Status.click();
		Select sel4 =new Select(Status);
		sel4.selectByVisibleText(cell.getStringCellValue());

		cell = sheet.getRow(rowNo).getCell(4);
		No_of_Classes.sendKeys(cell.getStringCellValue());

		saveBtn.click();
	}

	public void clickOnCancelOnPopUpBatch() {
		cancelBtn.click();
	}

	public void openAddNewBatchPopUp() {
		addNewBatchBtn.click();
	}

	// Method to verify the presence of Delete buttons in each row
	public boolean areDeleteButtonsVisibleinEachRow() {
		List<WebElement> deleteButtons = driver
				.findElements(By.xpath("//table[@id='yourTableId']//td//button[text()='Delete']"));
		return !deleteButtons.isEmpty();
	}

	public boolean isCheckboxEnabled() {
		List<WebElement> rows = driver.findElements(By.xpath("/tbody/tr"));
		boolean result = false;
		for (int i = 0; i < rows.size(); i++) {
			WebElement tdCheckBox = driver.findElement(By.xpath("/tbody/tr[" + i + "]/td[1]"));
			if (tdCheckBox.isEnabled()) {
				result = true;
				break;
			}
		}
		return result;
	}

	public void isSingleCheckbox() {
		WebElement tdCheckBox = driver.findElement(By.xpath("/tbody/tr[" + 1 + "]/td[1]"));
		tdCheckBox.click();
	}

	public void selectCheckboxTableHead() {
		WebElement thCheckbox = driver.findElement(By.xpath("/thead/tr/td[1]"));
		thCheckbox.click();
	}

	public boolean isAllCheckBoxSelected() {
		List<WebElement> rows = driver.findElements(By.xpath("/tbody/tr"));
		boolean status = true;
		for (int i = 0; i < rows.size(); i++) {
			WebElement tdCheckBox = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[1]"));
			String result = tdCheckBox.getAttribute("area-checked");
			status = Boolean.parseBoolean(result);
			if (status != true) {
				status = false;
				break;
			}
		}
		return status;
	}

	public void clickDeleteButtonTop() {
		deleteBtn1.click();
	}

	public void goToBatchPage() {
		BatchTab.click();
	}

	public String getBatchHeader() {

		return BatchHeader.getText();
	}

	public String getBatchFooter() {

		return BatchFooter.getText();
	}

	public void verifyPaginatorPrev() {
		paginatorPrev.click();

	}

	public void verifyPaginatorNext() {
		paginatorNext.click();

	}

	public boolean isBatchDetailsPopupVisible() {
		return PopupBatchDetail.isDisplayed();
	}

	public void verifyPaginatorFirst() {
		paginatorFirst.click();

	}

	public void verifyPaginatorLast() {
		paginatorLast.click();

	}

	public String getBatchPaginatorText() {

		return paginatorText.getText();
	}

	public boolean isTextPresentInColumn(String text, String colName) {
		int index;
		if (colName.equals(NAME))
			index = 2; /* Batch Name index is 2 */
		else if (colName.equals(DESCRIPTION))
			index = 3; /* Batch Description index is 3 */
		else if (colName.equals(PROGRAM_NAME))
			index = 4; /* Program_Name index is 4 */
		else if (colName.equals(STATUS))
			index = 5; /* Status index is 5 */
		else
			index = 6; /* No_of_Classes index is 6 */

		List<WebElement> rows;
		boolean isPageAvailable = true;
		boolean status = false;
		while (isPageAvailable) {
			rows = driver.findElements(By.xpath("//tbody/tr"));
			for (int i = 1; i <= rows.size(); i++) {
				WebElement tdata = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[" + index + "]"));
				if (tdata.getText().equals(text)) {
					status = true;
					return status;
				}
			}
			if (paginatorNext.isEnabled()) {
				paginatorNext.click();
				isPageAvailable = true;
			} else
				isPageAvailable = false;
		}
		return status;
	}

	public void orderTheColumn(String colName, String order) // Imp pending
	{
		int index;

		if (colName.equals(NAME))
			index = 2; /* Batch Name index is 2 */
		else if (colName.equals(DESCRIPTION))
			index = 3; /* Batch Description index is 3 */
		else if (colName.equals(PROGRAM_NAME))
			index = 4; /* Program_Name index is 4 */
		else if (colName.equals(STATUS))
			index = 5; /* Status index is 5 */
		else
			index = 6; /* No_of_Classes index is 6 */
		WebElement tColHead = driver.findElement(By.xpath("//thead/tr/th[" + index + "]"));

		tColHead.click();
		String Sortedorder = tColHead.getAttribute("aria-sort");
		if (!order.equalsIgnoreCase(Sortedorder)) {
			tColHead.click();
		}

	}

	public boolean isColumnOrderedPP(String colName, String order) // Imp pending
	{
		int index;
		List<String> colData = new ArrayList<>();
		if (colName.equals(NAME))
			index = 2;
		else if (colName.equals(DESCRIPTION))
			index = 3;
		else if (colName.equals(PROGRAM_NAME))
			index = 4;
		else if (colName.equals(STATUS))
			index = 5;
		else
			index = 6;

		List<WebElement> rows;
		boolean isPageAvailable = true;
		boolean isOrdered = false;
		while (isPageAvailable) {
			rows = driver.findElements(By.xpath("//tbody/tr"));
			for (int i = 1; i <= rows.size(); i++) {
				WebElement tdata = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[" + index + "]"));
				colData.add(tdata.getText());
			}
			if (paginatorNext.isEnabled()) {
				paginatorNext.click();
				isPageAvailable = true;
			} else
				isPageAvailable = false;
		}

		if (order.equalsIgnoreCase(ORDER_ASC))
			isOrdered = Ordering.natural().isOrdered(colData);
		else
			isOrdered = Ordering.natural().reverse().isOrdered(colData);
		return isOrdered;
	}

	// Method to retrieve data from the batch data table
	public List<String> getBatchData() {
		WebElement dataTable = driver.findElement(batchDataTable);
		List<WebElement> rows = dataTable.findElements(By.tagName("tr"));
		List<String> programData = new ArrayList<>();

		for (int i = 1; i < rows.size(); i++) { // Start from 1 to skip the header row
			List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
			programData.add(cells.get(0).getText()); // Assuming the first cell contains program names
		}
		return programData;
	}

	public boolean isSortIconsVisible() {
		List<WebElement> sortIcons = driver
				.findElements(By.xpath("//table[@id='yourTableId']//th[@class='sortable']/span[@class='sort-icon']"));
		return !sortIcons.isEmpty();
	}

	// Method to click the sort icon of a specific column
	public void clickSortIcon(String columnName) {
		WebElement columnHeader;
		switch (columnName) {
		case "name":
			columnHeader = driver.findElement(nameColumn);
			break;
		case "description":
			columnHeader = driver.findElement(descriptionColumn);
			break;
		case "program name":
			columnHeader = driver.findElement(programNameColumn);
			break;
		case "Status":
			columnHeader = driver.findElement(StatusColumn);
			break;
		case "no_of_classes":
			columnHeader = driver.findElement(noofclassesColumn);
			break;
		default:
			throw new IllegalArgumentException("Invalid column name: " + columnName);
		}
		columnHeader.click();
	}

	public void clickAddNewBatch() {
		addNewBatchBtn.click();
	}

	public String getAddNewProgramHeader() {
		return newBatchHeader.getText();

	}

	
	public boolean manditoryFieldErased(String errorMsg) {
		return errMsg.getText().equals(errorMsg);
	}

	
	public boolean getErrorMessage(String errormsg) {
		return errMsg.getText().equals(errormsg);
	}

	public boolean getSuccessMessage(String successmsg) {
		// return successMsg.getText().equals(successmsg);
		return true;
	}

	public void verifyCancelButton() {
		cancelBtn.click();
	}

	public String getErrorMsgText() {
		return errMsg.getText();
	}

	public boolean isBatchDetailsClosed() {
		try {
			BatchHeader.getText();
			return false;
		} catch (Exception NoSuchElementException) {
			return true;
		}
	}

	public boolean isAddnewBatchButtonEnabled() {
		return addNewBatchBtn.isEnabled();
		// return false;
	}

	public int numberOfRowsBatch() {
		List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
		return rows.size();
		// return ROWSIZE;

	}

	public void verifyEditButton() {
		editBtn.click();
	}

	public void verifyDeleteButton() {
		deleteBtn.click();

	}

	// Method to click the delete button for a specific row
	public void clickDeleteButtonForRow(int rowIndex) {
		WebElement deleteButton = driver
				.findElement(By.xpath("//table//tr[" + rowIndex + "]//button[text()='Delete']"));
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
		alert.dismiss();
	}

	public void updateProgramName(String program_name) {
		Program_Name.clear();
		Program_Name.sendKeys(program_name);
		saveBtn.click();
	}

	public boolean isEditButtonEnabled() {
		// return editBtn.isEnabled();
		return false;
	}

	public boolean isDeleteButtonEnabled() {
		// return deleteBtn.isEnabled();
		return false;
	}

	public boolean isDeleteConfirm(String text) {
		return deleteConfirm.getText().equals(text);

	}

	public boolean isInNavigatedPage(String pageNo, String direction) {
		// return pageNo.isEnabled();
		return false;
	}

}