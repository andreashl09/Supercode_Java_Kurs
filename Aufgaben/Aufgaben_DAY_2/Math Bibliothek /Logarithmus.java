public class Logarithmus {

    public static void main(String[] args) {
        // Logarithmus berechnen

        double zahl = 100; // Die Zahl, von der der Logarithmus berechnet werden soll
        double basis = 10; // Die Basis des Logarithmus (hier: Logarithmus zur Basis 10)

        double ergebnis = Math.log10(zahl); // Berechnung des Logarithmus zur Basis 10

        System.out.println("Der Logarithmus von " + zahl + " zur Basis " + basis + " ist: " + ergebnis);

    }
}