import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSumof1dArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};//{1,1,1,1,1};
        Arrays.stream(runningSum(nums)).forEach(System.out::print);
    }
    public static int[] runningSum(int[] nums) {
      int sum=0;
        int []ans= new int[nums.length];
        if(nums.length>1 && nums.length<=1000) {
            for (int i = 0; i < nums.length; i++) {
                sum = sum + nums[i];
                ans[i] = sum;
            }
            return ans;
        }
    return nums;
    }
}
