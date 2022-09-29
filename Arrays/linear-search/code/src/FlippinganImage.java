import java.util.Arrays;

//https://leetcode.com/problems/flipping-an-image/
public class FlippinganImage {
    public static void main(String[] args) {
        int [][] image ={{1,1,0},{1,0,1},{0,0,0}};

        //{{1,1,0},{1,0,1},{0,0,0}}
        image = flipAndInvertImage( image);
        //System.out.println(Arrays.deepToString(flipAndInvertImage( image)));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
     int [][] ans= new int[image.length][image.length];
        for (int i = 0; i <image.length ; i++) {
             int k=0;
            for (int j = image[i].length-1; j >=0 ; j--) {

                if(image[i][j]==0){
                    ans[i][k]=1;

                }
                if(image[i][j]==1){
                    ans[i][k]=0;
                }

                System.out.print(ans[i][k]);
                k++;
            }
            System.out.print(",");
            System.out.println("");
        }
        return ans;
    }
}
