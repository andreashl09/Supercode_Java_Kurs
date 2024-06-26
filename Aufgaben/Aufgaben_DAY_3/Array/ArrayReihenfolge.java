public class ArrayReihenfolge {

    public static void main(String args[]) {

        // Initialisierung des Arrays mit den Zahlen 1 bis 9
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // Initialisierung des Zählers, der auf das letzte Element im Array zeigt
        int counter = arr.length - 1;

        // Schleife läuft, solange der Zähler nicht negativ ist
        while (0 <= counter) {

            // Überprüfung, ob der Zähler auf das erste Element im Array zeigt
            if (counter == 0) {
                // Wenn ja, drucke das Element ohne ein Komma am Ende
                System.out.print(arr[counter]);
            } else {
                // Wenn nicht, drucke das Element gefolgt von einem Komma und einem Leerzeichen
                System.out.print(arr[counter] + ", ");
            }

            // Verringere den Zähler um eins für das nächste Element in der nächsten
            // Iteration
            counter--;
        }

    }
}
