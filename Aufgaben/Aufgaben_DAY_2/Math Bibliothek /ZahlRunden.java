public class ZahlRunden {

    public static void main(String[] args) {
        // Zahl auf eine bestimmte Anzahl von Dezimalstellen runden

        double x = 13455.3456789; // Die ursprüngliche Zahl
        int anzahlStellen = 3; // Anzahl der gewünschten Dezimalstellen
        double scale = Math.pow(10, anzahlStellen); // Berechnet die 10er Potenz, z.B. 1000 für 3 Dezimalstellen

        // Math.round rundet immer auf eine Ganzzahl ab.
        // Wenn man die Zahl zuerst mit 10, 100, 1000 usw. multipliziert,
        // sie dann rundet und anschließend durch die gleiche Potenz von 10 wieder teilt,
        // erhält man eine gerundete Dezimalzahl.

        // Beispiel: 
        // Multipliziere 13455.3456789 mit 1000 (ergibt 13455345.6789)
        // Runde diese Zahl (ergibt 13455346)
        // Teile 13455346 wieder durch 1000 (ergibt 13455.346)

        double roundOff = Math.round(scale * x) / scale; // Rundet die Zahl auf die gewünschte Anzahl von Dezimalstellen
        System.out.println(roundOff); // Gibt die gerundete Zahl aus
    }
}