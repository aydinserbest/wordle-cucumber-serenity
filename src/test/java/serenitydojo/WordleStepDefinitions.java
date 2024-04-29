package serenitydojo;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.stream.Collectors;

public class WordleStepDefinitions {
    private List<Character> targetWord;
    @Given("the target word is :")
    public void the_target_word_is(List<List<String>> rows) {
        // Her satırı (aslında burada tek bir satır var) işle
         targetWord = rows.get(0).stream()  // İlk ve tek satırı al
                .map(s -> s.charAt(0))  // Her string'in ilk karakterini al
                .collect(Collectors.toList());
        System.out.println("Target Word: " + targetWord);

    }
    @When("the player enters the following letters:")
    public void the_player_enters_the_following_letters(io.cucumber.datatable.DataTable dataTable) {

    }
    @Then("the squares should be coloredas follows:")
    public void the_squares_should_be_coloredas_follows(io.cucumber.datatable.DataTable dataTable) {

    }

}
