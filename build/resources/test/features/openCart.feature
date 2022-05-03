#language:en
# Autor: Tania Ruiz Sanchez

@stories
Feature: openCart
  As a user I want to filter the different data of the SEO URL list

  @scenario1

Scenario Outline: Enter data to filter
    Given Tania wants to filter data in the SEO URL list
    When She enter the data in the filter field
      | username   | password   | seourl   | query   | keyword   | store   | language   |
      | <username> | <password> | <seourl> | <query> | <keyword> | <store> | <language> |


    Then She looks for the information on the filter button

    Examples:
      | username | password | seourl  | query          | keyword   | store   | language |
      | demo     | demo     | Banners | product_id=47  | hp-lp3065 | Default | English  |
      | demo     | demo     | SEO URL | product_id=41  | iphone    | Default | English  |
      | demo     | demo     | SEO URL | category_id=18 |           |         |          |