package serenitydojo.wordle.model;

import com.serenitydojo.wordle.model.CellColor;

public class RenderedCell {
    private final String targetWord;

    public RenderedCell(String targetWord) {

        this.targetWord = targetWord;
    }

    public static RenderedCell forTargetWord(String targetWord){
        return new RenderedCell(targetWord);
    }

    public CellColor forEntry(String letter, int position) {
        return null;
    }
}
