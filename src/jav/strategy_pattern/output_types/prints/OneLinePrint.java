package jav.strategy_pattern.output_types.prints;

public class OneLinePrint implements PrintBehaviour{

    @Override
    public String setTypeOutput(String text) {
        return text.replace("\n", " ");
    }
}
