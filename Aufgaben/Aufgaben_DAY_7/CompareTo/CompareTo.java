public class CompareTo {

    public static void main(String[] args) {
        String s1 = "Hallo";
        String s2 = "Welt";
        int result = compareTo(s1, s2);
        System.out.println("Vergleichsergebnis: " + s1.compareTo(s2));
        System.out.println(result);
    }

    public static int compareTo(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());

        for (int i = 0; i < minLength; i++) {
            int string1Char = s1.charAt(i);
            int string2Char = s2.charAt(i);
            if (string1Char != string2Char)
                return string1Char - string2Char;
        }
        return s1.length() - s2.length();
    }
}