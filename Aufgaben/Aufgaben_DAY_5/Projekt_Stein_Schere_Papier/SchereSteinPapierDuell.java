import java.util.Scanner;

public class SchereSteinPapierDuell {

    public static void main(String[] args) {
        // System.out.println(andTheWinnerIs(1, 2));

        while (true) {
            System.out.println("Wähle: 0 = Schere, 1 = Stein, 2 = Papier, 3 = Beenden");
            int userInput = userInput(); // User Eingabe
            int computerInt = computerRandomInt(); // Randomzahl wird erzeugt

            if (intIsInRange(userInput)) {
                if (userInput == 3) {
                    System.out.println("Das Programm wird beendet!");
                    break;
                }
                System.out.println("Deine Wahl: " + stonePaperScissorSelect(userInput));
                System.out.println("Wahl des Computers: " + stonePaperScissorSelect(computerInt));
                System.out.println(andTheWinnerIs(userInput, computerInt));
                System.out.print("\n");
            } else {
                System.err.println("Ungültige Eingbe. Bitte nochmal.");
                continue;
            }
        }
    }

    public static int userInput() {
        Scanner scanner = new Scanner(System.in);
        int userInputInt = scanner.nextInt();
        userInputInt = Math.abs(userInputInt);
        return userInputInt;
    }

    public static boolean intIsInRange(int userInt) {
        if (userInt >= 0 && userInt <= 3) {
            return true;
        }
        return false;
    }

    public static int computerRandomInt() {
        int randomNum = (int) (Math.random() * 3);
        return randomNum;
    }

    public static String stonePaperScissorSelect(int choiseInt) {
        String[] choiseStrings = { "Schere", "Stein", "Papier" };
        return choiseStrings[choiseInt];
    }

    public static String andTheWinnerIs(int userInt, int computertInt) {
        String winnerText;
        if (userInt != computertInt) {
            if ((computertInt == 1 && userInt == 0) || (computertInt == 2 && userInt == 1)
                    || (computertInt == 3 && userInt == 2)) {
                winnerText = "Der Computer hat gewonnen!";
            } else {
                winnerText = "Du hast gewonnen!";
            }
        } else {
            winnerText = "Unentschieden!";
        }
        return winnerText;
    }

}