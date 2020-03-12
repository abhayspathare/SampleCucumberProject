Feature: Automation of end to end flow
Scenario: Basic workflow
Given user is on home page
When he searches for "dress"
And choose to buy first item
And moves to checkout from mini cart
And enters personal details on checkout page
And place the order
Then order gets placed successfully
