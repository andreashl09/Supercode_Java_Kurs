import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * ArrayListMethoden
 */
public class ArrayListMethoden {

    public static void main(String[] args) {
        ArrayList<Integer> intListe = new ArrayList<Integer>();

        for (int i = 1; i <= 5; i++) {
            intListe.add(i);
        }

        // remove 3
        int removeInt = 3;
        for (int i = 0; i < intListe.size(); i++) {
            if (intListe.get(i) == 3)
                intListe.remove(i);

        }
        System.out.println(removeInt + " wurde aus Arraylist entfernt!");

        // print intListe Size
        System.out.println("Länge der Liste: " + intListe.size());

        // print IntListe
        printList(intListe);

        intListe.add(89);
        intListe.add(9);
        intListe.add(8);
        intListe.add(7);
        intListe.add(-2);

        intListe.sort(Comparator.naturalOrder());
        printList(intListe);

        // Prüft ob int 4 enthalten ist
        System.out.println(intListe.contains(((Integer) 4)));

        // SubList - die ersten drei Elemente
        ArrayList<Integer> subList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            subList.add(intListe.get(i));
        }
        printList(subList);

        // Zwei Arraylisten mit je ungerade zahlen und gerade Zahlen
        int[] data = { 1, 5, 6, 11, 3, 15, 7, 8, 12, 21, 9, 1038 };

        ArrayList<Integer> ungeradeZahlen = new ArrayList<Integer>();
        ArrayList<Integer> geradeZahlen = new ArrayList<Integer>();

        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0)
                geradeZahlen.add(data[i]);
            else
                ungeradeZahlen.add(data[i]);
        }

        printList(geradeZahlen);
        printList(ungeradeZahlen);

    }

    public static void printList(ArrayList list) {
        System.out.print("Inhalt: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("");
    }

}