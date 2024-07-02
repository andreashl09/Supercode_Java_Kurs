public class Palindrom {
    public static void main(String[] args) {
        String[] inputText = { "Amok Oma", "Ein Esel lese nie", "Anna", "Lagerregal" };
        for (int i = 0; i < inputText.length; i++) {
            System.out.println(
                    isStringPalindrom(inputText[i]) ? inputText[i] + ": Der Text ist ein Palindrom"
                            : inputText[i] + ": Der Text ist kein Palindrom");
        }

    }

    public static boolean isStringPalindrom(String inputText) {
        String reverseText = "";

        for (int i = inputText.length() - 1; i >= 0; i--) {
            char character = inputText.charAt(i);
            reverseText += character;
        }
        return inputText.toLowerCase().equals(reverseText.toLowerCase());
    }
}