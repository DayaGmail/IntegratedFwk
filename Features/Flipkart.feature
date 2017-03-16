@FullTest
Feature: FlipkartFulltest

@Test
Scenario:
Login to page 
Given I navigate to Flipkart
When I search "mobiles"
And I search for "Gionee" and select Ram as "2 GB - 3 GB"
Then I should see First phone as "Gionee"
