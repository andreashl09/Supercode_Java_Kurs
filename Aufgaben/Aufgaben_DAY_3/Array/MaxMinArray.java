public class MaxMinArray {

    public static void main(String args[]) {

        int arr[] = { 3, 44, 87, 2, 4, 99, 112, -1, 9, 14, 89, 21 };

        int min = 0, max = 0;

        // Array durchsuchen und die kleinste und größte Zahl im Terminal ausgeben

        for (int i = 0; i < arr.length; i++) {
            int arrayNumber = arr[i];

            // wenn min größer ist als arrayNumber dann akkumuliere min
            if (min > arrayNumber) {
                min = arrayNumber;
                // falls wenn max kleiner ist als arrayNumber dann akkumiliere max
            } else if (max < arrayNumber) {
                max = arrayNumber;
            }

        }
        // Ausgabe der Variablen
        
        System.out.println(max);
        System.out.println(min);

    }
}