package serenitydojo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.stream.Collectors;

import java.util.Collection;
import java.util.stream.Stream;


public class WordleStepDefinitions {
    @Given("the target word is :")
    public void the_target_word_is(DataTable dataTable) {
        List<List<String>> lists = dataTable.asLists(String.class); // asLists() kullanarak dönüştürme

        List<String> list = lists.stream()
                .flatMap(Collection::stream)
                .toList();

        String targetWord = String.join("", list); // Tek bir kelime oluştur
        System.out.println(targetWord);

    }
    @When("the player enters the following letters:")
    public void the_player_enters_the_following_letters(io.cucumber.datatable.DataTable dataTable) {

    }
    @Then("the squares should be coloredas follows:")
    public void the_squares_should_be_coloredas_follows(io.cucumber.datatable.DataTable dataTable) {

    }

}
