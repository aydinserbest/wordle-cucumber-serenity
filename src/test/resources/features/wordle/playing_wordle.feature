Feature: Playing Wordle

  Players have to guess a five-letter word.
  -Correctly placed letters are as shown green (*)
  -Incorrectly placed letters are shown as yellow (+)
  -Letters not appearing in the word are represented as grey (-)

  Rule: Correctly placed letter appear in green
    Background:
      Given the target word is :
        | B | L |
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



