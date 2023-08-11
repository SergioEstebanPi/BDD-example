Feature: Evaluate percentage

  Scenario: Verify 10% offer
    Given Execute DiscountService
    When if I will enter 5001
    Then we should get ten percentage discount

  Scenario: Verify 15% offer
    Given Execute DiscountService
    When if I will enter 11000
    Then we should get fifteen percentage discount