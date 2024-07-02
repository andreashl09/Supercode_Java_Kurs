public class StringProcessing {

    public static void main(String[] args) {
        String s1 = "Ich bin Ein TestSatz!";
        // toLowerCase(s1);
        // toUpperCase(s1);

        System.out.println(indexOf("Hallo Freunde!", "und"));
        // indexOf("Hallo Freunde!", "und");
    }

    public static void toLowerCase(String s1) {
        String lowerCaseText = "";

        for (int i = 0; i < s1.length(); i++) {

            int charByte = (byte) s1.charAt(i);

            if (charByte >= 65 && charByte < 91) {
                charByte += 32;
            }

            lowerCaseText += (char) charByte;

        }
        System.out.print(lowerCaseText);
    }

    public static void toUpperCase(String s1) {
        String UpperCaseText = "";

        for (int i = 0; i < s1.length(); i++) {

            int charByte = (byte) s1.charAt(i);

            if (charByte >= 97 && charByte < 123) {
                charByte -= 32;
            }

            UpperCaseText += (char) charByte;

        }
        System.out.print(UpperCaseText);
    }

    // Aufgabe: Implementiere deine eigene indexOf Methode:
    // input = "Hallo Freunde!"
    // search = "und"
    // indexOf(input, search) --> 9
    // indexOf(input, "blabla") --> -1 (kommt nicht vor)

    // abc
    // ab
    // return -1;
    public static int indexOf(String input, String search) {
        for (int index = 0; index < input.length(); index++) {

            int searchIndex = 0;
            while (searchIndex < search.length()) {
                if (input.charAt(index + searchIndex) == search.charAt(searchIndex)) {
                    searchIndex++;
                } else {
                    break;
                }

            }

            if (searchIndex == search.length()) {
                // index = 0, searchIndex = 2
                return index;
            }

        }
        return -1;
    }

    public static int indexOf2(String input, String search) {
        for (int index = 0; index < input.length(); index++) {

            int searchIndex = 0;
            while (searchIndex < search.length() && input.charAt(index + searchIndex) == search.charAt(searchIndex))
                searchIndex++;

            if (searchIndex == search.length()) {
                // index = 0, searchIndex = 2
                return index;
            }

        }
        return -1;
    }
}
