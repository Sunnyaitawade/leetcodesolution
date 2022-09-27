import java.util.Arrays;

//https://leetcode.com/problems/shuffle-the-array/
public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2};//{1,1,1,1,1};
        Arrays.stream(shuffle(nums, 2)).forEach(System.out::print);
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int j=0;
        for (int i = 0; i < 2*n; i++) {
            ans[i]=i%2==0 ? nums[i/2]:nums[n+i/2];
        }
        return ans;
    }
}
