package serenitydojo.wordle.model;

import com.serenitydojo.wordle.model.CellColor;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenRenderingACell {
    @Test
    public void matchingLettersInTheRightSpot(){
        // target word: weary
        // position, letter
        assertThat(RenderedCell.forTargetWord("weary").forEntry("w", 0)).isEqualTo(CellColor.GREEN);
    }
}
