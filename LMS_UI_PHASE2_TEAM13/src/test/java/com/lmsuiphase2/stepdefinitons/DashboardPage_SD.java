package com.lmsuiphase2.stepdefinitons;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.lmsuiphase2.apphooks.Hooks;
import com.lmsuiphase2.pageobjects.DashboardPage_PO;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class DashboardPage_SD {
	
	
	private WebDriver driver;
	private static final Logger LOG= LogManager.getLogger(DashboardPage_SD.class);
	
	DashboardPage_PO  dashboard;
	
	public DashboardPage_SD()
	{
		 driver = Hooks.getDriver();
		 dashboard =  new DashboardPage_PO (driver);
	}
	
	@Given("User Logged on to LMS Website")
	public void user_logged_on_to_lms_website() {
		dashboard.Login();
		
	}

	@Given("Admin is in the login page")
	public void admin_is_in_the_login_page() {
	    dashboard.Login();
	}

	@When("Admin enters valid credentials and clicks the login button")
	public void admin_enters_valid_credentials_and_clicks_the_login_button() {
		dashboard.LoginWithValidCredentials();
		LOG.info("User logged into the homepage entering valid user name and password");
	    
	}
	
@Then("Verify after login  admin lands on manage program as dashboard page")
public void Verify_after_login_admin_lands_on_manage_program_as_dashboard_page() {
	String actualTitle= dashboard.getProdHeader();
	Assert.assertEquals(actualTitle, "Data Structures-Introduction");
	LOG.info("varify that dashboard as program page");
}


@Then ("Verify the response time")
public void Verify_the_response_time() {
	long actLoadingTime = dashboard.loadingTime();
	Assert.assertEquals(actLoadingTime,30);
	LOG.info("Verify the response time");
}

@Then("Verify broken link")
public void Verify_broken_link() {
	dashboard.BrokenLinksValidation();
	LOG.info("Verify the response time");
}

@Then("Verify LMS title")
public void Verify_LMS_title() {
String actTitle=	dashboard.getLmsTitle();
Assert.assertEquals(actTitle, "LMS - Learning Management System");
LOG.info("Verify LMS title");
	
}
@Then ("Verify  LMS title alignment")
public void Verify_LMS_title_alignment() {
	dashboard.getLMStitlealignment();
	LOG.info("Verify  LMS title alignment");
}

@Then("Validate navigation bar text")
public void Validate_navigation_bar_text(){
	String actualtext= dashboard.getNavigationBarText();
	String ExpText= "";
	Assert.assertEquals(actualtext, ExpText);
	LOG.info("Validate navigation bar text");
}

@Then ("Validate LMS title has correct spelling ang space")
public void Validate_LMS_title_has_correct_spelling_ang_space() {
	
	boolean isTextValid = dashboard.validateTextSpellingAndSpacing(null);
	if (isTextValid) {
        System.out.println("All text is valid.");
    } else {
        System.out.println("Some text has spelling or spacing issues.");
    }
	LOG.info("Validate LMS title has correct spelling ang space");
}

@Then("Validate alignment for navigation bar")
public void Validate_alignment_for_navigation_bar() {
	String position = dashboard.getNavigationBarCssValue("position");
    String top = dashboard.getNavigationBarCssValue("top");
    String right = dashboard.getNavigationBarCssValue("right");

    
    if ("fixed".equalsIgnoreCase(position) && "0px".equals(top) && "0px".equals(right)) {
        System.out.println("Navigation bar is fixed at the top right corner.");
    } else {
        System.out.println("Navigation bar position does not match the expected position.");
    }
    LOG.info("Validate alignment for navigation bar");
}

@Then("Admin should see {string} in the {string} place")
public void admin_should_see_in_the_place(DataTable expectedTabsTable) {
	List<List<String>> expectedTabs = expectedTabsTable.asLists(String.class);
    for (int i = 0; i < expectedTabs.size(); i++) {
        String expectedTabName = expectedTabs.get(i).get(1);
        String actualTabName = dashboard.getTabPosition(i + 1);
        assertEquals(expectedTabName, actualTabName);
        LOG.info("Validate tabs position on bar");
    }
    
    
}
@Then(" Verify Logout button function")
public void  Verify_Logout_button_function() {
	dashboard.logout();
	String actaualTittle=dashboard.getProdHeader();
	Assert.assertEquals(actaualTittle, "Manage Program");
	LOG.info("Logout is working");
	
	
}

@Then("Admin should see Student in the 1st place")
public void admin_should_see_student_in_the_1st_place() {
	dashboard.getStudentAtPosition1(1);
	Assert.assertEquals(dashboard.getStudentAtPosition1(1), "1");
}

@Then("Admin should see Program in the 2nd place")
public void admin_should_see_program_in_the_2nd_place() {
	dashboard.getprogramAtPosition2(2);
	Assert.assertEquals(dashboard.getprogramAtPosition2(2), "2");
}

@Then("Admin should see Batch in the 3rd place")
public void admin_should_see_batch_in_the_3rd_place() {
	dashboard.getBatchAtPosition3(3);
	Assert.assertEquals(dashboard.getBatchAtPosition3(3), "3");
}

@Then("Admin should see Class in the 4th place")
public void admin_should_see_class_in_the_4th_place() {
	dashboard.getclassAtPosition4(4);
	Assert.assertEquals(dashboard.getclassAtPosition4(4), "4");
    
}

@Then("Admin should see User in the 5th place")
public void admin_should_see_user_in_the_5th_place() {
	dashboard.getuserAtPosition(5);
	Assert.assertEquals(dashboard.getuserAtPosition(5), "5");
   
}

@Then("Admin should see Assignment in the 6th place")
public void admin_should_see_assignment_in_the_6th_place() {
	dashboard.getAssignmentAtPosition6(6);
	Assert.assertEquals(dashboard.getAssignmentAtPosition6(6), "6");
}

@Then("Admin should see Attendance in the 7th place")
public void admin_should_see_attendance_in_the_7th_place() {
	dashboard.getAttandancePosition7(7);
	Assert.assertEquals(dashboard.getAttandancePosition7(7), "7");  
}

@Then("Admin should see Logout in the 8th place")
public void admin_should_see_logout_in_the_8th_place() {
	dashboard.getLogoutAtPosition8(8);
	Assert.assertEquals(dashboard.getLogoutAtPosition8(8), "8");
}
	
}
