Feature: feature to login functionality

  Background: 
    Given I am on facebook application
    
    
@smoke
  Scenario Outline: check login is successful with valid credential
    Given User enters "<username>" and "<password>" LogIn
     
    And I click on login button
    Then I am able to login

 Examples:
 
 |username|password|
 |abc |mastani@123|
 |lmn |test@12455|
 
 @smoke
 Scenario Outline: check login is successful with valid credential
    Given User enters "<username>" and "<password>" LogIn
     
    And I click on login button
    Then I am able to login

 Examples:
 
 |username|password|
 |sandip |mastani@123|
 |shreeyang |test@12455|
 
  @sanity
 Scenario Outline: check login is successful with valid credential
    Given User enters "<username>" and "<password>" LogIn
     
    And I click on login button
    Then I am able to login

 Examples:
 
 |username|password|
 |rekha |mastani@123|
 |megha |test@12455|
 
  @sanity
 Scenario Outline: check login is successful with valid credential
    Given User enters "<username>" and "<password>" LogIn
     
    And I click on login button
    Then I am able to login

 Examples:
 
 |username|password|
 |palli |mastani@123|
 |tulli |test@12455|