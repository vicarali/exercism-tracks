class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int numOfNaturalNumbers) {
        int total = 0;

        for (int i = 0; i <= numOfNaturalNumbers; i++) {
            total += i;
        }

        return total * total;
    }

    int computeSumOfSquaresTo(int numOfNaturalNumbers) {
        int total = 0;

        for (int i = 0; i <= numOfNaturalNumbers; i++) {
            int currentNumberSquare = i * i;
            total += currentNumberSquare;
        }

        return total;
    }

    int computeDifferenceOfSquares(int numOfNaturalNumbers) {
        int squareOfSum = computeSquareOfSumTo(numOfNaturalNumbers);
        int sumOfSquares = computeSumOfSquaresTo(numOfNaturalNumbers);

        return squareOfSum - sumOfSquares;
    }

}
