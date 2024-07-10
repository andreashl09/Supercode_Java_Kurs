import java.util.ArrayList;

/**
 * Main
 */
public class Bank {

    public static void main(String[] args) {
        ArrayList<Bankkonto> kontenList = new ArrayList<Bankkonto>();

        Bankkonto konto1 = new Bankkonto("Andreas", "DE33456757877");
        Bankkonto konto2 = new Bankkonto("Beatrix", "DE98765432101");
        Bankkonto konto3 = new Bankkonto("Carlos", "DE11223344556");
        Bankkonto konto4 = new Bankkonto("Diana", "DE22334455667");
        Bankkonto konto5 = new Bankkonto("Erik", "DE33445566778");
        Bankkonto konto6 = new Bankkonto("Franziska", "DE44556677889");
        Bankkonto konto7 = new Bankkonto("Gustav", "DE55667788990");
        Bankkonto konto8 = new Bankkonto("Hanna", "DE66778899001");
        Bankkonto konto9 = new Bankkonto("Isabel", "DE77889900112");
        Bankkonto konto10 = new Bankkonto("Jonas", "DE88990011223");

        kontenList.add(konto1);
        kontenList.add(konto2);
        kontenList.add(konto3);
        kontenList.add(konto4);
        kontenList.add(konto5);
        kontenList.add(konto6);
        kontenList.add(konto7);
        kontenList.add(konto8);
        kontenList.add(konto9);
        kontenList.add(konto10);

        // for (Bankkonto bankkonto : kontenList) {
        // bankkonto.gibKontoInformationen();
        // }

        konto1.einzahlen(200);
        konto1.ueberweisen(konto10, 100);

        konto10.ueberweisen(konto2, 20);

        konto1.ueberweisen(konto10, 1000);

        // for (Bankkonto bankkonto : kontenList) {
        // bankkonto.gibKontoInformationen();
        // }
        System.out.println("Kontoauszug von: " + konto1.getKontoInhaber());
        konto1.printKontoauszug();
        System.out.println("");
        System.out.println("Kontoauszug von: " + konto10.getKontoInhaber());
        konto10.printKontoauszug();
    }
}