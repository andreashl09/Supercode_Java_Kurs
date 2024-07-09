import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Bankkonto
 */
public class Bankkonto {

    private String kontoinhaber;
    private String kontonummer;
    private double kontostand = 0.0;
    private double dispo;
    private boolean isDispo = false;
    private ArrayList<String> transaktioStrings = new ArrayList<String>();

    public Bankkonto(String kontoInhaber, String kontoNummer) {
        this.kontoinhaber = kontoInhaber;
        this.kontonummer = kontoNummer;

    }

    public double getKontostand() {
        return this.kontostand;
    }

    public String getKontoInhaber() {
        return kontoinhaber;
    }

    public void einzahlen(double betrag) {
        if (betrag < 0)
            System.out.println("Du kannst keinen Minusbetrag einzahlen");
        kontostand += betrag;
        System.out.println(getKontostandInfo());
    }

    public boolean abheben(double betrag) {
        if (betrag < 0) {
            System.out.println("Du kannst keinen Minusbetrag einzahlen");
            return false;
        }
        if (!isDispo && betrag > kontostand) {
            System.out.println("Du kannst nicht mehr abheben als du hast");
            return false;
        } else if (isDispo && betrag > (kontostand + dispo))
            System.out.println("Du kannst dein Kontolimit nicht überziehen");
        else
            kontostand -= betrag;
        System.out.println(getKontostandInfo());
        return true;
    }

    public String getKontostandInfo() {
        return "Kontostand: " + kontostand;
    }

    public String kontoInformationen() {
        return "Kontoinhaber: " + kontoinhaber + " Kontonummer: " + kontonummer + " " + getKontostandInfo();
    }

    public void gibKontoInformationen() {
        System.out.println(kontoInformationen());
    }

    public void setDispo(boolean dispoTrue) {
        this.isDispo = dispoTrue;
    }

    public void setDispo(int dispoBetrag) {
        this.dispo = dispoBetrag;
    }

    public void ueberweisen(Bankkonto empfaenger, double betrag) {
        if (abheben(betrag)) {
            empfaenger.einzahlen(betrag);
            this.writeTransaktion(empfaenger, betrag);
        }
    }

    public void writeTransaktion(Bankkonto empfaenger, double betrag) {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        transaktioStrings
                .add(formattedDate + " -" + betrag + " an " + empfaenger.getKontoInhaber()
                        + " überwiesen. Kontostand:"
                        + this.kontostand);
        empfaenger.transaktioStrings
                .add(formattedDate + " +" + betrag + " von " + this.getKontoInhaber() + " erhalten. Kontostand:"
                        + empfaenger.kontostand);
    }

    public void printKontoauszug() {
        for (String string : transaktioStrings) {
            System.out.println(string);
        }
    }

}