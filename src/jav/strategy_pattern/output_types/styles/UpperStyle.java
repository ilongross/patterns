package jav.strategy_pattern.output_types.styles;

import java.util.Locale;

public class UpperStyle implements StyleBehaviour{

    @Override
    public String setStyle(String text) {
        return text.toUpperCase();
    }
}
