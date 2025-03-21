import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/dd/yyyy " + "HH:mm:ss");

        return LocalDateTime.parse(appointmentDateDescription, formatter);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        final int appointmentHour = appointmentDate.getHour();

        return appointmentHour >= 12 && appointmentHour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter formatterDayYear = DateTimeFormatter.ofPattern("d, yyyy");
        DateTimeFormatter formatterHour = DateTimeFormatter.ofPattern("h:mm a");

        return String.format(
                "You have an appointment on %s, %s %s, at %s.",
                appointmentDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH),
                appointmentDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH),
                formatterDayYear.format(appointmentDate),
                formatterHour.format(appointmentDate)
        );
    }

    public LocalDate getAnniversaryDate() {
        int currentYear = LocalDate.now().getYear();
        final int anniversaryMonth = 9;
        final int anniversaryDay = 15;

        return LocalDate.of(currentYear, anniversaryMonth, anniversaryDay);
    }
}
