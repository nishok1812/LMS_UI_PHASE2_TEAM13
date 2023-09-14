package com.lmsuiphase2.stepdefinitons;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.lmsuiphase2.apphooks.Hooks;
import com.lmsuiphase2.pageobjects.LoginPage_PO;
import com.lmsuiphase2.pageobjects.DashboardPage_PO;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage_SD {

	private WebDriver driver;

	LoginPage_PO LoginPO;
	DashboardPage_PO DashboardPagePO;

	public LoginPage_SD() {
		driver = Hooks.getDriver();
		LoginPO = new LoginPage_PO(driver);
	}

	@Given("Admin launch the browser")
	public void admin_launch_the_browser() {

	}

	@When("Admin gives the correct <LMS portal URL>")
	public void admin_gives_the_correct_lms_portal_url() {
		LoginPO.homepageWithvalidURL();
		Assert.assertTrue(false);
	}

	@Then("Admin should land on the home page")
	public void admin_should_land_on_the_home_page() {
		System.out.println("Home Page URL");
	}

	@When("Admin gives the invalid <LMS portal URL>")
	public void admin_gives_the_invalid_lms_portal_url() {
		LoginPO.homepageWithInvalidURL();

		Assert.assertTrue(false);
	}

	@Then("Admin should recieve {int} page not found error")
	public void admin_should_recieve_page_not_found_error(Integer int1) {
		DashboardPagePO.BrokenLinksValidation();
	}

	@Then("HTTP response >= {int}. Then the link is broken")
	public void http_response_then_the_link_is_broken(Integer int1) {
		DashboardPagePO.BrokenLinksValidation();
	}

	@Given("Admin should see correct spellings in all fields")
	public void admin_should_see_correct_spellings_in_all_fields() {
		DashboardPagePO.validateTextSpellingAndSpacing();
	}

	@When("Admin should see correct logo of the LMS")
	public void admin_should_see_correct_logo_of_the_lms() {
		LoginPO.Logo.isDisplayed();
	}

	@Then("Admin should see logo is properly aligned")
	public void admin_should_see_logo_is_properly_aligned() {
		LoginPO.Logo.isDisplayed();
	}

	@Then("Admin should see login button")
	public void admin_should_see_login_button() {
		LoginPO.LoginBtn.isDisplayed();
	}

	@Then("Admin should able to click the Login button")
	public void admin_should_able_to_click_the_login_button() {
		LoginPO.LoginBtn.click();
	}

	@Given("Admin is in home page after LMS portal URL")
	public void admin_is_in_home_page_after_lms_portal_url() {
		System.out.println("LMS PORTAL PAGE");
	}

	@When("Admin clicks Login button")
	public void admin_clicks_login_button() {
		LoginPO.LoginBtn.click();
	}

	@Then("Admin should land on the login page")
	public void admin_should_land_on_the_login_page() {
		LoginPO.Login();
	}

	@Then("Admin should see {string} in the header")
	public void admin_should_see_in_the_header(String string) {
		LoginPO.LoginTitle.isDisplayed();
	}

	@Then("Admin should see two text field")
	public void admin_should_see_two_text_field() {
		LoginPO.User.isDisplayed();
		LoginPO.Password.isDisplayed();
	}

	@Then("Admin should {string} in the first text field")
	public void admin_should_in_the_first_text_field(String string) {
		LoginPO.User.isDisplayed();
	}

	@When("Admin enter user value and clicks Login button")
	public void admin_enter_user_value_and_clicks_login_button(String string) {
		LoginPO.enterUser(string);
	}

	@Then("Admin should see * symbol next to user text")
	public void admin_should_see_symbol_next_to_user_text() {
		LoginPO.User.isDisplayed();
	}

	@Then("Admin should {string} in the second text field")
	public void admin_should_in_the_second_text_field(String string) {
		LoginPO.Password.isDisplayed();
	}

	@When("Admin enter password value and clicks Login button")
	public void admin_enter_password_value_and_clicks_login_button(String string) {
		LoginPO.enterPassword(string);
	}

	@Then("Admin should see * symbol next to password text")
	public void admin_should_see_symbol_next_to_password_text() {
		LoginPO.Password.isDisplayed();
	}

	@Then("Admin should see input field on the centre of the page")
	public void admin_should_see_input_field_on_the_centre_of_the_page() {
		LoginPO.LoginBtn.isDisplayed();
	}

	@Then("Admin should see login button on the centre of the page")
	public void admin_should_see_login_button_on_the_centre_of_the_page() {
		LoginPO.LoginBtn.isDisplayed();
	}

	@Then("Admin should see forgot username or password link")
	public void admin_should_see_forgot_username_or_password_link() {
		LoginPO.Forgetusername_password_Link.isDisplayed();
	}

	@Then("Admin should see reset password link")
	public void admin_should_see_reset_password_link() {
		LoginPO.Resetpassword_link.isDisplayed();
	}

	@Then("Admin should see user in gray color")
	public void admin_should_see_user_in_gray_color() {
		LoginPO.User.isDisplayed();
	}

	@Then("Admin should see password in gray color")
	public void admin_should_see_password_in_gray_color() {
		LoginPO.Password.isDisplayed();
	}

	@Given("Admin in login page after clicking login button in home page")
	public void admin_in_login_page_after_clicking_login_button_in_home_page() {
		LoginPO.Login();
	}

	@When("Admin enter valid credentials from {string} and {string} and clicks login button")
	public void admin_enter_valid_credentials_from_and_and_clicks_login_button(String string, String string2) {
		LoginPO.adminLoginWithValidCredentials(string, string2);
	}

	@Then("Admin should land on dashboard page")
	public void admin_should_land_on_dashboard_page() {
		LoginPO.dashboardPage();
	}

	@When("Admin enter invalid credentials  from {string} and {string} and clicks login button")
	public void admin_enter_invalid_credentials_from_and_and_clicks_login_button(String string, String string2) {
		LoginPO.adminLoginWithInvalidCredentials(string, string2);
	}

	@Then("Error message please check username/password")
	public void error_message_please_check_username_password(String string) {

		LoginPO.getErrorMessage(string);
	}

	@When("Admin enter valid username from {string} and {string} and clicks login button")
	public void admin_enter_valid_username_from_and_and_clicks_login_button(String string) {
		LoginPO.LoginWithValidCredentialsInUsername(string);
	}

	@Then("Error message please check password")
	public void error_message_please_check_password(String string) {
		LoginPO.getErrorMessage(string);
	}

	@When("Admin enter valid  password from {string} and {string} and clicks login button")
	public void admin_enter_valid_password_from_and_and_clicks_login_button(String string, String string2) {

	}

	@Then("Error message please check username")
	public void error_message_please_check_username(String string) {
		LoginPO.getErrorMessage(string);
	}

	@When("Admin enter blank in username from {string} and clicks login button")
	public void admin_enter_blank_in_username_from_and_and_clicks_login_button(String string) {
		LoginPO.enterPassword(string);

	}

	@When("Admin enter blank in password from {string} and clicks login button")
	public void admin_enter_blank_in_password_from_and_and_clicks_login_button(String string) {
		LoginPO.enterUser(string);
	}

	@When("Admin clicks Login button with empty values in both columns from {string} and {string}")
	public void admin_clicks_login_button_with_empty_values_in_both_columns_from_and(String string, String string2) {
		LoginPO.LoginWithEmptyValuesInBothField(string, string2);
	}

	@When("Admin enter valid credentials from {string} and {string} and clicks login button through keyboard")
	public void admin_enter_valid_credentials_from_and_and_clicks_login_button_through_keyboard(String string,
			String string2) {
		LoginPO.LoginButtonActionThroughKeyboard(string, string2);
	}

	@When("Admin enter valid credentials from {string} and {string} and clicks login button through mouse")
	public void admin_enter_valid_credentials_from_and_and_clicks_login_button_through_mouse(String string,
			String string2) {

		LoginPO.LoginButtonActionThroughMouse(string, string2);
	}

	@When("Admin clicks forgot username or password link")
	public void admin_clicks_forgot_username_or_password_link() {
		LoginPO.Forgetusername_password_Link.click();
	}

	@Then("Admin should land on forgot username or password page")
	public void admin_should_land_on_forgot_username_or_password_page() {
		LoginPO.Forgetusername_password_Page.isDisplayed();
	}

	@Then("Admin should see {string} text in gray color")
	public void admin_should_see_text_in_gray_color(String string) {
		LoginPO.Emailid.isDisplayed();
	}

	@Then("Admin should see {string} in text field")
	public void admin_should_see_in_text_field(String string) {
		LoginPO.Emailid.isDisplayed();
	}

	@Then("Admin should see {string}  button")
	public void admin_should_see_button(String string) {
		LoginPO.SubmitBtn.isDisplayed();
	}

	@Then("Admin should see asterik {string} symbol need Email")
	public void admin_should_see_asterik_symbol_need_email(String string) {
		LoginPO.Emailid.isDisplayed();
	}

	@Then("Admin should see send link button in center of the page")
	public void admin_should_see_send_link_button_in_center_of_the_page() {
		LoginPO.Emailid.isDisplayed();
	}

	@Given("Admin is in forgot username and password page after reaching login page")
	public void admin_is_in_forgot_username_and_password_page_after_reaching_login_page() {
		System.out.println(" ");
	}

	@When("Admin enters valid {string} and clicks send link button")
	public void admin_enters_valid_and_clicks_send_link_button(String string) {
		LoginPO.emailSentForForgotPassword(string);
	}

	@Then("Admin should receive link in mail for reset username \\/ password")
	public void admin_should_receive_link_in_mail_for_reset_username_password() {

	}

	@When("Admin enters invalid {string} and clicks send link button")
	public void admin_enters_invalid_and_clicks_send_link_button(String string) {
		LoginPO.sentEmailForForgotPasswordWithInvalidEmailid(string);

	}

	@When("Admin clicks reset password link")
	public void admin_clicks_reset_password_link() {
		LoginPO.Resetpassword_link.click();
	}

	@Then("Admin should land on reset password page")
	public void admin_should_land_on_reset_password_page() {
		LoginPO.Resetpassword_Page.isDisplayed();
	}

	@Then("Admin should see {string} button in center of the page")
	public void admin_should_see_button_in_center_of_the_page(String string) {
		LoginPO.Emailid.isDisplayed();
	}

	@Then("Admin should see two text box")
	public void admin_should_see_two_text_box() {
		LoginPO.Newpassword.isDisplayed();
		LoginPO.Retype_Password.isDisplayed();
	}

	@Then("Admin should see {string} in the first label text")
	public void admin_should_see_in_the_first_label_text(String string) {
		LoginPO.Newpassword.isDisplayed();
	}

	@Then("Admin should see {string} in the second label text")
	public void admin_should_see_in_the_second_label_text(String string) {
		LoginPO.Retype_Password.isDisplayed();
	}

	@Then("Admin should see text box in disabled state")
	public void admin_should_see_text_box_in_disabled_state() {
		LoginPO.Newpassword.isDisplayed();
		LoginPO.Retype_Password.isDisplayed();
	}

	@Given("Admin in reset password page after click reset password link after reaching in login page")
	public void admin_in_reset_password_page_after_click_reset_password_link_after_reaching_in_login_page() {

	}

	@Then("Admin should see text box is enabled state")
	public void admin_should_see_text_box_is_enabled_state() {
		LoginPO.Newpassword.isEnabled();
		LoginPO.Retype_Password.isEnabled();
	}

	@When("Admin enters same Password@{String} and Password@{String} on both field and clicks submit button")
	public void admin_enters_same_password_and_password_on_both_field_and_clicks_submit_button(String string,
			String string2) {
		LoginPO.resetPasswordWithValidDetails(string, string);
	}

	@When("Admin enters same Pass@{String} and Pass@{String} on both field with invalid details and clicks submit button")
	public void admin_enters_same_pass_and_pass_on_both_field_with_invalid_details_and_clicks_submit_button(
			String string, String string2) {
		LoginPO.resetPasswordWithInvalidDetails(string, string2);
	}

	@When("Admin enters empty details  and  on both field and clicks submit button")
	public void admin_enters_empty_details_and_on_both_field_and_clicks_submit_button(String string, String string2) {
		LoginPO.resetPasswordWithEmptyDetails(string, string2);
	}

	@When("Admin enters mismatch values of Pass@{String} and Pass@{String} and clicks submit button")
	public void admin_enters_mismatch_values_of_pass_and_pass_and_clicks_submit_button(String string, String string2) {
		LoginPO.resetPasswordMismatchValues(string, string2);
	}

}
