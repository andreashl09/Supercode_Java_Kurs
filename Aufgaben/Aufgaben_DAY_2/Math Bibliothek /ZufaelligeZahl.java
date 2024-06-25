public class ZufaelligeZahl {
    /**
     * @param args
     */
    public static void main(String[] args) {

        // Random Zahl im Bereich von 4 und 10
        double minNumber = 4;
        double maxNumber = 10;
        double randomNumber;

        do {
            randomNumber = Math.random() * maxNumber;
        } while (randomNumber <= minNumber);
        System.out.println(randomNumber);
    }
}