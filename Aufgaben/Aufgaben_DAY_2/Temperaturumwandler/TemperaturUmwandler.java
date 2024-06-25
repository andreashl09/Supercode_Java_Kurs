public class TemperaturUmwandler {

    public static void main(String[] args) {
        // args wird als String übergeben und muss daher in ein int geparst werden
        int tempInput = Integer.parseInt(args[0]);
        int fahrenheitOutput = tempInput * 9 / 5 + 32;
        System.out.println(tempInput + "°C Grad sind " + fahrenheitOutput + " Fahrenheit");
    }
}