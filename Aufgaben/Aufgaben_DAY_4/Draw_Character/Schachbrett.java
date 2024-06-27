public class Schachbrett {
    public static void main(String[] args) {
        // int height = Integer.parseInt(args[0]);
        int height = 8;
        int character = height;
        boolean isCharacter = true;

        for (int i = 0; i < height; i++) {
            for (int j = 1; j <= character; j++) {
                System.out.print(isCharacter ? "#" : " ");
                if (j < character) {
                    isCharacter = !isCharacter;
                }

            }
            System.out.print("\n"); // Zeilenumbruch
        }

    }
}
