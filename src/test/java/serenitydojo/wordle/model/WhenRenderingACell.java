package serenitydojo.wordle.model;

import com.serenitydojo.wordle.model.CellColor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When rendering a cell")
public class WhenRenderingACell {
    @Test
    @DisplayName("should return green for matching letters in the right spot")
    public void matchingLettersInTheRightSpot(){
        // target word: weary
        // position, letter
        assertThat(RenderedCell.forTargetWord("weary").forEntry('w', 0)).isEqualTo(CellColor.GREEN);
    }
    @Test
    @DisplayName("should return yellow for matching letters in the wrong spot")
    public void matchingLettersInTheWrongSpot(){
        // target word: weary
        // position, letter
        assertThat(RenderedCell.forTargetWord("weary").forEntry('w', 1)).isEqualTo(CellColor.YELLOW);
    }
    @Test
    @DisplayName("should return gray for non-matching letters in the wrong spot")
    public void nonMatchingLettersInTheWrongSpot(){
        // target word: weary
        // position, letter
        assertThat(RenderedCell.forTargetWord("weary").forEntry('w', 1)).isEqualTo(CellColor.GRAY);
    }
}
