import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Similar to :https://leetcode.com/problems/add-to-array-form-of-integer/
//https://leetcode.com/problems/plus-one/

public class PlusOne {
    public static void main(String[] args) {
        int []digits = {4,3,2,1};

        Arrays.stream(plusOne(digits)).forEach(System.out::print);
    }
    public static int[] plusOne(int[] digits) {
      List<Integer> ansList= new ArrayList<>();
       int lentgh= digits.length;
       int i=lentgh-1;
       int k=1;
        while(i>=0 || k>0){
            if(i>=0){
                ansList.add((digits[i]+k)%10);
                k=(digits[i]+k)/10;
            }else {
                ansList.add(k%10);
                k=k/10;
            }
            i--;
        }
        Collections.reverse(ansList);
       return  ansList.stream().mapToInt(l -> l).toArray();
    }
}
