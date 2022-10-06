import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/spiral-matrix/
public class SpiralMatrix {
    public static void main(String[] args) {
        int[][]  digits = {{1,2,3},{4,5,6},{7,8,9}};
        spiralOrder(digits).stream().forEach(System.out::print);
    }
    public static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> result = new ArrayList<Integer>();
        if(matrix == null || matrix.length == 0) return result;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int x=0;
        int y=0;
        while(rows>0 && cols>0){
            //if one row/column left, no circle can be formed
            if(rows==1){
                for (int i = 0; i <cols ; i++) {
                    result.add(matrix[x][y++]);
                }
                break;
            }
            else if(cols==1){
                for (int i = 0; i <rows ; i++) {
                    result.add(matrix[x++][y]);
                }
                break;
            }
            //below, process a circle
            //top - move right
            for (int i = 0; i <cols-1 ; i++) {
                result.add(matrix[x][y++]);
            }
            //right - move down
            for (int i = 0; i <rows-1 ; i++) {
                result.add(matrix[x++][y]);
            }
            //bottom - move left
            for(int i=0;i<cols-1;i++){
                result.add(matrix[x][y--]);
            }
            //left - move up
            for(int i=0;i<rows-1;i++){
                result.add(matrix[x--][y]);
            }
            x++;
            y++;
            rows=rows-2;
            cols=cols-2;
        }
        return result;
    }
}
