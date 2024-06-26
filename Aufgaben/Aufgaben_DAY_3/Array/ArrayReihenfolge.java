public class ArrayReihenfolge {

    public static void main(String args[]) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int counter = arr.length - 1;

        while (0 <= counter) {

            if (counter == 0) {
                System.out.print(arr[counter]);
            } else {
                System.out.print(arr[counter] + ", ");
            }
            
            counter--;
        }
    }
}
