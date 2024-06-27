public class DrawTraingle {

    public static void main(String[] args) {
    
        int height = Integer.parseInt(args[0]);

        int i = 0;
        // Initialisiere die Schleifenvariable 'i' mit 0. Diese Variable dient als Zähler für die äußere Schleife.

        while (i < height) {
            // Starte eine while-Schleife, die so lange läuft, wie 'i' kleiner als 'height' ist.

            int j = 0;
            // Initialisiere die Schleifenvariable 'j' mit 0. Diese Variable dient als Zähler für die innere Schleife.

            while (i >= j) {
                // Starte eine weitere while-Schleife innerhalb der ersten Schleife, die so lange läuft, wie 'i' größer
                // oder gleich 'j' ist.

                System.out.print("#");
                // Drucke ein '#' ohne Zeilenumbruch.

                j++;
                // Erhöhe den Wert von 'j' um 1.
            }

            System.out.print("\n");
            // Drucke einen Zeilenumbruch, nachdem die innere Schleife beendet ist.

            i++;
            // Erhöhe den Wert von 'i' um 1, bevor die äußere Schleife erneut gestartet wird.
        }
    }
}
