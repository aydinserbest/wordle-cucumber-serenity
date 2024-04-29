package serenitydojo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordleStepDefinitions {

    @Given("the target word is :")
    public void the_target_word_is(List<List<String>> list) {
       // List<String> list = dataTable.asList();
        List<String> collect = list.stream()
                .flatMap(List::stream)
                .toList();   //   [B, A, C, D, H, A, C, Y]
        System.out.println(collect);
        System.out.println(list);    //   [ [B, A, C, D], [H, A, C, Y] ]


    }
    @When("the player enters the following letters:")
    public void the_player_enters_the_following_letters(io.cucumber.datatable.DataTable dataTable) {
       List<List<String>> list = dataTable.asLists();
        System.out.println(list);

    }
    @Then("the squares should be coloredas follows:")
    public void the_squares_should_be_coloredas_follows(io.cucumber.datatable.DataTable dataTable) {

    }

}
