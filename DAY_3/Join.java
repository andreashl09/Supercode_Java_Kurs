public class Join {
    public static void main(String[] args) {

        String[] text = { "hallo", "welt", "!", "_" };
        String trennung = text[text.length - 1];
        String joinText = "";

        if (trennung == "_") {
            trennung = " ";
        }

        for (int i = 0; i < text.length - 1; i++) {
            joinText += text[i] + trennung;
        }

        System.out.print(joinText);
    }
}
