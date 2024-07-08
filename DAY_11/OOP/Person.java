public class Person {

    public String vorname;
    public String nachname;
    public int alter;

    public Person(String personInfo) {
        String[] personString = personInfo.split(" ");
        this.vorname = personString[0];
        this.nachname = personString[1];
        String alterString = personString[2].substring(1, personString[2].length() - 1);
        this.alter = Integer.parseInt(alterString);
    }
}
