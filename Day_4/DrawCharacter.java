public class DrawCharacter {

    public static void main(String[] args) {

        int sideLength = Integer.parseInt(args[0]);
        int i = 0;

        while (i < sideLength) {
            int j = 0;
            while (j < sideLength) {

                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}