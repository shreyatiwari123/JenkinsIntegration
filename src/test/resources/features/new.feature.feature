Feature: temp


  @datatable
  Scenario: Example sce
    Given I want to do something
    When I have a list of item to send //by using list
    | shreya |
    | neha   |
    | pooja  |
    | rajnish|
    | sunil  |
    When I have students and there marks //key value pair by using <map>
      | shreya | 12 |
      | neha   | 13 |
      | pooja  | 14 |
      | rajnish| 15 |
      | sunil  | 16 |
    Then something should happened

    @Example
    Scenario Outline: I want to search for a products
      Given I m on the search page
      When I search for a products as "<products>"
      Then result should be displayed related to "<products>"

      Examples:
      | products |
      | computer |
      | bags     |
      | earphone |
      | bluetooth|
      | keyboard |