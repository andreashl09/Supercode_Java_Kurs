import java.util.Random;

public class RateWort {

    private char[] rateWort;

    public RateWort(int auswahl) {
        rateWort = randomWortinCharArray(auswahl);
    }

    public String randomWort(int auswahl) {
        Random rand = new Random();

        String[] allgemeineWoerter = {
                "Apfel", "Banane", "Computer", "Tisch", "Stuhl",
                "Fenster", "Katze", "Hund", "Buch", "Schule",
                "Auto", "Straße", "Blume", "Himmel", "Sonne",
                "Mond", "Baum", "Haus", "Garten", "Freund"
        };

        String[] javaWoerter = {
                "Klasse", "Objekt", "Methode", "Variable", "Konstruktor",
                "Interface", "Vererbung", "Polymorphismus", "Abstraktion", "Kapselung",
                "Array", "Schleife", "Bedinung", "Ausnahme", "Thread",
                "Synchronisation", "Stream", "Lambda", "Generics", "Annotation"
        };

        String[] randomWort = (auswahl == 2) ? javaWoerter : allgemeineWoerter;
        return randomWort[rand.nextInt(10)].toUpperCase();
    }

    public char[] randomWortinCharArray(int auswahl) {
        String rateWort = randomWort(auswahl);
        return rateWort.toCharArray();
    }

    public char[] getRateWort() {
        return rateWort;
    }

}
