public class Wuerfeln {

    public static void main(String[] args) {

        int i = 1;
        boolean isSix = false;

        while (!isSix) {
            double randomNumber = (Math.random() * 6) + 1;
            int number = (int) Math.round(randomNumber * 10) / 10;
            isSix = number == 6;
            if (i == 1 && number == 6) {
                System.out.println("Glückwunsch: Hast du ein Glück 6 ");
            } else if (number == 6) {
                System.out.println(number + " Glückwusch");
            } else {
                System.out.println(number);
            }
            i++;
        }

    }
}