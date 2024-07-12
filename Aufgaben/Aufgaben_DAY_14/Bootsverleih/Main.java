import java.time.LocalDateTime;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        Bootsverleih rentABoat = new Bootsverleih();

        Boot boot1 = new Boot("Jeanneau", "Segelboot", 4, false, 20);
        Boot boot2 = new Boot("Bayliner", "Motorboot", 4, false, 36);
        Boot boot3 = new Boot("Cobalt Boats", "Motorboot", 2, true, 28);
        Boot boot4 = new Boot("Beneteau", "Segelboot", 16, true, 92);
        Boot boot5 = new Boot("Najad Yachts", "Segelboot", 2, false, 16);
        Boot boot6 = new Boot("Searay", "Motorboot", 4, true, 140);

        rentABoat.addBoat(boot1);
        rentABoat.addBoat(boot2);
        rentABoat.addBoat(boot3);
        rentABoat.addBoat(boot4);
        rentABoat.addBoat(boot5);
        rentABoat.addBoat(boot6);

        Person andreas = new Person("Andreas", true);
        Person anton = new Person("Anton", true);
        Person peter = new Person("Peter", false);

        rentABoat.addCustomer(peter);
        rentABoat.addCustomer(andreas);
        rentABoat.addCustomer(anton);

        LocalDateTime sonnabend12 = LocalDateTime.of(2024, Month.JULY, 13, 12, 0);
        LocalDateTime sonntag11 = LocalDateTime.of(2024, Month.JULY, 14, 11, 0);
        LocalDateTime sonntagNach11 = LocalDateTime.of(2024, Month.JULY, 14, 11, 1);
        LocalDateTime montag12 = LocalDateTime.of(2024, Month.JULY, 15, 12, 0);

        // -------

        LocalDateTime dienstag10 = LocalDateTime.of(2024, Month.JULY, 16, 10, 0);
        LocalDateTime mittwoch9 = LocalDateTime.of(2024, Month.JULY, 17, 9, 0);
        LocalDateTime donnerstag8 = LocalDateTime.of(2024, Month.JULY, 18, 8, 0);
        LocalDateTime freitag7 = LocalDateTime.of(2024, Month.JULY, 19, 7, 0);
        LocalDateTime samstag6 = LocalDateTime.of(2024, Month.JULY, 20, 6, 0);
        LocalDateTime sonntag5 = LocalDateTime.of(2024, Month.JULY, 21, 5, 0);
        LocalDateTime montag4 = LocalDateTime.of(2024, Month.JULY, 22, 4, 0);
        LocalDateTime dienstag3 = LocalDateTime.of(2024, Month.JULY, 23, 3, 0);
        LocalDateTime mittwoch2 = LocalDateTime.of(2024, Month.JULY, 24, 2, 0);
        LocalDateTime donnerstag1 = LocalDateTime.of(2024, Month.JULY, 25, 1, 0);

        // boot3.addReservation(sonnabend12, sonntag11, peter); // Licence required!

        boot3.addReservation(sonnabend12, sonntag11, andreas);
        boot3.addReservation(donnerstag8, freitag7, andreas);
        boot3.addReservation(samstag6, sonntag5, andreas);

        boot3.addReservation(sonntagNach11, montag12, anton);

        boot2.addReservation(mittwoch2, donnerstag1, peter);
        boot2.addReservation(dienstag10, mittwoch9, peter);

        boot3.printReservations();

        rentABoat.topCustomer();
        rentABoat.topBoat();
        rentABoat.worstBoat();

        boot2.printBookings();

    }
}
