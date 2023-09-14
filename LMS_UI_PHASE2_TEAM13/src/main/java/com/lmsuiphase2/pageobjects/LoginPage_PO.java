package com.lmsuiphase2.pageobjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.lmsuiphase2.pageobjects.Common_PO;
import com.lmsuiphase2.pageobjects.DashboardPage_PO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.lmsuiphase2.utilities.CommonUtils;
import com.lmsuiphase2.utilities.ExcelUtils;

public class LoginPage_PO {

	WebDriver driver;
	public Actions action;
	Common_PO CommonPO;

	public @FindBy(id = "Logo") WebElement Logo;
	public @FindBy(id = "username") WebElement User;
	public @FindBy(id = "password") WebElement Password;
	public @FindBy(xpath = "//input[text()='Login']") WebElement LoginBtn;
	public @FindBy(id = "forget username/password") WebElement Forgetusername_password_Link;
	public @FindBy(id = "Forgetusername_password_Page") WebElement Forgetusername_password_Page;
	public @FindBy(id = "reset password") WebElement Resetpassword_link;
	public @FindBy(id = "reset password page") WebElement Resetpassword_Page;
	public @FindBy(id = "forgetpassword_emailid") WebElement Emailid;
	public @FindBy(id = "sendlink") WebElement Send_LinkBtn;
	public @FindBy(id = "new password") WebElement Newpassword;
	public @FindBy(id = "retype password") WebElement Retype_Password;
	public @FindBy(id = "Submit") WebElement SubmitBtn;
	public @FindBy(id = "LMS Application") WebElement LoginTitle;
	public @FindBy(xpath = "//div[text()='errormessage']") WebElement errMsg;

	String errorMessage;
	String applicationUrl = CommonUtils.applicationUrl;
	String loginPageURL = CommonUtils.loginUrl;
	String excelURL = CommonUtils.excelFilePath;
	String invalidapp_Url = "http://heruapp.com/";
	String dashbaordUrl = CommonUtils.dashbaordUrl;

	public LoginPage_PO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		action = new Actions(this.driver);

		CommonPO = new Common_PO();

	}

	public void homepageWithvalidURL() {
		driver.get(applicationUrl);
	}

	public void homepageWithInvalidURL() {
		driver.get(invalidapp_Url);
	}

	public void loginHeader() {
		LoginTitle.getText();
	}

	public void dashboardPage() {
		driver.get(dashbaordUrl);
	}

	public boolean getErrorMessage(String errormsg) {
		return errMsg.getText().equals(errormsg);
	}

	// LoginPage
	
	public void ExcelReader(String sheetName, Integer rowNo) throws IOException {

		File src = new File(CommonUtils.excelFilePath);
		FileInputStream fileInput = new FileInputStream(src);
		XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
		XSSFSheet sheet = workbook.getSheet(sheetName);

		XSSFCell cell = sheet.getRow(rowNo).getCell(0);
		User.click();
		Select sel1 =new Select(User);
		sel1.selectByVisibleText(cell.getStringCellValue());

		cell = sheet.getRow(rowNo).getCell(1);
		Password.click();
		Select sel2 =new Select(Password);
		sel2.selectByVisibleText(cell.getStringCellValue());
		LoginBtn.click();
	}
	public void Login() {
		driver.get(loginPageURL);
	}

	public void enterUser(String user) {
		User.sendKeys(user);
		LoginBtn.click();

	}

	public void enterPassword(String password) {
		Password.sendKeys(password);
		LoginBtn.click();
	}

	public void LoginWithValidCredentialsInUsername(String user) {

		User.sendKeys(user);
	}

	public void LoginButtonActionThroughKeyboard(String user, String password) {

		User.sendKeys(user);
		Password.sendKeys(password);
		LoginBtn.sendKeys(Keys.ENTER);
	}

	public void LoginButtonActionThroughMouse(String user, String password) {

		User.sendKeys(user);
		Password.sendKeys(password);
		LoginBtn.click();
	}

	// ForgotUsername Or Password

	public void emailSentForForgotPassword(String email) {
		Emailid.sendKeys(email);
		Send_LinkBtn.click();

	}

	public void sentEmailForForgotPasswordWithInvalidEmailid(String email) {
		Emailid.sendKeys(email);
		Send_LinkBtn.click();

	}

	// Reset Password

	public void resetPasswordWithValidDetails(String newpassword, String retypepassword) {
		Newpassword.sendKeys(newpassword);
		Retype_Password.sendKeys(retypepassword);
		SubmitBtn.click();

	}

	public void resetPasswordWithInvalidDetails(String newpassword, String retypepassword) {
		Newpassword.sendKeys(newpassword);
		Retype_Password.sendKeys(retypepassword);
		SubmitBtn.click();
	}

	public void resetPasswordWithEmptyDetails(String newpassword, String retypepassword) {
		Newpassword.sendKeys(newpassword);
		Retype_Password.sendKeys(retypepassword);
		SubmitBtn.click();
	}

	public void resetPasswordMismatchValues(String newpassword, String retypepassword) {

		Newpassword.sendKeys(newpassword);
		Retype_Password.sendKeys(retypepassword);
		SubmitBtn.click();

	}

}
