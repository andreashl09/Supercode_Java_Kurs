public class Kunde {

    private int kundenId;
    private String name;
    private String email;
    private String telefonnummer;

    public Kunde() {

    }

    public Kunde(int kundenId, String name) {
        this.setKundenId(kundenId);
        this.setName(name);
        this.telefonnummer = "";
        this.email = "";
    }

    public Kunde(int kundenId, String name, String email) {
        this.setKundenId(kundenId);
        this.setName(name);
        this.setEmail(email);
        this.telefonnummer = "";
    }

    public int getKundenId() {
        return kundenId;
    }

    public void setKundenId(int kundenId) {
        this.kundenId = kundenId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public void printDetails() {
        System.out.println("KundenId: " + this.kundenId + ", Name: " + this.name + ", Email: " + this.email
                + ", Telefonnummer: " + this.telefonnummer);
    }
}
