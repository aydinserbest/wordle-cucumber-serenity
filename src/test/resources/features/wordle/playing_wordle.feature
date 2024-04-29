Feature: Playing Wordle

  Players have to guess a five-letter word.
  -Correctly placed letters are as shown green (*)
  -Incorrectly placed letters are shown as yellow (+)
  -Letters not appearing in the word are represented as grey (-)



  Rule: Repeated letters in the wrong spot appear in grey
    Scenario: Two incorrectly placed letters
      Given the target word is :
        | B | L | A | N | D |
      When the player enters the following letters:
        | L | A | B | E | L |
        | L | A | B | T | M |
      Then the squares should be colored as follows:
        | + | + | + | - | - |

