/**
 * Fahrer
 */
public class Fahrer {

    private String vorname;
    private String nachname;
    private int alter;
    private boolean isOverEighteen;

    public Fahrer(String vorname, String nachname, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        setAlter(alter);
        this.isOverEighteen = isOverEighteen(alter);

    }

    private void setAlter(int alter) {
        if (alter < 0)
            throw new IllegalArgumentException();
        this.alter = alter;
    }

    private boolean isOverEighteen(int alter) {
        return (alter >= 18);
    }

    public void fahren(Auto auto, double kilometer) {
        if (kilometer <= 0)
            throw new IllegalArgumentException();

        if (!isOverEighteen) {
            System.out.println("Der Fahrer: " + this.vorname + " darf noch kein Auto fahren!");
            return;
        }
        if (!auto.isReichweite(kilometer)) {
            System.out.println("Der Tankinhalt reicht nicht für die angegebenen Kilometer");
            return;
        }
        auto.setKilometerstand(auto.getKilometerstand() + kilometer);
        auto.setTankinhalt(auto.getTankinhalt() - auto.verbrauchBerechnen(kilometer));
    }

}