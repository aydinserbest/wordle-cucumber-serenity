Feature: Playing Wordle

  Players have to guess a five-letter word.
  -Correctly placed letters are as shown green (*)
  -Incorrectly placed letters are shown as yellow (+)
  -Letters not appearing in the word are represented as grey (-)


  Rule: Repeated letters in the wrong spot appear in grey
    Scenario: Two incorrectly placed letters
      Given the target word is :
        | first letter | second letter |
        | M            | L             |
      When the player enters the following letters:
        | first letter | second letter |
        | L            | A             |
        | K            | M             |
      Then the squares should be colored as follows:
        | + | + | + | - | - |

