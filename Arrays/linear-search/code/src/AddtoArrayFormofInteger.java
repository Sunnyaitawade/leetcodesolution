import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/add-to-array-form-of-integer/
public class AddtoArrayFormofInteger {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 0};//{0,2,1,5,3,4};
        int k = 34;
        addToArrayForm(nums, k).forEach(System.out::print);

    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ansList = new ArrayList<>();
        int n=num.length;
        int i=n-1;
        while(i>=0 || k>0){
            if(i>=0){
                ansList.add((num[i]+k)%10);
                k=(num[i]+k)/10;
            }else {
                ansList.add(k%10);
                k=k/10;
            }
            i--;
        }
        Collections.reverse(ansList);

        return (ansList);
    }
}
