import java.util.HashMap;

class SqueakyClean {
    static String clean(String identifier) {
        String identifierWithoutWhitespaces = replaceWhitespaces(identifier);
        String identifierInCamelCase = convertFromKebabCaseToCamelCase(identifierWithoutWhitespaces);
        String identifierWithoutLeetSpeak = convertFromLeetSpeakToNormalText(identifierInCamelCase);
        String identifierWithoutNonLetters = removeNonLetters(identifierWithoutLeetSpeak);

        return identifierWithoutNonLetters;
    }

    private static String replaceWhitespaces(String identifier) {
        StringBuilder sb = new StringBuilder(identifier);

        int currentWhiteSpaceOccurence = sb.indexOf(" ");
        while(currentWhiteSpaceOccurence != -1) {
            sb.replace(currentWhiteSpaceOccurence, currentWhiteSpaceOccurence+1, "_");
            currentWhiteSpaceOccurence = sb.indexOf(" ");
        }

        return sb.toString();
    }

    private static String convertFromKebabCaseToCamelCase(String identifier) {
        StringBuilder sb = new StringBuilder(identifier);

        int currentHyphenOccurence = sb.indexOf("-");
        while(currentHyphenOccurence != -1) {
            sb.deleteCharAt(currentHyphenOccurence);

            char nextChar = sb.charAt(currentHyphenOccurence);
            String capitalizedNextCharString = String.valueOf(nextChar).toUpperCase();
            sb.replace(currentHyphenOccurence, currentHyphenOccurence+1, capitalizedNextCharString);

            currentHyphenOccurence = sb.indexOf("-");
        }

        return sb.toString();
    }

    private static String convertFromLeetSpeakToNormalText(String identifier) {
        StringBuilder sb = new StringBuilder(identifier);

        HashMap<Character, Character> leetSpeakCharacters = new HashMap<>();
        leetSpeakCharacters.put('4', 'a');
        leetSpeakCharacters.put('3', 'e');
        leetSpeakCharacters.put('0', 'o');
        leetSpeakCharacters.put('1', 'l');
        leetSpeakCharacters.put('7', 't');

        for (int i = 0; i < sb.length(); i++) {
            char currentChar = sb.charAt(i);

            if(leetSpeakCharacters.containsKey(currentChar)) {
                sb.replace(i, i+1, leetSpeakCharacters.get(currentChar).toString());
            }
        }

        return sb.toString();
    }

    private static String removeNonLetters(String identifier) {
        StringBuilder sb = new StringBuilder(identifier);

        for (int i = 0; i < sb.length(); i++) {
            char currentChar = sb.charAt(i);

            if(!Character.isLetter(currentChar) && currentChar != '_') {
                sb.deleteCharAt(i);
                i--;
            }
        }

        return sb.toString();
    }
}
