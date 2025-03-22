class NeedForSpeed {
    private final int speed, batteryDrain;
    private int distanceDriven;
    private int currentBattery = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public static NeedForSpeed nitro() {
        final int nitroModelSpeed = 50;
        final int nitroModelBatteryDrain = 4;
        return new NeedForSpeed(nitroModelSpeed, nitroModelBatteryDrain);
    }

    public boolean batteryDrained() {
        return batteryDrain > currentBattery;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            this.distanceDriven += this.speed;
            this.currentBattery -= batteryDrain;
        }
    }
}

class RaceTrack {
    private final int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        boolean canFinish = false;

        while (car.distanceDriven() < distance && !car.batteryDrained()) {
            car.drive();

            if (car.distanceDriven() >= distance) canFinish = true;
        }

        return canFinish;
    }
}
