import java.util.Arrays;

//https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,5,5,11};

        Arrays.stream(twoSum(nums, 10)).forEach(System.out::print);
    }
    public static int[] twoSum(int[] nums, int target) {
        int []outout =new int[2];
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j < nums.length; j++) {
              if((nums[i] +nums[j])==target){
                  outout[0] =i;
                  outout[1] =j;
                  return outout;

              }
            }

        }
        return outout;

    }
}
