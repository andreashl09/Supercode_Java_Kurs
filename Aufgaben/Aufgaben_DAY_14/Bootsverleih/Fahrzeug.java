import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Fahrzeug {
    private String hersteller;
    private String type;
    private double pricePerHour;
    private ArrayList<Reservation> reservations;
    private ArrayList<Buchhaltung> bookings;
    private static int idCounter = 0;
    private int id;

    public Fahrzeug(String hersteller, String type, double pricePerHour) {
        this.hersteller = hersteller;
        this.pricePerHour = pricePerHour;
        this.id = Fahrzeug.idCounter + 1;
        Fahrzeug.idCounter++;
        this.reservations = new ArrayList<Reservation>();
        bookings = new ArrayList<>();
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setPricePerHour(double pricePerHour) {
        if (pricePerHour < 0.0)
            throw new IllegalArgumentException("Personcount muss positiv sein");
        this.pricePerHour = pricePerHour;
    }

    public int getId() {
        return this.id;
    }

    public double getPicePerHour() {
        return pricePerHour;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public ArrayList<Buchhaltung> getBookings() {
        return bookings;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Reservation addReservation(LocalDateTime from, LocalDateTime to, Person p) {
        // boolean licenceOK = !isLicenceRequired || isLicenceRequired &&
        // p.hasLicence();
        // if (!licenceOK)
        // throw new IllegalStateException("Licence required to book this boat");

        // check availability based on from and to values!!!
        boolean isAvailable = checkIsAvailable(from, to);
        if (!isAvailable)
            throw new IllegalStateException("Boat not available, please try a different time");

        Reservation reservation = new Reservation(p, from, to);
        reservations.add(reservation);
        generateBooking(from, to);
        return reservation;
    }

    private boolean checkIsAvailable(LocalDateTime from, LocalDateTime to) {
        // if can find a reservation that overlaps --> return false
        // else return true
        for (int i = 0; i < reservations.size(); i++) {
            Reservation reservation = reservations.get(i);
            boolean isOverlapping = to.isAfter(reservation.getFrom()) &&
                    from.isBefore(reservation.getTo());
            if (isOverlapping)
                return false;
        }
        return true;
    }

    public void printReservations() {
        System.out.println("Reservations of ");
        for (Reservation r : reservations) {
            System.out.println("\t" + r.toString());
        }
    }

    private void generateBooking(LocalDateTime from, LocalDateTime to) {
        Duration duration = Duration.between(from, to);
        double soldHour = duration.toMinutes() / 60;
        double earings = soldHour * this.pricePerHour;
        System.out.println(earings);
        Buchhaltung buchung = new Buchhaltung(LocalDateTime.now(), soldHour, earings);
        bookings.add(buchung);
    }

    public void printBookings() {
        System.out.println("Reservations of Buchnungen");
        for (Buchhaltung b : bookings) {
            System.out.println(
                    "\t" + b.getId() + " | " + b.getSoldHour() + " | " + b.getEarnings() + " | " + b.getTimestamp());
        }
    }
}
