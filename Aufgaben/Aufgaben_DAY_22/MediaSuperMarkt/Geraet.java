public class Geraet {

    private String marke;
    private String modell;

    public Geraet(String marke, String modell) {
        this.marke = marke;
        this.modell = modell;
    }

    public void einschalten() {
        System.err.println("Gerät einschalten");
    }

    public void ausschalten() {
        System.err.println("Gerät ausschalten");
    }

    public void zeigen() {
        System.out.println("Marke: " + this.marke);
        System.out.println("Modell: " + this.modell);
    }

}
