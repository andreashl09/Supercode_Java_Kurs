public class Laptop extends Geraet implements IInternetfaehig {

    private String prozessor;

    public Laptop(String marke, String modell, String prozessor) {
        super(marke, modell);
        this.prozessor = prozessor;
    }

    @Override
    public void verbindeMitInternet() {
        System.out.println("Laptop ist mit dem Internet verbunden");
    }

    @Override
    public void zeigen() {
        super.zeigen();
        System.out.println("Prozessor: " + prozessor);
    }

}