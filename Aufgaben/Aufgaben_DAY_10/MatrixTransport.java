public class MatrixTransport {
    public static void main(String[] args) {

        int[][] zahlenArr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        printArray(zahlenArr);
        System.out.println("");
        printArray(zahlenTransport(zahlenArr));
    }

    public static int[][] zahlenTransport(int[][] zahlenArr) {

        int[][] newMatrix = new int[zahlenArr.length][zahlenArr[0].length];

        for (int i = 0; i < zahlenArr.length; i++) {
            for (int j = 0; j < zahlenArr[0].length; j++) {
                newMatrix[j][i] = zahlenArr[i][j];
            }
        }

        return newMatrix;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
