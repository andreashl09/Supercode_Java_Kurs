
import java.time.LocalDateTime;

public class Buchhaltung {

    private static int bookingIdCounter = 0;
    private int id;
    private LocalDateTime timestamp;
    private double soldHour;
    private double earnings;

    public Buchhaltung(LocalDateTime now, double hours, double earings) {
        this.soldHour = hours;
        this.earnings = earings;
        this.timestamp = now;
        this.id = Buchhaltung.bookingIdCounter;
        bookingIdCounter++;
    }

    public static int getBookingIdCounter() {
        return bookingIdCounter;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public double getSoldHour() {
        return soldHour;
    }

    public double getEarnings() {
        return earnings;
    }

}
