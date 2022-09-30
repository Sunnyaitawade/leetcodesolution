//https://leetcode.com/problems/transpose-matrix/
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};//{{0, 1}, {1, 1}};

        System.out.println(transpose(matrix));
    }
    public static int[][] transpose(int[][] matrix) {
        int R = matrix.length, C = matrix[0].length;
      int [][] ans =  new int[C][R];
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length; j++) {
                ans[i][j]=matrix[j][i];
                System.out.print(ans[i][j]);
            }

            System.out.println("");
        }
        return ans;
    }
}
