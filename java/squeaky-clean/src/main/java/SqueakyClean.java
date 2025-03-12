class SqueakyClean {
    static String clean(String identifier) {
        String identifierWithoutWhitespaces = replaceWhitespaces(identifier);

        return identifierWithoutWhitespaces;
    }

    static String replaceWhitespaces(String identifier) {
        StringBuilder sb = new StringBuilder(identifier);

        int currentWhiteSpaceOccurence = sb.indexOf(" ");
        while(currentWhiteSpaceOccurence != -1) {
            sb.replace(currentWhiteSpaceOccurence, currentWhiteSpaceOccurence+1, "_");
            currentWhiteSpaceOccurence = sb.indexOf(" ");
        }

        return sb.toString();
    }

    static String convertFromKebabCaseToCamelCase(String identifier) {
        StringBuilder sb = new StringBuilder(identifier);

        int currentHyphenOccurence = sb.indexOf("-");
        while(currentHyphenOccurence != -1) {
            sb.deleteCharAt(currentHyphenOccurence);

            char nextChar = sb.charAt(currentHyphenOccurence);
            sb.replaceCharAt(nextChar)
        }

        return sb.toString();
    }
}
