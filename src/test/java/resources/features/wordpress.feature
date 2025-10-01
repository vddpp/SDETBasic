Feature: Verify WordPress Website functionality

  Scenario: User verifies WordPress homepage and navigates to Get WordPress
    Given User launches the WordPress homepage
    Then Verify the title of the page is "Blog Tool, Publishing Platform, and CMS – WordPress.org"

  Scenario: User hovers over and click and verify 'Get WordPress' text
    Given User launches the WordPress homepage
    When User hovers and clicks 'Get WordPress'
    Then Verify the text is "Get WordPress"

  Scenario: User navigates to Community and Photo Directory and searches for an image and verifies resultsy
    Given User launches the WordPress homepage
    When User clicks on 'Community' and then 'Photo Directory'
    Then User searches for an image "WordPress Logo"
    And Verify the image is displayed