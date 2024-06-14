Feature: Compose and send mail through gmail account

Scenario: User logs in and sends mail

Given User launches browser
When User visits gmail login page "https://mail.google.com/"
#When User click on use another account
When user enters email "pratikcucumber@gmail.com"
And User click on next button on email text field page
When user enters password "Test@123"
And User click on next button on password text field page
When user sends an email to "shubham2.solanki@sourcingxpress.com" with subject "Incubyte" and body "Automation QA test for Incubyte"
Then Close the browser