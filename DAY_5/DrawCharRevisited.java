public class DrawCharRevisited {

    public static void main(String[] args) {
        int length = Integer.parseInt(args[0]);
        int heigth = Integer.parseInt(args[1]);

        DrawRectangle(length, heigth);
    }

    public static void DrawRectangle(int length, int height) {
        for (int i = 0; i < height; i++) {
            DrawLine(length);
        }
    }

    public static void DrawLine(int length) {
        for (int i = 0; i < length; i++) {
            System.err.print("*");
        }
        System.out.print("\n");
    }

}