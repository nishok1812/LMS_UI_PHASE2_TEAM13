package com.lmsuiphase2.stepdefinitons;
//import static org.junit.Assert.assertEquals;

//import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.lmsuiphase2.apphooks.Hooks;
import com.lmsuiphase2.pageobjects.Common_PO;
//import com.lmsuiphase2.pageobjects.DashboardPage_PO;
import com.lmsuiphase2.pageobjects.StudentPage_PO;
//import com.lmsuiphase2.pageobjects.StudentPage_SD;
//import com.lmsuiphase2.utilities.CommonUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StudentPage_SD {

private static final Logger log= LogManager.getLogger(StudentPage_SD.class);
	private WebDriver driver;
	public static StudentPage_PO sd;
	public static Common_PO cmpo;
	//commonObj= new Common_PO(driver);

	public StudentPage_SD()
	{
	  driver = Hooks.getDriver();
	 sd =  new StudentPage_PO(driver);
	 cmpo = new Common_PO();
	}

	
	@Given("Admin is on dashboard page after Login Student")
	public void admin_is_on_dashboard_page_after_login_student() {
		driver.get(StudentPage_PO.DashboardPageUrl);
	}

	@When("Admin clicks {string} on the navigation bar")
	public void admin_clicks_on_the_navigation_bar(String string) {
		sd.clickStudentLink();
	}

	@Then("Admin should see the Student details Page Title")
	public void admin_should_see_the_student_details_page_title() {
		String Studentheader=Common_PO.getHeader();
		
		String ExpectedHeader = sd.expectedUrl;
		Assert.assertEquals(Studentheader, ExpectedHeader);
	}

	@Then("Maximum navigation time in milliseconds, defaults to {int} seconds on student page")
	public void maximum_navigation_time_in_milliseconds_defaults_to_seconds_on_student_page(Integer int1) {
	  //  int Nav_time = cmpo.navigationPageLoadTime(1);
	    //Assert.assertEquals(Nav_time,3 );
	}

	@Then("HTTP response >= {int} then link is broken on student page")
	public void http_response_then_link_is_broken_on_student_page(Integer int1) {
	 sd.StudentBrokenLinksValidation();
	}

	@Then("Admin should see LMS -Learning management system as title on student page")
	public void admin_should_see_lms_learning_management_system_as_title_on_student_page() {
		String actURL=driver.getCurrentUrl();
		   String expPURL= "";
		   Assert.assertEquals(actURL, expPURL); 
	}

	@Then("Student Detail title should be in centre of the page")
	public void student_detail_title_should_be_in_centre_of_the_page() {
	   
	}

	@Then("{int} dropdowns should be present in the page on student page")
	public void dropdowns_should_be_present_in_the_page_on_student_page(Integer int1) {
		sd.isDropdownDisplayed();
	//  Boolean Pagedrop = sd.findDropdownElement();
	  
	//  assertEquals(false, Pagedrop);
	}

	@Then("Admin should see search box inside the drop down on student page")
	public void admin_should_see_search_box_inside_the_drop_down_on_student_page() {

	
	sd.SearchboxStudentName();
	}

	@Then("Admin should see search box inside batch id drop down on student page")
	public void admin_should_see_search_box_inside_batch_id_drop_down_on_student_page() {
    
		sd.SearchboxBatchId();
	}

	//@Then("Admin should see correct spelling select student name on student page")
	//public void admin_should_see_correct spelling_select_student_name_on_student_page() {
	  // sd.StudentvalidateTextSpellingAndSpacing(null);
	//}

	@Then("Admin should see correct spelling select batch id text on student page")
	public void admin_should_see_correct_spelling_select_batch_id_text_on_student_page() {
	  //sd.StudentvalidateTextSpellingAndSpacing(null) ;
	}

	@Then("Admin should see only numbers inside batch id drop down on student page")
	public void admin_should_see_only_numbers_inside_batch_id_drop_down_on_student_page() {
	    sd.BatchiddropDownNo();
	}

	@Then("Admin should see select student name in gray color on student page")
	public void admin_should_see_select_student_name_in_gray_color_on_student_page() {
	
		sd.verifyColorStudent();
	}

	@Then("Admin should see select batch ID in gray color on student page")
	public void admin_should_see_select_batch_id_in_gray_color_on_student_page() {
		//Assert.assertEquals(colorCode, expectedColorCode);
		sd.verifyColorBatch();
	}

	@Then("Admin should see select student name in first on student page")
	public void admin_should_see_select_student_name_in_first_on_student_page() {
	   //sd.spellcheck_student();
	 //  Assert.assertEquals(retirveValue,StudentName);
		sd.studentDropDownLabel();
	}

	@Then("Admin should see select batch id in second on student page")
	public void admin_should_see_select_batch_id_in_second_on_student_page() {
	   sd.batchidDropDownLabel();
	}

	@Then("Admin should able to scroll down to select the name on student page")
	public void admin_should_able_to_scroll_down_to_select_the_name_on_student_page() {
	   sd.DropdownscrollDownStudent();
	}

	@Then("Admin should able to scroll down to select the batch id on student page")
	public void admin_should_able_to_scroll_down_to_select_the_batch_id_on_student_page() {
	   sd.DropdownscrollDownbatchId();
	}

	@Given("Admin is on student details page Student")
	public void admin_is_on_student_details_page_student() {
	//	dashboard.clickOnStudentTab();
		sd.clickStudentLink();
	}

	@When("Admin select student name from the drop down")
	public void admin_select_student_name_from_the_drop_down() {
	    sd. SelectStudentName();
	}

	@Then("Admin shouldnot see select student name text")
	public void admin_shouldnot_see_select_student_name_text()
		
	{
		
	}

	@Given("Admin is on student details page")
	public void admin_is_on_student_details_page() {
		//dashboard.clickOnStudentTab();
		sd.clickStudentLink();
	}

	@When("Admin select batch id from the drop down")
	public void admin_select_batch_id_from_the_drop_down() {
	  sd.SelectBatchId();
	}

	@Then("Admin should not see select batch id text")
	public void admin_should_not_see_select_batch_id_text() {
	  
	}

	@When("Admin clicks select student name and enters {string} and {string}  alphabet in the search box")
	public void admin_clicks_select_student_name_and_enters_and_alphabet_in_the_search_box(String string, String string2) {
	  // sd.Alphabetinsearch();
	}

	@Then("Admin should see student name start with {string} and {string}  is listed below")
	public void admin_should_see_student_name_start_with_and_is_listed_below(String string, String string2) {
	   //sd.RetriveName();
	  // Assert.assertEquals(SelectStudentName,retiveValue );
	}

	@When("Admin clicks select batch id and enter {string} and {string} number in the search box")
	public void admin_clicks_select_batch_id_and_enter_and_number_in_the_search_box(String string, String string2) {
	//  sd.RetriveID();
	 
	}

	//@Then("Admin should see batch id start with {string} and {string} is listed below")
	//{
		//sd.RetriveID();
	//	 Assert.assertEquals(SelectbatchId,retiveValue );
	//}

	@When("Admin selects only student name  {string} and {string}")
	public void admin_selects_only_student_name_and(String string, String string2) {
	   // sd.OnlyStudentName();
	}

	@Then("Student details should not be displayed")
	public void student_details_should_not_be_displayed() {
		// Assert.assertEquals(SelectStudentName,0 );
	}

	@When("Admin selects only batch id {string} and {string}")
	public void admin_selects_only_batch_id_and(String string, String string2) {
		 //sd.OnlyBatchID();
	}

	@Then("Student details shouldn't be displayed")
	public void student_details_shouldn_t_be_displayed() {
		 //Assert.assertEquals(SelectbatchId,0 );
	}

	@When("Admin selects student name and batch id {string} and {string}")
	public void admin_selects_student_name_and_batch_id_and(String string, String string2) {
	    //sd.BothNameID();
	    
	}

	@Then("Particular student informations should be display")
	public void particular_student_informations_should_be_display() {
		cmpo.navigationClick("Student");
	}

	@When("Admin clicks on program link on student page")
	public void admin_clicks_on_program_link_on_student_page() {
		cmpo.navigationClick("Program");
	}

	
	

	@When("Admin clicks on Batch link on student page")
	public void admin_clicks_on_batch_link_on_student_page() {
		cmpo.navigationClick("Batch");
	}

	@Then("Admin is redirected to Batch page")
	public void admin_is_redirected_to_batch_page() {
	  
	}

	@When("Admin clicks on Class link on student page")
	public void admin_clicks_on_class_link_on_student_page() {
		cmpo.navigationClick("Class");
	}

	@Then("Admin is redirected to Class page")
	public void admin_is_redirected_to_class_page() {
	   
	}

	@When("Admin clicks on User link on student page")
	public void admin_clicks_on_user_link_on_student_page() {
		cmpo.navigationClick("User"); 
	}

	@Then("Admin is redirected to User page")
	public void admin_is_redirected_to_user_page() {
	   
	}

	@When("Admin clicks on Assignment link on student page")
	public void admin_clicks_on_assignment_link_on_student_page() {
		cmpo.navigationClick("Assignment");
	}

	@Then("Admin is redirected to Assignment page")
	public void admin_is_redirected_to_assignment_page() {
	  
	}

	@When("Admin clicks on Attendance link on student page")
	public void admin_clicks_on_attendance_link_on_student_page() {
		cmpo.navigationClick("Attendance");
	}

	@Then("Admin is redirected to Attendance page")
	public void admin_is_redirected_to_attendance_page() {
		sd.clickStudentLink();
	}

	@When("Admin clicks on Logout link on student page")
	public void admin_clicks_on_logout_link_on_student_page() {
		cmpo.navigationClick("Logout");
	}

	@Then("Admin is redirected to Login page")
	public void admin_is_redirected_to_login_page() {
	   
	}

}
