
@tag
Feature: student page verification


Background: Logged on the LMS portal as Admin

	
@StudentPage_TC002      
Scenario: Validating the title of the page
Given  Admin is on dashboard page after Login Student
When  Admin clicks "Student" on the navigation bar
Then Admin should see the Student details Page Title

@StudentPage_TC003
Scenario: Validate response time from dashboard page to student page
Given Admin is on dashboard page after Login Student
When Admin clicks "Student" on the navigation bar 
Then  Maximum navigation time in milliseconds, defaults to 30 seconds on student page

@StudentPage_TC004
Scenario: Validate the broken link
Given Admin is on dashboard page after Login Student
When Admin clicks "Student" on the navigation bar
Then HTTP response >= 400 then link is broken on student page

@StudentPage_TC005
Scenario: Verify LMS title
Given  Admin is on dashboard page after Login Student
When Admin clicks "Student" on the navigation bar
Then Admin should see LMS -Learning management system as title on student page

@StudentPage_TC006
Scenario: Verify the alignment of the Student detail title
Given  Admin is on dashboard page after Login Student
When Admin clicks "Student" on the navigation bar
Then Student Detail title should be in centre of the page 

@StudentPage_TC007
Scenario: Validate drop down is present in the page
Given  Admin is on dashboard page after Login Student
When Admin clicks "Student" on the navigation bar
Then  2 dropdowns should be present in the page on student page

@StudentPage_TC008
Scenario: Validate search bar in select student name drop down
Given  Admin is on dashboard page after Login Student
When Admin clicks "Student" on the navigation bar
Then Admin should see search box inside the drop down on student page

@StudentPage_TC009
Scenario: Validate search bar in select batch id drop down
Given  Admin is on dashboard page after Login Student
When Admin clicks "Student" on the navigation bar
Then Admin should see search box inside batch id drop down on student page

@StudentPage_TC0010
Scenario: Validate text spelling student name
Given Admin is on dashboard page after Login Student
When Admin clicks "Student" on the navigation bar
Then Admin should see correct spelling select student name on student page

@StudentPage_TC001
Scenario: Validate text spelling select batch id
Given Admin is on dashboard page after Login Student
When Admin clicks "Student" on the navigation bar
Then Admin should see correct spelling select batch id text on student page

@StudentPage_TC0012
Scenario: Validate only numbers inside select batch id
Given Admin is on dashboard page after Login Student
When Admin clicks "Student" on the navigation bar
Then Admin should see only numbers inside batch id drop down on student page

@StudentPage_TC0013
Scenario: Validate gray color in student name drop down
Given Admin is on dashboard page after Login Student
When Admin clicks "Student" on the navigation bar
Then Admin should see select student name in gray color on student page

@StudentPage_TC0014
Scenario: Validate gray color in student name drop down
Given Admin is on dashboard page after Login Student
When Admin clicks "Student" on the navigation bar
Then Admin should see select batch ID in gray color on student page

@StudentPage_TC0015
Scenario: Validate first drop down label is select student name
Given Admin is on dashboard page after Login Student
When Admin clicks "Student" on the navigation bar
Then Admin should see select student name in first on student page

@StudentPage_TC0016
Scenario: Validate second drop down label is select batch id
Given Admin is on dashboard page after Login Student
When Admin clicks "Student" on the navigation bar
Then Admin should see select batch id in second on student page

@StudentPage_TC0017
Scenario: Validate scroll down inside student name dropdown
Given Admin is on dashboard page after Login Student
 When Admin clicks "Student" on the navigation bar
 Then Admin should able to scroll down to select the name on student page
 
 @StudentPage_TC0018
 Scenario: Validate scroll down inside batch id dropdown
 Given Admin is on dashboard page after Login Student
 When Admin clicks "Student" on the navigation bar
 Then Admin should able to scroll down to select the batch id on student page
 
 
 
 #Background: Admin is logged in and on the student Details page
 
 Scenario: Validate select student name is fading
 Given  Admin is on student details page Student
 When  Admin select student name from the drop down
 Then  Admin shouldnot see select student name text
 
 @StudentPage_TC0020
 Scenario: Validate select batch id is fading
 Given  Admin is on student details page
 When  Admin select batch id from the drop down
 Then  Admin should not see select batch id text
 
 @StudentPage_TC0021
 Scenario Outline: Validate select student name using search box
 Given  Admin is on student details page
 When  Admin clicks select student name and enters "<Sheetname>" and "<row>"  alphabet in the search box
 Then  Admin should see student name start with "<Sheetname>" and "<row>"  is listed below
 
 Examples:
 |Sheetname|Row|
 |Student|0|
 
 
 @StudentPage_TC0022
 Scenario Outline: Validate select batch id using search box
 Given  Admin is on student details page
 When  Admin clicks select batch id and enter "<Sheetname>" and "<row>" number in the search box
 Then  Admin should see batch id start with "<Sheetname>" and "<row>" is listed below
 
  Examples:
 |Sheetname|Row|
 |Student|1|
 
 @StudentPage_TC0023
 Scenario Outline: Validate selecting only student name will not display any details
 Given  Admin is on student details page
 When  Admin selects only student name  "<Sheetname>" and "<row>"
 Then  Student details should not be displayed
 Examples:
 |Sheetname|Row|
 |Student|0|
  
 @StudentPage_TC0024
 Scenario Outline: Validate selecting only batch id will not display any details
 Given Admin is on student details page
 When Admin selects only batch id "<Sheetname>" and "<row>"
 Then Student details shouldn't be displayed
 Examples:
 |Sheetname|Row|
 |Student|1|
 
 @StudentPage_TC0025
 
 Scenario Outline: Validate selecting student name and batch id
 Given Admin is on student details page
 When Admin selects student name and batch id "<Sheetname>" and "<row>"
 Then Particular student informations should be display
 
  Examples:
 |Sheetname|Row|
 |Student|2|
 
 #Feature: Navigation Validation from student page to other Pages
 
 #Background: Admin is logged in and on the student Details page
 @StudentPage_TC0026
 Scenario: Program link on navigation bar
 Given Admin is on student details page
 When Admin clicks on program link on student page
 Then Admin is redirected to Program page
 
 @StudentPage_TC0027
 Scenario: Batch link on navigation bar
 Given Admin is on student details page
 When Admin clicks on Batch link on student page
 Then Admin is redirected to Batch page
 
 @StudentPage_TC0028
 Scenario: Class link on navigation bar
 Given Admin is on student details page
 When Admin clicks on Class link on student page
 Then Admin is redirected to Class page
 
 @StudentPage_TC0029
 Scenario: User link on navigation bar
 Given Admin is on student details page
 When Admin clicks on User link on student page
 Then Admin is redirected to User page
 
 @StudentPage_TC0030
 Scenario: Assignment link on navigation bar
 Given Admin is on student details page
 When Admin clicks on Assignment link on student page
 Then Admin is redirected to Assignment page
 
 @StudentPage_TC0031
 Scenario: Attendance link on navigation bar
 Given Admin is on student details page
 When Admin clicks on Attendance link on student page
 Then Admin is redirected to Attendance page
 
 @StudentPage_TC0032
  Scenario: Logout link on navigation bar
 Given Admin is on student details page
 When Admin clicks on Logout link on student page
 Then Admin is redirected to Login page
