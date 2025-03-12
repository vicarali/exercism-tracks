public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int carsProducedPerHourAtLowestSpeed = 221;
        double cardsProducedPerHour = 0;

        if (speed <= 4) {
            cardsProducedPerHour = carsProducedPerHourAtLowestSpeed * speed;
        } else if (speed > 4 && speed <= 8) {
            cardsProducedPerHour = carsProducedPerHourAtLowestSpeed * speed * 0.9;
        } else if (speed == 9) {
            cardsProducedPerHour = carsProducedPerHourAtLowestSpeed * speed * 0.8;
        } else if (speed == 10) {
            cardsProducedPerHour = carsProducedPerHourAtLowestSpeed * speed * 0.77;
        }

        return cardsProducedPerHour;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
