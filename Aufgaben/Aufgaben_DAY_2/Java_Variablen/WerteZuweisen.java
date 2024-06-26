public class WerteZuweisen {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 6;
        double x = 1.5;
        double y = 2.3;
        int int_ergebnis;
        double double_ergebnis;

        int_ergebnis = c - a * 3; // = -3
        int_ergebnis = c / a; // = 2
        int_ergebnis = c / b; // = 1
        int_ergebnis = a + b / c; // = 3
        int_ergebnis = a++; // 3
        int_ergebnis = ++a; // 5
        int_ergebnis = b + a--; // 10
        int_ergebnis = b + --a; // 8
        // int_ergebnis = a**; --> error
        System.out.println();
        double_ergebnis = c / b; // 1.2 --> dadurch das c und b ein int sind, wird das ergebnis auch nur als int ausgegeben und darum 1.0;
        System.out.println(double_ergebnis);
        double_ergebnis = x + y * b; // 13.0
        System.out.println(double_ergebnis);
        double_ergebnis = (x + y) * b; // 19.0
        System.out.println(double_ergebnis);
        double_ergebnis = c + a / b; // 6.0
        System.out.println(double_ergebnis);
        double_ergebnis = (x * c - a); // 6.0
        System.out.println(double_ergebnis);

    }
}