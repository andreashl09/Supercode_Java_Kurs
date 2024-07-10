public class Autofahren {

    public static void main(String[] args) {

        Auto auto1 = new Auto("Mercedes", 1979);
        Fahrer fahrer1 = new Fahrer("Dieter", "Schlotzmann", 89);
        Fahrer fahrer2 = new Fahrer("Jochen", "Whatever", 17);

        System.out.println(auto1.getDetails());

        auto1.tanken(40);
        System.out.println(auto1.getDetails());
        fahrer1.fahren(auto1, 34);
        fahrer1.fahren(auto1, 250);

        System.out.println(auto1.getDetails());
        System.out.println(auto1.reichweiteBerechnen());

    }
}
