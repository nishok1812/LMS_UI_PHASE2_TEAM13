package com.lmsuiphase2.stepdefinitons;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.lmsuiphase2.apphooks.Hooks;
import com.lmsuiphase2.pageobjects.DashboardPage_PO;
import com.lmsuiphase2.utilities.CommonUtils;
import com.lmsuiphase2.pageobjects.BatchPage_PO;

public class BatchPage_SD {

	BatchPage_PO BatchPO;
	DashboardPage_PO DashboardPO;
	private WebDriver driver;

	String dashbaordUrl = CommonUtils.dashbaordUrl;

	public BatchPage_SD() {
		driver = Hooks.getDriver();
		BatchPO = new BatchPage_PO(driver);
	}

	@Given("Admin is on dashboard page after Login in LMS portal")
	public void admin_is_on_dashboard_page_after_login_in_lms_portal() {
		driver.get(dashbaordUrl);
	}

	@When("Admin clicks {string} from navigation bar")
	public void admin_clicks_from_navigation_bar(String string) {
		BatchPO.clickonBatchTab();
	}

	@Then("Admin should see the {string} in the URL")
	public void admin_should_see_the_in_the_url() {
		BatchPO.batchTitle();
	}

	@Then("Admin should see the {string} in the header")
	public void admin_should_see_the_in_the_header(String string) {
		BatchPO.getBatchHeader();
	}

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
		BatchPO.getBatchPaginatorText();
	}

	@Then("Admin Should see the data table with headers Batch name, Batch Description,Batch Status, No of classes, Program Name, Edit\\/Delete")
	public void admin_should_see_the_data_table_with_headers_batch_name_batch_description_batch_status_no_of_classes_program_name_edit_delete() {

		Assert.assertTrue(true);
	}

	@Then("Admin should be able to see the {string} icon button that is disabled")
	public void admin_should_be_able_to_see_the_icon_button_that_is_disabled(String string) {
		BatchPO.verifyDeleteButton();
	}

	@Then("Admin should be able to see the {string} button")
	public void admin_should_be_able_to_see_the_button(String string) {
		BatchPO.clickAddNewBatch();
	}

	@Then("Each row in the data table should have a edit icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled() {
		BatchPO.areEditButtonsVisibleinechRow();
	}

	@Then("Each row in the data table should have a delete icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled() {
		BatchPO.isDeleteOnTopEnabled();
	}

	@Then("A new pop up with Batch details appears")
	public void a_new_pop_up_with_batch_details_appears() {
		BatchPO.isBatchDetailsPopupVisible();
	}

	@Given("A new pop up with Batch details appears Before Admin is on dashboard page after Login admin clicks \"\"Batch\"\" from navigation bar admin clicks {string}+ A New Batch\"\" button")
	public void a_new_pop_up_with_batch_details_appears_before_admin_is_on_dashboard_page_after_login_admin_clicks_batch_from_navigation_bar_admin_clicks_a_new_batch_button(
			String string) {
		BatchPO.isBatchDetailsPopupVisible();
	}

	@Then("The pop up should include the fields Name, Number of classes and Description as text box, Program Name as drop down, Status as radio button Number of classes as text box")
	public void the_pop_up_should_include_the_fields_name_number_of_classes_and_description_as_text_box_program_name_as_drop_down_status_as_radio_button_number_of_classes_as_text_box() {
		BatchPO.isBatchDetailsPopupVisible();
	}

	@When("Fill in all the fields except description with valid values from {string} and {string} and click save")
	public void fill_in_all_the_fields_except_description_with_valid_values_from_and_and_click_save(String sheetName,
			Integer rowNo) throws IOException {
		BatchPO.ExcelReader(sheetName, rowNo);
	}

	@When("Fill in all the fields with valid values from {string} and {string} and click save")
	public void fill_in_all_the_fields_with_valid_values_from_and_and_click_save(String sheetName, Integer rowNo)
			throws IOException {
		BatchPO.ExcelReader(sheetName, rowNo);
	}

	@When("Any of the fields have invalid values from {string} and {int}")
	public void any_of_the_fields_have_invalid_values_from_and(String sheetName, Integer rowNo) throws IOException {
		BatchPO.ExcelReader(sheetName, rowNo);
	}

	@Then("Error message should appear")
	public void error_message_should_appear() {
		BatchPO.getErrorMsgText();
	}

	@When("Any of the mandatory fields are blank from {string} and {string}")
	public void any_of_the_mandatory_fields_are_blank_from_and(String sheetName, Integer rowNo) throws IOException {
		BatchPO.ExcelReader(sheetName, rowNo);
	}

	@Given("The delete icon on row level in data table is enabled before admin is on dashboard page after Login admin clicks {string} from navigation bar")
	public void the_delete_icon_on_row_level_in_data_table_is_enabled_before_admin_is_on_dashboard_page_after_login_admin_clicks_from_navigation_bar(
			String string) {
		BatchPO.areDeleteButtonsVisibleinEachRow();
	}

	@When("Admin clicks the delete icon")
	public void admin_clicks_the_delete_icon() {
		BatchPO.isDeleteBtnPresent();
	}

	@Then("Alert appears with <yes> and <No> option")
	public void alert_appears_with_yes_and_no_option() {
		BatchPO.confirmAlert();
	}

	@Given("Admin clicks the delete icon before admin is on dashboard page after Login admin clicks {string} from navigation bar")
	public void admin_clicks_the_delete_icon_before_admin_is_on_dashboard_page_after_login_admin_clicks_from_navigation_bar(
			String string) {
		BatchPO.clickDeleteButtonTop();
	}

	@When("You click <yes> option")
	public void you_click_yes_option() {
		BatchPO.confirmAlert();
	}

	@Then("Batch deleted alert pops and batch is no more available in data table")
	public void batch_deleted_alert_pops_and_batch_is_no_more_available_in_data_table() {
		BatchPO.dismissAlert();
	}

	@Given("None of the checkboxes in data table are selected before admin is on dashboard page after Login admin clicks \"\"Batch\"\" from navigation bar")
	public void none_of_the_checkboxes_in_data_table_are_selected_before_admin_is_on_dashboard_page_after_login_admin_clicks_batch_from_navigation_bar() {
		BatchPO.isCheckboxEnabled();
	}

	@Then("The delete icon under the {string} header should be disabled")
	public void the_delete_icon_under_the_header_should_be_disabled(String string) {
		BatchPO.isDeleteOnTopEnabled();
	}

	@Given("One of the checkbox\\/ row is selected before admin is on dashboard page after Login admin clicks \"\"Batch\"\" from navigation bar")
	public void one_of_the_checkbox_row_is_selected_before_admin_is_on_dashboard_page_after_login_admin_clicks_batch_from_navigation_bar() {
		BatchPO.isSingleCheckbox();
	}

	@When("Click <delete> icon below {string} header")
	public void click_delete_icon_below_header(String string) {
		BatchPO.clickDeleteButtonTop();
	}

	@Then("Click {string} and The respective row in the data table is deleted")
	public void the_respective_row_in_the_data_table_is_deleted(String string) {
		BatchPO.confirmDelete(string);
	}

	@Given("The edit icon on row level in data table is enabled before admin is on dashboard page after Login admin clicks \"\"Batch\"\" from navigation bar")
	public void the_edit_icon_on_row_level_in_data_table_is_enabled_before_admin_is_on_dashboard_page_after_login_admin_clicks_batch_from_navigation_bar() {
		BatchPO.areEditButtonsVisibleinechRow();
	}

	@When("Admin clicks the <edit> icon")
	public void admin_clicks_the_edit_icon() {
		BatchPO.verifyEditButton();
	}

	@When("Update the fields with valid values from {string} and {int} and click save")
	public void update_the_fields_with_valid_values_from_and_and_click_save(String sheetName, Integer rowNo)
			throws IOException {
		BatchPO.ExcelReader(sheetName, rowNo);
	}

	@Then("The updated batch details should appear on the data table")
	public void the_updated_batch_details_should_appear_on_the_data_table() {
		BatchPO.clickonBatchTab();
	}

	@When("Update the fields with invalid values from {string} and {int} and click save")
	public void update_the_fields_with_invalid_values_from_and_and_click_save(String sheetName, Integer rowNo)
			throws IOException {
		BatchPO.ExcelReader(sheetName, rowNo);
	}

	@When("Erase data from mandatory field from {string} and {string}")
	public void erase_data_from_mandatory_field_from_and(String string, String string2) {
		BatchPO.manditoryFieldErased(string2);
	}

	@When("Erase data from description field from {string} and {int}")
	public void erase_data_from_description_field_from_and(String sheetName, Integer rowNo) throws IOException {
		BatchPO.ExcelReader(sheetName, rowNo);

	}

}
