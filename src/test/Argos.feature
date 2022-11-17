Feature:dfghlk

  Scenario: to verify shop main menu exist
    Given user is on www.argos.co.uk
    When user look at the homepage
    Then user should be able to see shop main menu at top left panel

  Scenario: to verify user should be able to see submenu when hoovering on shop main menu then i want to see pop up menu
  on the left hand side of the page which should contain "christmas"
    Given user is on www.argos.co.uk
    When user hover the mouse on shop main menu
    Then user should be able to see pop up menu on the left hand side of the page which should contain Christmas


  Scenario: to verify user should be able to see submenu when hoovering on shop main menu then i want to see pop up menu
  on the left hand side of the page which should contain "Technology"
    Given user is on www.argos.co.uk
    When user hover the mouse on shop main menu
    Then user should be able to see pop up menu on the left hand side of the page which should contain Technology



  Scenario: to verify user should be able to see submenu when hoovering on shop main menu then i want to see pop up menu
  on the left hand side of the page which should contain "Home and Furniture"
    Given user is on www.argos.co.uk
    When user hover the mouse on shop main menu
    Then user should be able to see pop up menu on the left hand side of the page which should contain Home and Furniture

  Scenario: to verify user should be able to see submenu when hoovering on shop main menu then i want to see pop up menu
  on the left hand side of the page which should contain "Toys"
    Given user is on www.argos.co.uk
    When user hover the mouse on shop main menu
    Then user should be able to see pop up menu on the left hand side of the page which should contain Toys

  Scenario: To verify as a user when i hover the mouse on christmas menu I want to see "Lights"

    Given user is on www.argos.co.uk
    When user hover the mouse on shop main menu
    And user hover the mouse on Christmas menu
    Then user should be able to see Lights category
  Scenario: To verify as a user when i hover the mouse on christmas menu I want to see "Decoration"

    Given user is on www.argos.co.uk
    When user hover the mouse on shop main menu
    And user hover the mouse on Christmas menu
    Then user should be able to see Lights category


  Scenario: To verify as a user when i hover the mouse on Technology menu I want to see "Televisions"

    Given user is on www.argos.co.uk
    When user hover the mouse on shop main menu
    And user hover the mouse on Technology menu
    Then user should be able to see "Televisions" category


  Scenario: To verify as a user when i hover the mouse on Technology menu I want to see  "Phones"
    Given user is on www.argos.co.uk
    When user hover the mouse on shop main menu
    And user hover the mouse on Technology menu
    Then user should be able to see "Phones" category
