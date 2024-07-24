import java.util.ArrayList;

public class MediaSuperMarkt {

    public static ArrayList<Geraet> inventarList = new ArrayList<>();

    public static void main(String[] args) {

        inventarList.add(new Fernseher("LG", "x", 55));
        inventarList.add(new Smartphone("IPhone", "X", "IOS"));
        inventarList.add(new Laptop("ACER", "24-dc.5", "I9"));

        testeAlleGeraete();
        zeigedDieMethodenDerInterfaces();

    }

    public static void testeAlleGeraete() {
        for (Geraet g : inventarList) {
            g.einschalten();
            g.zeigen();
            g.ausschalten();
            System.out.println("");
        }
    }

    public static void zeigedDieMethodenDerInterfaces() {
        for (Geraet g : inventarList) {
            if (g instanceof IBluetoothfaehig)
                ((IBluetoothfaehig) g).verbindeMitBluetooth();

            if (g instanceof IInternetfaehig)
                ((IInternetfaehig) g).verbindeMitInternet();

        }
    }
}
