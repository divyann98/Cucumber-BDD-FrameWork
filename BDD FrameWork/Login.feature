Feature: Open OrangeHRM;
Scenario: Validate Login Credentials;

Given OpenURL
When  Enter Credentials
Then  Login Application
Then  Close Application
