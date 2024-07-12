import java.time.LocalDateTime;
import java.util.ArrayList;

public class Boot extends Fahrzeug {
    // länge, breite, tiefgang, freiboard
    // hasMotor: segelboot (masthöhe) vs. motorboot
    // personCount
    // isLicenceRequired
    // availability: Reservation[] from, to, person

    private int personCount;
    private boolean isLicenceRequired;

    public Boot(String hersteller, String type, int personCount, boolean isLicenceRequired, double pricePerHour) {
        super(hersteller, type, pricePerHour);
        this.setType(type);
        this.setPersonCount(personCount);
        this.setIsLicenceRequired(isLicenceRequired);
        this.setPricePerHour(pricePerHour);

    }

    @Override
    public void setType(String type) {
        if (!type.equals("Segelboot") && !type.equals("Motorboot"))
            throw new IllegalArgumentException("Bootstyp muss Segelboot oder Motorboot sein");
    }

    public void setPersonCount(int personCount) {
        if (personCount <= 0)
            throw new IllegalArgumentException("Personcount muss größer als 0 sein");
        this.personCount = personCount;
    }

    public void setIsLicenceRequired(boolean isLicenceRequired) {
        this.isLicenceRequired = isLicenceRequired;
    }

    public int getPersonCount() {
        return personCount;
    }

    public boolean isLicenceRequired() {
        return isLicenceRequired;
    }

}
