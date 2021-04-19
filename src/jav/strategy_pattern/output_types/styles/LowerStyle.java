package jav.strategy_pattern.output_types.styles;

public class LowerStyle implements StyleBehaviour{
    @Override
    public String setStyle(String text) {
        return text.toLowerCase();
    }
}
