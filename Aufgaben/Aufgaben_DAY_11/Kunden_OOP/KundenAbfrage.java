public class KundenAbfrage {

    public static void main(String[] args) {
        Kunde kunde1 = new Kunde(1001, "Anna Müller");
        Kunde kunde2 = new Kunde(1002, "Thomas Schmidt");
        Kunde kunde3 = new Kunde(1003, "Laura Fischer", "laura.fischer@example.com");
        Kunde kunde4 = new Kunde(1004, "Michael Becker", "michael.becker@example.com");

        kunde1.printDetails();
        kunde2.printDetails();
        kunde3.setTelefonnummer("+49 160 45678901");
        kunde3.printDetails();
        kunde4.printDetails();
    }
}