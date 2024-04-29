package serenitydojo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Collection;
import java.util.stream.Stream;


public class WordleStepDefinitions {
    String target;
    List<String> attempts;
    List<List<CellColor>> renderedRows;

    @Given("the target word is :")
    public void the_target_word_is(DataTable targetWord) {
        this.target = String.join("", targetWord.asLists().get(0));

        System.out.println(target);

    }
    @When("the player enters the following letters:")
    public void the_player_enters_the_following_letters(DataTable dataTable) {
        List<String> attempts2 = dataTable.asLists()
                .stream()
                .map(cellsInRow-> String.join("", cellsInRow))
                .toList();
        System.out.println(attempts2);

    }
    @Then("the squares should be colored as follows:")
    public void the_squares_should_be_coloredas_follows(DataTable dataTable) {
        this.renderedRows = dataTable.asLists()
                .stream()
                .map(listOfCellSymbols -> colored(listOfCellSymbols))
                .collect(Collectors.toList());

        System.out.println(renderedRows);

    }
    private List<CellColor> colored(List<String> listOfCellSymbols) {
        return listOfCellSymbols.stream()
                .map(symbol -> CellColor.withSymbol(symbol))
                .collect(Collectors.toList());
    }

}
