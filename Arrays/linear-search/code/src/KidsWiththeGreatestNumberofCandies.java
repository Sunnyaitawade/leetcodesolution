import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class KidsWiththeGreatestNumberofCandies {

    public static void main(String[] args) {
        int[] nums = {4,2,1,1,2};//{1,1,1,1,1};
        kidsWithCandies(nums, 1).stream().forEach(System.out::print);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            boolean test = false;
            for (int j = 0; j < candies.length; j++) {
                if (candies[i] + extraCandies < candies[j]) {
                    test = true;
                    break;
                }
            }
            ans.add(!test);
        }
        return ans;
    }
}
