package com.lmsuiphase2.stepdefinitons;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.lmsuiphase2.apphooks.Hooks;
import com.lmsuiphase2.pageobjects.AttendancePage_PO;
import com.lmsuiphase2.pageobjects.Common_PO;
import com.lmsuiphase2.utilities.CommonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AttendancePage_SD {

	private WebDriver driver;
	public static AttendancePage_PO attendance;
	Common_PO common;
	private static final Logger log= LogManager.getLogger(DashboardPage_SD.class);

	public AttendancePage_SD()
	{
		driver = Hooks.getDriver();
		attendance =  new AttendancePage_PO (driver);
		common = new Common_PO(driver);
	}

	@Given("Admin is on dashboard page after Login Attendance page")
	public void admin_is_on_dashboard_page_after_login_attendance_page() {

		log.info("Admin is on dashboard page after Login");
		assertEquals(CommonUtils.dashbaordUrl, common.getCurrentUrl());

	}

	@When("Admin clicks {string} on the navigation bar Attendance page")
	public void admin_clicks_on_the_navigation_bar_attendance_page(String string) {

		log.info("Admin clicks" + string + " on the navigation bar");
		attendance.attendanceBtnClick();

	}

	@Then("Admin should see the Manage attendance in header Attendance page")
	public void admin_should_see_the_manage_attendance_in_header_attendance_page() {

		log.info("Admin should be redirected to Manage attendance Page");
		assertEquals(attendance.manageAttendanceText, common.getHeader());

	}

	@Then("Admin validates the Maximum navigation time in milliseconds defaults to {int} seconds Attendance page")
	public void admin_validates_the_maximum_navigation_time_in_milliseconds_defaults_to_seconds_attendance_page(Integer int1) {

		log.info("validates the Maximum navigation time in milliseconds defaults to" + int1 + " seconds");
		assertEquals(30, attendance.timeTakenForPageLoad);

	}

	@Then("Admin should get HTTP response >= {int}. Then the link is broken Attendance page")
	public void admin_should_get_http_response_then_the_link_is_broken_attendance_page(Integer responseCode) throws IOException {

		log.info("Admin should get HTTP response >= {int}. Then the link is broken Attendance page");
		assertEquals(responseCode,GreaterEquals(attendance.getHTTPResponseCode()));

	}

	private Integer GreaterEquals(int httpResponseCode) {
		return null;
	}

	@Then("Admin should see LMS -Learning management system  as title Attendance page")
	public void admin_should_see_lms_learning_management_system_as_title_attendance_page() {

		log.info("Admin should see LMS -Learning management system  as title");
		assertEquals(attendance.titleText,common.getLMSTitle());

	}

	@Then("Admin should get Manage attendance header in left side of the page Attendance page")
	public void admin_should_get_manage_attendance_header_in_left_side_of_the_page_attendance_page() {

		log.info("Admin should get Manage attendance header in left side of the page Attendance page");
		assertEquals("left",attendance.manage_AttendancePg_Header.getAttribute("align"));

	}

	@When("Admin clicks {string} button on the navigation bar and get all text from the portal page Attendance page")
	public void admin_clicks_button_on_the_navigation_bar_and_get_all_text_from_the_portal_page_attendance_page(String string) {

		log.info("Admin clicks" + string + " on the navigation bar and get all text from the portal page");
		attendance.attendanceBtnClick();

	}

	@Then("Admin should see correct spelling for the all the fields Attendance page")
	public void admin_should_see_correct_spelling_for_the_all_the_fields_attendance_page() {

		log.info("Admin should see correct spelling for the all the fields in Attendance page");
		assertEquals(attendance.manageAttendanceText, attendance.manage_AttendancePg_Header.getText());
		assertEquals(attendance.classIdText, attendance.classId_ColumnName.getText());
		assertEquals(attendance.studentIdText, attendance.studentId_ColumnName.getText());
		assertEquals(attendance.presentText, attendance.present_ColumnName.getText());

	}

	@Then("Admin should see disabled delete icon below the {string} Attendance page")
	public void admin_should_see_disabled_delete_icon_below_the_attendance_page(String string) {

		log.info("Admin should see disabled delete icon below the Header");
		assertEquals(common.isMultiDeleteButtonEnabled(),true);

	}

	@Then("Admin should see search bar on the attendance page Attendance page")
	public void admin_should_see_search_bar_on_the_attendance_page_attendance_page() {

		log.info("Admin should see search bar on the attendance page");
		assertEquals(common.isSearchBoxVisible(),true);

	}

	@Then("Admin should see +Add New Attendance button on the attendance page")
	public void admin_should_see_add_new_attendance_button_on_the_attendance_page() {

		log.info("Admin should see +Add New Attendance button on the attendance page");
		assertEquals(attendance.isAddNewAttendanceBtnVisible(),true);

	}

	@Then("Admin should see data table on the Manage Attendance Page With following column headers Check box symbol,Class ID, Student Id,Preasent, Edit Delete  Attendance page")
	public void admin_should_see_data_table_on_the_manage_attendance_page_with_following_column_headers_check_box_symbol_class_id_student_id_preasent_edit_delete_attendance_page() {

		log.info("Admin should see data table on the Manage Attendance Page");
		assertEquals(attendance.dataTable.isDisplayed(),true);
		assertEquals(attendance.classId_ColumnName.isDisplayed(),true);
		assertEquals(attendance.studentId_ColumnName.isDisplayed(),true);
		assertEquals(attendance.present_ColumnName.isDisplayed(),true);
		assertEquals(attendance.editdelete_ColumnName.isDisplayed(),true);
		assertEquals(attendance.multiSelect_Checkbox.isDisplayed(),true);

	}

	@Then("Admin should able to Edit Icon in each row of data table only  when entries are available Attendance page")
	public void admin_should_able_to_edit_icon_in_each_row_of_data_table_only_when_entries_are_available_attendance_page() {

		log.info("Admin should able to Edit Icon in each row of data table");
		assertEquals(common.singleEditBtnPresent(),true);
	}

	@Then("Admin validates Edit Icon will not be present in data table Attendance page")
	public void admin_validates_edit_icon_will_not_be_present_in_data_table_attendance_page() {

		log.info("Admin validates Edit Icon will not be present in data table");
		assertEquals(common.singleEditBtnPresent(),false);

	}

	@Then("Admin validates Delete Icon in each row of data table only  when entries are available Attendance page")
	public void admin_validates_delete_icon_in_each_row_of_data_table_only_when_entries_are_available_attendance_page() {

		log.info("Admin validates Delete Icon in each row of data table ");
		assertEquals(common.singleDeleteBtnPresent(),true);

	}

	@Then("Admin cant see delete Icon in data table Attendance page")
	public void admin_cant_see_delete_icon_in_data_table_attendance_page() {

		log.info("Admin cant see delete Icon in data table");
		assertEquals(attendance.isDataTableEmpty(),true);
		assertEquals(common.singleDeleteBtnPresent(),false);

	}

	@Then("Admin should see sort icon near the column headers except for Edit and Delete Attendance page")
	public void admin_should_see_sort_icon_near_the_column_headers_except_for_edit_and_delete_attendance_page() {

		log.info("Admin should see sort icon near the column headers except for Edit and Delete Attendance page");
		assertEquals(attendance.isClassSortIconVisible(),true);
		assertEquals(attendance.isStudentSortIconVisible(),true);
		assertEquals(attendance.isPresentSortIconVisible(),true);

	}

	@Then("Admin should see check box in the all rows  of data table Attendance page")
	public void admin_should_see_check_box_in_the_all_rows_of_data_table_attendance_page() {

		log.info("Admin should see check box in the all rows  of data table");
		assertEquals(common.isCheckboxEnabled(),true);

	}

	@Then("Above the footer Admin should see the text as {string} below the table  Attendance page")
	public void above_the_footer_admin_should_see_the_text_as_below_the_table_attendance_page(String string) {

		log.info("Admin should see the footer text");
		assertEquals(attendance.table_Footer.isDisplayed(),true);
	}

	@Then("Admin should see the pagination controls under the data table Attendance page")
	public void admin_should_see_the_pagination_controls_under_the_data_table_attendance_page() {

		log.info("Admin should see the pagination controls under the data table");
		assertEquals(attendance.pageInfo_Link.isDisplayed(),true); 
		assertEquals(attendance.pageFirst_Link.isDisplayed(),true); 
		assertEquals(attendance.pageLast_Link.isDisplayed(),true); 
		assertEquals(attendance.pageNext_Link.isDisplayed(),true); 
		assertEquals(attendance.pagePrev_Link.isDisplayed(),true); 
		assertEquals(attendance.pageNo.isDisplayed(),true); 

	}

	@Then("Admin should see the text with total number classes in the data table  Attendance page")
	public void admin_should_see_the_text_with_total_number_classes_in_the_data_table_attendance_page() {

		log.info("Admin should see the text with total number classes in the data table ");
		assertEquals(attendance.table_Footer.isDisplayed(),true); 
	}

	@Given("Admin is in manage attendance page")
	public void admin_is_in_manage_attendance_page() {

		log.info("Admin is in manage attendance page ");
		assertEquals(CommonUtils.attendanceUrl, common.getCurrentUrl()); 

	}

	@When("Admin clicks + a new attendance button")
	public void admin_clicks_a_new_attendance_button() {

		log.info("Admin clicks + a new attendance button ");
		attendance.addNewAttendanceBtnClick();

	}

	@Then("Admin should see correct spellings in the label Attendance page")
	public void admin_should_see_correct_spellings_in_the_label_attendance_page() {

		log.info("Admin should see correct spellings in the label");
		assertEquals(attendance.programNameText,attendance.programName_Label.getText());  
		assertEquals(attendance.studentNameText,attendance.studentName_Label.getText());
		assertEquals(attendance.classNameText,attendance.className_Label.getText());
		assertEquals(attendance.attendanceText,attendance.attendance_Label.getText());
		assertEquals(attendance.attendanceDateText,attendance.attendanceDate_Label.getText());
	}

	@Then("Admin should see {int} dropdown is present Attendance page")
	public void admin_should_see_dropdown_is_present_attendance_page(Integer int1) {

		log.info("Admin should see 4 dropdown is present ");
		assertEquals(attendance.programName_DropDown.isDisplayed(),true);  
		assertEquals(attendance.studentName_DropDown.isDisplayed(),true);  
		assertEquals(attendance.className_DropDown.isDisplayed(),true);  
		assertEquals(attendance.attendance_DropDown.isDisplayed(),true);  

	}

	@Then("Admin should see  close button on the attendance details popup window Attendance page")
	public void admin_should_see_close_button_on_the_attendance_details_popup_window_attendance_page() {

		log.info("Admin should see  close button on the attendance details popup window");
		assertEquals(attendance.close_Btn.isDisplayed(),true);  

	}

	@Then("Admin should see Close button should on the top right corner Attendance page")
	public void admin_should_see_close_button_should_on_the_top_right_corner_attendance_page() {

		log.info("Admin should see Close button should on the top right corner");
		assertEquals("right",attendance.close_Btn.getAttribute("align"));  

	}

	@Then("Admin should see First dropdown box {string} text is present  Attendance page")
	public void admin_should_see_first_dropdown_box_text_is_present_attendance_page(String dropDownText) {

		log.info("Admin should see First dropdown box "+dropDownText+" text is present  Attendance page");
		assertEquals(attendance.programName_DropDown.getText(),dropDownText);

	}

	@Then("Admin should see Second dropdown box {string} text is present Attendance page")
	public void admin_should_see_second_dropdown_box_text_is_present_attendance_page(String dropDownText) {

		log.info("Admin should see Second dropdown box "+dropDownText+" text is present  Attendance page");
		assertEquals(attendance.studentName_DropDown.getText(),dropDownText);

	}

	@Then("Admin should see Third dropdown box {string} text is present Attendance page")
	public void admin_should_see_third_dropdown_box_text_is_present_attendance_page(String dropDownText) {

		log.info("Admin should see Third dropdown box "+dropDownText+" text is present  Attendance page");
		assertEquals(attendance.className_DropDown.getText(),dropDownText);


	}

	@Then("Admin should see fourth dropdown box {string} text is present Attendance page")
	public void admin_should_see_fourth_dropdown_box_text_is_present_attendance_page(String dropDownText) {

		log.info("Admin should see fourth dropdown box "+dropDownText+" text is present  Attendance page");
		assertEquals(attendance.attendance_DropDown.getText(),dropDownText);

	}

	@Then("Admin  should text in gray color Attendance page")
	public void admin_should_text_in_gray_color_attendance_page() {

		log.info("Admin  should text in gray color Attendance page");
		assertEquals(attendance.programName_DropDown.getCssValue("color"),"gray");
		assertEquals(attendance.className_DropDown.getCssValue("color"),"gray");
		assertEquals(attendance.studentName_DropDown.getCssValue("color"),"gray");
		assertEquals(attendance.attendance_DropDown.getCssValue("color"),"gray");

	}

	@Then("Admin should see  save button in the attendance detail popup window Attendance page")
	public void admin_should_see_save_button_in_the_class_detail_popup_window_attendance_page() {

		log.info("Admin should see  save button in the attendance detail popup window");
		assertEquals(attendance.save_Btn.isDisplayed(),true);

	}

	@Then("Admin should see  cancel button in the attendance detail popup window Attendance page")
	public void admin_should_see_cancel_button_in_the_class_detail_popup_window_attendance_page() {

		log.info("Admin should see  cancel button in the attendance detail popup window");
		assertEquals(attendance.cancel_Btn.isDisplayed(),true);

	}

	@Given("Admin is in  attendance details popup window Attendance page")
	public void admin_is_in_attendance_details_popup_window_attendance_page1() {

		log.info("Admin is in  attendance details popup window");
		attendance.addNewAttendanceBtnClick();

	}

	@When("Admin clicks program name dropdown Attendance page")
	public void admin_clicks_program_name_dropdown_attendance_page() {

		log.info("Admin clicks program name dropdown");
		attendance.programName_DropDown.click();
		attendance.isProgramNamePresent();

	}

	@Then("Program Name in the drop down should match with  program name in  manage program page table Attendance page")
	public void program_name_in_the_drop_down_should_match_with_program_name_in_manage_program_page_table_attendance_page() {

		log.info("Program Name in the drop down should match with  program name in  manage program table");
		assertEquals(attendance.validProgramName,attendance.programname);

	}

	@When("Admin clicks Attendance dropdown Attendance page")
	public void admin_clicks_Attendance_dropdown_attendance_page() {

		log.info("Admin clicks class name dropdown");
		attendance.className_DropDown.click();
		attendance.isAttendanceKeywordsPresent();
	}

	@When("Admin clicks class name dropdown Attendance page")
	public void admin_clicks_class_name_dropdown_attendance_page() {

		log.info("Admin clicks class name dropdown");
		attendance.className_DropDown.click();
		attendance.isClassNamePresent();
	}

	@Then("Class Name in the drop down should match with  class name in  manage class page table Attendance page")
	public void class_name_in_the_drop_down_should_match_with_class_name_in_manage_class_page_table_attendance_page() {

		log.info("Class Name in the drop down should match with  class name in  manage class page table");
		assertEquals("Selenium",attendance.classname);

	}

	@Then("Attendance field should have keywords such as - present, absent, late, excused Attendance page")
	public void attendance_field_should_have_keywords_such_as_present_absent_late_excused_attendance_page() {

		log.info("Attendance field should have keywords such as - present, absent, late, excused");
		assertEquals("Present",attendance.presentKeyword);
		assertEquals("Absent",attendance.absentKeyword);
		assertEquals("Late",attendance.lateKeyword);
		assertEquals("Excused",attendance.excusedKeyword);

	}

	@Then("Admin should see correct spellings in dropdown text Attendance page")
	public void admin_should_see_correct_spellings_in_dropdown_text_attendance_page() {

		log.info("Admin should see correct spellings in dropdown text");
		assertEquals("Present",attendance.presentKeyword);
		assertEquals("Absent",attendance.absentKeyword);
		assertEquals("Late",attendance.lateKeyword);
		assertEquals("Excused",attendance.excusedKeyword);

	}
	@When("Admin fills all the values from sheet {string} and {int} and click save Attendance page")
	public void admin_fills_all_the_values_from_sheet_and_and_click_save_attendance_page(String sheetName, Integer rowNo) throws IOException {

		log.info("Admin fills all the values from sheet");
		attendance.ExcelReader(sheetName, rowNo);
	}

	@Then("Admin should see success message in popup window and sees new attendance details in manage attendance details DB Attendance page")
	public void admin_should_see_success_message_in_popup_window_and_sees_new_attendance_details_in_manage_attendance_details_db_attendance_page() {

		log.info("Validate Success message");
		assertEquals( "Attendance Added",attendance.getSuccessMessage());
	}

	@When("Admin fills invalid values from sheet {string} and {int}  and click save Attendance page")
	public void admin_fills_invalid_values_from_sheet_and_and_click_save_attendance_page(String sheetName, Integer rowNo) throws IOException {

		log.info("Admin fills invalid values from sheet");
		attendance.ExcelReader(sheetName, rowNo);

	}

	@Then("Admin should see the {string} Attendance page")
	public void admin_should_see_the_attendance_page(String Error) {

		log.info("Admin should see the "+Error+" error message");
		assertEquals( Error,attendance.getErrorMessage());
		attendance.cancel_Btn.click();

	}

	@Then("Admin should see success message in popup window and sees new attendance details in manage attendance details DB")
	public void admin_should_see_success_message_in_popup_window_and_sees_new_attendance_details_in_manage_attendance_details_db() {

		log.info("Validate Success message");
		assertEquals( "Attendance Updated",attendance.getSuccessMessage());

	}

	@Given("Admin is in attendance details popup window Attendance page")
	public void admin_is_in_attendance_details_popup_window_attendance_page() {


	}

	@Given("Admin is in manage attendance page Attendance page")
	public void admin_is_in_manage_attendance_page_attendance_page() {

		log.info("Admin is in manage attendance page ");
		assertEquals(CommonUtils.attendanceUrl, common.getCurrentUrl()); 
	}

	@When("Admin clicks delete button in data table row level Attendance page")
	public void admin_clicks_delete_button_in_data_table_row_level_attendance_page() {

		log.info("Admin clicks delete button in data table row level Attendance page");
		attendance.singleDeleteBtnClick();
	}

	@Then("Admin should see alert Attendance page")
	public void admin_should_see_alert_attendance_page() {

		log.info("Admin should see alert Attendance page");
		assertEquals(common.isAlertPresent(),true);
	}

	@Then("Alert should have {string} button to accept Attendance page")
	public void alert_should_have_button_to_accept_attendance_page(String string) {

		log.info("Alert should have "+string+" button to accept Attendance page");
		assertEquals(attendance.isYesBtnInAlertPresent(),true);

	}

	@Then("Alert should have {string} button to reject Attendance page")
	public void alert_should_have_button_to_reject_attendance_page(String string) {

		log.info("Alert should have "+string+" button to reject Attendance page");
		assertEquals(attendance.isNoBtnInAlertPresent(),true);

	}

	@Given("Admin is in delete alert Attendance page")
	public void admin_is_in_delete_alert_attendance_page() {

		log.info("Admin is in delete alert Attendance page");
		attendance.singleDeleteBtnClick();
	}

	@Given("Admin is in delete alert for multidelete Attendance page")
	public void admin_is_in_delete_alert_for_mutlidelete_attendance_page() {

		log.info("Admin is in delete alert for multidelete");
		attendance.selectCheckBoxInRow();
		common.multiDeleteButtonClick();

	}

	@Given("Admin is in delete alert for multidelete for multicheckbox Attendance page")
	public void admin_is_in_delete_alert_for_mutlidelete_for_mutlicheckbox_attendance_page() {

		log.info("Admin is in delete alert for multidelete for multicheckbox");
		common.selectMultipleCheckBox();
		common.multiDeleteButtonClick();

	}

	@When("Admin clicks yes button Attendance page")
	public void admin_clicks_yes_button_attendance_page() {

		log.info("Admin clicks yes button ");
		attendance.acceptAlert();
	}

	@Then("Validate Success message and selected attendance details are deleted from the data table Attendance page")
	public void validate_success_message_and_selected_attendance_details_are_deleted_from_the_data_table_attendance_page() {

		log.info("Validate Success message");
		assertEquals( "Record Deleted",attendance.getSuccessMessage());

	}

	@When("Admin clicks no button Attendance page")
	public void admin_clicks_no_button_attendance_page() {

		log.info("Admin clicks no button ");
		attendance.dismissAlert();
	}

	@Then("User should get Redirected attendance page and selected attendance details are not deleted from the data table Attendance page")
	public void user_should_get_redirected_attendance_page_and_selected_attendance_details_are_not_deleted_from_the_data_table_attendance_page() {

		log.info("User should get Redirected manage attendance page");
		assertEquals(CommonUtils.attendanceUrl, common.getCurrentUrl());
	}

	@When("Admin clicks single  row level check box in the data table Attendance page")
	public void admin_clicks_single_row_level_check_box_in_the_data_table_attendance_page() {

		log.info("Admin clicks single  row level check box in the data table Attendance page");
		attendance.selectCheckBoxInRow();

	}

	@Then("Admin should see delete icon below the header is enabled Attendance page")
	public void admin_should_see_delete_icon_below_the_header_is_enabled_attendance_page() {

		log.info("Admin should see delete icon below the header is enabled");
		assertEquals(common.isMultiDeleteButtonEnabled(),true);
		attendance.attendanceBtnClick();
	}

	@Then("Admin should see tick mark in check box Attendance page")
	public void admin_should_see_tick_mark_in_check_box_attendance_page() {

		log.info("Admin should see tick mark in check box");
		assertEquals(common.isAllCheckBoxSelected(),true);
		attendance.attendanceBtnClick();
	}

	@When("Admin clicks multiple row level check box in the data table Attendance page")
	public void admin_clicks_multiple_row_level_check_box_in_the_data_table_attendance_page() {

		log.info("Admin clicks multiple row level check box in the data table");
		common.selectMultipleCheckBox();

	}

	@Then("Admin should see tick mark in check box  of the selected rows Attendance page")
	public void admin_should_see_tick_mark_in_check_box_of_the_selected_rows_attendance_page() {

		log.info("Admin should see tick mark in check box  of the selected rows");
		assertEquals(common.isAllCheckBoxSelected(),true);
		attendance.attendanceBtnClick();

	}

	@Then("Admin should get Success message and selected attendance detail are deleted from the data table Attendance page")
	public void admin_should_get_success_message_and_selected_attendance_detail_are_deleted_from_the_data_table_attendance_page() {

		log.info("Validate Success message");
		assertEquals( "Record Deleted",attendance.getSuccessMessage());

	}

	@Then("Admin should get Redirected to attendance page and selected attendance details are not deleted from the data table Attendance page")
	public void admin_should_get_redirected_to_attendance_page_and_selected_attendance_details_are_not_deleted_from_the_data_table_attendance_page() {

		log.info("User should get Redirected manage attendance page");
		assertEquals(CommonUtils.attendanceUrl, common.getCurrentUrl());

	}

	@Then("Admin should get Success message and validate particular attendance details are deleted from the data table Attendance page")
	public void admin_should_get_success_message_and_validate_particular_attendance_details_are_deleted_from_the_data_table_attendance_page() {

		log.info("Validate Success message");
		assertEquals( "Record Deleted",attendance.getSuccessMessage());
	}

	@When("Admin clicks {string} button on the navigation bar Attendance page")
	public void admin_clicks_button_on_the_navigation_bar_attendance_page(String string) {

		log.info("Admin clicks " + string + " button in the navigation bar Attendance page");
		common.navigationClick(string);
	}

	@Then("Data table should display {int} page  when entries available Attendance page")
	public void data_table_should_display_page_when_entries_available_attendance_page1(Integer page) {

		log.info("Data table should display "+page+" page  when entries available");
		assertEquals(1,attendance.pageNo.getText());
	}

	@Then("Right arrow should be enabled in page one  when entries are more than {int} available Attendance page")
	public void right_arrow_should_be_enabled_in_page_one_when_entries_are_more_than_available_attendance_page(Integer page) {

		log.info("Right arrow should be enabled in page one  when entries are more than "+page+" available");
		assertEquals(GreaterThan(1),attendance.pageNo.getText());
		assertEquals(attendance.pageNext_Link.isEnabled(),true);
		assertEquals(attendance.pageLast_Link.isEnabled(),true);
	}

	private String GreaterThan(int i) {
		return null;
	}

	@Then("Left arrow should be disabled in page one  when entries are more than {int} available Attendance page")
	public void left_arrow_should_be_disabled_in_page_one_when_entries_are_more_than_available_attendance_page(Integer page) {

		log.info("Left arrow should be disabled in page one  when entries are more than "+page+" available");
		assertEquals(GreaterThan(1),attendance.pageNo.getText());
		assertEquals(attendance.pageFirst_Link.isEnabled(),false);
		assertEquals(attendance.pagePrev_Link.isEnabled(),false);
	}

	@Then("Right arrow should be enabled in page two when entries are more than {int} available Attendance page")
	public void right_arrow_should_be_enabled_in_page_two_when_entries_are_more_than_available_attendance_page(Integer page) {

		log.info("Right arrow should be enabled in page two when entries are more than "+page+" available");
		assertEquals(GreaterThan(10),attendance.entryZ.getText());
		assertEquals(attendance.pageNext_Link.isEnabled(),true);
		assertEquals(attendance.pageLast_Link.isEnabled(),true);

	}

	@Then("Left arrow should be enabled in page two  Attendance page")
	public void left_arrow_should_be_enabled_in_page_two_attendance_page() {

		log.info("Left arrow should be enabled in page two");
		assertEquals(2,attendance.pageNo.getText());
		assertEquals(attendance.pageFirst_Link.isEnabled(),true);
		assertEquals(attendance.pagePrev_Link.isEnabled(),true);

	}

	@Then("Data table should display  page {int}  when entries available Attendance page")
	public void data_table_should_display_page_when_entries_available_attendance_page(Integer page) {

		log.info("Data table should display  page "+page+"  when entries available ");
		assertEquals(2,attendance.pageNo.getText());
		assertEquals(LessThan(10),attendance.entryZ.getText());
		assertEquals(attendance.pageNext_Link.isDisplayed(),false);
		assertEquals(attendance.pageLast_Link.isDisplayed(),false);
	}

	private String LessThan(int i) {
		return null;
	}

	@Then("When entries are more than {int} in data table pagination controls enabled Attendance page")
	public void when_entries_are_more_than_in_data_table_pagination_controls_enabled_attendance_page(Integer page) {

		log.info("When entries are more than "+page+" in data table pagination controls enabled");
		assertEquals(GreaterThan(5),attendance.entryZ.getText());
		assertEquals(2,attendance.pageNo.getText());
		assertEquals(attendance.pageFirst_Link.isEnabled(),true);
		assertEquals(attendance.pagePrev_Link.isEnabled(),true);
		assertEquals(attendance.pageNext_Link.isEnabled(),true);
		assertEquals(attendance.pageLast_Link.isEnabled(),true);
	}

	@Then("When entries are less than {int} in data table pagination controls disabled Attendance page")
	public void when_entries_are_less_than_in_data_table_pagination_controls_disabled_attendance_page(Integer page) {

		log.info("When entries are less than "+page+" in data table pagination controls disabled");
		assertEquals(LessThan(5),attendance.entryZ.getText());
		assertEquals(1,attendance.pageNo.getText());
		assertEquals(attendance.pageFirst_Link.isEnabled(),false);
		assertEquals(attendance.pagePrev_Link.isEnabled(),false);
		assertEquals(attendance.pageNext_Link.isEnabled(),false);
		assertEquals(attendance.pageLast_Link.isEnabled(),false);
	}

	@Given("Admin is in add attendance details popup window Attendance page")
	public void admin_is_in_add_attendance_details_popup_window_attendance_page() {


	}

	@When("Admin creates 6 new attendance sheet {string} and {int} and click save Attendance page")
	public void admin_creates_new_attendance_attendance_page22(String sheetName, Integer rowNo) throws IOException {

		log.info("Admin creates 6 new attendance  from sheet");
		attendance.ExcelReader(sheetName, rowNo);

	}

	@Then("When total attendance entries above {int} next page is enabled  On multiples of {int} new page will be enabled  Attendance page")
	public void when_total_attendance_entries_above_next_page_is_enabled_on_multiples_of_new_page_will_be_enabled_attendance_page(Integer entries, Integer page) {

		log.info("When total attendance entries above "+entries+" next page is enabled");
		assertEquals(GreaterThan(5), attendance.entryZ.getText());
		assertEquals(attendance.pageNext_Link.isEnabled(),true);
		assertEquals(attendance.pageLast_Link.isEnabled(),true);

	}

	@When("Admin creates 4 new attendance sheet {string} and {int} and click save Attendance page")
	public void admin_creates_new_attendance_attendance_page33(String sheetName, Integer rowNo) throws IOException {

		log.info("Admin creates 4 new attendance  from sheet");
		attendance.ExcelReader(sheetName, rowNo);
	}

	@Then("Validates total attendance entries  {int} or below next page is disabled Attendance page")
	public void validates_total_attendance_entries_or_below_next_page_is_disabled_attendance_page(Integer entries) {

		log.info("Validates total attendance entries  "+entries+" or below next page is disabled");
		assertEquals(LessThan(5), attendance.entryZ.getText());
		assertEquals(attendance.pageNext_Link.isEnabled(),false);
		assertEquals(attendance.pageLast_Link.isEnabled(),false);
	}

	@When("Admin clicks {string} button in the navigation bar Attendance page")
	public void admin_clicks_button_in_the_navigation_bar_attendance_page(String string) {

		log.info("Admin clicks " + string + " button in the navigation bar Attendance page");
		common.navigationClick(string);

	}

	@Then("Admin should able to land on student page Attendance page")
	public void admin_should_able_to_land_on_student_page_attendance_page() {

		log.info("Admin should able to land on student page");
		assertEquals(CommonUtils.studentUrl, common.getCurrentUrl()); 
		attendance.attendanceBtnClick();
	}

	@Then("Admin should able to land on program page Attendance page")
	public void admin_should_able_to_land_on_program_page_attendance_page() {

		log.info("Admin should able to land on program page");
		assertEquals(CommonUtils.programUrl, common.getCurrentUrl()); 
		attendance.attendanceBtnClick();

	}

	@Then("Admin should able to land on batch page Attendance page")
	public void admin_should_able_to_land_on_batch_page_attendance_page() {

		log.info("Admin should able to land on batch page");
		assertEquals(CommonUtils.batchUrl, common.getCurrentUrl()); 
		attendance.attendanceBtnClick();

	}

	@Then("Admin should able to land on user page Attendance page")
	public void admin_should_able_to_land_on_user_page_attendance_page() {

		log.info("Admin should able to land on user page");
		assertEquals(CommonUtils.userUrl, common.getCurrentUrl()); 
		attendance.attendanceBtnClick();

	}

	@Then("AAdmin should able to land on Assignment page Attendance page")
	public void a_admin_should_able_to_land_on_assignment_page_attendance_page() {

		log.info("Admin should able to land on Assignment page");
		assertEquals(CommonUtils.assignmentUrl, common.getCurrentUrl()); 
		attendance.attendanceBtnClick();

	}

	@Then("Admin should able to land on class page Attendance page")
	public void admin_should_able_to_land_on_class_page_attendance_page() {

		log.info("Admin should able to land on class page");
		assertEquals(CommonUtils.classUrl, common.getCurrentUrl()); 
		attendance.attendanceBtnClick();

	}

	@Then("Admin should able to land on login page Attendance page")
	public void admin_should_able_to_land_on_login_page_attendance_page() {

		log.info("Admin should able to land on login page");
		assertEquals(CommonUtils.loginUrl, common.getCurrentUrl()); 


	}



}
