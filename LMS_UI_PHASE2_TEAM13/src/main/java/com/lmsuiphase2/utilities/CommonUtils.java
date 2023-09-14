package com.lmsuiphase2.utilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class CommonUtils {
	
	public static String BROWSER;
	public static String excelFilePath;
	public static String applicationUrl;
	public static String loginUrl;
	public static String forgotpasswordORusernameUrl;
	public static String resetpasswordUrl;
	public static String dashbaordUrl;
	public static String studentUrl;
	public static String programUrl;
	public static String batchUrl;
	public static String userUrl;
	public static String classUrl;
	public static String assignmentUrl;
	public static String attendanceUrl;


	public static final String LMS_TITLE = "LMS";
	public static final String LOGIN_HEADER = "Please login to LMS application";
	public static final String PROGRAM_HEADER = "Manage Program";
	public static final String PROGRAM_FOOTER = "In total there are 9 programs.";
	public static final String PROGRAM_PAGINATOR_TEXT = "Showing 1 to 5 of 9 entries";
	public static final String PAGINATOR_NEXT_TEXT = "Showing 6 to 9 of 9 entries";
	public static final String PAGINATOR_PREV_TEXT = "Showing 1 to 5 of 9 entries";
	public static final String RESETPASS_HEADER = "Type in new Password";
	public static final String VALID_EMAIL = "abc123@gmail.com";
	public static final String VERIFICATION_CODE_PAGE = "Enter verification code below";
	public static final String CODE1 = "2";
	public static final String CODE2 = "5";
	public static final String CODE3 = "8";
	public static final String CODE4 = "1";
	public static final String CODE5 = "3";
	public static final String NEW_PASSWORD = "Testing@12";
	public static final String RETYPE_PASSWORD = "Testing@12";
	public static final String SEARCHBOX_TEXT = "Search";
	public static final String PAGE_HIGHLIGHT = "p-highlight";
	public static final String ADMIN_USERNAME = "lmsadmin";
	public static final String ADMIN_PASSWORD= "lmsadminpass";
	public static final String ADMIN_CODE= "23478";
	public static final String ADD_NEW_PGM_HEADER= "Program Details";
	public static final String EMPTY= "";
	public static final int ROWSIZE= 5;
	public static final String DELETE_CONFIRM= "Delete Confirm";
	public static final String CONFIRM_YES= "Yes";
	public static final String PROGRAM_NAME= "Program Name";
	public static final String PROGRAM_DESC= "Program Descrption";
	public static final String PROGRAM_STATUS= "Program Status";
	public static final String ORDER_ASC= "Ascending";
	public static final String ORDER_DESC= "Descending";

	static Properties properties = new Properties();
	public static void loadProperties() {

		FileInputStream inputstr = null;

		try {
			inputstr = new FileInputStream(System.getProperty("user.dir")+"//src//main//resources//config.properties");
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}


		try {
			properties.load(inputstr);
		} catch (IOException e) {
			e.printStackTrace();
		}

		BROWSER=properties.getProperty("BROWSER");
		excelFilePath=properties.getProperty("excelfilepath");
		applicationUrl=properties.getProperty("applicationURL");
		loginUrl=properties.getProperty("loginpageurl");
		forgotpasswordORusernameUrl=properties.getProperty("forgotpasswordORusernameurl");
		resetpasswordUrl=properties.getProperty("resetpasswordurl");
		dashbaordUrl=properties.getProperty("dashboardurl");
		studentUrl=properties.getProperty("studenturl");
		programUrl=properties.getProperty("programurl");
		batchUrl=properties.getProperty("batchurl");
		userUrl=properties.getProperty("userurl");
		classUrl=properties.getProperty("classurl");
		assignmentUrl=properties.getProperty("assignmenturl");
		attendanceUrl=properties.getProperty("attandanceurl");

	}
	public static String getApplicationPage() {
		String appurl = properties.getProperty("applicationURL");
		if (appurl != null)
			return appurl;
		else
			throw new RuntimeException("Homeurl not specified in the Configuration.properties file.");
	}
	public static String getHomePage() {
		String homeurl = properties.getProperty("homepage");
		if (homeurl != null)
			return homeurl;
		else
			throw new RuntimeException("Homeurl not specified in the Configuration.properties file.");
	}
	public static String getLoginPage() {
		String loginurl = properties.getProperty("loginpage");
		if (loginurl != null)
			return loginurl;
		else
			throw new RuntimeException("Loginurl not specified in the Configuration.properties file.");
	}
	public static String getRegisterPage() {
		String registerurl = properties.getProperty("registerurl");
		if (registerurl != null)
			return registerurl;
		else
			throw new RuntimeException("Register url not specified in the Configuration.properties file.");
	}
	public static boolean webclick(List<WebElement> elements,String optionValue)
	{
		WebElement matchingElement = elements.stream()
				.filter(x -> x.getText().equals(optionValue))
				.findFirst()
				.get();

		if(matchingElement != null) {
			matchingElement.click();
			return true;
		}
		return false;
	}

	
}