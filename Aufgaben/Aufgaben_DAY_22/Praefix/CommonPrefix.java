/**
 * CommonPrefix
 */
public class CommonPrefix {

    public static void main(String[] args) {
        String[] str = { "flower", "flow", "flight", "fly" };
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strings) {
        if (strings.length == 0)
            return "";
        String output = strings[0];
        for (int i = 0; i < strings.length; i++) {
            while (strings[i].indexOf(output) != 0)
                output = output.substring(0, output.length() - 1);
            if (output.isEmpty())
                return "";
        }
        return output;
    }

}
