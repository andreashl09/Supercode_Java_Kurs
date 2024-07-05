public class PasswortGenerator {

    public static void main(String[] args) {

        String text = "Das Erlernen von Java macht so viel Spass";
        System.out.println(getPassword(text, getPassword(text)));
        String leer = " ";
    }

    public static int getPassword(String text) {

        int howElements = 0;
        int index = 0;

        while (index >= 0) {
            index = text.indexOf(" ");
            text = text.substring(index + 1, text.length());
            howElements++;
        }

        return howElements;
    }

    public static char[] getPassword(String text, int elements) {
        char[] password = new char[elements];
        int index = 0;

        password[0] = text.charAt(0);

        for (int i = 1; i < elements; i++) {
            index = text.indexOf(" ");
            text = text.substring(index + 1, text.length());
            password[i] = text.charAt(0);
        }
        return password;
    }
}
