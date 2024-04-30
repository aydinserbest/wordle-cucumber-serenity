package com.serenitydojo.wordle;

import com.serenitydojo.wordle.model.CellColor;

import java.util.ArrayList;
import java.util.List;

public class WordleGame {

    private final String targetWord;

    public WordleGame(String targetWord) {
        this.targetWord = targetWord;
    }

    public String getTargetWord() {
        return targetWord;
    }

    public void play(String attempt) {
    }

    public List<List<CellColor>> getRenderedCells() {
        return new ArrayList<>();
    }
}
