public class ZufaelligeZahl {

    public static void main(String[] args) {

        // Eine zufällige Zahl im Bereich von 4 bis 10 generieren

        double minNumber = 4; // untere Grenze des Bereichs
        double maxNumber = 10; // obere Grenze des Bereichs
        double randomNumber; // Variable zur Speicherung der zufälligen Zahl

        // Math.random() gibt eine zufällige Zahl zwischen 0 (inklusive) und 1
        // (exklusive) zurück.
        // Durch Multiplikation mit (maxNumber - minNumber) wird der Bereich auf 0 bis
        // (maxNumber - minNumber) skaliert.
        // In diesem Fall bedeutet das eine Skalierung auf 0 bis 6.
        randomNumber = Math.random() * (maxNumber - minNumber);

        // Durch Hinzufügen von minNumber wird der Bereich auf minNumber bis maxNumber
        // verschoben.
        // In diesem Fall bedeutet das eine Verschiebung auf 4 bis 10.
        randomNumber = randomNumber + minNumber;
        
        // Die zufällige Zahl im Bereich von 4 bis 10 wird ausgegeben
        System.out.println(randomNumber);
    }
}