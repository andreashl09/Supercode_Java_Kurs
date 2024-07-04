public class Rekursion {

    public static void main(String[] args) {
        int n = 0;
        System.out.println(rekursion(n));

    }

    public static String rekursion(int n) {

        if (n >= 10)
            return "";

        rekursion(n + 1);
        return "Guten Morgen!" + n;
    }
}