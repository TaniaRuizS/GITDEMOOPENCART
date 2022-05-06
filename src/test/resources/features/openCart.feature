#language:en
# Autor: Tania Ruiz Sanchez

@stories
Feature: openCart
  As a user I want to filter the different data of the SEO URL list

  Background: Load the page
    Given Tania wants to filter data in the SEO URL list

  @scenario1
  Scenario Outline: Enter data to filter
    When She enter the data in the filter field
      | username   | password   | seourl   | query   | keyword   | store   | language   |
      | <username> | <password> | <seourl> | <query> | <keyword> | <store> | <language> |

    Then She visualizes the information in SEO URL List
      | seourllist   |
      | <seourllist> |

    Examples:
      | username | password | seourl  | query             | keyword   | store   | language | seourllist   |
      | demo     | demo     | SEO URL | product_id=47     | hp-lp3065 | Default | English  | SEO URL List |
      | demo     | demo     | SEO URL | manufacturer_id=9 |           | Default | English  | SEO URL List |

  @scenario2
  Scenario Outline: filter to edit
    When She enters the data she wants to edit
      | username   | password   | seourl   | query   | keyword   | store   | language   | queryedit   | keywordedit   | storeedit   | languajeedit   |
      | <username> | <password> | <seourl> | <query> | <keyword> | <store> | <language> | <queryedit> | <keywordedit> | <storeedit> | <languajeedit> |

    Then She displays a warning message
      | warning   |
      | <warning> |

    Examples:
      | username | password | seourl  | query          | keyword         | store   | language | queryedit      | keywordedit | storeedit | languajeedit | warning                                                   |
      | demo     | demo     | SEO URL | product_id=47  | hp-lp3065       | Default | English  | category_id=18 | CORRECION   | Default   | English      | Warning: You do not have permission to modify SEO URL!\n× |
      | demo     | demo     | SEO URL | category_id=18 | laptop-notebook | Default | English  | EDICION        | CORRECION   | Default   | English      | Warning: You do not have permission to modify SEO URL!\n× |


  @scenario3
  Scenario Outline: Edit information leaving mandatory fields empty
    When She enters the data she wants to edit leaving a mandatory field empty
      | username   | password   | seourl   | queryedit   | keywordedit   |
      | <username> | <password> | <seourl> | <queryedit> | <keywordedit> |

    Then displays an alert message about the characters
      | characters   |
      | <characters> |

    Examples:
      | username | password | seourl  | queryedit      | keywordedit | characters                                   |
      | demo     | demo     | SEO URL | category_id=18 |             | Keyword must be between 3 and 64 characters! |
