package com.serenitydojo.wordle;

import com.serenitydojo.wordle.model.CellColor;
import serenitydojo.wordle.model.RenderedCell;

import java.util.ArrayList;
import java.util.List;

public class WordleGame {

    private final String targetWord;
    List<List<CellColor>> stateOfPlay = new ArrayList<>();

    public WordleGame(String targetWord) {
        this.targetWord = targetWord;
    }

    public void play(String attempt) {
        List<CellColor> renderedAttempts = new ArrayList<>();
        for (int pos = 0; pos < attempt.length(); pos++) {
            char letter = attempt.charAt(pos);
            CellColor cellColor = RenderedCell.forTargetWord(targetWord).forEntry(letter, pos);
            renderedAttempts.add(cellColor);
        }
        stateOfPlay.add(renderedAttempts);
    }

    public List<List<CellColor>> getRenderedCells() {
        return stateOfPlay;
    }
}
