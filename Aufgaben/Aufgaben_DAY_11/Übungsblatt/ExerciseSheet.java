public class ExerciseSheet {

    private static int numberSheet = 1;
    private int maxPoint;
    private int numberOfSheet;
    private int numberOfpointsReached;

    public ExerciseSheet(int numberOfpointsReached) {
        this.numberOfSheet = numberSheet++;
        this.maxPoint = 60;
        this.numberOfpointsReached = numberOfpointsReached;
    }

    public int getNumberOfSheet() {
        return numberOfSheet;
    }

    public void setNumberOfSheet(int numberOfSheet) {
        this.numberOfSheet = numberOfSheet;
    }

    public int getMaxPoint() {
        return maxPoint;
    }

    public int getNumberOfpointsReached() {
        return numberOfpointsReached;
    }

    public void setNumberOfpointsReached(int numberOfpointsReached) {
        this.numberOfpointsReached = numberOfpointsReached;
    }

    public String toString() {
        return "Sheet Nr.:" + numberOfSheet +
                " maxPoint=" + maxPoint +
                ", numberOfPointsReached=" + this.numberOfpointsReached +
                '}';
    }

    public void printSheet() {
        System.out.println(this.toString());
    }

}
