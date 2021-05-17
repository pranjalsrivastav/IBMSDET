Feature: Register on elearningm1 and send mail

  Background: This step will always execute before my test case
    Given launch the browser and hit the URL

  @RegMail
  Scenario Outline: User can successfully register and compose mail
    When User hit the Signup
    And Fill the form and submit "<firstName>", "<lastName>","<email>","<userName>","<password>","<phone>","<language>","<code>","<skype>","<linkedURI>"
    Then Verify user successfully resgistered
    When Click on Inbox
    And Compose a message

    Examples: 
      | firstName | lastName |      email           | userName  | password | phone  | language | code | skype | linkedURI |
      | pranjal   | ranjan   | pranjalsdeto@jsw.com | pranjal7o | sdetlearn|91234567| English  | 1234 | skype | linkedin  |