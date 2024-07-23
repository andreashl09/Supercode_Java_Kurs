public class Smartphone extends Geraet implements IInternetfaehig, IBluetoothfaehig {

    private String betriebssystem;

    public Smartphone(String marke, String modell, String betriebssystem) {
        super(marke, modell);
        this.betriebssystem = betriebssystem;
    }

    @Override
    public void verbindeMitInternet() {
            System.out.println("Smartphone ist mit dem Internet verbunden");
    }

    @Override
    public void verbindeMitBluetooth() {
            System.out.println("Bluetooth ist am Smartphone eingeschaltet");
    }

    @Override
    public void zeigen() {
        super.zeigen();
        System.out.println("Betriebssystem: " + betriebssystem);
    }
}