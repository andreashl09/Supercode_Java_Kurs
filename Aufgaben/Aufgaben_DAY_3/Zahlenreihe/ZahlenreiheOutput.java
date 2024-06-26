package Zahlenreihe;

public class ZahlenreiheOutput {

    public static void main(String[] args) {

        // Summe aller Zahlen zwichen 1 - 100
        int sum = 0;
        int max = 100;

        for (int i = 0; i <= max; i++) {
            sum += i;

        }
        System.out.println("Summe aller Zahlen: " + sum);

        sum = 0;

        // Summe aller geraden Zahlen zwischen 1 - 100

        int i = 0;
        while (i <= max) {
            boolean isStraightNumber = i % 2 == 0;
            if (isStraightNumber) {
                sum += i;
            }
            i++;
        }

        System.out.println("Summe aller geraden Zahlen: " + sum);

        // Summe aller ungeraden Zahlen zwischen 1 - 100
        i = 0;
        sum = 0;

        do {
            boolean isUnevenNumber = i % 2 == 1;
            if (isUnevenNumber) {
                sum += i;
            }

            i++;
        } while (i <= max);

        System.out.println("Summe aller ungeraden Zahlen: " + sum);
    }

}
