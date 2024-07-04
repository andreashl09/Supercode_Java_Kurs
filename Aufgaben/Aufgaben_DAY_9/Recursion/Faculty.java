public class Faculty {

    public static void main(String[] args) {

        int n = 3;
        System.out.println(faculty(n));
    }

    public static int faculty(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * faculty(n - 1);
    }
}
