package jav.strategy_pattern.output_types.textes;

import jav.strategy_pattern.output_types.prints.PrintBehaviour;
import jav.strategy_pattern.output_types.styles.StyleBehaviour;

public interface TextInterface {
    public void setupSettings();
    public void setPrintBehaviour(PrintBehaviour print);
    public void setStyleBehaviour(StyleBehaviour style);
}
