package jav.strategy_pattern.output_types.styles;

import java.util.Arrays;
import java.util.List;

public class QuadroScobesStyle implements StyleBehaviour{
    @Override
    public String setStyle(String text) {
        List<String> words = Arrays.asList(text.split(" "));
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            char[] chars = word.toCharArray();
            for (char c : chars) {
                sb.append("[" + c + "]");
            }
        }
        return String.valueOf(sb);
    }
}
