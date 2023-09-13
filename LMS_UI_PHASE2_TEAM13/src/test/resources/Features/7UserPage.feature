 
 
@tag
Feature: User page validation


Background: Logged on the LMS portal

@UserPage_TC_001
Scenario: Validate landing in User page
Given  	Admin is on dashboard page after Login 
When Admin clicks "User" from navigation bar
Then Admin should see the "Manage User" in the URL

@UserPage_TC_002
Scenario: Validate header in the User Page

Given Admin is on dashboard page after Login
When Admin clicks "User" from navigation bar
Then Admin should see the "Manage User" in the header

@UserPage_TC_003
Scenario: Validate pagination in the User Page
Given Admin is on dashboard page after Login
When Admin clicks "User" from navigation bar
Then Admin should see the pagination controls under the data table on userpage

@UserPagee_TC_004
Scenario: Validate data table headers in the User Page
Given Admin is on dashboard page after Login
When Admin clicks "User" from navigation bar
Then Admin should be able to see the "Delete" icon button that is disabled on userpage
@StudentPage_TC_005
Scenario: Validate "+ A New user" button in User Page
Given Admin is on dashboard page after Login
When Admin clicks "User" from navigation bar
Then Admin should be able to see the "+ A New User" button


@UserPage_TC_009
Scenario: Validate "+ Assign staff" button in User page
Given Admin is on dashboard page after Login
When Admin clicks "User" from navigation bar
Then Admin should be able to see the "+ Assign staff" button

@UserPagee_TC_0010
Scenario: Validate search box in User page
Given Admin is on dashboard page after Login
When Admin clicks "User" from navigation bar
Then Each row in the data table should have a checkbox on userpage

@UserPage_TC_0011
Scenario: Validate data rows
Given Admin is on dashboard page after Login
When Admin clicks "User" from navigation bar
Then Each row in the data table should have a checkbox on userpage

@UserPage_TC_0012
Scenario: Validate data rows
Given Admin is on dashboard page after Login
When Admin clicks "User" from navigation bar
Then Each row in the data table should have a edit icon that is enabled on userpage

@StudentPage_TC_0013
Scenario: Validate data rows
Given Admin is on dashboard page after Login
When Admin clicks "User" from navigation bar
Then Each row in the data table should have a delete icon that is enabled on userpage

@UserPage_TC_0014
Scenario: Validate pop up for adding user
Given Admin is on dashboard page after Login and Admin clicks "User" from navigation bar
When Admin clicks "+ A New User" button
Then The pop up should include the fields (First Name,Middle name, Last Name, Location phone, email,linkedin Url,Undergraduate,postgraduate,time zone, user comments,user Role, Role status, visa status)



#Feature: Add new user

#Background: Logged on the LMS portal
#Admin is on dashboard page after Login
#min clicks "User" from navigation bar
#Admin clicks "+ A New User" button
@UserPage_TC_0015
Scenario: Check if the fields exist in pop
Given Admin is on dashboard page and clicks "User" from the navigation bar and clicks on "+ A New User" button
When A new pop up with user details appears
Then The pop up should include the fields (First Name,Middle name, Last Name, Location phone, email,linkedin Url,Undergraduate,postgraduate,time zone, user comments,user Role, Role status, visa status)


@UserPage_TC_0016
Scenario Outline: Check if Middle name, linkedIn url, email, user comments.under graduate,post graduate,time zone are optional

Given Admin is on new pop up with user details
When Fill in all the fields values from "<SheetName>" and "<Row>"  except optional fields with valid values and click submit
Then The newly added user should be present in the data table in Manage User page
Examples:
|SheetName|Row|
|User|0|

@UserPage_TC_0018
Scenario Outline: Check for error messages for invalid fields
Given Admin is on new pop up with user details
When any of the fields have invalid values from "<SheetName>" and "<Row>" 
Then Error message should appear on userpage


Examples:
|SheetName|Row|Error|
|User|4 |invalid value|

@UserPage_TC_0017
Scenario Outline: Check if the program details are added in data table
Given  Admin is on new pop up with user details
When Fill in all the fields with valid values from "<SheetName>" and "<Row>"  and click submit
Then The newly added user should be present in the data table in Manage User page
Examples:
|SheetName|Row|
|User|1|

@UserPage_TC_0019
Scenario Outline: Check for error messages for mandatory fields
Given Admin is on new pop up with user details
When Any of the mandatory fields values from "<SheetName>" and "<Row>" from are blank 
Then Error message "<Error>" should appear on userpage
Examples:
|SheetName|Row|Error|
|User|5 |mandatory field missing|

#Feature: Edit new user
#Background: Logged on the LMS portal
#Admin is on dashboard page after Login
#Admin clicks "User" from navigation bar


@UserPage_TC_0020
Scenario: Validate row level edit icon
Given The edit icon on row level in data table is enabled
When Admin clicks the edit icon
Then A new pop up with User details appears

@UserPage_TC_0021
Scenario Outline: Check if the fields are updated
Given Admin clicks the edit icon
When Update the fields with valid values from  "<SheetName>" and "<Row>" and click submit
Then The updated user details should appear on the data table
Examples:
|SheetName|Row|
|User|5|
@UserPage_TC_0022
Scenario: Check if the update throws error with invalid values
Given Admin clicks the edit icon
When Update the fields with invalid values from "<SheetName>" and "<Row>"  and click submit
Then Error message should appear on userpage

Examples:
|SheetName|Row|Error|
|User|6 |invalid value|

@UserPage_TC_0023
Scenario: Check if you get error message when mandatory fields are erased
Given Admin clicks the edit icon
When Erase data from mandatory field
Then Error message should appear on userpage

@UserPage_TC_0024
Scenario: Check if description field is optional in update
Given Admin clicks the edit icon
When Erase data from description field
Then The updated user details should appear on the data table

#Feature: Delete user
#Background: Logged on the LMS portal
#Admin is on dashboard page after Login
#Admin clicks "User" from navigation bar

@UserPage_TC_0025
Scenario: Validate row level delete icon
Given The delete icon on row level in data table is enabled
When Admin clicks the delete icon
Then Alert appears with yes and No option on userpage

@UserPage_TC_0026
Scenario: Validate accept alert
Given Admin clicks the delete icon
When Admin click yes option
Then User deleted alert pops and user is no more available in data table

@UserPage_TC_0027
Scenario: Validate reject alert
Given Admin clicks the delete icon
When Admin click No option
Then User is still listed in data table on userpage

#Feature: Delete multiple user
#Background: Logged on the LMS portal
#Admin is on dashboard page after Login
#Admin clicks "User" from navigation bar

@UserPage_TC_0028
Scenario: Validate the delete icon below the header
Given None of the checkboxes in data table are selected
Then The delete icon under the "Manage User" header should be disabled

@UserPage_TC_0029
Scenario: Check for single row delete
Given One of the checkbox/ row is selected
When Click delete icon below "Manage User" header
Then The respective row in the data table is deleted on userpage


@UserPage_TC_0030
Scenario: Check for multi row delete
Given Two or more checkboxes/row is selected
When Click delete icon below "Manage User" header
Then The respective row in the data table is deleted on userpage

 