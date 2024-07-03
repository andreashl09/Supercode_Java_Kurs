public class Split_Methode {

    public static void main(String[] args) {

        String s = "Hallo meine Freunde, ich bin back in Town!";
        for (String string : split(s, " ")) {
            System.out.println(string);
        }
    }

    public static int numberOfElements(String inputString, String searchInput) {
        int numbers = 0;
        int inputStringLength = inputString.length();
        int searchInputLength = searchInput.length();

        for (int i = 0; i < inputStringLength; i++) {

            int j = 0;
            while (j < searchInputLength) {
                if (inputString.charAt(i + j) == searchInput.charAt(j)) {
                    j++;
                } else {
                    break;
                }

                if (searchInputLength == j) {
                    numbers++;
                }
            }
        }
        return numbers + 1;
    }

    public static String[] split(String inputString, String searchString) {
        int numberOfElements = numberOfElements(inputString, searchString);
        String[] arrayStr = new String[numberOfElements];
        String restOfString = inputString;

        for (int element = 0; element < numberOfElements; element++) {
            int endIndex = restOfString.indexOf(searchString);
            if (endIndex > 0 && element < numberOfElements) {
                arrayStr[element] = restOfString.substring(0, endIndex);
                restOfString = restOfString.substring(endIndex + searchString.length(), restOfString.length());
            } else {
                arrayStr[element] = restOfString;
            }
        }

        return arrayStr;
    }
}