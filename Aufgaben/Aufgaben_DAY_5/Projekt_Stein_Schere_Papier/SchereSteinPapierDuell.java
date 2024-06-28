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
        double randomNum;
        randomNum = Math.random() * 3;
        int randomInt = (int) randomNum;
        return randomInt;
    }

    public static String stonePaperScissorSelect(int choiseInt) {
        String theChoiseIs;
        
        switch (choiseInt) {
            case 0:
                theChoiseIs = "Schere";
                break;
            case 1:
                theChoiseIs = "Stein";
                break;
            case 2:
                theChoiseIs = "Papier";
                break;
            default:
                theChoiseIs = "Unknow";
                break;
        }

        return theChoiseIs;
    }

    public static String andTheWinnerIs(int userInt, int computertInt) {
        int sum = userInt + computertInt;
        int user = 1;
        int computer = 2;
        int undecided = 3;
        int winnerIs;

        // scissor = 0;
        // stone = 1;
        // paper = 2;
        // sum: scissor + stone = 1, scissor + paper = 2; stone + paper = 3

        if (userInt != computertInt) {
            if ((sum == 1 && userInt == 0) || (sum == 2 && userInt == 1) || (sum == 3 && userInt == 2)) {
                winnerIs = user;
            } else {
                winnerIs = computer;
            }
        } else {
            winnerIs = undecided;
        }

        // Gewinner Ausgabe
        String winnerText;
        switch (winnerIs) {
            case 1:
                winnerText = "Du hast gewonnen!";
                break;
            case 2:
                winnerText = "Der Computer hat gewonnen!";
                break;
            case 3:
                winnerText = "Unentschieden!";
                break;

            default:
                winnerText = "Fehler";
                break;
        }
        return winnerText;
    }

}