Feature: Playing Wordle

  Players have to guess a five-letter word.
  -Correctly placed letters are as shown green (*)
  -Incorrectly placed letters are shown as yellow (+)
  -Letters not appearing in the word are represented as grey (-)

  Rule: Correctly placed letter appear in green
    Background:
      Given the target word is :
        | B | L | A | N | D |
    Scenario: Correctly placed letters
      When the player enters the following letters:
        | P | R | I | N | T |
      Then the squares should be coloredas follows:
        | - | - | - | * | - |
    Scenario: Letters that are present but not n the right place
      When the player enters the following letters:
        | B | R | A | I | N |
      Then the squares should be coloredas follows:
        | * | - | * | - | * |

  Rule: Repeated letters in the wrong spot appear in grey
    Scenario: Two incorrectly placed letters
      Given the target word is :
        | B | L | A | N | D |
      When the player enters the following letters:
        | L | A | B | E | L |
      Then the squares should be coloredas follows:
        | + | + | + | - | - |

  Rule: The player wins when they find he right word in 6 or less tries
    Scenario: Player guesses the right word
      Given the target word is :
        | B | L | A | N | D |
      When the player enters the following letters:
        | B | E | A | S | T |
        | B | R | I | A | N |
        | B | L | A | N | D |
      Then the squares should be coloredas follows:
        | * | - | * | - | - |
        | * | - | * | - | + |
        | * | * | * | * | * |


