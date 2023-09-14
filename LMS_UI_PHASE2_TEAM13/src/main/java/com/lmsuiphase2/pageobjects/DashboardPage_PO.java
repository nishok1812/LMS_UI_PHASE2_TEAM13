package com.lmsuiphase2.pageobjects;

import java.util.List;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.lmsuiphase2.utilities.CommonUtils;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Dictionary;
import java.util.HashMap;


public class DashboardPage_PO {
	WebDriver driver;
	public Actions action;
	
	public DashboardPage_PO (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		action = new Actions(this.driver);}
	
	private final static Logger LOG = LogManager.getLogger(DashboardPage_PO.class);
	
	@FindBy	(xpath = "//h2[text()='Manage Program']") WebElement programHeader;
	@FindBy	(xpath = "//h2[text()='Manage Program']") WebElement lmsTitle;
	@FindBy	(xpath = "//h2[text()='Manage Program']") List<WebElement>  lmsTextTitle;
	@FindBy	(xpath = "//h2[text()='Manage Program']") List<WebElement>  tab;
	@FindBy	(xpath = "") WebElement programFooter;
	@FindBy	(xpath = "") WebElement navigationBar;
	@FindBy	(xpath = "")WebElement paginatorText;
	@FindBy	(xpath = "") WebElement programTab;
	@FindBy	(xpath = "//button[text()='delete']") WebElement deleteBtn1;
	@FindBy	(xpath = "") WebElement search;
	@FindBy	(xpath = "") WebElement newProgramBtn;
	@FindBy	(xpath = "") WebElement editBtn;
	@FindBy	(xpath = "") WebElement deleteBtn;
	@FindBy	(xpath = "") WebElement BatchTab;
	@FindBy	(xpath = "") WebElement StudentTab;
	@FindBy	(xpath = "") WebElement ProgramTab;
	@FindBy	(xpath = "") WebElement ClassTab;
	@FindBy	(xpath = "") WebElement UserTab;
	@FindBy	(xpath = "") WebElement AssignmentTab;
	@FindBy	(xpath = "") WebElement AttandanceTab;
	@FindBy	(xpath = "") WebElement LogoutTab;
	@FindBy(id ="id_username")WebElement Username;
 	@FindBy(id="id_password")WebElement password;
 	@FindBy (xpath= "//input[@value='Login']")WebElement loginButton;
	@FindBy (xpath = "")WebElement paginatorFirst;
	@FindBy (xpath = "")WebElement paginatorPrev;
	@FindBy (xpath = "")WebElement paginatorLast;
	@FindBy (xpath = "")WebElement paginatorNext;
	@FindBy (xpath = "")WebElement pageNo;
	@FindBy (xpath = "")WebElement addNewProgramBtn;
	@FindBy (xpath = "")WebElement newProgramHeader;
	@FindBy(xpath="//div[contains(@class, 'alert alert-primary')]")
    public WebElement loginSuccessMessage;

	String successMessage="";
	String errorMessage;
	String applicationURL = CommonUtils.getApplicationPage();
	String homePageURL = CommonUtils.getHomePage();
	String loginPageURL = CommonUtils.getLoginPage();
	String registerPageURL = CommonUtils.getRegisterPage();
	
	public String getProdHeader()
	{
		return programHeader.getText();
			
	}
	public void logout() {
		LogoutTab.click();
	}
	
	public String getLmsTitle () {
		return lmsTitle.getText();
		
	}

	public void LoginWithValidCredentials()
 	{
		Username.sendKeys("coolcukes");
		password.sendKeys("Selenium@123");
		loginButton.click();
		
		successMessage=loginSuccessMessage.getText();
		LOG.info("The Login is successful:" +successMessage );
		
 	}
	public String getNavigationBarText() {
		return programFooter.getText();
	}
	public void Login()
	{
		driver.get(loginPageURL);
	}
	
	
	
