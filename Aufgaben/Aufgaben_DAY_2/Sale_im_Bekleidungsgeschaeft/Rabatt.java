public class Rabatt {

    public static void main(String[] args) {
        // Input der Args über Terminal
        double priceInput = Double.parseDouble(args[0]);
        double dicountInput = Double.parseDouble(args[1]);

        // Rabattierten Preis ausrechnen
        double discountedPrice = (priceInput - (priceInput / 100 * dicountInput));

        // Preis auf zwei Stellen nach dem Komma runden --> mal 100 = zwei Stellen; mal 1000 = drei Stellen, etc.
        double roundPrice = (Math.round(discountedPrice * 100.0)) / 100.0;

        //  Ausgabe des gerundeten Preis
        System.out.println(roundPrice);
    }
}