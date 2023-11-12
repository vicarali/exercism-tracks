import java.util.stream.*;

class MicroBlog {
    final static int MAX_CHARACTERS = 5;

    public String truncate(String input) {
        if (input.length() <= MAX_CHARACTERS) return input;

        IntStream inputCodePoints = input.codePoints();
        IntStream inputCodePointsTruncated = inputCodePoints.limit(MAX_CHARACTERS);

        return new String(inputCodePointsTruncated.toArray(), 0, MAX_CHARACTERS);
    }
}