	public String getLMStitlealignment () {
		return lmsTitle.getCssValue("text-align");
	}
	
public long loadingTime() {
	 long startTime = System.currentTimeMillis();
	 long endTime = System.currentTimeMillis();
long pageLoadTime = endTime - startTime;
     System.out.println("Page load time: " + pageLoadTime + " milliseconds");
	return pageLoadTime;

}
    public  void BrokenLinksValidation() {
        
    	 List<WebElement> links = driver.findElements(By.tagName("a")); // Find all the links on the dashboard page using the anchor <a> tag
for (WebElement link : links) {  // Iterate through the links and validate them
            String url = link.getAttribute("href");
            if (url != null && !url.isEmpty()) {
                try {
                    // Create a URL object
                    URL linkUrl = new URL(url);

                    // Open a connection to the URL
                    HttpURLConnection connection = (HttpURLConnection) linkUrl.openConnection();
                    connection.setRequestMethod("HEAD");

                    // Get the HTTP response code
                    int responseCode = connection.getResponseCode();

                    // Check for broken links (response code other than 200 OK)
                    if (responseCode != 200) {
                        System.out.println("Broken Link Found: " + url + " (HTTP Response Code: " + responseCode + ")");
                    }

                    // Close the connection
                    connection.disconnect();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

       }

	
    public boolean validateTextSpellingAndSpacing(List<WebElement> lmsTextTitles) {
        boolean allTextValid = true;

        for (WebElement lmsTextTitle : lmsTextTitles) {
            try {
                String text = lmsTextTitle.getText();

                
                boolean isSpellingValid = isSpacingValid(text);

                
                boolean isSpacingValid = isSpacingValid(text); 

                if (!isSpellingValid || !isSpacingValid) {
                   
                    System.out.println("Text validation issues in: " + text); // Log the validation issues
                    allTextValid = false;
                }
            } catch (Exception e) { // Handle any exceptions that may occur during text retrieval
                
                System.out.println("Error while processing text: " + e.getMessage());
                allTextValid = false;
            }
        }

        return allTextValid;
    }

     private boolean isSpacingValid(String text) {
        if (text.matches(".*\\s{2,}.*")) {
            return false; // Spacing issue detected
        }
        return true; // Spacing is valid
    }
    
    public String getNavigationBarCssValue(String position) {
        return navigationBar.getCssValue(position);
    }
    
    
 
    public String getStudentAtPosition1(int position1) {
    	WebElement tab = driver.findElement(By.xpath("//div[@id='navbar']//li[" + position1 + "]/a"));
        return tab.getText();}
    
    
    public String getprogramAtPosition2(int position2) {
    	WebElement tab = driver.findElement(By.xpath("//div[@id='navbar']//li[" + position2 + "]/a"));
        return tab.getText();}
    
    public String getBatchAtPosition3(int position3) {
    	WebElement tab = driver.findElement(By.xpath("//div[@id='navbar']//li[" + position3 + "]/a"));
        return tab.getText();}
    
    public String getclassAtPosition4(int position4) {
    	WebElement tab = driver.findElement(By.xpath("//div[@id='navbar']//li[" + position4 + "]/a"));
        return tab.getText();}
    
    public String getuserAtPosition(int position5) {
    	WebElement tab = driver.findElement(By.xpath("//div[@id='navbar']//li[" + position5 + "]/a"));
        return tab.getText();}
    public String getAssignmentAtPosition6(int position6) {
    	WebElement tab = driver.findElement(By.xpath("//div[@id='navbar']//li[" + position6 + "]/a"));
        return tab.getText();}
    
    public String getAttandancePosition7(int position7) {
    	WebElement tab = driver.findElement(By.xpath("//div[@id='navbar']//li[" + position7 + "]/a"));
        return tab.getText();}
    public String getLogoutAtPosition8(int position8) {
    	WebElement tab = driver.findElement(By.xpath("//div[@id='navbar']//li[" + position8 + "]/a"));
        return tab.getText();}
    
    
    public String getTabPosition(int position) {
       
        return ((WebElement) tab).getText();
    }
    
    public void clickOnprogramTab() {
    	programTab.click();
    }
}
