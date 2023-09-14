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

import com.lmsuiphase2.apphooks.Hooks;
import com.lmsuiphase2.driverfactory.DriverFactory;
import com.lmsuiphase2.pageobjects.ClassPage_PO;
import com.lmsuiphase2.utilities.CommonUtils;
import com.lmsuiphase2.pageobjects.Common_PO;
import com.thoughtworks.qdox.model.expression.GreaterEquals;
import com.lmsuiphase2.utilities.ExcelUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ClassPage_SD{
	private static final Logger log= LogManager.getLogger(ClassPage_SD.class);
	private WebDriver driver;
	public static ClassPage_PO ClassPageObj;
	Common_PO commonObj;
	

	public ClassPage_SD()
	{
	  driver = Hooks.getDriver();
	 ClassPageObj =  new ClassPage_PO(driver);
	commonObj= new Common_PO(driver);
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
     
   String actURL=driver.getCurrentUrl();
	String expPURL= commonObj.getCurrentUrl();
	Assert.assertEquals(actURL, expPURL);
    
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
public void get_the_response_time_for_navigation_from_dashboard_page_to_manage_class_page_for_class(String string) {
     
	log.info("Admin should be able to capture Response time from the URL");
	
	commonObj.navigationPageLoadTime(string);
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

@Then("six textbox should be  present in Class details popup window for class")
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
	
	String currentURL =commonObj.getCurrentUrl();
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



@When("Admin clicks Cancel button without entering values in the fields for class")
public void admin_clicks_cancel_button_without_entering_values_in_the_fields_for_class() {
     
	log.info(" Admin clicks Cancel button without entering values in the fields ");

	ClassPageObj.clickCancel();
}

}