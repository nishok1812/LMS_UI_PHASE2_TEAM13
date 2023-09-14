package com.lmsuiphase2.stepdefinitons;


import static org.testng.Assert.assertEquals;
import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import com.lmsuiphase2.apphooks.Hooks;
import com.lmsuiphase2.pageobjects.AssignmentPage_PO;
import com.lmsuiphase2.pageobjects.Common_PO;
import com.lmsuiphase2.utilities.CommonUtils;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignmentPage_SD {
	
	private WebDriver driver;
	public static AssignmentPage_PO assignPoObj;
	Common_PO commonObj;
	private static final Logger log= LogManager.getLogger(DashboardPage_SD.class);	
	
	
	public AssignmentPage_SD()
	{
		 driver = Hooks.getDriver();
		 assignPoObj =  new AssignmentPage_PO(driver);
		 commonObj= new Common_PO(driver);
	}
	
	@Given("LMSAdminUser is on dashboard page after Login")
	public void LMSAdminUser_is_on_dashboard_page_after_login() {
		
		log.info("LMSAdminUser is on dashboard page after Login");
		assertEquals(CommonUtils.dashbaordUrl, commonObj.getCurrentUrl());
	    
	}

	@When("LMSAdminUser clicks {string} on the navigation bar")
	public void LMSAdminUser_clicks_on_the_navigation_bar(String string) {
		
		log.info("LMSAdminUser clicks" + string + " on the navigation bar");
		commonObj.navigationClick(string);
	    
	}

	@Then("LMSAdminUser should see URL with {string}")
	public void LMSAdminUser_should_see_url_with(String string) {
	    
		String actURL=driver.getCurrentUrl();
		String expPURL= commonObj.getCurrentUrl();
		Assert.assertEquals(actURL, expPURL);
	}

	@Then("LMSAdminUser should see able to capture Response time from the URL with {string}")
	public void LMSAdminUser_should_see_able_to_capture_response_time_from_the_url_with(String string) {
	   
		log.info("LMSAdminUser should be able to capture Response time from the URL");
		commonObj.navigationPageLoadTime(string);
	}

	@Then("LMSAdminUser should see a heading with text {string} on the page")
	public void LMSAdminUser_should_see_a_heading_with_text_on_the_page(String string) {
		
		log.info("LMSAdminUser should be redirected to Manage Assignment Page");
		assertEquals("Manage Assignment", commonObj.getHeader());
	}

	@Then("LMSAdminUser should see correct spelling for all the fields on {string}")
	public void LMSAdminUser_should_see_correct_spelling_for_all_the_fields_on(String string) {
	    
		log.info("LMSAdminUser should see correct spelling for the all the fields in Attendance page");
		assertEquals(assignPoObj.manageAssignmentText, assignPoObj.manage_AssignmentPg_Header.getText());
		assertEquals(assignPoObj.assignmentNameText, assignPoObj.assignmentName_ColumnName.getText());
		assertEquals(assignPoObj.assignmentDescriptionText, assignPoObj.assignmentDescription_ColumnName.getText());
		assertEquals(assignPoObj.assignmentDueDateText, assignPoObj.assignmentDueDate_ColumnName.getText());
		assertEquals(assignPoObj.assignmentDueDateText,assignPoObj.assignmentGrade_ColumnName.getText());
	}

	@Then("LMSAdminUser should see disabled delete icon below the header")
	public void LMSAdminUser_should_see_disabled_delete_icon_below_the_header() {
		
		log.info("LMSAdminUser should see disabled delete icon below the Header");
		assertEquals(commonObj.isMultiDeleteButtonEnabled(),true);
	}

	@Then("LMSAdminUser should see search bar on the {string}")
	public void LMSAdminUser_should_see_search_bar_on_the(String string) {
		
		log.info("LMSAdminUser should see search bar on the attendance page");
		assertEquals(commonObj.isSearchBoxVisible(),true);
	}

	@Then("LMSAdminUser should see a {string} button on the {string}")
	public void LMSAdminUser_should_see_a_button_on_the(String string, String string2) {
		
		log.info("LMSAdminUser should see +Add New Assignment button on the Assignment Page");
		assertEquals(assignPoObj.isAddNewAssignmentBtnVisible(),true);
	 
	}

	@Then("LMSAdminUser should see data table on the Manage Assignment Page with column headers \\(Check box symbol,Assignment Name, Assignment Description, Assignment Date, Assignment Grade, Edit Delete)")
	public void LMSAdminUser_should_see_data_table_on_the_manage_assignment_page_with_column_headers_check_box_symbol_assignment_name_assignment_description_assignment_date_assignment_grade_edit_delete() {
	    
		log.info("LMSAdminUser should see data table on the Manage Attendance Page");
		assertEquals(assignPoObj.dataTable.isDisplayed(),true);
		assertEquals(assignPoObj.assignmentName_ColumnName.isDisplayed(),true);
		assertEquals(assignPoObj.assignmentDescription_ColumnName.isDisplayed(),true);
		assertEquals(assignPoObj.assignmentDueDate_ColumnName.isDisplayed(),true);
		assertEquals(assignPoObj.assignmentGrade_ColumnName.isDisplayed(),true);
		assertEquals(assignPoObj.editdelete_ColumnName.isDisplayed(),true);
		assertEquals(assignPoObj.multiSelect_Checkbox.isDisplayed(),true);
	}

	@Then("LMSAdminUser should see the Edit Icon in each row of data table only when entries are available")
	public void LMSAdminUser_should_see_the_edit_icon_in_each_row_of_data_table_only_when_entries_are_available() {
		
		 log.info("LMSAdminUser should able to Edit Icon in each row of data table");
	     assertEquals(commonObj.singleEditBtnPresent(),true);
	}

	@Then("LMSAdminUser should see that Edit Icon will not be present in data table")
	public void LMSAdminUser_should_see_that_edit_icon_will_not_be_present_in_data_table() {
	     
	     log.info("LMSAdminUser validates Edit Icon will not be present in data table");
	     assertEquals(commonObj.singleEditBtnPresent(),false);

	}

	@Then("LMSAdminUser should see the Delete Icon in each row of data table only when entries are available")
	public void LMSAdminUser_should_see_the_delete_icon_in_each_row_of_data_table_only_when_entries_are_available() {
	    
	     log.info("LMSAdminUser validates Delete Icon in each row of data table ");
	     assertEquals(commonObj.singleDeleteBtnPresent(),true);	     

	}

	@Then("LMSAdminUser should see that Delete Icon will not be present in data table")
	public void LMSAdminUser_should_see_that_delete_icon_will_not_be_present_in_data_table() {
	    
	     log.info("LMSAdminUser validates Delete Icon in each row of data table ");
	     assertEquals(commonObj.singleDeleteBtnPresent(),false);	     

	}

	@Then("LMSAdminUser should see the sort icon near the column headers except for Edit and Delete")
	public void LMSAdminUser_should_see_the_sort_icon_near_the_column_headers_except_for_edit_and_delete() {
		
		boolean sortIconsVisible = assignPoObj.isSortIconsVisible();
	    Assert.assertTrue(sortIconsVisible);
	}

	@Then("LMSAdminUser should see check box  in the all rows of data table when entries available")
	public void LMSAdminUser_should_see_check_box_in_the_all_rows_of_data_table_when_entries_available() {
		  
	     log.info("LMSAdminUser should see check box in the all rows  of data table");
	     assertEquals(commonObj.isCheckboxEnabled(),true);
	     
	}

	@Then("LMSAdminUser should see the text as {string} below the data table and above the footer.")
	public void LMSAdminUser_should_see_the_text_as_below_the_data_table_and_above_the_footer(String string) {
		
		String ActPFooter=assignPoObj.getEntriesFooter();
		String ExpFooter= "Showing 0 to 0 of 0 entries";
		Assert.assertEquals(ActPFooter, ExpFooter);
	}

	@Then("LMSAdminUser should see the pagination controls under the data table")
	public void LMSAdminUser_should_see_the_pagination_controls_under_the_data_table() {
		
		log.info("LMSAdminUser should see the pagination controls under the data table");
		assertEquals(assignPoObj.isPaginationVisible(),true);
	}

	@Then("LMSAdminUser should see the text with total number assignments in the data table \\( {string})")
	public void LMSAdminUser_should_see_the_text_with_total_number_assignments_in_the_data_table(String footertext) {
	   
		String ActPFooter=assignPoObj.getTotalFooter();
		String ExpFooter= "In total there are 0 assignments.";
		Assert.assertEquals(ActPFooter, ExpFooter);
	}

	@Given("LMSAdminUser is on Manage Assignment Page")
	public void LMSAdminUser_is_on_manage_assignment_page() {
		
		log.info("LMSAdminUser is on manage assignment page ");
		assertEquals(CommonUtils.assignmentUrl, commonObj.getCurrentUrl()); 
	}

	@When("LMSAdminUser enters from the given {string} and {string} to be searched")
	public void LMSAdminUser_enters_from_the_given_and_to_be_searched(String sheetName, Integer rowNo) throws IOException {

		log.info("LMSAdminUser fills all the values from sheet");
		assignPoObj.ExcelReader(sheetName, rowNo);
	}

	@Then("LMSAdminUser should see the entries")
	public void LMSAdminUser_should_see_the_entries() {
		assertEquals(assignPoObj.isDataTableEmpty(),true);
	}

	@Then("LMSAdminUser should be Displayed empty details in the data table")
	public void LMSAdminUser_should_be_displayed_empty_details_in_the_data_table() {
		
		assertEquals(assignPoObj.isDataTableEmpty(),false);
	}

	@When("LMSAdminUser clicks <Add New Assignment> button")
	public void LMSAdminUser_clicks_add_new_assignment_button() {
		
		assignPoObj.addNewAssignmentBtnClick();
		    for (String windowHandle : driver.getWindowHandles()) {
		    	driver.switchTo().window(windowHandle);
		    }
	}

	@Then("LMSAdminUser should see a popup  with  heading {string}")
	public void LMSAdminUser_should_see_a_popup_with_heading(String string) {
	    
		boolean popupVisible = assignPoObj.isAssignmentDetailsPopupVisible();
	    Assert.assertTrue(popupVisible);
	    log.info("Assignment Details Popup window with header"+ assignPoObj.getHeader()+"is visible.");
	}

	@Then("LMSAdminUser should see input fields Text \\(Program name, batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file {int}, Assignment file {int}, Assignment file {int}, Assignment file {int})")
	public void LMSAdminUser_should_see_input_fields_text_program_name_batch_number_assignment_name_assignment_description_grade_by_assignment_due_date_assignment_file1_assignment_file_assignment_file_assignment_file_assignment_file(Integer int1, Integer int2, Integer int3, Integer int4) {
	   
		boolean popupVisible = assignPoObj.isAssignmentDetailsPopupVisible();
	    Assert.assertTrue(popupVisible);
		
	}

	@Then("LMSAdminUser should see {int} textbox should be  present in Assignment details popup window")
	public void LMSAdminUser_should_see_textbox_should_be_present_in_assignment_details_popup_window(Integer int1) {
		
		boolean popupVisible = assignPoObj.isAssignmentDetailsPopupVisible();
	    Assert.assertTrue(popupVisible);
	    int count = assignPoObj.AssignmentDetailsPopupTextBoxCount();
	    assertEquals(count, int1);
	}

	@Then("LMSAdminUser should see dropdown option for Batch Number")
	public void LMSAdminUser_should_see_dropdown_option_for_batch_number() {

		assertEquals(assignPoObj.batchNumber_DropDown.isDisplayed(),true);
	}

	@Then("LMSAdminUser should see dropdown option for Program Name")
	public void LMSAdminUser_should_see_dropdown_option_for_program_name() {

		assertEquals(assignPoObj.programName_DropDown.isDisplayed(),true);
	}

	@Then("LMSAdminUser should see save button in the Assignment detail popup window")
	public void LMSAdminUser_should_see_save_button_in_the_assignment_detail_popup_window() {
		boolean popupVisible = assignPoObj.isAssignmentDetailsPopupVisible();
	    Assert.assertTrue(popupVisible);
	    Assert.assertTrue(assignPoObj.AssignmentDetailsPopupSaveBtn());
	}

	@Then("LMSAdminUser should see cancel button in the Assignment detail popup window")
	public void LMSAdminUser_should_see_cancel_button_in_the_assignment_detail_popup_window() {
		
		boolean popupVisible = assignPoObj.isAssignmentDetailsPopupVisible();
	    Assert.assertTrue(popupVisible);
	    Assert.assertTrue(assignPoObj.AssignmentDetailsPopupCancelBtn());
	}

	@Then("LMSAdminUser should see Cancel\\/Close\\(X) button in the Assignment detail popup window")
	public void LMSAdminUser_should_see_cancel_close_x_button_in_the_assignment_detail_popup_window() {
		
		boolean popupVisible = assignPoObj.isAssignmentDetailsPopupVisible();
	    Assert.assertTrue(popupVisible);
	    Assert.assertTrue(assignPoObj.AssignmentDetailsPopupCloseBtn());
	}

	@Given("LMSAdminUser is on Manage Assignment Page and clicks on Add New Assignment to open assignment details popup window")
	public void LMSAdminUser_is_on_manage_assignment_page_and_clicks_on_add_new_assignment_to_open_assignment_details_popup_window() {
	    
		log.info("LMSAdminUser is on manage assignment page ");
		assertEquals(CommonUtils.assignmentUrl, commonObj.getCurrentUrl()); 
		assignPoObj.addNewAssignmentBtnClick();
	}

	@When("LMSAdminUser enters all mandatory field values with valid data from  {string} and {string} and clicks on save button")
	public void LMSAdminUser_enters_all_mandatory_field_values_with_valid_data_from_and_and_clicks_on_save_button(String sheetName, Integer rowNo) throws IOException {

		log.info("LMSAdminUser fills all the values from sheet");
		assignPoObj.ExcelReader(sheetName, rowNo);
	}

	@Then("LMSAdminUser should see new assignment details is added in the data table")
	public void LMSAdminUser_should_see_new_assignment_details_is_added_in_the_data_table(String successMessage) {
		
		Assert.assertTrue(assignPoObj.getSuccessMessage(successMessage));
	}

	@When("LMSAdminUser enters all mandatory field values with invalid data from  {string} and {string} and clicks on save button")
	public void LMSAdminUser_enters_all_mandatory_field_values_with_invalid_data_from_and_and_clicks_on_save_button(String sheetName, Integer rowNo) throws IOException {

		log.info("LMSAdminUser fills all the values from sheet");
		assignPoObj.ExcelReader(sheetName, rowNo);
	}

	@Then("LMSAdminUser should see Error message in alert")
	public void LMSAdminUser_should_see_error_message_in_alert(String Error) {

		log.info("LMSAdminUser should see the "+Error+" error message");
		assertEquals( Error,assignPoObj.getErrorMessage());
	}

	@When("LMSAdminUser enters all field values with valid data from  {string} and {string} and clicks on save button")
	public void LMSAdminUser_enters_all_field_values_with_valid_data_from_and_and_clicks_on_save_button(String sheetName, Integer rowNo) throws IOException {
		 
		log.info("LMSAdminUser fills all the values from sheet");
		assignPoObj.ExcelReader(sheetName, rowNo);
	}

	@When("LMSAdminUser enters optional fields with invalid data from  {string} and {string} and clicks on save button")
	public void LMSAdminUser_enters_optional_fields_with_invalid_data_from_and_and_clicks_on_save_button(String sheetName, Integer rowNo) throws IOException {
		 
		log.info("LMSAdminUser fills all the values from sheet");
		assignPoObj.ExcelReader(sheetName, rowNo);
	}

	@When("LMSAdminUser enters valid data in all fields except Program Name with no data from  {string} and {string} and clicks on save button")
	public void LMSAdminUser_enters_valid_data_in_all_fields_except_program_name_with_no_data_from_and_and_clicks_on_save_button(String sheetName, Integer rowNo) throws IOException {
		 
		log.info("LMSAdminUser fills all the values from sheet");
		assignPoObj.ExcelReader(sheetName, rowNo);
	}

	@Then("LMSAdminUser should see {string} alert")
	public void LMSAdminUser_should_see_alert(String string) {
			Assert.assertTrue(assignPoObj.getErrorMessage(string));
	}

	@When("LMSAdminUser enters valid data in all fields except Batch Number with no data from  {string} and {string} and clicks on save button")
	public void LMSAdminUser_enters_valid_data_in_all_fields_except_batch_number_with_no_data_from_and_and_clicks_on_save_button(String sheetName, Integer rowNo) throws IOException {
		 
		log.info("LMSAdminUser fills all the values from sheet");
		assignPoObj.ExcelReader(sheetName, rowNo);
	}

	@When("LMSAdminUser enters valid data in all fields except Assignment name with no data from  {string} and {string} and clicks on save button")
	public void LMSAdminUser_enters_valid_data_in_all_fields_except_assignment_name_with_no_data_from_and_and_clicks_on_save_button(String sheetName, Integer rowNo) throws IOException {
		 
		log.info("LMSAdminUser fills all the values from sheet");
		assignPoObj.ExcelReader(sheetName, rowNo);
	}

	@When("LMSAdminUser enters valid data in all fields except Assignment due date with no data from  {string} and {string} and clicks on save button")
	public void LMSAdminUser_enters_valid_data_in_all_fields_except_assignment_due_date_with_no_data_from_and_and_clicks_on_save_button(String sheetName, Integer rowNo) throws IOException {
		 
		log.info("LMSAdminUser fills all the values from sheet");
		assignPoObj.ExcelReader(sheetName, rowNo);
	}

	@When("LMSAdminUser enters valid data in all fields except Grade by with no data from  {string} and {string} and clicks on save button")
	public void LMSAdminUser_enters_valid_data_in_all_fields_except_grade_by_with_no_data_from_and_and_clicks_on_save_button(String sheetName, Integer rowNo) throws IOException {
		 
		log.info("LMSAdminUser fills all the values from sheet");
		assignPoObj.ExcelReader(sheetName, rowNo);
	}

	@When("LMSAdminUser enters valid data in all fields except Assignment due date with passing past date from  {string} and {string} and clicks on save button")
	public void LMSAdminUser_enters_valid_data_in_all_fields_except_assignment_due_date_with_passing_past_date_from_and_and_clicks_on_save_button(String sheetName, Integer rowNo) throws IOException {
		 
		log.info("LMSAdminUser fills all the values from sheet");
		assignPoObj.ExcelReader(sheetName, rowNo);
	}

	@When("LMSAdminUser clicks Cancel\\/Close\\(X) Icon  without entering values in the fields")
	public void LMSAdminUser_clicks_cancel_close_x_icon_without_entering_values_in_the_fields() {
		
		boolean popupVisible = assignPoObj.isAssignmentDetailsPopupVisible();
	    Assert.assertTrue(popupVisible);
	    Assert.assertTrue(assignPoObj.AssignmentDetailsPopupCloseBtn());
	}

	@Then("LMSAdminUser should land on manage assignment page")
	public void LMSAdminUser_should_land_on_manage_assignment_page() {

		log.info("LMSAdminUser is on manage assignment page ");
		assertEquals(CommonUtils.assignmentUrl, commonObj.getCurrentUrl()); 
	}

	@When("LMSAdminUser clicks Cancel button entering values in the fields")
	public void LMSAdminUser_clicks_cancel_button_entering_values_in_the_fields() {
		assignPoObj.clickCancelonPop();
		Assert.assertTrue(assignPoObj.isAssignmentmDetailsClosed());
	}

	@Then("LMSAdminUser should land on manage assignment Page and validate new assignment is not created in the data table")
	public void LMSAdminUser_should_land_on_manage_assignment_page_and_validate_new_assignment_is_not_created_in_the_data_table() {

				assignPoObj.isDataTableEmpty();
	}

	@When("LMSAdminUser clicks Edit button in data table")
	public void LMSAdminUser_clicks_edit_button_in_data_table() {

		assignPoObj.verifyAssignEditButton();
		for (String windowHandle : driver.getWindowHandles()) {
	    	driver.switchTo().window(windowHandle);
		}
	}

	@Then("LMSAdminUser should see Edit popup window with Assignment Details header")
	public void LMSAdminUser_should_see_edit_popup_window_with_assignment_details_header() {
	   
		boolean popupVisible = assignPoObj.isAssignmentDetailsPopupVisible();
	    Assert.assertTrue(popupVisible);
	}

	@When("LMSAdminUser clicks Edit button from one of the row in data table")
	public void LMSAdminUser_clicks_edit_button_from_one_of_the_row_in_data_table() {
	    
		assignPoObj.verifyAssignEditButton();
		for (String windowHandle : driver.getWindowHandles()) {
	    	driver.switchTo().window(windowHandle);
		}
	}

	@Then("LMSAdminUser should see Edit popup window with same row values in the all fields")
	public void LMSAdminUser_should_see_edit_popup_window_with_same_row_values_in_the_all_fields() {
		System.out.println("user is on Edit Program Window");
	}

	@Given("Given LMSAdminUser is on Manage Assignment Page and clicks on Edit button to open Edit assignment details popup window")
	public void given_LMSAdminUser_is_on_manage_assignment_page_and_clicks_on_edit_button_to_open_edit_assignment_details_popup_window() {
		
		log.info("LMSAdminUser is on manage assignment page ");
		assertEquals(CommonUtils.assignmentUrl, commonObj.getCurrentUrl());
		assignPoObj.verifyAssignEditButton();
	}

	@When("LMSAdminUser enters all mandatory field values with valid data from from  {string} and {string} and clicks save button")
	public void LMSAdminUser_enters_all_mandatory_field_values_with_valid_data_from_from_and_and_clicks_save_button(String sheetName, Integer rowNo) throws IOException {
		 
		log.info("LMSAdminUser fills all the values from sheet");
		assignPoObj.ExcelReader(sheetName, rowNo);
	}

	@Then("LMSAdminUser should see updated assignment details is added in the data table")
	public void LMSAdminUser_should_see_updated_assignment_details_is_added_in_the_data_table() {
		log.info("Validate Success message");
		assertEquals( "Assignment Updated",assignPoObj.getSuccessMessage());

	}

	@When("LMSAdminUser enters all mandatory field values with invalid data from from  {string} and {string} and clicks save button")
	public void LMSAdminUser_enters_all_mandatory_field_values_with_invalid_data_from_from_and_and_clicks_save_button(String sheetName, Integer rowNo) throws IOException {
		 
		log.info("LMSAdminUser fills all the values from sheet");
		assignPoObj.ExcelReader(sheetName, rowNo);
	}

	@When("LMSAdminUser enters missing value in program name and clicks on save button")
	public void LMSAdminUser_enters_missing_value_in_program_name_and_clicks_on_save_button(String sheetName, Integer rowNo) throws IOException {
		 
		log.info("LMSAdminUser fills all the values from sheet");
		assignPoObj.ExcelReader(sheetName, rowNo);
	}

	@When("LMSAdminUser enters missing value in Batch number and clicks on save button")
	public void LMSAdminUser_enters_missing_value_in_batch_number_and_clicks_on_save_button(String sheetName, Integer rowNo) throws IOException {
		 
		log.info("LMSAdminUser fills all the values from sheet");
		assignPoObj.ExcelReader(sheetName, rowNo);
	}

	@When("LMSAdminUser enters missing value in Assignment name and clicks on save button")
	public void LMSAdminUser_enters_missing_value_in_assignment_name_and_clicks_on_save_button(String sheetName, Integer rowNo) throws IOException {
		 
		log.info("LMSAdminUser fills all the values from sheet");
		assignPoObj.ExcelReader(sheetName, rowNo);
	}

	@When("LMSAdminUser enters missing value in Assignment due date and clicks on save button")
	public void LMSAdminUser_enters_missing_value_in_assignment_due_date_and_clicks_on_save_button(String sheetName, Integer rowNo) throws IOException {
		 
		log.info("LMSAdminUser fills all the values from sheet");
		assignPoObj.ExcelReader(sheetName, rowNo);
	}

	@When("LMSAdminUser enters missing value in Grade by and clicks on save button")
	public void LMSAdminUser_enters_missing_value_in_grade_by_and_clicks_on_save_button(String sheetName, Integer rowNo) throws IOException {
		 
		log.info("LMSAdminUser fills all the values from sheet");
		assignPoObj.ExcelReader(sheetName, rowNo);
	}

	@When("LMSAdminUser enters passed date in the due date field and clicks save button")
	public void LMSAdminUser_enters_passed_date_in_the_due_date_field_and_clicks_save_button(String sheetName, Integer rowNo) throws IOException {
		 
		log.info("LMSAdminUser fills all the values from sheet");
		assignPoObj.ExcelReader(sheetName, rowNo);
	}

	@When("LMSAdminUser clicks Cancel button without entering values in the fields")
	public void LMSAdminUser_clicks_cancel_button_without_entering_values_in_the_fields() {
		if (assignPoObj.isAlertPresent()) {
			assignPoObj.dismissAlert(); // Dismiss the alert
	    } else {
	        Assert.fail("Assignment Creation is cancelled.");
	    }
	}

	@When("LMSAdminUser clicks delete button in data table row level")
	public void LMSAdminUser_clicks_delete_button_in_data_table_row_level() {
		
		log.info("LMSAdminUser clicks delete button in data table row level Assignment page");
		assignPoObj.singleDeleteBtnClick();
	}

	@Then("LMSAdminUser should see dialog box")
	public void LMSAdminUser_should_see_dialog_box() {
		
		log.info("LMSAdminUser should see alert Assignment page");
		assertEquals(commonObj.isAlertPresent(),true);
	}

	@Then("Alert should have {string} button to accept")
	public void alert_should_have_button_to_accept(String string) {
		log.info("Alert should have "+string+" button to accept Assignment page");
		assertEquals(assignPoObj.isYesBtnInAlertPresent(),true);
	}

	@Then("Alert should have {string} button to reject")
	public void alert_should_have_button_to_reject(String string) {
		log.info("Alert should have "+string+" button to reject Assignment page");
		assertEquals(assignPoObj.isNoBtnInAlertPresent(),true);
	}

	@Given("LMSAdminUser clicks row level delete button after landing to manage assignment page")
	public void LMSAdminUser_clicks_row_level_delete_button_after_landing_to_manage_assignment_page() {
		log.info("LMSAdminUser validates Delete Icon in each row of data table ");
		assertEquals(commonObj.singleDeleteBtnPresent(),true);
	}

	@When("LMSAdminUser clicks yes button")
	public void LMSAdminUser_clicks_yes_button() {
		log.info("LMSAdminUser clicks yes button ");
		assignPoObj.acceptAlert();
	}

	@Then("LMSAdminUser should be redirected to assignment page and selected assignment details are deleted from the data table")
	public void LMSAdminUser_should_be_redirected_to_assignment_page_and_selected_assignment_details_are_deleted_from_the_data_table() {
		log.info("Validate Success message");
		assertEquals( "Record Deleted",assignPoObj.getSuccessMessage());
	}

	@When("LMSAdminUser clicks no button")
	public void LMSAdminUser_clicks_no_button() {
		log.info("LMSAdminUser clicks no button ");
		assignPoObj.dismissAlert();
	}
	
	@Then("LMSAdminUser should be redirected to assignment page and selected assignment details are not deleted from the data table")
	public void LMSAdminUser_should_be_redirected_to_assignment_page_and_selected_assignment_details_are_not_deleted_from_the_data_table() {
		log.info("User should get Redirected manage attendance page");
		assertEquals(CommonUtils.attendanceUrl, commonObj.getCurrentUrl());
	}

	@When("LMSAdminUser clicks single  row level check box in the data table")
	public void LMSAdminUser_clicks_single_row_level_check_box_in_the_data_table() {

		log.info("LMSAdminUser clicks single  row level check box in the data table Attendance page");
		assignPoObj.selectCheckBoxInRow();	}

	@Then("LMSAdminUser should see delete icon below the header is enabled")
	public void LMSAdminUser_should_see_delete_icon_below_the_header_is_enabled() {
		
		log.info("LMSAdminUser should see delete icon below the header is enabled");
		assertEquals(commonObj.isMultiDeleteButtonEnabled(),true);
		assignPoObj.addNewAssignmentBtnClick();
	}

	@Given("LMSAdminUser is on Manage Assignment Page and clicks delete button under header after selecting the check box in the data table")
	public void LMSAdminUser_is_on_manage_assignment_page_and_clicks_delete_button_under_header_after_selecting_the_check_box_in_the_data_table() {
		log.info("LMSAdminUser should see tick mark in check box");
		assertEquals(commonObj.isAllCheckBoxSelected(),true);
		assignPoObj.addNewAssignmentBtnClick();
	}


	@Given("LMSAdminUser is on Manage Assignment Page and clicks delete button under header after selecting the multiple check box in the data table")
	public void LMSAdminUser_is_on_manage_assignment_page_and_clicks_delete_button_under_header_after_selecting_the_multiple_check_box_in_the_data_table() {
		log.info("LMSAdminUser clicks multiple row level check box in the data table");
		commonObj.selectMultipleCheckBox();
	}

	@When("LMSAdminUser click on assignment name column header to sort")
	public void LMSAdminUser_click_on_assignment_name_column_header_to_sort() {
		log.info("LMSAdminUser should see sort icon near the column headers Assignment Name");
		assertEquals(assignPoObj.isAssignmentNameSortIconVisible(),true);
	}

	@Then("LMSAdminUser should see that Right arrow should be enabled in page one  when entries are more than {int} available")
	public void LMSAdminUser_should_see_that_right_arrow_should_be_enabled_in_page_one_when_entries_are_more_than_available(Integer page) {

		log.info("Right arrow should be enabled in page one  when entries are more than "+page+" available");
		assertEquals(GreaterThan(1),assignPoObj.pageNo.getText());
		assertEquals(assignPoObj.pageNext_Link.isEnabled(),true);
		assertEquals(assignPoObj.pageLast_Link.isEnabled(),true);
	}
	
	private String GreaterThan(int i) {
		return null;
	}

	@Then("LMSAdminUser should see that left arrow should be enabled in page one  when entries are more than {int} available")
	public void LMSAdminUser_should_see_that_left_arrow_should_be_enabled_in_page_one_when_entries_are_more_than_available(Integer page) {
		
		log.info("Left arrow should be disabled in page one  when entries are more than "+page+" available");
		assertEquals(GreaterThan(1),assignPoObj.pageNo.getText());
		assertEquals(assignPoObj.pageFirst_Link.isEnabled(),false);
		assertEquals(assignPoObj.pagePrev_Link.isEnabled(),false);
	}

	@Then("LMSAdminUser should see that Right arrow should be enabled in page two when entries are more than {int} available")
	public void LMSAdminUser_should_see_that_right_arrow_should_be_enabled_in_page_two_when_entries_are_more_than_available(Integer page) {
		
		log.info("Right arrow should be enabled in page two when entries are more than "+page+" available");
		assertEquals(GreaterThan(10),assignPoObj.entryZ.getText());
		assertEquals(assignPoObj.pageNext_Link.isEnabled(),true);
		assertEquals(assignPoObj.pageLast_Link.isEnabled(),true);
	}

	@Then("LMSAdminUser should see that Left arrow should be enabled in page two")
	public void LMSAdminUser_should_see_that_left_arrow_should_be_enabled_in_page_two() {
		log.info("Left arrow should be enabled in page two");
		assertEquals(2,assignPoObj.pageNo.getText());
		assertEquals(assignPoObj.pageFirst_Link.isEnabled(),true);
		assertEquals(assignPoObj.pagePrev_Link.isEnabled(),true);
	}

	@Then("LMSAdminUser should see that Data table displays  page {int}  when entries available")
	public void LMSAdminUser_should_see_that_data_table_displays_page_when_entries_available(Integer page) {
		log.info("Data table should display  page "+page+"  when entries available ");
		assertEquals(2,assignPoObj.pageNo.getText());
		assertEquals(LessThan(10),assignPoObj.entryZ.getText());
		assertEquals(assignPoObj.pageNext_Link.isDisplayed(),false);
		assertEquals(assignPoObj.pageLast_Link.isDisplayed(),false);
	}
	
	private String LessThan(int i) {
		return null;
	}

	@Then("LMSAdminUser should see that entries are more than {int} in data table pagination controls enabled")
	public void LMSAdminUser_should_see_that_entries_are_more_than_in_data_table_pagination_controls_enabled(Integer page) {
		log.info("When entries are more than "+page+" in data table pagination controls enabled");
		assertEquals(GreaterThan(5),assignPoObj.entryZ.getText());
		assertEquals(2,assignPoObj.pageNo.getText());
		assertEquals(assignPoObj.pageFirst_Link.isEnabled(),true);
		assertEquals(assignPoObj.pagePrev_Link.isEnabled(),true);
		assertEquals(assignPoObj.pageNext_Link.isEnabled(),true);
		assertEquals(assignPoObj.pageLast_Link.isEnabled(),true);
	}

	@Then("LMSAdminUser should see that entries are less than {int} in data table pagination controls disabled")
	public void LMSAdminUser_should_see_that_entries_are_less_than_in_data_table_pagination_controls_disabled(Integer page) {
		log.info("When entries are less than "+page+" in data table pagination controls disabled");
		assertEquals(LessThan(5),assignPoObj.entryZ.getText());
		assertEquals(1,assignPoObj.pageNo.getText());
		assertEquals(assignPoObj.pageFirst_Link.isEnabled(),false);
		assertEquals(assignPoObj.pagePrev_Link.isEnabled(),false);
		assertEquals(assignPoObj.pageNext_Link.isEnabled(),false);
		assertEquals(assignPoObj.pageLast_Link.isEnabled(),false);
	}

	@Given("LMSAdminUser click +Add New assignment button after reaching to manage assignment page")
	public void LMSAdminUser_click_add_new_assignment_button_after_reaching_to_manage_assignment_page() {
	    assignPoObj.addNewAssignmentBtnClick();
	}

	@Then("LMSAdminUser should see that if total class entries above {int} next page is enabled \\( On multiples of {int} new page will be enabled)")
	public void LMSAdminUser_should_see_that_if_total_class_entries_above_next_page_is_enabled_on_multiples_of_new_page_will_be_enabled(Integer entries, Integer page) {

		log.info("When total attendance entries above "+entries+" next page is enabled");
		assertEquals(GreaterThan(5), assignPoObj.entryZ.getText());
		assertEquals(assignPoObj.pageNext_Link.isEnabled(),true);
		assertEquals(assignPoObj.pageLast_Link.isEnabled(),true);
	}

	@When("LMSAdminUser creates less than or equal to {int} new  assignment")
	public void LMSAdminUser_creates_less_than_or_equal_to_new_assignment(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("LMSAdminUser should see that if total class entries are below {int} then next page is disabled")
	public void LMSAdminUser_should_see_that_if_total_class_entries_are_below_then_next_page_is_disabled(Integer entries) {
		log.info("Validates total attendance entries  "+entries+" or below next page is disabled");
		assertEquals(LessThan(5), assignPoObj.entryZ.getText());
		assertEquals(assignPoObj.pageNext_Link.isEnabled(),false);
		assertEquals(assignPoObj.pageLast_Link.isEnabled(),false);
	}

}