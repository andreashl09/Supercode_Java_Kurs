public class Diamont {
    // Die Hauptmethode des Programms
    public static void main(String[] args) {
        // Liest die Höhe der Pyramide aus den Programmargumenten und konvertiert sie in
        // eine Ganzzahl
        int height = Integer.parseInt(args[0]);

        // Setzt die anfängliche Anzahl der Zeichen (Sterne) auf 1
        int character = 1;

        // Überprüft, ob die Höhe eine ungerade Zahl ist
        boolean isHeightOddNumber = height % 2 != 0;

        // Falls die Höhe eine gerade Zahl ist, wird sie um 1 erhöht, damit sie ungerade
        // wird
        if (!isHeightOddNumber) {
            height += 1;
        }

        // Berechnet die anfängliche Anzahl der Leerzeichen (Abstand), die vor den
        // Sternen stehen
        int spaces = (height - 1) / 2;

        // Überprüft erneut, ob die Höhe ungerade ist (was jetzt immer der Fall sein
        // sollte)
        // Flag zum Verfolgen, ob die maximale Breite der Pyramide erreicht wurde
        boolean isMaxWidth = false;

        // Schleife, die über jede Zeile der Pyramide iteriert
        for (int i = 1; i <= height; i++) {
            // Schleife, die die Leerzeichen vor den Sternen ausgibt
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Schleife, die die Sterne ausgibt
            for (int j = 0; j < character; j++) {
                System.out.print("*");
            }
            // Geht zur nächsten Zeile über
            System.out.println("");

            // Wenn keine Leerzeichen mehr vorhanden sind, wurde die maximale Breite der
            // Pyramide erreicht
            if (spaces == 0) {
                isMaxWidth = true;
            }

            // Wenn die maximale Breite erreicht wurde, werden die Leerzeichen erhöht und
            // die Anzahl der Sterne verringert
            if (isMaxWidth) {
                spaces += 1;
                character -= 2;
            }
            // Wenn die maximale Breite noch nicht erreicht wurde, werden die Leerzeichen
            // verringert und die Anzahl der Sterne erhöht
            else {
                spaces -= 1;
                character += 2;
            }
        }
    }
}
