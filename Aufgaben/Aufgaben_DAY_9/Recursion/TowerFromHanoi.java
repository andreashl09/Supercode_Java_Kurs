public class TowerFromHanoi {

    public static void main(String[] args) {

        int n = 3;// anzahl der scheiben
        hanoi(n, 'A', 'B', 'C', "1");
    }

    public static void hanoi(int n, char a, char b, char c, String methode) {
        // System.out.println("n: " + n + " |a: " + start + " |b: " + middle + " |c: " +
        // target + " Methode: " + methode);
        if (n == 1) {
            System.out.println("Verschiebe Scheibe " + n + " von " + a + " nach " + c);
            return;
        }
        hanoi(n - 1, a, c, b, "2");
        System.out.println("Verschiebe Scheibe " + n + " von " + a + " nach " + c);
        hanoi(n - 1, b, a, c, "3");

    }
}
