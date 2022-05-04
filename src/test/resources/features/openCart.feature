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

    Then She visualizes the information in SEO URL List
      | seourllist   |
      | <seourllist> |

    Examples:
      | username | password | seourl  | query         | keyword   | store   | language | seourllist   |
      | demo     | demo     | SEO URL | product_id=47 | hp-lp3065 | Default | English  | SEO URL List |

  @scenario2
  Scenario Outline: filter to edit
    Given Tania wants to edit data from the list consulted in SEO URL
    When She enters the data she wants to edit
      | username   | password   | seourl   | query   | keyword   | store   | language   | queryedit   | keywordedit   |
      | <username> | <password> | <seourl> | <query> | <keyword> | <store> | <language> | <queryedit> | <keywordedit> |

    Then She displays a warning message
      | warning   |
      | <warning> |

    Examples:
      | username | password | seourl  | query         | keyword   | store   | language | queryedit      | keywordedit | warning |
      | demo     | demo     | SEO URL | product_id=47 | hp-lp3065 | Default | English  | category_id=18 | NO          | Warning |


  @scenario3
  Scenario Outline: Edit information leaving mandatory fields empty
    Given Tania wants to edit list data leaving mandatory fields empty
    When She enters the data she wants to edit leaving a mandatory field empty
      | username   | password   | seourl   | queryedit   | keywordedit   |
      | <username> | <password> | <seourl> | <queryedit> | <keywordedit> |

    Then displays an alert message about the characters
      | characters |
      |<characters>|

    Examples:
      | username | password | seourl  | queryedit      | keywordedit | characters |
      | demo     | demo     | SEO URL | category_id=18 |             |characters  |
