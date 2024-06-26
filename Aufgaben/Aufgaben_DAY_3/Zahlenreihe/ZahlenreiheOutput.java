package Zahlenreihe;

public class ZahlenreiheOutput {

    public static void main(String[] args) {

        // Summe aller Zahlen zwischen 1 und 100
        int sum = 0; // Variable zur Speicherung der Summe initialisieren
        int max = 100; // Maximale Zahl für die Summenberechnung festlegen

        // Schleife zur Berechnung der Summe aller Zahlen von 1 bis max
        for (int i = 0; i <= max; i++) {
            sum += i; // Addiere die aktuelle Zahl i zur Summe hinzu
        }
        System.out.println("Summe aller Zahlen: " + sum); // Ausgabe der berechneten Summe

        sum = 0; // Summe zurücksetzen für die nächste Berechnung

        // Summe aller geraden Zahlen zwischen 1 und 100
        int i = 0; // Zählervariable initialisieren
        while (i <= max) {
            boolean isEvenNumber = i % 2 == 0; // Überprüfen, ob i eine gerade Zahl ist
            if (isEvenNumber) {
                sum += i; // Wenn i gerade ist, zur Summe hinzufügen
            }
            i++; // Inkrementiere den Zähler
        }
        System.out.println("Summe aller geraden Zahlen: " + sum); // Ausgabe der berechneten Summe der geraden Zahlen

        // Summe aller ungeraden Zahlen zwischen 1 und 100
        i = 0; // Zähler zurücksetzen für die nächste Berechnung
        sum = 0; // Summe zurücksetzen für die Berechnung der ungeraden Zahlen

        do {
            boolean isOddNumber = i % 2 != 0; // Überprüfen, ob i eine ungerade Zahl ist
            if (isOddNumber) {
                sum += i; // Wenn i ungerade ist, zur Summe hinzufügen
            }
            i++; // Inkrementiere den Zähler
        } while (i <= max);

        System.out.println("Summe aller ungeraden Zahlen: " + sum); // Ausgabe der berechneten Summe der ungeraden
                                                                    // Zahlen
    }

}
