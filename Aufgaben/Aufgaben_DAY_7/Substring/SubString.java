public class SubString {

    public static void main(String[] args) {

        String s = "Programmieren";
        String sub = substring(s, 0, 7);
        System.out.println(sub); // Sollte "gram" ausgeben.
    }

    public static String substring(String s, int start, int end) {
        int lengthStringInt = s.length();

        if (start < 0 || end > lengthStringInt)
            return "null";

        String subString = "";
        for (int i = start; i < end; i++) {
            subString += s.charAt(i);
        }
        return subString;
    }
}