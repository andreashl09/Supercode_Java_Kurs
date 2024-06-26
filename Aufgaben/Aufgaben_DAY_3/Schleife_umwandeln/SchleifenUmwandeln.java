public class SchleifenUmwandeln {

    public static void main(String[] args) {

        // public class ForInWhile{

        // public static void main(String args[]){

        // int summe;

        // for(int i = 0; i < 10; i++){
        // System.out.println("Durchlauf: " + i);
        // summe += i;
        // }
        // System.out.println(summe);

        // }
        // }

        int summe = 0;
        int i = 0;

        while (i < 10) {
            System.out.println("Durchlauf: " + i);
            summe += i;
        }

        System.out.println(summe);

        // public class WhileInFor{

        // public static void main(String args[]){

        // int a = 0;
        // do{
        // a += 2;
        // System.out.println(a);
        // }while(a < 7);

        // }
        // }

        int a = 0;

        for (int j = 0; j < 7; j++) {
            a += 2;
            System.out.println(a);
        }
    }
}