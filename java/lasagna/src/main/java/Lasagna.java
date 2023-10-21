public class Lasagna {
    public static int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int currentMinutesInOven) {
        return Lasagna.expectedMinutesInOven() - currentMinutesInOven;
    }

    public int preparationTimeInMinutes(int lasagnaLayers) {
        int minutesPerLayer = 2;

        return lasagnaLayers * minutesPerLayer;
    }

    public int totalTimeInMinutes(int lasagnaLayers, int currentMinutesInOven) {
        return preparationTimeInMinutes(lasagnaLayers) + currentMinutesInOven;
    }
}
