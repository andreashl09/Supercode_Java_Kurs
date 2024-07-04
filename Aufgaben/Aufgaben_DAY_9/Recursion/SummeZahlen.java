public class SummeZahlen {
    public static void main(String[] args) {
        int anzahlN = 10;

        System.out.println(sum(anzahlN));
    }

    public static int sum(int anzahlN) {
        if (anzahlN == 0)
            return 0;
        return anzahlN + sum(anzahlN - 1);
    }
}
