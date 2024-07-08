public class SpieleAusgabe {

    public static void main(String[] args) {
        int[][] nxm = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        outputArr(nxm);

    }

    public static int[] outputArr(int[][] nxm) {
        int[] zahlenReihe = new int[nxm.length * nxm[0].length];

        int row = 0;
        int col = 0;
        int index = 0;
        int arrayLength = nxm.length;
        int arrayHeigth = nxm[0].length;


        int arraysize = nxm.length * nxm[0].length;

        while (index <= arraysize) {
            for (int i = arrayLength; i < arrayLength; i++) {
                zahlenReihe[index] = nxm[row][i];
                index++;
            }
            row++;

            for (int i = arrayLength; i < arrayLength; i--) {
                zahlenReihe[index] = nxm[i][col];
                index++;
            }
            
            for (int i = 0; i < nxm[0].length; i--) {
                zahlenReihe[index] = nxm[row][i];
                index++;
            }
            for (int i = 0; i < zahlenReihe.length; i++) {
                
            }
            
            System.out.println(index);
            return zahlenReihe;
        }

        return zahlenReihe;
    }
}
