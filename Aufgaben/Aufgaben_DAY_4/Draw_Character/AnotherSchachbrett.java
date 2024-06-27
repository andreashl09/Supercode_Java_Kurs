public class AnotherSchachbrett {

    public static void main(String[] args) {
        // Breite des Musters
        int width = 8;

        // Höhe des Musters
        int height = 8;

        // Boolesche Variable, um zu entscheiden, ob "****" oder Leerzeichen gedruckt
        // wird
        boolean isCharacter = true;

        // Äußere Schleife für die Zeilen
        for (int i = 1; i <= height; i++) {

            // Mittlere Schleife für die halbe Breite
            for (int j = 1; j < width / 2; j++) {

                // Innere Schleife für die gesamte Breite
                for (int k = 0; k < width; k++) {

                    // Drucken von "****" oder Leerzeichen
                    System.out.print(isCharacter ? "****" : "    ");

                    // Bedingung innerhalb der mittleren Schleife
                    if (j < height) {
                        // Umschalten des Zeichens
                        isCharacter = !isCharacter;
                    }
                }
                // Zeilenumbruch nach jeder Breite
                System.out.println("");
            }
            // Umschalten des Zeichens nach jeder Zeile
            isCharacter = !isCharacter;
        }
    }
}
