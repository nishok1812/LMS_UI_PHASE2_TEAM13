package com.lmsuiphase2.stepdefinitons;



import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.lmsuiphase2.apphooks.Hooks;
import com.lmsuiphase2.pageobjects.DashboardPage_PO;
import com.lmsuiphase2.pageobjects.ProgramPage_PO;
import com.lmsuiphase2.utilities.CommonUtils;
import com.lmsuiphase2.utilities.ExcelUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProgramPage_SD {
	
	private WebDriver driver;
	private static final Logger LOG= LogManager.getLogger(DashboardPage_SD.class);
	
	ProgramPage_PO  ProPo;
	 DashboardPage_PO  dashboard;
	 private List<String> initialProgramData;
	
	public ProgramPage_SD()
	{
		 driver = Hooks.getDriver();
		 ProPo =  new ProgramPage_PO (driver);
		 dashboard= new DashboardPage_PO(driver);
	}



@Given("AdminUser is on dashboard page after Login")
public void admin_user_is_on_dashboard_page_after_login() {
   // hm.login();//for reaching Dashboard
	
}

@When("AdminUser clicks {string} on the navigation bar")
public void admin_user_clicks_on_the_navigation_bar(String string) {
	dashboard.clickOnprogramTab();
}

@Then("AdminUser should see URL")
public void admin_user_should_see_url() {
   String actURL=driver.getCurrentUrl();
   String expPURL= "";
   Assert.assertEquals(actURL, expPURL);
}

@Then("AdminUser should see a heading with text")
public void admin_user_should_see_a_heading_with_text() {
	String ActPHeader=ProPo.getProgramHeader();
	String ExpPHeader= "LMs-LearningSystem";
	Assert.assertEquals(ActPHeader, ExpPHeader);
}

@Then("User see the footer text as")
public void user_see_the_footer_text_as() {
	String ActPFooter=ProPo.getProgramFooter();
	String ExpFooter= "In total there are 4557 Programs";
	Assert.assertEquals(ActPFooter, ExpFooter);;
}

@Then("User see Footer")
public void user_see_footer() {
	ProPo.isFooterPresent();
	if (ProPo.isFooterPresent()==true) {
		Assert.assertTrue(true);
		
	}
	else {
		Assert.assertTrue(false);
		
	}
}

@Then("AdminUser should see a Delete button on the top left hand side as Disabled")
public void admin_user_should_see_a_delete_button_on_the_top_left_hand_side_as_disabled() {
	ProPo.isDeleteBtnPresent();
	if (ProPo.isDeleteBtnPresent()==true) {
		Assert.assertTrue(true);
		
	}
	else {
		Assert.assertTrue(false);
		
	}
}

@Then("AdminUser should see a {string} button on the program page above the data table")
public void admin_user_should_see_a_button_on_the_program_page_above_the_data_table(String string) {
	ProPo.isDeleteAllBtnPresent();
	if (ProPo.isDeleteAllBtnPresent()==true) {
		Assert.assertTrue(true);
		
	}
	else {
		Assert.assertTrue(false);
		
	}
}

@Then("AdminUser should see the number of records displayed on the page are {int}")
public void admin_user_should_see_the_number_of_records_displayed_on_the_page_are(Integer int1) {
	int actualRowCount = ProPo.numberOfRowsPro();
    Assert.assertEquals(CommonUtils.ROWSIZE, actualRowCount);
	
	
    
}

@Then("AdminUser should see data table on the Manage Program Page with following column headers")
public void admin_user_should_see_data_table_on_the_manage_program_page_with_following_column_headers(String string ) {
    ProPo.isColumnOrderedPP(string, string);
    if (ProPo.isColumnOrderedPP(string, string)==true) {
		Assert.assertTrue(true);
		
	}
	else {
		Assert.assertTrue(false);
		
	}
}

@Then("AdminUser should see the sort arrow icon beside to each column header except Edit and Delete")
public void admin_user_should_see_the_sort_arrow_icon_beside_to_each_column_header_except_edit_and_delete() {
	boolean sortIconsVisible = ProPo.isSortIconsVisible();
    Assert.assertTrue(sortIconsVisible);
}

@Then("AdminUser should see the Edit and Delete buttons on each row of the data table")
public void admin_user_should_see_the_edit_and_delete_buttons_on_each_row_of_the_data_table() {
	boolean editButtonsVisible = ProPo.areEditButtonsVisibleinechRow();
    boolean deleteButtonsVisible = ProPo.areDeleteButtonsVisibleinEachRow();

    Assert.assertTrue( editButtonsVisible);
    Assert.assertTrue( deleteButtonsVisible);
}

@When("User is on Manage Program page")
public void user_is_on_manage_program_page() {
    dashboard.clickOnprogramTab();
}

@Then("User see the Search Text box has text as {string}")
public void user_see_the_search_text_box_has_text_as(String string) {
   String actualProSaerchText= ProPo.getSearchBoxText();
   Assert.assertEquals(CommonUtils.SEARCHBOX_TEXT, actualProSaerchText);
}

@Given("AdminUser is on Manage Program Page")
public void admin_user_is_on_manage_program_page1() {
    System.out.println("User is on Manage Program Page");
}

@When("User enters {string} to be searched from {string} and {string}")
public void user_enters_to_be_searched_from_and(String string, String string2, String string3) {
   
	ProPo.searchProgramBox(string);
    ProPo.searchProgramBox(string2);
    ProPo.searchProgramBox(string3);
}

@Then("User see the entries for the searched {string}")
public void user_see_the_entries_for_the_searched(String string) {
    ProPo.areSearchResultsDisplayed();
    if (ProPo.areSearchResultsDisplayed()==true) {
		Assert.assertTrue(true);
		
	}
	else {
		Assert.assertTrue(false);
		
	}
}

@Given("AdminUser is on the manage program page")
public void admin_user_is_on_the_manage_program_page() {
	System.out.println("User is on Manage Program Page");
	
}




@When("AdminUser clicks A New Program button")
public void admin_user_clicks_a_new_program_button() {
    ProPo.clickAddNewProgram();
    for (String windowHandle : driver.getWindowHandles()) {
    	driver.switchTo().window(windowHandle);
    }
}

@Then("AdminUser should see a popup open for Program details with empty form along with SAVE and CANCEL button and Close\\(X) Icon on the top right corner of the window")
public void admin_user_should_see_a_popup_open_for_program_details_with_empty_form_along_with_save_and_cancel_button_and_close_x_icon_on_the_top_right_corner_of_the_window(String string) {
	
	boolean popupVisible = ProPo.isProgramDetailsPopupVisible();

    Assert.assertTrue(popupVisible);
	
}

@Then("AdminUser should see two input fields and their respective text boxes in the program details window")
public void admin_user_should_see_two_input_fields_and_their_respective_text_boxes_in_the_program_details_window() {
	boolean popupVisible = ProPo.isProgramDetailsPopupVisible();

    Assert.assertTrue(popupVisible);
}

@Then("AdminUser should see two radio button for Program Status")
public void admin_user_should_see_two_radio_button_for_program_status() {
	boolean radioButtonsVisible = ProPo.areProgramStatusRadioButtonsVisible();

    Assert.assertTrue( radioButtonsVisible);
}

@Given("AdminUser is on Program Details Popup window")
public void admin_user_is_on_program_details_popup_window() {
   System.out.println("user is on add program popwindow");
}




@When("AdminUser clicks Save button without entering any data")
public void admin_user_clicks_save_button_without_entering_any_data(String name, String description ) {
	ProPo.validateAddNewProgram(name,description);
}

@Then("AdminUser gets a Error message alert {string}")
public void admin_user_gets_a_error_message_alert(String eMsg) {
	Assert.assertTrue(ProPo.getErrorMessage(eMsg));
}

@When("AdminUser enters only Program Name in text box and clicks Save button")
public void admin_user_enters_only_program_name_in_text_box_and_clicks_save_button(String programName) {
	ProPo.validateAddNewProgram(programName,CommonUtils.EMPTY);
}

@Then("AdminUser gets a message alert {string}")
public void admin_user_gets_a_message_alert(String eeMsg) {
	Assert.assertTrue(ProPo.getErrorMessage(eeMsg));
}

@When("AdminUser enters only Program description in text box and clicks Save button")
public void admin_user_enters_only_program_description_in_text_box_and_clicks_save_button(String PD) {
	ProPo.validateAddNewProgram(CommonUtils.EMPTY,PD);
}

@Given("AdminUser is on {string} Popup window")
public void admin_user_is_on_popup_window(String string) {
    System.out.println("");
}

@When("AdminUser selects only Status and clicks Save button")
public void admin_user_selects_only_status_and_clicks_save_button() {
	ProPo.validateAddNewProgram(CommonUtils.EMPTY,CommonUtils.EMPTY);
}

@When("AdminUser enters only numbers or special char in name and desc column")
public void admin_user_enters_only_numbers_or_special_char_in_name_and_desc_column(String PD, String N) {
	ProPo.validateAddNewProgramwithSpecial(PD,N);
	
}

@Then("AdminUser gets a Error message alert")
public void admin_user_gets_a_error_message_alert() {
	 String errorMessage = ProPo.getErrorMsgText();

     Assert.assertNotNull("Error message alert is not displayed.", errorMessage);
}

@When("AdminUser clicks Cancel\\/Close\\(X) Icon on Program Details form")
public void admin_user_clicks_cancel_close_x_icon_on_program_details_form() {
	ProPo.clickCancelonPop();
}

@Then("Program Details popup window should be closed without saving")
public void program_details_popup_window_should_be_closed_without_saving() {
	Assert.assertTrue(ProPo.isProgramDetailsClosed(),"Program details window is not closed");
    
}

@Given("AdminUser is in the Program detail pop up window")
public void admin_user_is_in_the_program_detail_pop_up_window() {
	ProPo.clickAddNewProgram();
    for (String windowHandle : driver.getWindowHandles()) {
    	driver.switchTo().window(windowHandle);
    }
    
}

@When("Admin enters all mandatory field values with valid data and clicks save button \\( Name , Description) from {string} and {string}")
public void admin_enters_all_mandatory_field_values_with_valid_data_and_clicks_save_button_name_description_from_and(String name, String description) {
	ProPo.validateAddNewProgram(name,description); 
}

@Then("Admin should see new class details is added in the data table")
public void admin_should_see_new_class_details_is_added_in_the_data_table(String successMessage ) {
	Assert.assertTrue(ProPo.getSuccessMessage(successMessage));
}

@When("AdminUser clicks <Cancel>button")
public void admin_user_clicks_cancel_button() {
	ProPo.verifyCancelButton();
}

@Then("AdminUser can see the Program details popup disappears without creating any program")
public void admin_user_can_see_the_program_details_popup_disappears_without_creating_any_program() {
	Assert.assertTrue(ProPo.isProgramDetailsClosed(),"Program details window is not closed");
}

@When("AdminUser clicks <Edit> button on the data table for any row")
public void admin_user_clicks_edit_button_on_the_data_table_for_any_row() {
	ProPo.verifyProEditButton();
	for (String windowHandle : driver.getWindowHandles()) {
    	driver.switchTo().window(windowHandle);
    }
}


@Then("AdminUser should see a popup open for Program details to edit")
public void admin_user_should_see_a_popup_open_for_program_details_to_edit() {
	boolean popupVisible = ProPo.isProgramDetailsPopupVisible();

    Assert.assertTrue(popupVisible);
}

@Given("AdminUser is on Program Details Popup window to Edit")
public void admin_user_is_on_program_details_popup_window_to_edit() {
   System.out.println("user is on Edit Program Window");
}

@When("AdminUser edits the Name column and clicks save button")
public void admin_user_edits_the_name_column_and_clicks_save_button(String proName) {
	ProPo.updatePgmName(proName);
}

@Then("AdminUser gets a message {string} alert and able to see the updated name in the table for the particular program")
public void admin_user_gets_a_message_alert_and_able_to_see_the_updated_name_in_the_table_for_the_particular_program(String searchText,String colName) {
	Assert.assertTrue(ProPo.isTextPresentInColumn(searchText,colName),"Search not in table");
}

@When("AdminUser edits the Description column and clicks save button")
public void admin_user_edits_the_description_column_and_clicks_save_button(String pgmDescription) {
	ProPo.updatePgmDescription(pgmDescription);
}

@Then("AdminUser gets a message {string} alert and able to see the updated description in the table for the particular program")
public void admin_user_gets_a_message_alert_and_able_to_see_the_updated_description_in_the_table_for_the_particular_program(String searchText,String colName) {
	Assert.assertTrue(ProPo.isTextPresentInColumn(searchText,colName),"Search not in table");
}

@When("AdminUser changes the Status and clicks save button")
public void admin_user_changes_the_status_and_clicks_save_button(String pgmStatus) {
	ProPo.updateProgramStatusWithRadio(pgmStatus);
}

@Then("AdminUser gets a message {string} alert and able to see the updated status in the table for the particular program")
public void admin_user_gets_a_message_alert_and_able_to_see_the_updated_status_in_the_table_for_the_particular_program(String status) {
	Assert.assertEquals("Success message does not match the expected message.", ProPo.getSuccessMessage(status));
}

@When("AdminUser clicks <Cancel>button on edit popup")
public void admin_user_clicks_cancel_button_on_edit_popup() {
	ProPo.verifyCancelButton();
}

@Then("AdminUser can see the Program details popup disappears and can see nothing changed for particular program")
public void admin_user_can_see_the_program_details_popup_disappears_and_can_see_nothing_changed_for_particular_program() {
	Assert.assertTrue(ProPo.isProgramDetailsClosed(),"Program details window is not closed");
}

@When("AdminUser clicks <Save>button on edit popup")
public void admin_user_clicks_save_button_on_edit_popup(String name,String description) {
  ProPo.ValidateupdateNewProgram(name,description); 
}

@Then("AdminUser gets a message {string} alert and able to see the updated details in the table for the particular program")
public void admin_user_gets_a_message_alert_and_able_to_see_the_updated_details_in_the_table_for_the_particular_program(String successMessage) {
	Assert.assertTrue(ProPo.getSuccessMessage(successMessage));
}

@When("AdminUser clicks <Delete> button on the data table for any row")
public void admin_user_clicks_delete_button_on_the_data_table_for_any_row() {
	ProPo.clickDeleteButtonForRow(1);
	for (String windowHandle : driver.getWindowHandles()) {
    	driver.switchTo().window(windowHandle);
    }
}

@Then("AdminUser should see a alert open with heading {string} along with  <YES> and <NO> button for deletion")
public void admin_user_should_see_a_alert_open_with_heading_along_with_yes_and_no_button_for_deletion(String expectedHeading, String yesButtonText, String noButtonText) {
	
        String actualAlertText = ProPo.getConfirmationAlertText();

        Assert.assertTrue(actualAlertText.contains(expectedHeading));
        Assert.assertTrue(actualAlertText.contains(yesButtonText));
        Assert.assertTrue(actualAlertText.contains(noButtonText));
    }
	

@Then("AdminUser should see a message {string}")
public void admin_user_should_see_a_message(String text) {
	Assert.assertTrue(ProPo.isDeleteConfirm(text));
}

@Given("AdminUser is on Confirm Deletion alert")
public void admin_user_is_on_confirm_deletion_alert() {
   ProPo.verifyDeleteButton();
   for (String windowHandle : driver.getWindowHandles()) {
   	driver.switchTo().window(windowHandle);
   }
}

@When("AdminUser clicks <YES> button on the alert")
public void admin_user_clicks_yes_button_on_the_alert1(String Yes) {
	   ProPo.confirmDelete(Yes);
}

@Then("AdminUser gets a message {string} alert and able to see that program deleted in the data table")
public void admin_user_gets_a_message_alert_and_able_to_see_that_program_deleted_in_the_data_table(String pgmName, String colName) {
	Assert.assertFalse(ProPo.isTextPresentInColumn(pgmName,colName),"Search not present in the table");
}

@When("AdminUser clicks <NO> button on the alert")
public void admin_user_clicks_no_button_on_the_alert1(String No) {
	
		   ProPo.confirmDelete(No);
}

@Then("AdminUser can see the deletion alert disappears without deleting")
public void admin_user_can_see_the_deletion_alert_disappears_without_deleting(String pgmName,String colName) {
	Assert.assertFalse(ProPo.isTextPresentInColumn(pgmName,colName),"Search present in the table");
}

@When("AdminUser clicks Cancel\\/Close\\(X) Icon on Deletion alert")
public void admin_user_clicks_cancel_close_x_icon_on_deletion_alert() {
	if (ProPo.isAlertPresent()) {
		ProPo.dismissAlert(); // Dismiss the alert
    } else {
        Assert.fail("Confirmation alert not found.");
    }
}

@Then("AdminUser can see the deletion alert disappears without any changes")
public void admin_user_can_see_the_deletion_alert_disappears_without_any_changes() {
	 Assert.assertFalse(ProPo.isAlertPresent());
}

@Given("AdminUser is in Manage Program page")
public void admin_user_is_in_manage_program_page() {
    System.out.println("user is on Program Page");
 // Ensure that the common delete button is initially disabled
    Assert.assertFalse(ProPo.isCommonDeleteAllButtonEnabled(), "Common delete button is enabled initially.");
}

@When("AdminUser clicks any checkbox in the data table")
public void admin_user_clicks_any_checkbox_in_the_data_table() {
	ProPo.clickAnyCheckBox();
}

@Then("AdminUser should see common delete option enabled under header Manage Program")
public void admin_user_should_see_common_delete_option_enabled_under_header_manage_program() {
	boolean isCommonDeleteButtonEnabled = ProPo.isCommonDeleteAllButtonEnabled();

    
    Assert.assertTrue(isCommonDeleteButtonEnabled, "Common delete button is not enabled.");
}

@Then("AdminUser should land on Manage Program page and can see the selected program is deleted from the data table")
public void admin_user_should_land_on_manage_program_page_and_can_see_the_selected_program_is_deleted_from_the_data_table(String pgmName,String colName) {
	Assert.assertFalse(ProPo.isTextPresentInColumn(pgmName,colName),"Search present in the table");}

@Then("AdminUser should land on Manage Program page and can see the selected program is not deleted from the data table")
public void admin_user_should_land_on_manage_program_page_and_can_see_the_selected_program_is_not_deleted_from_the_data_table(String pgmName,String colName) {
	Assert.assertTrue(ProPo.isTextPresentInColumn(pgmName,colName),"Search present in the table");
}

@When("AdminUser clicks YES button on the alert")
public void admin_user_clicks_yes_button_on_the_alert(String Yes) {
	ProPo.confirmDelete(Yes);
}

@Then("AdminUser should land on Manage Program page")
public void admin_user_should_land_on_manage_program_page() {
    Assert.assertEquals(ProPo.getProgramHeader(), "LMSTitle");
}

@Then("AdminUser can see the selected programs are deleted from the data table")
public void admin_user_can_see_the_selected_programs_are_deleted_from_the_data_table(String pgmName, String colName) {
	Assert.assertFalse(ProPo.isTextPresentInColumn(pgmName,colName),"Search present in the table");
}

@When("AdminUser clicks NO button on the alert")
public void admin_user_clicks_no_button_on_the_alert(String No) {
	ProPo.confirmDelete(No);
}

@Then("AdminUser can see the selected programs are not deleted from the data table")
public void admin_user_can_see_the_selected_programs_are_not_deleted_from_the_data_table(String pgmName, String colName) {
	Assert.assertTrue(ProPo.isTextPresentInColumn(pgmName,colName),"Search present in the table");
}

@Given("AdminUser is on Manage Program Page after clicks Program on the navigation bar")
public void admin_user_is_on_manage_program_page_after_clicks_program_on_the_navigation_bar() {
   System.out.println("user is on program page");
}

@When("AdminUser clicks the sort icon of <Column name> column")
public void admin_user_clicks_the_sort_icon_of_column_name_column(String name) {
    ProPo.clickSortIcon(name);
}

@Then("The data get sorted on the table based on the <Column name> column values in <Order> order")
public void the_data_get_sorted_on_the_table_based_on_the_column_name_column_values_in_order_order(String colName,String order) {
	ProPo.isColumnOrderedPP(colName,order);
}

@Given("AdminUser is on Manage Program page")
public void admin_user_is_on_manage_program_page() {
	System.out.println("user is on program page");
}

@When("AdminUser clicks Next page link on the program table")
public void admin_user_clicks_next_page_link_on_the_program_table() {
    ProPo.verifyPaginatorNext();
    ProPo.clickNextPageLink();
}

@Then("AdminUser should see the Pagination has {string} link")
public void admin_user_should_see_the_pagination_has_link(String string) {
	ProPo.verifyPaginatorNext();
}

@When("AdminUser clicks Last page link")
public void admin_user_clicks_last_page_link() {
	ProPo.clickLastPaginator();
}

@Then("AdminUser should see the last page record on the table with Next page link are disabled")
public void admin_user_should_see_the_last_page_record_on_the_table_with_next_page_link_are_disabled() {
	boolean isLastPageRecordDisplayed = ProPo.isLastPageRecordDisplayed(); 

   
    boolean isNextLinkDisabled = ProPo.isNextPageLinkDisabled(); 

    
    Assert.assertTrue(isLastPageRecordDisplayed, "Last page record is not displayed on the table.");
    Assert.assertTrue(isNextLinkDisabled, "Next link is not disabled.");
}

@Given("AdminUser is on last page of Program table")
public void admin_user_is_on_last_page_of_program_table() {
    ProPo.clickLastPaginator();
}

@When("AdminUser clicks First page link")
public void admin_user_clicks_first_page_link() {
	ProPo.clickFirstPaginator();
}

@Then("AdminUser should see the previous page record on the table with pagination has previous page link")
public void admin_user_should_see_the_previous_page_record_on_the_table_with_pagination_has_previous_page_link() {
	boolean isFirstPageRecordDisplayed = ProPo.isFirstPageRecordDisplayed(); 

	   
    boolean isNextLinkDisabled = ProPo.isNextPageLinkDisabled(); 

    
    Assert.assertTrue(isFirstPageRecordDisplayed, "Last page record is not displayed on the table.");
    Assert.assertTrue(isNextLinkDisabled, "Next link is not disabled.");
}

@Given("AdminUser is on Previous Program page")
public void admin_user_is_on_previous_program_page() {
   System.out.println("ProgramPage");
}

@When("AdminUser clicks Start page link")
public void admin_user_clicks_start_page_link() {
	 ProPo.clickFirstPaginator();
}

@Then("AdminUser should see the very first page record on the table with Previous page link are disabled")
public void admin_user_should_see_the_very_first_page_record_on_the_table_with_previous_page_link_are_disabled() {
	boolean isFirstPageRecordDisplayed = ProPo.isFirstPageRecordDisplayed(); 

	   
    boolean isNextLinkDisabled = ProPo.isNextPageLinkDisabled(); 

    
    Assert.assertTrue(isFirstPageRecordDisplayed, "Last page record is not displayed on the table.");
    Assert.assertTrue(isNextLinkDisabled, "Next link is not disabled.");
}



}






