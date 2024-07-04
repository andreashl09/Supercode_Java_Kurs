
class Recursion_Example {

    public static void main(String[] args) {

        int[] zahlen = { 3, 4, 5, 66, 77, 2, -2, 89 };
        int summe = sum(zahlen);
        System.out.println(summe);
    }

    public static int sum(int[] zahl) {
        return sum(zahl, 0);
    }

    public static int sum(int[] zahl, int index) {
        if (zahl.length == index)
            return 0;

        return zahl[index] + sum(zahl, index + 1);
    }
}