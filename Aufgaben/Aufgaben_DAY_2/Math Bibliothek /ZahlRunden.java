public class ZahlRunden {

    public static void main(String[] args) {
        // Zahl runden

        double x = 13455.3456789;
        int anzahlStellen = 5;
        double scale = Math.pow(10, anzahlStellen);
        double roundOff = Math.ceil(Math.pow(10, anzahlStellen) * x) / Math.pow(10, anzahlStellen);
        System.out.println(roundOff);
    }
}