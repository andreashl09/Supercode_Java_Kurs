import java.util.ArrayList;

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
            counter = 0;
            index++;
        }
        sortArray(topList);
        System.out.println("Der Topcustomer: " + kunden.get(topList[0][0]).getName() + " mit " + topList[0][1]
                + " Reservierungen");
        return kunden.get(topList[0][0]);
    }

    public Boot topBoat() {
        int[][] topList = getIndex();
        // sortiere topList absteigend
        sortArray(topList);
        System.out.println(
                "Der TopBoot: " + boote.get(topList[0][0]).getId() + " mit " + topList[0][1] + " Reservierungen");
        return boote.get(topList[0][0]);
    }

    public Boot worstBoat() {
        int[][] topList = getIndex();
        // sortiere topList absteigend
        sortArrayReverse(topList);
        System.out.println(
                "Das Boot: " + boote.get(topList[0][0]).getId() + " ist mit " + topList[0][1]
                        + " Reservierungen das Schlechteste");
        return boote.get(topList[0][0]);
    }

    private int[][] getIndex() {
        int[][] topList = new int[boote.size()][2];
        int index = 0;

        for (Boot boot : boote) {
            ArrayList<Reservation> reservierungen = boot.getReservations();
            topList[index][1] = reservierungen.size();
            topList[index][0] = index;
            index++;
        }
        return topList;
    }

    private void sortArray(int[][] topList) {
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
    }

    private void sortArrayReverse(int[][] topList) {
        for (int i = 0; i < topList.length - 1; i++) {
            if (topList[i][1] >= topList[i + 1][1]) {

                int noteFirstInt = topList[i + 1][0];
                topList[i + 1][0] = topList[i][0];
                topList[i][0] = noteFirstInt;

                int noteSecondInt = topList[i + 1][1];
                topList[i + 1][1] = topList[i][1];
                topList[i][1] = noteSecondInt;
            }
        }
    }
}
