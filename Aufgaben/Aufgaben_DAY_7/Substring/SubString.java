public class SubString {
    // # ✅ Aufgabenstellung

    // In dieser Aufgabe sollst du die Methode substring aus der
    // Java-Standardbibliothek selbst implementieren:
    // die substring-Methode extrahiert einen Teilstring aus einem gegebenen String
    // die Methode gibt den Teilstring von der Position start (inklusive) bis end
    // (exklusive) zurück
    // wenn start oder end ungültige Werte haben, soll die Methode null zurückgeben

    public static void main(String[] args) {

        String s = "Programmieren";
        String sub = substring(s, 3, 7);
        System.out.println(sub); // Sollte "gram" ausgeben.
    }

    public static String substring(String s, int start, int end) {
        int lengthStringInt = s.length();

        if (start < 0 || end > lengthStringInt || start > end)
            return null;

        String subString = "";
        for (int i = start; i < end; i++) {
            subString += s.charAt(i);
        }
        return subString;
    }
}