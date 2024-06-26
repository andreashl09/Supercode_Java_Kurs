public class Reverse {

    public static void main(String[] args) {

        int[] number = { 19, 0, 239, 30, 459, 30, 29 };
        int counter = number.length - 1;

        while (counter >= 0) {
            System.out.print(number[counter]);
            counter--;
        }
    }
}