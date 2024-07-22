import java.util.*;

public class Hangman {

    static char[] rateWortCharArray;
    static char[] ergebnisWort;
    static ArrayList<Character> gerateneBuchstaben = new ArrayList<>();;
    static final int VERSUCHE = 6;
    static int versuch = VERSUCHE;
    static int charCounter = 0;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        clearConsole();
        System.out.println("Willkommen zu Hangman!");
        System.out.println("Wähle deine Kategorie: 1 = allgemeines Wort, 2 = Wort aus der Welt von Java");
        System.out.print("Deine Wahl: ");
        neuesSpiel(scan.nextInt());
        while (spielLaeuft()) {
            spielfeld();
            char userEingabe = getUserEingabe(scan);
            spielMechanik(userEingabe);
            clearConsole();
        }

    }

    private static void spielfeld() {
        System.out.println(zeigeWort(ergebnisWort));
        System.out.println("Verbleibende Versuche: " + versuch);
        System.out.println("Geratene Buchstaben:" + gerateneBuchstaben);
        System.out.print("Bitte geben Sie einen Buchstaben ein: ");
    }

    private static char getUserEingabe(Scanner scan) {
        return scan.next().toUpperCase().charAt(0);
    }

    public static void neuesSpiel(int auswahl) {
        RateWort rateWort = new RateWort(auswahl);
        rateWortCharArray = rateWort.getRateWort();
        ergebnisWort = new char[rateWortCharArray.length];

    }

    public static boolean spielLaeuft() {
        if (charCounter == rateWortCharArray.length) {
            System.out.println("Du hast " + new String(rateWortCharArray) + " erraten. Glückwunsch!!");
            return false;
        }

        if (versuch == 0) {
            System.out.println("Du hast leider verloren! Das gesuchte Wort war: " + new String(rateWortCharArray));
            return false;
        }

        return true;
    }

    public static boolean istBuchstabe(char userEingabe) {
        return userEingabe >= 'A' && userEingabe <= 'Z';
    }

    public static void spielMechanik(char userEingabe) {
        istBuchstabe(userEingabe);

        if (istBuchstabe(userEingabe)) {
            boolean treffer = false;
            for (int i = 0; i < rateWortCharArray.length; i++) {
                if (rateWortCharArray[i] == userEingabe) {
                    ergebnisWort[i] = userEingabe;
                    treffer = true;
                    charCounter++;
                }
            }

            if (!treffer) {
                versuch--;
            }
        }
        gerateneBuchstaben.add(userEingabe);
    }

    public static String zeigeWort(char[] array) {
        String loesung = "";
        for (char c : array) {
            loesung += (c == '\u0000') ? "_ " : c + " ";
        }
        return loesung;
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}