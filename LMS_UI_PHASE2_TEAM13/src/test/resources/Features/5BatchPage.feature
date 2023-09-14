Feature: Batch Page Functionally

  @BatchPageValidation @BatchPage_TC001
  Scenario: Validate landing in Batch page
    Given LMSBatchAdmin is on dashboard page after Login in LMS portal
    When LMSBatchAdmin clicks "Batch" from navigation bar
    Then LMSBatchAdmin should see the "Manage Batch" in the URL

  @BatchPageValidation @BatchPage_TC002
  Scenario: Validate header in the Batch Page
    Given LMSBatchAdmin is on dashboard page after Login in LMS portal
    When LMSBatchAdmin clicks "Batch" from navigation bar
    Then LMSBatchAdmin should see the "Manage Batch" in the header

  @BatchPageValidation @BatchPage_TC003
  Scenario: Validate pagination in the Batch Page
    Given LMSBatchAdmin is on dashboard page after Login in LMS portal
    When LMSBatchAdmin clicks "Batch" from navigation bar
    Then LMSBatchAdmin should see the pagination controls under the data table

  @BatchPageValidation @BatchPage_TC004
  Scenario: Validate data table headers in the Batch Page
    Given LMSBatchAdmin is on dashboard page after Login in LMS portal
    When LMSBatchAdmin clicks "Batch" from navigation bar
    Then LMSBatchAdmin Should see the data table with headers Batch name, Batch Description,Batch Status, No of classes, Program Name, Edit/Delete

  @BatchPageValidation @BatchPage_TC005
  Scenario: Validate Delete button in Batch Page
    Given LMSBatchAdmin is on dashboard page after Login in LMS portal
    When LMSBatchAdmin clicks "Batch" from navigation bar
    Then LMSBatchAdmin should be able to see the "Delete" icon button that is disabled

  @BatchPageValidation @BatchPage_TC006
  Scenario: Validate "+ A New batch" in Batch Page
    Given LMSBatchAdmin is on dashboard page after Login in LMS portal
    When LMSBatchAdmin clicks "Batch" from navigation bar
    Then LMSBatchAdmin should be able to see the "+ A New batch" button

  @BatchPageValidation @BatchPage_TC007
  Scenario: Validate data rows
    Given LMSBatchAdmin is on dashboard page after Login in LMS portal
    When LMSBatchAdmin clicks "Batch" from navigation bar
    Then Each row in the data table should have a checkbox

  @BatchPageValidation @BatchPage_TC008
  Scenario: Validate data rows
    Given LMSBatchAdmin is on dashboard page after Login in LMS portal
    When LMSBatchAdmin clicks "Batch" from navigation bar
    Then Each row in the data table should have a edit icon that is enabled

  @BatchPageValidation @BatchPage_TC009
  Scenario: Validate data rows
    Given LMSBatchAdmin is on dashboard page after Login in LMS portal
    When LMSBatchAdmin clicks "Batch" from navigation bar
    Then Each row in the data table should have a delete icon that is enabled

  @BatchPageValidation @BatchPage_TC010
  Scenario: Validate pop up for adding batch
    Given LMSBatchAdmin is on dashboard page after Login in LMS portal
    When LMSBatchAdmin clicks "+ A New Batch" button
    Then A new pop up with Batch details appears

  @AddNewBatch @BatchPage_TC011
  Scenario: Check if the fields exist in pop
    Given A new pop up with Batch details appears Before LMSBatchAdmin is on dashboard page after Login LMSBatchAdmin clicks ""Batch"" from navigation bar LMSBatchAdmin clicks ""+ A New Batch"" button
    Then The pop up should include the fields Name, Number of classes and Description as text box, Program Name as drop down, Status as radio button Number of classes as text box

  @AddNewBatch @BatchPage_TC012
  Scenario Outline: Check if description is optional field
    Given A new pop up with Batch details appears Before LMSBatchAdmin is on dashboard page after Login LMSBatchAdmin clicks ""Batch"" from navigation bar LMSBatchAdmin clicks ""+ A New Batch"" button
    When Fill in all the fields except description with valid values from "<Sheet Name>" and "<Row Number>" and click save
    Then The newly added batch should be present in the data table in Manage Batch page

    Examples: 
      | Sheet Name    | Row Number |
      | Name          |          2 |
      | Description   |          2 |
      | Program Name  |          2 |
      | Status        |          2 |
      | No of Classes |          2 |

  @AddNewBatch @BatchPage_TC013
  Scenario Outline: Check if the program details are added in data table
    Given A new pop up with Batch details appears Before LMSBatchAdmin is on dashboard page after Login LMSBatchAdmin clicks ""Batch"" from navigation bar LMSBatchAdmin clicks ""+ A New Batch"" button
    When Fill in all the fields with valid values from "<Sheet Name>" and "<Row Number>" and click save
    Then The newly added batch should be present in the data table in Manage Batch page

    Examples: 
      | Sheet Name    | Row Number |
      | Name          |          3 |
      | Description   |          3 |
      | Program Name  |          3 |
      | Status        |          3 |
      | No of Classes |          3 |

  @AddNewBatch @BatchPage_TC014
  Scenario Outline: Check for error messages for invalid fields
    Given A new pop up with Batch details appears Before LMSBatchAdmin is on dashboard page after Login LMSBatchAdmin clicks ""Batch"" from navigation bar LMSBatchAdmin clicks ""+ A New Batch"" button
    When Any of the fields have invalid values from "<Sheet Name>" and "<Row Number>"
    Then Error message should appear

    Examples: 
      | Sheet Name    | Row Number |
      | Name          |          4 |
      | Description   |          4 |
      | Program Name  |          4 |
      | Status        |          4 |
      | No of Classes |          4 |

  @AddNewBatch @BatchPage_TC015
  Scenario Outline: Check for error messages for mandatory fields
    Given A new pop up with Batch details appears Before LMSBatchAdmin is on dashboard page after Login LMSBatchAdmin clicks ""Batch"" from navigation bar LMSBatchAdmin clicks ""+ A New Batch"" button
    When Any of the mandatory fields are blank from "<Sheet Name>" and "<Row Number>"
    Then Error message should appear

    Examples: 
      | Sheet Name    | Row Number |
      | Name          |          5 |
      | Description   |          5 |
      | Program Name  |          5 |
      | Status        |          5 |
      | No of Classes |          5 |

  @DeleteBatch @BatchPage_TC016
  Scenario: Validate row level delete icon
    Given The delete icon on row level in data table is enabled before LMSBatchAdmin is on dashboard page after Login LMSBatchAdmin clicks "Batch" from navigation bar
    When LMSBatchAdmin clicks the delete icon
    Then Alert appears with <yes> and <No> option

  @DeleteBatch @BatchPage_TC017
  Scenario: Validate accept alert
    Given LMSBatchAdmin clicks the delete icon before LMSBatchAdmin is on dashboard page after Login LMSBatchAdmin clicks "Batch" from navigation bar
    When You click <yes> option
    Then Batch deleted alert pops and batch is no more available in data table

  @DeleteBatch @BatchPage_TC018
  Scenario: Validate reject alert
    Given LMSBatchAdmin clicks the delete icon LMSBatchAdmin is on dashboard page after Login LMSBatchAdmin clicks "Batch" from navigation bar
    When you click <No> option
    Then Batch is still listed in data table

  @DeleteMultipleBatch @BatchPage_TC019
  Scenario: Validate the delete icon below the header
    Given None of the checkboxes in data table are selected before LMSBatchAdmin is on dashboard page after Login LMSBatchAdmin clicks ""Batch"" from navigation bar
    Then The delete icon under the "Manage Batch" header should be disabled1

  @DeleteMultipleBatch @BatchPage_TC020
  Scenario: Check for single row delete
    Given One of the checkbox/ row is selected before LMSBatchAdmin is on dashboard page after Login LMSBatchAdmin clicks ""Batch"" from navigation bar
    When Click <delete> icon below "Manage Batch" header
    Then you click <yes> and The respective row in the data table is deleted

  @DeleteMultipleBatch @BatchPage_TC021
  Scenario: Check for multi row delete
    Given Two or more checkboxes/row is selected before LMSBatchAdmin is on dashboard page after Login LMSBatchAdmin clicks ""Batch"" from navigation bar
    When Click <delete> icon below "Manage Batch" header
    Then The respective row in the data table is deleted

  @EditBatch @BatchPage_TC022
  Scenario: Validate row level edit icon
    Given The edit icon on row level in data table is enabled before LMSBatchAdmin is on dashboard page after Login LMSBatchAdmin clicks ""Batch"" from navigation bar
    When LMSBatchAdmin clicks the <edit> icon
    Then A new pop up with Batch details appears

  @EditBatch @BatchPage_TC022
  Scenario Outline: Check if the fields are updated
    Given LMSBatchAdmin clicks the edit icon before LMSBatchAdmin is on dashboard page after Login LMSBatchAdmin clicks ""Batch"" from navigation bar
    When Update the fields with valid values from "<Sheet Name>" and "<Row Number>" and click save
    Then The updated batch details should appear on the data table

    Examples: 
      | Sheet Name    | Row Number |
      | Name          |          6 |
      | Description   |          6 |
      | Program Name  |          6 |
      | Status        |          6 |
      | No of Classes |          6 |

  @EditBatch @BatchPage_TC022
  Scenario Outline: Check if the update throws error with invalid valued
    Given LMSBatchAdmin clicks the edit icon before LMSBatchAdmin is on dashboard page after Login LMSBatchAdmin clicks ""Batch"" from navigation bar
    When Update the fields with invalid values from "<Sheet Name>" and "<Row Number>" and click save
    Then Error message should appear

    Examples: 
      | Sheet Name    | Row Number |
      | Name          |          7 |
      | Description   |          7 |
      | Program Name  |          7 |
      | Status        |          7 |
      | No of Classes |          7 |

  @EditBatch @BatchPage_TC022
  Scenario Outline: Check if you get error message when mandatory fields are erased
    Given LMSBatchAdmin clicks the edit icon before LMSBatchAdmin is on dashboard page after Login LMSBatchAdmin clicks ""Batch"" from navigation bar
    When Erase data from mandatory field from "<Sheet Name>" and "<Row Number>"
    Then Error message should appear

    Examples: 
      | Sheet Name    | Row Number |
      | Name          |          8 |
      | Description   |          8 |
      | Program Name  |          8 |
      | Status        |          8 |
      | No of Classes |          8 |

  @EditBatch @BatchPage_TC022
  Scenario Outline: Check if description field is optional in update
    Given LMSBatchAdmin clicks the edit icon before LMSBatchAdmin is on dashboard page after Login LMSBatchAdmin clicks ""Batch"" from navigation bar
    When Erase data from description field from "<Sheet Name>" and "<Row Number>"
    Then The updated batch details should appear on the data table

    Examples: 
      | Sheet Name    | Row Number |
      | Name          |          9 |
      | Description   |          9 |
      | Program Name  |          9 |
      | Status        |          9 |
      | No of Classes |          9 |
