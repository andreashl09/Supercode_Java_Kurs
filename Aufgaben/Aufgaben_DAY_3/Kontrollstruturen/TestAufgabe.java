public class TestAufgabe {

    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 10; i++) {
            a += i;
        }
        System.out.println(a);

        int b = 0;
        for (b = 0; b < 10; b++) {
            b += b;

        }
        System.out.println(b);

        int c = 0;
        for (int i = 0; i < 8; i++) {
            c += c++;
        }
        System.out.println(c);

        int n = 123456789;
        int m = 0;
        while (n != 0) {
            m = (10 * m) + (n % 10);
            n = n / 10;
            System.out.println(m);
            System.out.println(n);

        }

    }

}