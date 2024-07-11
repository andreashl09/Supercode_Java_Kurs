import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Time
 */
public class Time {

    public static void main(String[] args) {
        // aktuelles Datum ausgben
        LocalDateTime dateNow = LocalDateTime.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("E dd.MMM yyyy");
        System.out.println(dateNow.format(format1));
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(dateNow.format(format2));
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd.MM.yyyy | HH:mm");
        System.out.println(dateNow.format(format3));

        // verschiebe die Tage nach vorn oder nach hinten
        LocalDateTime dateTwoDayinFront = LocalDateTime.now().plusDays(2);
        System.out.println(dateTwoDayinFront.format(format1));
        LocalDateTime dateTwoDayinBack = LocalDateTime.now().minusDays(5);
        System.out.println(dateTwoDayinBack.format(format1));

        // berechne das Alter basierend auf die Angabe des Geburtsdatum
        LocalDate dateToday = LocalDate.now();
        LocalDate birthday = LocalDate.of(1983, 2, 19);
        int age = Period.between(birthday, dateToday).getYears();
        System.out.println("Alter ist: " + age);

        // berechne Zeitdifferenz zwischen zwei Zeitpunkten

        LocalDateTime date1 = LocalDateTime.of(2024, 7, 11, 17, 0, 0);
        Duration duration = Duration.between(dateNow, date1);
        System.out.println("Zeitdifferenz: " + duration.toHours() + " Stunden");

        // ermittle den Wochentag
        LocalDate randomDate = LocalDate.of(1980, 9, 2);
        DateTimeFormatter formatOnlyDay = DateTimeFormatter.ofPattern("E"); // EEEE gibt den vollständigen Wochentag
                                                                            // aus E nur die Abkürzung des Tags zb. Di.
        System.out.println(randomDate.format(formatOnlyDay));
        

        ArrayList testlist = new ArrayList<>();
        
    }
}