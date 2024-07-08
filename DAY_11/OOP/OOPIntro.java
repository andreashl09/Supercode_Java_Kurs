public class OOPIntro {

    public static void main(String[] args) {
        Person person = new Person("Thomas Bauer (36)");
        System.out.println(
                person.vorname
                        + " "
                        + person.nachname
                        + " (" + person.alter + ")");

        Laptop laptop1 = new Laptop();
        laptop1.setCpuHz(3.2f);
        laptop1.setDiskSpace(512);
        laptop1.setRam((byte) 16);
        laptop1.setDisplaySize(15.4f);
        laptop1.setHersteller("AcerKU");
        laptop1.printInfo();
    }
}