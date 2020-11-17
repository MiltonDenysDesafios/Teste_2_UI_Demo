#Author: milton Denys

@run_demo_test
Feature: Demo

  
  Scenario: Validate an order process 
    Given I acess the Home page 
	  And Search for any product
		And Access this product on the table grid
		And Add this product to the cart
		When Check the item on the cart and total price
#		And Do the Checkout
#		And Select the “Phone Order” Payment
#		Then Proceed with the order