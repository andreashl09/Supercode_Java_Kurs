public class TypeCasting {

    public static void main(String[] args) {
        // String --> text
        // char --> einzelner character
        // int, double, float --> zahlen
        // boolean --> Wahrheitswerte

        // double age = 100.756;
        // System.out.println(age);

        // // Cast in int
        // int ageUnprecise = (int) age;
        // System.out.println(ageUnprecise);

        // float age = 10.78f;
        // System.out.println(age);

        // // Cast in int
        // int ageUnprecise = (int) age;
        // System.out.println(ageUnprecise);

        // Parsen
        // von String in int
        String zahlString = "5";
        System.out.println(zahlString + 1);
        int zahl = Integer.parseInt(zahlString);
        System.out.println(zahl + 1);

    }
}