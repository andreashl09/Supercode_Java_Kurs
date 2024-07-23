public class Fernseher extends Geraet implements IBluetoothfaehig {

    private int bildschirmgroesse;

    public Fernseher(String marke, String modell, int bildschirmgroesse) {
        super(marke, modell);
        this.bildschirmgroesse = bildschirmgroesse;
    }

    @Override
    public void verbindeMitBluetooth() {
        System.out.println("Bluetooth ist am Fernseher eingeschaltet");
    }

    @Override
    public void zeigen() {
        super.zeigen();
        System.out.println("Bildschirmgröße:" + bildschirmgroesse);
    }

}
