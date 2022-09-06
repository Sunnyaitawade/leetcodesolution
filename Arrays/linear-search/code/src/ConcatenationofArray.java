import java.util.Arrays;

//https://leetcode.com/problems/concatenation-of-array/
public class ConcatenationofArray {

    public static void main(String[] args) {
        int[] nums = {1,3,2,1};//{1,2,1};//
        Arrays.stream(getConcatenation(nums)).forEach(System.out::print);
    }
    public static int[] getConcatenation(int[] nums) {
        int totalRows = nums.length*2;
        int []ans= new int[totalRows];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }
}
