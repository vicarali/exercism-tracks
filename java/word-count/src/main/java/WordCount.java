import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import java.util.logging.Logger;

class WordCount {

    public Map<String, Integer> phrase(String input) {
        String processedInput = input.toLowerCase().trim();
        String[] words = processedInput.split("[, ]+");

        List<String> wordsList = new ArrayList<String>(Arrays.asList(words));
        removePunctuation(wordsList);

        Map<String, Integer> countResults = new HashMap<String, Integer>();
        countWords(wordsList, countResults);

        return countResults;
    }

    private List<String> removePunctuation(List<String> words) {
        Iterator<String> it = words.iterator();
        int listIndex = 0;

        while (it.hasNext()) {
            StringBuilder sb = new StringBuilder(it.next());

            if ((sb.length() == 1 && isPunctuationChar(sb.charAt(0)) || sb.length() == 0)) {
                it.remove();
                listIndex--;
            } else {
                removeLeadingPunctuation(sb);
                removeTrailingPunctuation(sb);
                words.set(listIndex, sb.toString());
            }

            listIndex++;
        }

        return words;
    }

    private boolean isPunctuationChar(char character) {
        char[] punctuationChars = {':', '!', '?', '&', '@', '$', '%', '^', '\'', '"', '\t', '\n', ',', '.'};

        for (char c : punctuationChars) {
            if (c == character) return true;
        }

        return false;
    }

    private void removeLeadingPunctuation(StringBuilder sb) {
        char leadingCharacter = sb.charAt(0);

        while (isPunctuationChar(leadingCharacter)) {
            sb.deleteCharAt(0);
            leadingCharacter = sb.charAt(0);
        }
    }

    private void removeTrailingPunctuation(StringBuilder sb) {
        char trailingCharacter = sb.charAt(sb.length() - 1);

        while (isPunctuationChar(trailingCharacter)) {
            sb.deleteCharAt(sb.length() - 1);
            trailingCharacter = sb.charAt(sb.length() - 1);
        }
    }

    private void countWords(List<String> words, Map<String, Integer> countResults) {
        for (String word : words) {
            int ocurrences = 1;

            if (countResults.containsKey(word)) {
                ocurrences += countResults.get(word);
            }

            countResults.put(word, ocurrences);
        }
    }
}
