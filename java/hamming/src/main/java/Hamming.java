public class Hamming {
    private String leftStrand, rightStrand;

    public Hamming(String leftStrand, String rightStrand) throws IllegalArgumentException {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("strands must be of equal length");
        }

        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    public int getHammingDistance() {
        char[] leftStrandChars = leftStrand.toCharArray();
        char[] rightStrandChars = rightStrand.toCharArray();
        int totalDifferences = 0;

        for (int i = 0; i < leftStrandChars.length; i++) {
            if (leftStrandChars[i] != rightStrandChars[i]) totalDifferences++;
        }

        return totalDifferences;
    }
}
