import java.util.Arrays;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class howmanyNumbersaresmallerthanthecurrentnumber {
    public static void main(String[] args) {
        int[] nums = {6,5,4,8};//{1,1,1,1,1};
        Arrays.stream(smallerNumbersThanCurrent(nums)).forEach(System.out::print);
    }

    public static  int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            int min =0;
            for (int j = 0; j < nums.length ; j++) {
               if(nums[i]>nums[j]){
                   min++;
               }
            }
            ans[i]=min;
        }
        return ans;
    }

}
