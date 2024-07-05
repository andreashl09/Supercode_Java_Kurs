public class Palindrom {

    public static void main(String[] args) {

        System.out.println(isPalindrom("AmoK Oma"));
        System.out.println(isPalindrom("lagerregal"));
        System.out.println(isPalindrom("otto"));
        System.out.println(isPalindrom("amokoma"));
    }

    public static boolean isPalindrom(String input) {
        int inputLength = input.length();
        if (inputLength <= 1)
            return true;
 
        if (input.charAt(0) != input.charAt(inputLength - 1))
            return false;
       String nextInput = input.substring(1, inputLength -1);
        return isPalindrom(nextInput);
    }
}