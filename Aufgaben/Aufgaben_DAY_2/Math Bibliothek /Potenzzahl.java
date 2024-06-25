public class Potenzzahl {

    public static void main(String[] args) {
        // Potenzrechnen
        // Beispiel 5 hoch 3
        // a ist die Basis
        // n ist der Exponent

        int a = 5;
        int n = 3;
        int potenzZahl = a;

        // mit einer for-Schleife
        for (int i = 0; i < n - 1; i++) {
            potenzZahl *= a;
        }
        System.out.println(potenzZahl);

        // mit der Klasse Math
        double zahl = Math.pow(a, n);
        System.out.println(zahl);

    }
}