package serenitydojo.wordle.model;

import com.serenitydojo.wordle.model.CellColor;

public class RenderedCell {
    private final String targetWord;

    public RenderedCell(String targetWord) {

        this.targetWord = targetWord;
    }

    public static RenderedCell forTargetWord(String targetWord) {
        return new RenderedCell(targetWord);
    }

    public CellColor forEntry(char letter, int position) {
        if (targetWord.charAt(position) == letter) {
            return CellColor.GREEN;
        } else if (targetWord.contains(String.valueOf(letter))) {
            return CellColor.YELLOW;
        } else if (!targetWord.contains(String.valueOf(letter))) {
            return CellColor.GRAY;
        }
        return null;
    }
}
