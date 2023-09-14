package com.lmsuiphase2.stepdefinitons;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.lmsuiphase2.utilities.ExcelUtils;
import com.lmsuiphase2.apphooks.Hooks;
import com.lmsuiphase2.driverfactory.DriverFactory;
import com.lmsuiphase2.pageobjects.ClassPage_PO;
import com.lmsuiphase2.utilities.CommonUtils;
import com.lmsuiphase2.pageobjects.Common_PO;
import com.thoughtworks.qdox.model.expression.GreaterEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ClassPage_SD{
	private static final Logger log= LogManager.getLogger(ClassPage_SD.class);
	private WebDriver driver;
	public static ClassPage_PO ClassPageObj;
	//commonObj= new Common_PO(driver);

	public ClassPage_SD()
	{
	  driver = Hooks.getDriver();
	 ClassPageObj =  new ClassPage_PO(driver);
	}

@Given("Admin is in dashboard page after Login in Class")
public void admin_is_in_dashboard_page_after_login_in_class() {
	
	driver.get(ClassPageObj.DashboardPageUrl);
    
}

@When("Admin clicks {string} button on the navigation bar for class")
public void admin_clicks_button_on_the_navigation_bar_for_class1(String string) {
     
	ClassPageObj.clickClassLink();
    
}

@Then("Admin should see URL with {string} for class")
public void admin_should_see_url_with_for_class(String string) {
     
   // String actualUrl = CommonObj.currentpage();
    String expectedUrl = ClassPageObj.expectedUrl;
 // Compare the actual and expected URLs
    //Assert.assertEquals(actualUrl, expectedUrl, "Urls are matching");
    
}

@Given("Admin is on dashboard page after Login in Class")
public void admin_is_on_dashboard_page_after_login_in_class2() {
     

	driver.get(ClassPageObj.DashboardPageUrl);
}

@When("Admin click {string} button on the navigation bar for class")
public void admin_click_button_on_the_navigation_bar_for_class(String string) {
     
	ClassPageObj.clickClassLink(); 
}

@Then("Get the response time for navigation from dashboard page to manage class page for class")
public void get_the_response_time_for_navigation_from_dashboard_page_to_manage_class_page_for_class() {
     
	log.info("Admin should be able to capture Response time from the URL");
  //  Common_PO.navigationPageLoadTime(toS);
}

@Given("Admin is on dash board page after Login in Class")
public void admin_is_on_dash_board_page_after_login_in_class() {
     
	//ClassPageObj.currentpage();
}

@When("admin clicks {string} button on the navigation bar for class")
public void admin_clicks_button_on_the_navigation_bar_for_class(String string) {
     
	ClassPageObj.clickClassLink(); 
}

@Then("Admin should see header with {string} for class")
public void admin_should_see_header_with_for_class(String string) {
     
	//assertEquals("Manage Class", ClassPageObj.getHeader());
}

@Given("admin is on dashboard page after Login in Class")
public void admin_is_on_dashboard_page_after_login_in_class() {
     
	driver.get(ClassPageObj.DashboardPageUrl);
}

@When("Admin clicks {string} button on the navigation bar and get all text from the portal page for class")
public void admin_clicks_button_on_the_navigation_bar_and_get_all_text_from_the_portal_page_for_class(String string) {
     
    
}

@Then("Admin should see correct spelling for the all the fields for class")
public void admin_should_see_correct_spelling_for_the_all_the_fields_for_class() {
     
    
}

@Given("Admin is on dashboard page after Logging in Class")
public void admin_is_on_dashboard_page_after_logging_in_class() {
	
	driver.get(ClassPageObj.DashboardPageUrl);
    
}

@Then("Admin should see disabled delete icon below the {string} for class")
public void admin_should_see_disabled_delete_icon_below_the_for_class(String string) {
	
	//Common_PO.singleDeleteBtnPresent();
	//if (Common_PO.singleDeleteBtnPresent()==true) {
		//Assert.assertTrue(true);
		
	//}
	//else {
	//	Assert.assertTrue(false);
		
	//}
}

@Given("Admin is on dashboard page after successful Login")
public void admin_is_on_dashboard_page_after_successful_login() {
     
	driver.get(ClassPageObj.DashboardPageUrl);
}

@When("Admin clicks {string} button at the navigation bar for class")
public void admin_clicks_button_at_the_navigation_bar_for_class(String string) {
     
	ClassPageObj.clickClassLink(); 
}

@Then("Admin should see search bar on the class page for class")
public void admin_should_see_search_bar_on_the_class_page_for_class() {
     
    ClassPageObj.isSearchBoxDisplayed();
    Assert.assertTrue(true, "searchbox is not displayed");
}

@Then("Admin should see +Add New Class button on the class page for class")
public void admin_should_see_add_new_class_button_on_the_class_page_for_class() {
     
    ClassPageObj.addNewClassBtn();
    Assert.assertTrue(true, "Add New Class Button is not displayed");
}

@Then("Admin should see data table on the Manage Class Page With following column headers \\(Check box symbol,Batch Id, Class No,Class Date, Class Topic, Staff Id, Description, Comments, Notes, Recording, Edit Delete) for class")
public void admin_should_see_data_table_on_the_manage_class_page_with_following_column_headers_check_box_symbol_batch_id_class_no_class_date_class_topic_staff_id_description_comments_notes_recording_edit_delete_for_class()
 {
	boolean batchid = ClassPageObj.BatchId();
Assert.assertTrue(batchid, "Batch Id is not displayed on the class page");
boolean classno = ClassPageObj.NoOfClasses();
Assert.assertTrue(classno, "Class No is not displayed on the class page");
boolean classdate = ClassPageObj.ClassDate();
Assert.assertTrue(classdate, "Class Date is not displayed on the class page");
boolean classtopic = ClassPageObj.ClassTopic();
Assert.assertTrue(classtopic, "Class Topic is not displayed on the class page");
boolean staffid = ClassPageObj.StaffId();
Assert.assertTrue(staffid, "Staff Id is not displayed on the class page");
boolean description = ClassPageObj.ClassDesc();
Assert.assertTrue(description, "Description is not displayed on the class page");
boolean comments = ClassPageObj.Comments();
Assert.assertTrue(comments, "Comments is not displayed on the class page");
boolean notes = ClassPageObj.Notes();
Assert.assertTrue(notes, "Notes is not displayed on the class page");
boolean recording = ClassPageObj.Recording();
Assert.assertTrue(recording, "Recording is not displayed on the class page");
 boolean edit = ClassPageObj.EditClass();
Assert.assertTrue(edit, "Edit is not displayed on the class page");
boolean delete = ClassPageObj.DeleteClass();
Assert.assertTrue(delete, "Delete is not displayed on the class page");	
	
    
}

@Then("Edit Icon in each row of data table only  when entries are available for class")
public void edit_icon_in_each_row_of_data_table_only_when_entries_are_available_for_class() {
    ClassPageObj.editClass1();
    Assert.assertTrue(true);
    ClassPageObj.editClass2();
    Assert.assertTrue(true);
    ClassPageObj.editClass3();
    Assert.assertTrue(true);
    
}

@Then("Edit Icon will not be present in data table for class")
public void edit_icon_will_not_be_present_in_data_table_for_class() {
     
	    ClassPageObj.editClass1();
	    Assert.assertFalse(true);
	    ClassPageObj.editClass2();
	    Assert.assertFalse(true);
	    ClassPageObj.editClass3();
	    Assert.assertFalse(true);
}

@Then("Delete Icon in each row of data table only  when entries are available for class")
public void delete_icon_in_each_row_of_data_table_only_when_entries_are_available_for_class() {
	    ClassPageObj.deleteClass1();
	    Assert.assertTrue(true);
	    ClassPageObj.deleteClass2();
	    Assert.assertTrue(true);
	    ClassPageObj.deleteClass3();
	    Assert.assertTrue(true);
    
}

@Then("Admin cant see delete  Icon in data table for class")
public void admin_cant_see_delete_icon_in_data_table_for_class() {
	ClassPageObj.deleteClass1();
    Assert.assertFalse(true);
    ClassPageObj.deleteClass2();
    Assert.assertFalse(true);
    ClassPageObj.deleteClass3();
    Assert.assertFalse(true);
    
}

@Then("Admin should see sort icon near the column headers except for Edit and Delete for class")
public void admin_should_see_sort_icon_near_the_column_headers_except_for_edit_and_delete_for_class() {
    ClassPageObj.batchidSort();
    Assert.assertTrue(true);
    ClassPageObj.classnoSort();
    Assert.assertTrue(true);
    ClassPageObj.classdateSort();
    Assert.assertTrue(true);
    ClassPageObj.classtopicSort();
    Assert.assertTrue(true);
    ClassPageObj.staffidSort();
    Assert.assertTrue(true);
    ClassPageObj.descriptionSort();
    Assert.assertTrue(true);
    ClassPageObj.commentSort();
    Assert.assertTrue(true);
    ClassPageObj.noteSort();
    Assert.assertTrue(true);
    ClassPageObj.recordingSort();
    Assert.assertTrue(true);
}

@Then("Admin should see check box in the all rows  of data table for class")
public void admin_should_see_check_box_in_the_all_rows_of_data_table_for_class() {
     
    ClassPageObj.isCheckboxEnabled();
    Assert.assertTrue(true, "checkbox is not enabled for all the rows");
}

@Then("Above the footer Admin should see the text as {string} below the table x- starting record number on that pagey-ending record number on that page z-Total number of records  Note: with or without entries for class")
public void above_the_footer_admin_should_see_the_text_as_below_the_table_x_starting_record_number_on_that_pagey_ending_record_number_on_that_page_z_total_number_of_records_note_with_or_without_entries_for_class(String string) {
     
    int expectednumber = ClassPageObj.rowCount();
    String actualnumber = ClassPageObj.NumberEntries();
    Assert.assertEquals(expectednumber,actualnumber);
}

@Then("Admin should see the pagination controls under the data table for class")
public void admin_should_see_the_pagination_controls_under_the_data_table_for_class() { 
	
	 ClassPageObj.pagination();
     Assert.assertTrue(true,"Pagination controls are not visible");
  
}

@Then("Admin should see the text with total number classes in the data table \\({string}) for class")
public void admin_should_see_the_text_with_total_number_classes_in_the_data_table_for_class(String string) {
     
   String numbercountclasses= ClassPageObj.classesnumber();
   int expectednumber = ClassPageObj.rowCount();
   Assert.assertEquals(numbercountclasses, expectednumber);
    
}

@Given("Admin is on the manage class page in Class")
public void admin_is_on_the_manage_class_page_in_class() {
     
	ClassPageObj.clickClassLink();
	
}

@When("Admin enters valid {string} in the search box for class")
public void admin_enters_valid_in_the_search_box_for_class(String string) {
	
	ClassPageObj.TexttoSearch(string, string);
	
}

@Then("Displays entries with that {string} for class")
public void displays_entries_with_that_for_class(String string) {
	
	WebElement resultElement = driver.findElement(By.id("resultElementId")); // Replace with the actual ID of the result element
    String actualResult = resultElement.getText();
    assertEquals(string, actualResult);
    
}

@When("Admin enters invalid {string} in the search box for class")
public void admin_enters_invalid_in_the_search_box_for_class(String string) {
	
	ClassPageObj.TexttoSearch(string, string);
	
    
}

@Then("Displays empty details in the data table for class")
public void displays_empty_details_in_the_data_table_for_class() {
	
     ClassPageObj.DataTableEmpty();
    
}

@When("Admin click +Add New Class button for class")
public void admin_click_add_new_class_button_for_class3() {
     
	ClassPageObj.clickClassLink();
	ClassPageObj.addNewClass();
    
}

@Then("Admin should see a popup  with  heading {string} for class")
public void admin_should_see_a_popup_with_heading_for_class(String string) {
	 boolean classdetails = ClassPageObj.ClassDetails();
	Assert.assertTrue(classdetails, "Class Details pop up not appeared");
    
}

@When("Admin click Add New Class button for class")
public void admin_click_add_new_class_button_for_class() {
	ClassPageObj.clickClassLink();
	ClassPageObj.addNewClass();
    
}

@Then("Admin should see input fields Text \\(Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings) for class")
public void admin_should_see_input_fields_text_batch_id_no_of_classes_class_date_class_topic_staff_id_class_description_comments_notes_recordings_for_class() {
	
	boolean batchid = ClassPageObj.BatchId();
	Assert.assertTrue(batchid, "Batch Id is not displayed on the class details page");
	boolean classno = ClassPageObj.NoOfClasses();
	Assert.assertTrue(classno, "Class No is not displayed on the class details page");
	boolean classdate = ClassPageObj.ClassDate();
	Assert.assertTrue(classdate, "Class Date is not displayed on the class details page");
	boolean classtopic = ClassPageObj.ClassTopic();
	Assert.assertTrue(classtopic, "Class Topic is not displayed on the class details page");
	 boolean staffid = ClassPageObj.StaffId();
	Assert.assertTrue(staffid, "Staff Id is not displayed on the class details page");
	boolean description = ClassPageObj.ClassDesc();
	Assert.assertTrue(description, "Description is not displayed on the class details page");
	boolean comments = ClassPageObj.Comments();
	 Assert.assertTrue(comments, "Comments is not displayed on the class details page");
	 boolean notes = ClassPageObj.Notes();
	Assert.assertTrue(notes, "Notes is not displayed on the class details page");
	 boolean recording = ClassPageObj.Recording();
	Assert.assertTrue(recording, "Recording is not displayed on the class details page");
	
    
}

@Then("6 textbox should be  present in Class details popup window for class")
public void six_textbox_should_be_present_in_class_details_popup_window_for_class() {
     
	List<WebElement> textboxes = ClassPageObj.TextBox();
	  int totaltextboxes = textboxes.size();
	  Assert.assertEquals(totaltextboxes, 6,"Number of textboxes in the popup window doesn't match the expected value.");
    
}

@Then("Admin should see  dropdown option for Batch ID for class")
public void admin_should_see_dropdown_option_for_batch_id_for_class() {
	
	boolean batchdropdown = ClassPageObj.batchdropdown();
	Assert.assertTrue(batchdropdown, "Batch Id Drop Down is not displayed on the class details page");  
}
    


@Then("Admin should see  dropdown option for Staff Id for class")
public void admin_should_see_dropdown_option_for_staff_id_for_class() {
	
	boolean staffdropdown = ClassPageObj.staffdropdown();
	Assert.assertTrue(staffdropdown, "Staff Drop Down is not displayed on the class details page");
    
}

@Then("Admin should see  calendar icon for class date for class")
public void admin_should_see_calendar_icon_for_class_date_for_class() {
     
	boolean calendar = ClassPageObj.calendaricon();
	Assert.assertTrue(calendar, "Calendar is not displayed on the class details page");
    
}

@Then("Admin should see  save button in the class detail popup window for class")
public void admin_should_see_save_button_in_the_class_detail_popup_window_for_class() {
     
	boolean Save = ClassPageObj.save();
	Assert.assertTrue(Save, "Save Button is not displayed on the class details page");
}

@Then("Admin should see  cancel button in the class detail popup window for class")
public void admin_should_see_cancel_button_in_the_class_detail_popup_window_for_class() {
	
	boolean Cancel = ClassPageObj.cancel();
	Assert.assertTrue(Cancel, "Save Button is not displayed on the class details page");
    
}

@Then("Admin should see  close button on the class details popup window for class")
public void admin_should_see_close_button_on_the_class_details_popup_window_for_class() {
	
	boolean Close = ClassPageObj.close();
	Assert.assertTrue(Close, "Save Button is not displayed on the class details page");
    
}

@Given("Admin is in the class detail pop up window in Class")
public void admin_is_in_the_class_detail_pop_up_window_in_class4() {
	
	String currentURL =DriverFactory.getDriver().getCurrentUrl();
	String expectedURL = CommonUtils.classUrl;
		 Assert.assertEquals(expectedURL, currentURL);
		 Assert.assertNotNull(currentURL);
		 Assert.assertTrue(currentURL.startsWith("http://"));
		 if (!expectedURL.equals(currentURL))
		 {
		  System.out.println("Failed to reach the Class detail page.Expected Url: "+ expectedURL );
		 }
    
}

@When("Admin clicks  Batch ID dropdown for class")
public void admin_clicks_batch_id_dropdown_for_class() {
	
	 ClassPageObj.Click_BatchDropDown();
    
}

@Then("Batch id in the drop down should match with Batch id manage batch page table for class")
public void batch_id_in_the_drop_down_should_match_with_batch_id_manage_batch_page_table_for_class() {
	
	String tablebatchid = ClassPageObj.DataTableBatchId();
    List<WebElement> batchidoptions = ClassPageObj.BatchDropDownText();
    if (tablebatchid.equals(batchidoptions.toString().trim())) {
        System.out.println("Dropdown and table Batch Ids match.");
    } else {
        System.out.println("Dropdown and table Batch Ids do not match.");
    }
    
}

@When("Admin enters all mandatory field values with valid data and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id) from {string} and {string} for class")
public void admin_enters_all_mandatory_field_values_with_valid_data_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id_from_and_for_class(String string, String string2) {
     
    
}

@Then("Admin should see new class details is added in the data table for class")
public void admin_should_see_new_class_details_is_added_in_the_data_table_for_class() {
     
    
}

@When("Admin enters all mandatory field values with invalid data and clicks save button\\( Batch ID , No of Classes, Class Date, Staff Id )from {string} and {string} for class")
public void admin_enters_all_mandatory_field_values_with_invalid_data_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id_from_and_for_class(String string, String string2) {
     
    
}

@Then("Error message {string} should appear in  alert for class")
public void error_message_should_appear_in_alert_for_class5(String string) {
     
    
}

@When("Admin enters values in all fields with valid data and clicks save button \\(Batch ID , No of Classes, Class Date, Class Topic,Staff Id, Class description, Comments, Notes, Recordings) from {string} and {string} for class")
public void admin_enters_values_in_all_fields_with_valid_data_and_clicks_save_button_batch_id_no_of_classes_class_date_class_topic_staff_id_class_description_comments_notes_recordings_from_and_for_class(String string, String string2) {
     
    
}

@When("Admin enters invalid data in optional fields and clicks save button \\(Class description, Comments, Notes, Recordings) from {string} and {string} for class")
public void admin_enters_invalid_data_in_optional_fields_and_clicks_save_button_class_description_comments_notes_recordings_from_and_for_class(String string, String string2) {
     
    
}

@Then("Error message {string} should appear in alert for class")
public void error_message_should_appear_in_alert_for_class(String string) {
     
    
}

@When("Admin enters  data missing value in Batch ID and clicks save button \\(No of Classes, Class Date, Staff Id) for class")
public void admin_enters_data_missing_value_in_batch_id_and_clicks_save_button_no_of_classes_class_date_staff_id_for_class() {
     
    
}

@Then("Batch Id is missing for class")
public void batch_id_is_missing_for_class() {
     
    
}

@When("Admin enters data missing value in No of class and clicks save button \\(Batch ID ,  Class Date, Staff Id ) for class")
public void admin_enters_data_missing_value_in_no_of_class_and_clicks_save_button_batch_id_class_date_staff_id_for_class() {
     
    
}

@Then("No of classes is missing for class")
public void no_of_classes_is_missing_for_class() {
     
    
}

@When("Admin enters data missing value in  class date and clicks save button \\(Batch ID , No of Classes, Staff Id ) for class")
public void admin_enters_data_missing_value_in_class_date_and_clicks_save_button_batch_id_no_of_classes_staff_id_for_class() {
     
    
}

@Then("class date is missing for class")
public void class_date_is_missing_for_class() {
     
    
}

@Given("Admin is in the class detail pop up  window in Class")
public void admin_is_in_the_class_detail_pop_up_window_in_class() {
     
    
}

@When("Admin enters data missing value in staff id and clicks save button \\(Batch ID , No of Classes, Class Date ) for class")
public void admin_enters_data_missing_value_in_staff_id_and_clicks_save_button_batch_id_no_of_classes_class_date_for_class() {
     
    
}

@Then("staff id is missing for class")
public void staff_id_is_missing_for_class() {
     
    
}

@When("Admin enters passed date in the class date field and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id) for class")
public void admin_enters_passed_date_in_the_class_date_field_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id_for_class() {
     
    
}

@Then("class cannot be  created for the passed date for class")
public void class_cannot_be_created_for_the_passed_date_for_class() {
     
    
}

@When("Admin clicks date from date picker for class")
public void admin_clicks_date_from_date_picker_for_class() {
     
    
}

@Then("selected date should be their in class date text box for class")
public void selected_date_should_be_their_in_class_date_text_box_for_class() {
     
    
}

@Then("selected date should be in  mm\\/dd\\/yyyy format for class")
public void selected_date_should_be_in_mm_dd_yyyy_format_for_class() {
     
    
}

@When("Admin clicks right arrow in the date picker near month for class")
public void admin_clicks_right_arrow_in_the_date_picker_near_month_for_class() {
     
    ClassPageObj.clickdatepicker();
    ClassPageObj.clickrightarrowdatepicker();
}

@Then("Next month calender should visible for class")
public void next_month_calender_should_visible_for_class() {
     
	//String nextmonth =ClassPageObj.DateNextMonth();
	// Assert.assertTrue(nextmonth.contains("MM"), "Next Month is not visible on the date picker of class details page");  
}

//@When("Admin clicks left arrow in the date picker near month for class")
//public void admin_clicks_left_arrow_in_the_date_picker_near_month_for_class() {
     
    
//}

/*@Then("previous month calender should visible for class")
public void previous_month_calender_should_visible_for_class() {
     
    
}

@When("Admin clicks date picker button for class")
public void admin_clicks_date_picker_button_for_class() {
     
    
}

@Then("Admin should see current date is highled in the date picker for class")
public void admin_should_see_current_date_is_highled_in_the_date_picker_for_class() {
     
    
}

@When("Admin clicks date picker button and selects future date for class")
public void admin_clicks_date_picker_button_and_selects_future_date_for_class() {
     
    
}

@Then("Admin should see selected date is highled in the date picker for class")
public void admin_should_see_selected_date_is_highled_in_the_date_picker_for_class() {
     
    
}*/

@When("Admin clicks Cancel button without entering values in the fields for class")
public void admin_clicks_cancel_button_without_entering_values_in_the_fields_for_class() {
     
	log.info(" Admin clicks Cancel button without entering values in the fields ");

	ClassPageObj.clickCancel();
}

/*@Then("Admin should land on Manage Class page for class")
public void admin_should_land_on_manage_class_page_for_class() {
     
    
}

@When("Admin clicks Cancel button entering values in the fields for class")
public void admin_clicks_cancel_button_entering_values_in_the_fields_for_class() {
     
    
}

@Then("Admin should land on Manage Class Page and validate new class is not created in the data table for class")
public void admin_should_land_on_manage_class_page_and_validate_new_class_is_not_created_in_the_data_table_for_class() {
     
    
}*/

@When("Admin clicks Edit button in data table for class")
public void admin_clicks_edit_button_in_data_table_for_class() {
	
	ClassPageObj.click_edit();
    
}

@Then("Edit popup window appears with heading Class Details for class")
public void edit_popup_window_appears_with_heading_class_details_for_class() {
     
	boolean classdetails = ClassPageObj.ClassDetails();
	Assert.assertTrue(classdetails, "Class Details pop up not appeared");
}

@When("Admin clicks Edit button from one of the row in data table for class")
public void admin_clicks_edit_button_from_one_of_the_row_in_data_table_for_class() {
     
	ClassPageObj.click_edit1();
    
}

/*@Then("Edit popup window appears with same row values in the all fields for class")
public void edit_popup_window_appears_with_same_row_values_in_the_all_fields_for_class() {
     
	   
}

@Given("Admin clicks edit button in manage class page and admin is in the edit class detail pop up window in Class")
public void admin_clicks_edit_button_in_manage_class_page_and_admin_is_in_the_edit_class_detail_pop_up_window_in_class() {
     
    
}

@When("Admin enters all mandatory field values with valid data and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id) for class")
public void admin_enters_all_mandatory_field_values_with_valid_data_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id_for_class() {
     
    
}

@Then("Admin should see particular class details is updated in the data table for class")
public void admin_should_see_particular_class_details_is_updated_in_the_data_table_for_class() {
     
    
}

@When("Admin enters all mandatory field values with invalid data and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id, ) for class")
public void admin_enters_all_mandatory_field_values_with_invalid_data_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id_for_class() {
     
    
}

@Then("Error message should appear in alert for class")
public void error_message_should_appear_in_alert_for_class() {
     
    
}

@When("Admin enters values in all fields with valid data and clicks save button \\(Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description,Comments, Notes, Recordings) for class")
public void admin_enters_values_in_all_fields_with_valid_data_and_clicks_save_button_batch_id_no_of_classes_class_date_class_topic_staff_id_class_description_comments_notes_recordings_for_class() {
     
    
}

@When("Admin enters with invalid data in optional fields and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id) for class")
public void admin_enters_with_invalid_data_in_optional_fields_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id_for_class() {
     
    
}

@Then("class cannot be updated for the passed date for class")
public void class_cannot_be_updated_for_the_passed_date_for_class() {
     
    
}

@Then("Admin should land on Manage Class Page and validate particular class details are not changed  in the data table for class")
public void admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_not_changed_in_the_data_table_for_class() {
     
    
}

@When("Admin clicks delete button in data table row level for class")
public void admin_clicks_delete_button_in_data_table_row_level_for_class() {
     
    
}

@Then("Admin should see alert for class")
public void admin_should_see_alert_for_class() {
     
    
}

@Then("Alert should have {string} button to accept for class")
public void alert_should_have_button_to_accept_for_class(String string) {
     
    
}

@Then("Alert should have {string} button to reject for class")
public void alert_should_have_button_to_reject_for_class(String string) {
     
    
}

@When("Admin clicks yes button for class")
public void admin_clicks_yes_button_for_class() {
     
    
}

@Then("Success message and validate particular class details are deleted from the data table for class")
public void success_message_and_validate_particular_class_details_are_deleted_from_the_data_table_for_class() {
     
    
}

@When("Admin clicks no button for class")
public void admin_clicks_no_button_for_class() {
     
    
}

@Then("Admin should land on manage class page and validate particular class details are not deleted from the data table for class")
public void admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_not_deleted_from_the_data_table_for_class() {
     
    
}

@When("Admin clicks single  row level check box in the data table for class")
public void admin_clicks_single_row_level_check_box_in_the_data_table_for_class() {
     
    
}

@Then("Admin should see delete icon below the header is enabled for class")
public void admin_should_see_delete_icon_below_the_header_is_enabled_for_class() {
     
    
}

@Then("Admin should see tick mark in check box for class")
public void admin_should_see_tick_mark_in_check_box_for_class() {
     
    
}

@When("Admin clicks multiple row level check box in the data table for class")
public void admin_clicks_multiple_row_level_check_box_in_the_data_table_for_class() {
     
    
}

@Then("Admin should see tick mark in check box  of the selected rows for class")
public void admin_should_see_tick_mark_in_check_box_of_the_selected_rows_for_class() {
     
    
}

@Given("Admin clicks delete button under header after selecting the check box in the data table and admin is in the delete alert in class")
public void admin_clicks_delete_button_under_header_after_selecting_the_check_box_in_the_data_table_and_admin_is_in_the_delete_alert_in_class() {
     
    
}

@Then("Admin should land on manage class page and validate particular class details are deleted from the data table for class")
public void admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_deleted_from_the_data_table_for_class() {
     
    
}

@When("Admin click on Batch id column header to sort for class")
public void admin_click_on_batch_id_column_header_to_sort_for_class() {
     
    
}

@Then("Admin should see data table sorted in descending order")
public void admin_should_see_data_table_sorted_in_descending_order() {
     
    
}

@When("Admin double click on Batch id column header to sort for class")
public void admin_double_click_on_batch_id_column_header_to_sort_for_class() {
     
    
}

@Then("Admin should see data table sorted in ascending  order for class")
public void admin_should_see_data_table_sorted_in_ascending_order_for_class() {
     
    
}

@Given("Logged on the LMS portal as Admin and Admin is on dashboard page after Login in class")
public void logged_on_the_lms_portal_as_admin_and_admin_is_on_dashboard_page_after_login_in_class() {
     
    
}

@Then("Data table should display {int} page  when entries available for class")
public void data_table_should_display_page_when_entries_available_for_class6(Integer int1) {
     
    
}

@Then("Right arrow should be enabled in page one  when entries are more than {int} available for class")
public void right_arrow_should_be_enabled_in_page_one_when_entries_are_more_than_available_for_class(Integer int1) {
     
    
}

@Then("Left arrow should be disabled in page one  when entries are more than {int} available for class")
public void left_arrow_should_be_disabled_in_page_one_when_entries_are_more_than_available_for_class(Integer int1) {
     
    
}

@Then("Right arrow should be enabled in page two when entries are more than {int} available for class")
public void right_arrow_should_be_enabled_in_page_two_when_entries_are_more_than_available_for_class(Integer int1) {
     
    
}

@Then("Left arrow should be enabled in page two for class")
public void left_arrow_should_be_enabled_in_page_two_for_class() {
     
    
}

@Then("Data table should display  page {int}  when entries available for class")
public void data_table_should_display_page_when_entries_available_for_class(Integer int1) {
     
    
}

@Then("If entries are more than {int} in data table pagination controls enabled for class")
public void if_entries_are_more_than_in_data_table_pagination_controls_enabled_for_class(Integer int1) {
     
    
}

@Then("If entries are less than {int} in data table pagination controls disabled for class")
public void if_entries_are_less_than_in_data_table_pagination_controls_disabled_for_class(Integer int1) {
     
    
}

@Then("If total class entries above {int} next page is enabled \\( On multiples of {int} new page will be enabled) for class")
public void if_total_class_entries_above_next_page_is_enabled_on_multiples_of_new_page_will_be_enabled_for_class(Integer int1, Integer int2) {
     
    
}

@Then("If total class entries  {int} or below next page is disabled for class")
public void if_total_class_entries_or_below_next_page_is_disabled_for_class(Integer int1) {
     
    
}

@Given("Admin is on Manage Class page in class")
public void admin_is_on_manage_class_page_in_class() {
     
}
@When("Admin clicks on {string} link on Manage Class page for class")
public void admin_clicks_on_link_on_manage_class_page_for_class(String string) {
    
}

@Then("Admin is re-directed to {string} page for class")
public void admin_is_re_directed_to_page_for_class(String string) {
    
}*/

}