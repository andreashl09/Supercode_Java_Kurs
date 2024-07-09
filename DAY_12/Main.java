public class Main {

    public static void main(String[] args) {
        IntArrayList liste = new IntArrayList();

        liste.add(34);
        liste.add(32);
        liste.add(33);
        liste.add(36);
        liste.add(-37);
        liste.add(3);
        liste.add(36);
        liste.add(38);
        liste.add(90);
        liste.add(21);

        System.out.println(liste.slice(2, 4).get(1));

    }
}
