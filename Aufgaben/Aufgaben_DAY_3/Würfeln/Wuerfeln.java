public class Wuerfeln {

    public static void main(String[] args) {

        // Initialisierung des Zählers für die Anzahl der Würfe
        int numberOfThrows = 1;

        // Boolean-Flag, um zu überprüfen, ob eine 6 gewürfelt wurde
        boolean foundSix = false;

        // Solange keine 6 gewürfelt wurde, weiter würfeln
        while (!foundSix) {
            // Generiere eine Zufallszahl zwischen 1 und 6 (inklusive)
            double randomDouble = Math.random() * 6 + 1;

            // Runde die Zufallszahl auf die nächste ganze Zahl und speichere sie
            int diceRoll = (int) Math.round(randomDouble);

            // Überprüfe, ob eine 6 gewürfelt wurde
            foundSix = diceRoll == 6;

            // Ausgabe je nach Wurfergebnis
            if (numberOfThrows == 1 && foundSix) {
                System.out.println("Erster Wurf und eine 6! Glückwunsch!");
            } else if (foundSix) {
                System.out.println(diceRoll + " - Glückwunsch, du hast eine 6 gewürfelt!");
            } else {
                System.out.println(diceRoll);
            }

            // Erhöhe die Anzahl der Würfe für die nächste Iteration
            numberOfThrows++;
        }

    }
}