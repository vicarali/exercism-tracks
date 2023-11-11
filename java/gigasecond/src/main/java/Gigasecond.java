import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Gigasecond {
    LocalDateTime currentDate;
    static int gigasecond = 1000000000;

    public Gigasecond(LocalDate moment) {
        this.currentDate = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        this.currentDate = moment;
    }

    public LocalDateTime getDateTime() {
        return currentDate.plus(gigasecond, ChronoUnit.SECONDS);
    }
}
