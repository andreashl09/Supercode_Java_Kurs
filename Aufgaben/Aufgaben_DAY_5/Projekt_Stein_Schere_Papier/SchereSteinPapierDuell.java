import java.util.Scanner;

public class SchereSteinPapierDuell {
    final static int SCHERE = 0;
    final static int STEIN = 1;
    final static int PAPIER = 2;
    final static int BEENDEN = 3;

    final static int USER = 1;
    final static int COMPUTER = -1;
    final static int DRAWN = 0;

    public static int userScore = 0;
    public static int computerScore = 0;
    public static int counterMoves = 0;
    public static int bonusPointUser = 0;
    public static int bonusPointComputer = 0;
    public static int drawnPoint = 0;

    public static void main(String[] args) {
        ClearConsole();
        // System.out.println(andTheWinnerIs(1, 2));
        Scanner scanner = new Scanner(System.in);

        System.out.println("STEIN SCHERE PAPIER DUELL \n");
        while (true) {
            System.out.println("Wähle: 0 = Schere, 1 = Stein, 2 = Papier, 3 = Beenden");
            int userInput = userInput(scanner); // User Eingabe
            int computerInt = computerRandomInt();

            if (!intIsInRange(userInput)) {
                System.err.println("Ungültige Eingbe. Bitte nochmal.");
                continue;
            }

            if (userInput == BEENDEN) {
                if (counterMoves > 0) {
                    System.out.println(scoreBoard());

                    if (userScore > computerScore) {
                        System.out.println("Du hast das ganze Spiel gewonnen! Herzlichen Gückwunsch!");
                    } else if (userScore < computerScore) {
                        System.out.println(
                                "Der Computer hat das Spiel gewonnen! Du solltest vielleicht kein Lotto spielen!");
                    } else {
                        System.out.println("Das Spiel ist Unentschieden! Willst du es wirklich das so stehen lassen?");
                        System.out.println("0 = Nein, 1 = Ja");
                        userInput = userInput(scanner);

                        if (userInput == 0) {
                            continue;
                        }
                    }

                }
                System.out.println("Das Spiel wurde beendet!");
                break;
            }

            ClearConsole();
            System.out.println("Deine Wahl: " + stonePaperScissorSelect(userInput));
            System.out.println("Wahl des Computers: " + stonePaperScissorSelect(computerInt));
            countScores((determineTheStatus(userInput, computerInt)));
            checkForBonusPoint();
            counterMoves++;
            System.out.println(scoreBoard());

        }

        scanner.close();
    }

    public static int userInput(Scanner scanner) {
        int userInputInt = scanner.nextInt();
        return userInputInt;
    }

    public static boolean intIsInRange(int userInt) {
        return userInt >= 0 && userInt <= 3;
    }

    public static int computerRandomInt() {
        int randomNum = (int) (Math.random() * 3);
        return randomNum;
    }

    public static String stonePaperScissorSelect(int choiseInt) {
        String[] choiseStrings = { "Schere", "Stein", "Papier" };
        return choiseStrings[choiseInt];
    }

    public static int determineTheStatus(int userInt, int computertInt) {
        if (userInt == computertInt) {
            return DRAWN;

        } else if ((computertInt == STEIN && userInt == SCHERE) ||
                (computertInt == PAPIER && userInt == STEIN) ||
                (computertInt == SCHERE && userInt == PAPIER)) {
            return COMPUTER;
        } else {
            return USER;
        }
    }

    public static void countScores(int status) {
        if (status == USER) {
            userScore++;
            bonusPointComputer = 0;
            bonusPointUser++;
            System.out.println("Du hast gewonnen!\n");
            return;
        } else if (status == COMPUTER) {
            computerScore++;
            bonusPointUser = 0;
            bonusPointComputer++;
            System.out.println("Leider hat der Computer gewonnen!\n");
            return;
        }
        System.out.println("Unentschieden!\n");
        drawnPoint++;
        bonusPointUser = 0;
        bonusPointComputer = 0;
    }

    public static void checkForBonusPoint() {
        if (bonusPointUser < 3 && bonusPointUser > 0) {
            String inFolge = bonusPointUser > 1 ? " in Folge" : "";
            System.out.println("Du hast schon " + bonusPointUser + " mal" + inFolge + " gewonnen!\n");
            System.out.println(cheeringSlogan() + "\n");
            return;
        }

        if (bonusPointUser == 3) {
            System.out.println("Gewinnersträhne: Dreimal in Folge gewonnen! Du erhälst einen Bonuspunkt!");
            System.out.print("\n");
            userScore++;
            return;
        } else if (bonusPointComputer == 3) {
            System.out.println("Leider bekommt der Computer einen Bonuspunkt!");
            System.out.print("\n");
            computerScore++;
            return;
        }

    }

    public static String cheeringSlogan() {
        String[] cheeringStrings = {
                "Du schaffst das, gib alles!",
                "Zeig, was in dir steckt!",
                "Weiter so, du bist klasse!",
                "Glaub an dich, du rockst das!",
                "Keiner kann dich stoppen!",
                "Hol dir den Sieg, du bist stark!",
                "Nur noch ein bisschen, du packst das!",
                "Deine Zeit ist jetzt, gib Gas!",
                "Du bist unser Champion!",
                "Zeig ihnen, wie es gemacht wird!"
        };
        return cheeringStrings[(int) (Math.random() * 10)].toUpperCase();
    }

    public static void ClearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static String scoreBoard() {
        return "Aktueller Punktestand - User: " + userScore
                + " Computer: " + computerScore + " Spiele: " + counterMoves + " davon waren " + drawnPoint
                + " unentschieden";
    }

}
