/**
 * BuchListe
 */
public class BuchListe {

    public static void main(String[] args) {

        Buch buch1 = new Buch("Der Schatten des Windes", "Carlos Ruiz Zafón", "978-3-596-16809-5", 576);
        Buch buch2 = new Buch("Der Alchimist", "Paulo Coelho", "978-3-423-21377-4", 208);
        Buch buch3 = new Buch("Das Parfum", "Patrick Süskind", "978-3-257-22957-0", 336);
        Buch buch4 = new Buch("Die Verwandlung", "Franz Kafka", "978-3-596-90414-2", 144);
        Buch buch5 = new Buch("Siddhartha", "Hermann Hesse", "978-3-518-36600-2", 160);
        Buch buch6 = new Buch("Siddhartha", "Hermann Hesse", "978-3-518-36600-2", 160);

        Buch[] buecher = new Buch[6];
        buecher[0] = buch1;
        buecher[1] = buch2;
        buecher[2] = buch3;
        buecher[3] = buch4;
        buecher[4] = buch5;
        buecher[5] = buch6;

        printAll(buecher);
        System.out.println("----------------------------");

        sucheNachISBN(buecher, "978-3-518-36600-2");
    }

    public static void sucheNachISBN(Buch[] buecher, String searchISBN) {
        for (Buch buch : buecher) {
            if (buch.getIsbn().equals(searchISBN))
                buch.druckeDetails();
        }
    }

    public static void printAll(Buch[] buecher) {
        for (Buch buch : buecher) {
            buch.druckeDetails();
        }
    }
}