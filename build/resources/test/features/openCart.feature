#language:en
# Autor: Tania Ruiz Sanchez

@stories
Feature: openCart
  As a user I want to filter the different data of the SEO URL list

  @scenario1

  Scenario Outline: Enter data to filter
    Given Tania wants to filter data in the SEO URL list
    When She enter the data in the filter field
      | username   | password   | seourl   | query   | keyword   | store   | language   | queryedit   | keywordedit   |
      | <username> | <password> | <seourl> | <query> | <keyword> | <store> | <language> | <queryedit> | <keywordedit> |

    Then She visualizes the information in SEO URL List
      | seourllist   |
      | <seourllist> |

    Examples:
      | username | password | seourl  | query         | keyword   | store   | language | queryedit      | keywordedit | seourllist   |
      | demo     | demo     | SEO URL | product_id=47 | hp-lp3065 | Default | English  | category_id=18 | NO          | SEO URL List |