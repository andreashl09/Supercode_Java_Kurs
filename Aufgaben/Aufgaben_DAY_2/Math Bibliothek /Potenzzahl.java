public class Potenzzahl {

    public static void main(String[] args) {
        // Potenzrechnen

        // Beispiel: 5 hoch 3
        // a ist die Basis
        // n ist der Exponent

        int a = 5; // Die Basis der Potenz
        int n = 3; // Der Exponent der Potenz
        int potenzZahl = a; // Initialisiere potenzZahl mit der Basis a

        // Berechnung der Potenz mit einer for-Schleife
        for (int i = 0; i < n - 1; i++) {
            potenzZahl *= a; // Multipliziere potenzZahl mit a für jeden Durchlauf der Schleife
        }
        System.out.println(potenzZahl); // Gib das Ergebnis der Potenzberechnung aus

        // Berechnung der Potenz mit der Klasse Math
        double zahl = Math.pow(a, n); // Verwende Math.pow für die Potenzberechnung
        System.out.println(zahl); // Gib das Ergebnis der Potenzberechnung aus

    }
}