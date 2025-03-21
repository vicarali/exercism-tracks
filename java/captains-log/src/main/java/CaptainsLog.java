import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private final Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(PLANET_CLASSES.length)];
    }

    String randomShipRegistryNumber() {
        final String registryNumberPrefix = "NCC-";
        final int minNumber = 1000;
        final int maxNumber = 9999;
        int randomRegistryNumber = minNumber + random.nextInt(maxNumber + 1 - minNumber);

        return registryNumberPrefix + randomRegistryNumber;
    }

    double randomStardate() {
        final int minStardate = 41000;
        final int maxStardate = 42000;

        return minStardate + (maxStardate - minStardate) * random.nextDouble();
    }
}
