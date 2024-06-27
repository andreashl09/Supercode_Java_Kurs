public class Schachbrett {
    /*
     * Schreibe ein Java-Programm, das ein Schachbrettmuster in der Konsole ausgibt.
     * Die Größe vom Schachbrett soll der Benutzer beim Programmaufruf mitgeben.
     * Ein Schachbrett besteht aus abwechselnden Zeichen "#" und " ", wobei die
     * oberen linken Ecke immer eine "#" ist.
     */

    public static void main(String[] args) {
        // int height = Integer.parseInt(args[0]); // Liest die Höhe der Figur aus den
        // Argumenten
        int height = 8; // Höhe der Figur (festgelegt für Demonstration)
        int character = height; // Anzahl der Zeichen in der jeweiligen Zeile
        boolean isCharacter = true; // Flag, um zu verfolgen, welches Zeichen gedruckt werden soll

        // Schleife für jede Zeile
        for (int i = 0; i < height; i++) {
            // Schleife für jedes Zeichen in der aktuellen Zeile
            for (int j = 1; j <= character; j++) {
                System.out.print(isCharacter ? "#" : " ");
                if (j < character) {
                    isCharacter = !isCharacter; // Wechselt zwischen '#' und Leerzeichen
                }
            }
            System.out.print("\n"); // Zeilenumbruch
        }
    }
}
