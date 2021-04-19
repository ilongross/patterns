package jav.strategy_pattern.output_types.prints;

import java.util.Arrays;
import java.util.List;

public class CharsBySpacesPrint implements PrintBehaviour{
    @Override
    public String setTypeOutput(String text) {
        List<String> wordsList = Arrays.asList(text.split(" "));
        StringBuilder sb = new StringBuilder();
        for (String word : wordsList) {
            char[] chars = word.toCharArray();
            for (char c : chars) {
                sb.append(c + " ");
            }
        }
        return String.valueOf(sb);
    }
}
