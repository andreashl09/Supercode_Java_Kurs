public class SummeDerDiagonale {

    public static void main(String[] args) {

        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };

        System.out.println(sumOfMainDiagonal(matrix));
    }

    public static int sumOfMainDiagonal(int[][] matrix) {
        int summe = 0;

        for (int i = 0; i < matrix.length; i++) {
            summe += matrix[i][i];
        }

        return summe;
    }
}
