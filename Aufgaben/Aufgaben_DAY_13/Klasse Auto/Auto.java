import java.time.LocalDate;

/**
 * Auto
 */
public class Auto {

    private String marke;
    private int baujahr;
    private double kilometerstand = 0;
    private double tankkapazitaet = 50.0;
    private double tankinhalt = 0.0;
    private double verbrauch = 7.0;
    private double wartungsintervall = 15000;

    public void setTankkapazitaet(double tankkapazitaet) {
        this.tankkapazitaet = tankkapazitaet;
    }

    public void setTankinhalt(double tankinhalt) {
        this.tankinhalt = tankinhalt;
    }

    public void setVerbrauch(double verbrauch) {
        this.verbrauch = verbrauch;
    }

    public Auto(String marke, int baujahr) {
        setMarke(marke);
        setBaujahr(baujahr);
    }

    private void setMarke(String marke) {
        this.marke = marke;
    }

    private void setBaujahr(int baujahr) {
        if (baujahr < 0 || baujahr > LocalDate.now().getYear())
            throw new IllegalArgumentException();
        this.baujahr = baujahr;
    }

    public void setKilometerstand(double kilometer) {
        this.kilometerstand = kilometer;
        this.pruefeService(kilometerstand);
    }

    public String getMarke() {
        return this.marke;
    }

    public int getBaujahr() {
        return this.baujahr;
    }

    public double getKilometerstand() {
        return this.kilometerstand;
    }

    public String getDetails() {
        return "Marke: " + this.marke + " Baujahr:" + this.baujahr + " Kilometerstand: " + this.kilometerstand
                + " Tankinhalt: " + this.tankinhalt;
    }

    public double getTankkapazitaet() {
        return tankkapazitaet;
    }

    public double getTankinhalt() {
        return tankinhalt;
    }

    public double getVerbrauch() {
        return verbrauch;
    }

    public void tanken(double liter) {
        if (liter <= 0 || liter > this.tankkapazitaet)
            throw new IllegalArgumentException();
        this.tankinhalt += liter;
    }

    public void pruefeService(double kilometerstand) {
        if (kilometerstand >= wartungsintervall)
            System.out.println("Ein Service für das Auto: " + this.marke + "erforderlich");
    }

    public double verbrauchBerechnen(double kilometer) {
        return kilometer * this.verbrauch / 100;
    }

    public boolean isReichweite(double kilometer) {
        return this.tankinhalt >= verbrauchBerechnen(kilometer);
    }

    public String reichweiteBerechnen() {
        return "Die akteulle Reichweite: " + String.format("%.2fkm", this.tankinhalt / this.verbrauch * 100);
    }
}