public class MultiDimensionaleArray {

    public static void main(String[] args) {
        int[][] display = {
                { 1, 1, 1, 1, 1, 1 },
                { 1, 0, 0, 0, 0, 1 },
                { 1, 0, 0, 0, 0, 1 },
                { 1, 0, 0, 0, 0, 1 },
                { 1, 0, 0, 0, 0, 1 },
                { 1, 0, 0, 0, 0, 1 },
                { 1, 0, 0, 0, 0, 1 },
                { 1, 1, 1, 1, 1, 1 }
        };
        printDisplay(display);

    }

    public static void printDisplay(int[][] display) {
        for (int i = 0; i < display.length; i++) {
            for (int j = 0; j < display[i].length; j++) {
                if (display[i][j] == 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
