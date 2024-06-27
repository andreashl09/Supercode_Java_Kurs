public class Diamont {
    /*
     * Schreibe ein Programm, welches Diamanten in Form von Sternchen (*) in der
     * Konsole ausgibt.
     * Die Größe der Diamanten soll der Benutzer beim Programmaufruf mitgeben.
     */

    public static void main(String[] args) {
        int height = Integer.parseInt(args[0]); // Liest die Höhe des Diamanten
        int character = 1; // Anzahl der Sterne
        boolean isHeightOddNumber = height % 2 != 0; // Prüft, ob die Höhe ungerade ist

        if (!isHeightOddNumber) {
            height += 1; // Macht die Höhe ungerade, wenn sie gerade ist
            System.out.println(
                    "Du hast eine gerade Zahl eingeben. \nDaraus kann kein Diamand gedruckt werden. \nDeine Höhe wurde auf "
                            + height + " erhöht!");
        }

        int spaces = (height - 1) / 2; // Berechnet die Anfangsanzahl der Leerzeichen
        boolean isMaxWidth = false; // Flag für maximale Breite

        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" "); // Gibt Leerzeichen aus
            }

            for (int j = 0; j < character; j++) {
                System.out.print("*"); // Gibt Sterne aus
            }
            System.out.println(""); // Geht zur nächsten Zeile

            if (spaces == 0) {
                isMaxWidth = true; // Maximale Breite erreicht
            }

            if (isMaxWidth) {
                spaces += 1; // Erhöht Leerzeichen
                character -= 2; // Verringert Sterne
            } else {
                spaces -= 1; // Verringert Leerzeichen
                character += 2; // Erhöht Sterne
            }
        }
    }
}
