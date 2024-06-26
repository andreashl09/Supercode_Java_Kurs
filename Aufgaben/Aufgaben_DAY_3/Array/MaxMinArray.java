public class MaxMinArray {

    public static void main(String args[]) {

        int arr[] = { 3, 44, 87, 2, 4, 99, 112, -1, 9, 14, 89, 21 };

        // Initialisierung der Variablen für die kleinste und größte Zahl im Array
        int min = arr[0]; // Annahme: Das erste Element ist vorläufig das Minimum
        int max = arr[0]; // Annahme: Das erste Element ist vorläufig das Maximum
        
        // Array durchsuchen und die kleinste und größte Zahl finden
        for (int i = 1; i < arr.length; i++) {
            int arrayNumber = arr[i];
        
            // Wenn arrayNumber kleiner ist als das aktuelle Minimum, aktualisiere min
            if (arrayNumber < min) {
                min = arrayNumber;
            }
        
            // Wenn arrayNumber größer ist als das aktuelle Maximum, aktualisiere max
            if (arrayNumber > max) {
                max = arrayNumber;
            }
        }
        
        // Ausgabe der Ergebnisse
        System.out.println("Der höchste Wert ist: " + max);
        System.out.println("Der kleinste Wert ist: " + min);
        

    }
}