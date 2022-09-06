import java.util.Arrays;

//https://leetcode.com/problems/build-array-from-permutation/
public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};//{0,2,1,5,3,4};
        Arrays.stream(buildArray(nums)).forEach(System.out::print);
    }
    public static int[] buildArray(int[] nums) {
        if(nums.length>1 && nums.length<=1000){
            int []ans= new int[nums.length];
            int j=0;
            for (int i = 0; i < nums.length; i++) {
                j =nums[i];
                ans[i] =nums[j];
            }
            return ans;
        }
       return nums;
    }
}
