package jav.strategy_pattern.output_types.prints;

import java.util.List;

public class WordInLinePrint implements PrintBehaviour{
    @Override
    public String setTypeOutput(String text) {
        String newText = text.replace(" ", "\n");
        return newText;
    }
}
