package jav.strategy_pattern.output_types;

import jav.strategy_pattern.output_types.prints.CharsBySpacesPrint;
import jav.strategy_pattern.output_types.styles.QuadroScobesStyle;
import jav.strategy_pattern.output_types.styles.UpperStyle;
import jav.strategy_pattern.output_types.textes.LineUpperCase;
import jav.strategy_pattern.output_types.textes.SymbolsQuadroScobes;
import jav.strategy_pattern.output_types.textes.TextInterface;
import jav.strategy_pattern.output_types.textes.WordInLineLowerCase;

public class App {
    public static void main(String[] args) {
        TextInterface text1 = new LineUpperCase(TextForTest.getText());
        text1.setPrintBehaviour(new CharsBySpacesPrint());
        text1.setStyleBehaviour(new UpperStyle());

        TextInterface text2 = new WordInLineLowerCase(TextForTest.getText());
        text2.setStyleBehaviour(new QuadroScobesStyle());

        TextInterface text3 = new SymbolsQuadroScobes(TextForTest.getText());
        text3.setPrintBehaviour(new CharsBySpacesPrint());

        text1.setupSettings();
        text2.setupSettings();
        text3.setupSettings();

        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
    }
}
