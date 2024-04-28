Feature: Playing Wordle

  Players have to guess a five-letter word.
  -Correctly placed letters are as shown green (*)
  -Incorrectly placed letters are shown as yellow (+)
  -Letters not appearing in the word are represented as grey (-)

  Rule: Correctly placed letter appear in green
    Background:
      Given the target word is :
        | Gal | B | L | A | N | D |
    Scenario: Correctly placed letters
      When the player enters the following letters:
        | Attempt | P | R | I | N | T |
      Then the squares should be coloredas follows:
        | Result | - | - | - | * | - |
    Scenario: Letters that are present but not n the right place
      When the player enters the following letters:
        | Attempt | B | R | A | I | N |
      Then the squares should be coloredas follows:
        | Result | * | - | * | - | * |

  Rule: Repeated letters in the wrong spot appear in grey
    Scenario: Two incorrectly placed letters
      Given the target word is :
        | Gal | B | L | A | N | D |
      When the player enters the following letters:
        | Attempt | L | A | B | E | L |
      Then the squares should be coloredas follows:
        | Result | + | + | + | - | - |