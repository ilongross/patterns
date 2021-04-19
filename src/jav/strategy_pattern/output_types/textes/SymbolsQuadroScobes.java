package jav.strategy_pattern.output_types.textes;

import jav.strategy_pattern.output_types.prints.CharsBySpacesPrint;
import jav.strategy_pattern.output_types.prints.OneLinePrint;
import jav.strategy_pattern.output_types.prints.PrintBehaviour;
import jav.strategy_pattern.output_types.styles.LowerStyle;
import jav.strategy_pattern.output_types.styles.QuadroScobesStyle;
import jav.strategy_pattern.output_types.styles.StyleBehaviour;

public class SymbolsQuadroScobes implements TextInterface{

    private String text;
    private PrintBehaviour printBehaviour;
    private StyleBehaviour styleBehaviour;

    public SymbolsQuadroScobes(String text) {
        this.text = text;
        this.printBehaviour = new OneLinePrint();
        this.styleBehaviour = new LowerStyle();
    }

    @Override
    public void setupSettings() {
        this.text =  printBehaviour.setTypeOutput(this.text);
        this.text = styleBehaviour.setStyle(this.text);
    }

    public void setPrintBehaviour(PrintBehaviour printBehaviour) {
        this.printBehaviour = printBehaviour;
    }

    public void setStyleBehaviour(StyleBehaviour styleBehaviour) {
        this.styleBehaviour = styleBehaviour;
    }

    @Override
    public String toString() {
        return text;
    }
}
