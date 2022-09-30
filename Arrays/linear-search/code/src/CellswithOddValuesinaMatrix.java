//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
public class CellswithOddValuesinaMatrix {

    public static void main(String[] args) {
        int m = 2, n = 3;
        int[][] indices = {{0, 1}, {1, 1}};

        System.out.println(oddCells(m, n, indices));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int oddCount = 0;
        int[][] ansArray = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                for (int k = 0; k < indices.length; k++) {
                    if (i == indices[k][0]) {
                        ansArray[i][j] = ansArray[i][j] + 1;
                    }
                    if (j == indices[k][1]) {
                        ansArray[i][j] = ansArray[i][j] + 1;
                    }

                }
                //
                if (ansArray[i][j] % 2 != 0) {
                    oddCount++;
                }

            }

        }


        return oddCount;
    }
}
