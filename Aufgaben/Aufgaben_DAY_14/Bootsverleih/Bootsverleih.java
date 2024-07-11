import java.util.ArrayList;
import java.util.List;

public class Bootsverleih {
    private ArrayList<Boot> boote;
    private ArrayList<Person> kunden = new ArrayList<>();
    // private double umsatz;

    // the customer with the most reservation (count)

    public Bootsverleih() {
        this.boote = new ArrayList<>();
        this.kunden = new ArrayList<>();
    }

    public void addBoat(Boot boat) {
        this.boote.add(boat);
    }

    public void addCustomer(Person customer) {
        this.kunden.add(customer);
    }

    public Person topCustomer() {
        String[] topCustomers = new String[kunden.size()];
        int[][] topList = new int[kunden.size()][2];
        int index = 0;

        for (Person searchKunde : kunden) {
            int counter = 0;
            for (Boot boot : boote) {
                ArrayList<Reservation> reservierungen = boot.getReservations();

                for (Reservation reservierung : reservierungen) {
                    if (reservierung.getPerson() == searchKunde)
                        counter++;
                }
            }
            // fülle toplist
            topList[index][0] = index;
            topList[index][1] = counter;

            // sortiere topList absteigend
            for (int i = 0; i < topList.length - 1; i++) {
                if (topList[i][1] <= topList[i + 1][1]) {

                    int noteFirstInt = topList[i + 1][0];
                    topList[i + 1][0] = topList[i][0];
                    topList[i][0] = noteFirstInt;

                    int noteSecondInt = topList[i + 1][1];
                    topList[i + 1][1] = topList[i][1];
                    topList[i][1] = noteSecondInt;
                }
            }
            counter = 0;
            index++;
        }
        System.out.println("Der Topcustomer: " + kunden.get(topList[1][0]).getName() + " mit " + topList[1][1]
                + " Reservierungen");

        return null;
    }
}
