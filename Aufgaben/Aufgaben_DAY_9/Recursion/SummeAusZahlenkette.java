public class SummeAusZahlenkette {

    public static void main(String[] args) {
        int zahlenKette = -2345673;

        System.out.println(sumOfChainOfNumbers(zahlenKette));
    }

    public static int sumOfChainOfNumbers(int zahlenKette) {
        if (zahlenKette == 0)
            return 0;
        return zahlenKette % 10 + sumOfChainOfNumbers(zahlenKette / 10);

    }
}
