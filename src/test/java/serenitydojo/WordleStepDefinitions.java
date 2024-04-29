package serenitydojo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordleStepDefinitions {
    String target;
    List<String> attempts;
    List<List<CellColor>> renderedRows;

    @Given("the target word is :")
    public void the_target_word_is(DataTable targetWord) {
       Map<String,String> list = targetWord.asMap();
        System.out.println(list);


    }
    @When("the player enters the following letters:")
    public void the_player_enters_the_following_letters(DataTable dataTable) {
        //List<Map<String,String>> lists = dataTable.asMaps();
        List<Map<String,String>> lists = dataTable.asMaps();
        System.out.println(lists);


    }
    @Then("the squares should be colored as follows:")
    public void the_squares_should_be_coloredas_follows(DataTable dataTable) {


    }



}
