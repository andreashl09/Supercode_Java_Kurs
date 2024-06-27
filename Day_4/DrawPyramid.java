public class DrawPyramid {

    public static void main(String[] args) {

        // int height = Integer.parseInt(args[0]);

        int height = 10 - 1; // Höhe des Dreiecks
        int characterNumber = 1; // Anzahl der Zeichen in der aktuellen Zeile

        for (int lines = 1; lines <= height; lines++) { // Schleife für Zeilen
            int spaces = height - lines; // Berechne Leerzeichen
            for (int i = 1; i <= spaces; i++) { // Schleife für Leerzeichen
                System.out.print(" ");
            }
            for (int j = 1; j <= characterNumber; j++) { // Schleife für Zeichen
                System.out.print("#");
            }
            System.out.print("\n"); // Neue Zeile
            characterNumber += 2; // Erhöhe Anzahl der Zeichen
        }

    }
}
