public class CompareTo {

    public static void main(String[] args) {
        String s1 = "Hallo";
        String s2 = "Welt";
        int result = compareTo(s1, s2);
        System.out.println("Vergleichsergebnis: " + s1.compareTo(s2));
        System.out.println(result);
    }

    public static int compareTo(String s1, String s2) {
        int lengthString1 = s1.length();
        int lengthString2 = s2.length();              
        int lengthCounter = Math.min(lengthString1, lengthString2);
        
        int charCounter = 0;

        for (int i = 0; i < lengthCounter; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            } else {
                charCounter++;
            }
        }

        if (charCounter == lengthCounter) {
            return lengthString1 - lengthString2;
        }

        return 0;
    }
}