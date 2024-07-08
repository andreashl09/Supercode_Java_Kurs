/**
 * Rechner
 */
public class Rechner {

    public static void main(String[] args) {

        ExerciseSheet[] sheets = new ExerciseSheet[13];

        for (int i = 0; i < sheets.length; i++) {
            sheets[i] = new ExerciseSheet((int) (Math.random() * 60));
        }

        for (ExerciseSheet exerciseSheet : sheets) {
            exerciseSheet.printSheet();
        }

        System.out.println("Gesamtpunkte alle Übungsblättern: " + totalPoints(sheets));
        System.out.println(howPercent(sheets));
        findTheHighestAndSmallest(sheets);
    }

    public static int totalPoints(ExerciseSheet[] sheets) {
        int summe = 0;
        for (ExerciseSheet exerciseSheet : sheets) {
            summe += exerciseSheet.getNumberOfpointsReached();
        }
        return summe;
    }

    public static String howPercent(ExerciseSheet[] sheets) {
        double maxPoints = sheets.length * 60;
        double percent = (int) (totalPoints(sheets) / maxPoints * 100);

        if (percent >= 50)
            return "Klausurzulassungsgrenze von 50% wurde mit " + (int) percent + "% erreicht";

        return "Klausurzulassungsgrenze von 50% wurde mit " + (int) percent + "% nicht erreicht";
    }

    public static void findTheHighestAndSmallest(ExerciseSheet[] sheets) {
        int smallest = sheets[0].getNumberOfpointsReached();
        int hightest = sheets[0].getNumberOfpointsReached();
        int smallestSheet = sheets[0].getNumberOfSheet();
        int hightestSheet = sheets[0].getNumberOfSheet();

        for (ExerciseSheet exerciseSheet : sheets) {
            int reachedPoints = exerciseSheet.getNumberOfpointsReached();
            if (reachedPoints < smallest) {
                smallest = reachedPoints;
                smallestSheet = exerciseSheet.getNumberOfSheet();
            } else if (reachedPoints > hightest) {
                hightest = reachedPoints;
                hightestSheet = exerciseSheet.getNumberOfSheet();
            }
        }

        System.out.println(
                "Sheet Nr: " + smallestSheet + " mit Punkte: " + smallest + " hat die geringste Anzahl und Sheet Nr: "
                        + hightestSheet + " mit Punkte: " + hightest
                        + " die höchsten Punkte");
    }

}