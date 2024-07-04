public class Potenzwert {

    public static void main(String[] args) {
        int basis = 0;
        int exponent = 2;
        System.out.println(powerCalculation(basis, exponent));
    }

    public static int powerCalculation(int basis, int exponent) {
        if (exponent == 0 || basis == 0)
            return basis;
        return basis * powerCalculation(basis, exponent - 1);
    }
}
