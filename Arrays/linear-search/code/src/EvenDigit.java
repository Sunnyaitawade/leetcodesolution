//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigit {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums
        ) {
            if (isevendigit(num)) {
                count++;
            }
        }
        return count;

    }

    //function to check whether a number contains even digit or not
    public static boolean isevendigit(int digit) {
        int nofdigits =countNoOfDigit2(digit); //countNoOfDigit1(digit);//
        if (nofdigits % 2 == 0) {
            return true;
        }
        return false;

    }

    //sol 1::function to count number of digits in a number
    public static int countNoOfDigit1(int num) {
        int count = 0;

        //no is negative case::convert into positive number by mulitplying -1 to given number
        if (num < 0) {
            num = num * -1;
        }
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    //sol 2::function to count number of digits in a number
    public static int countNoOfDigit2(int num) {
        int count = 0;
        //no is negative case::convert into positive number by mulitplying -1 to given number
        if (num < 0) {
            num = num * -1;
        }
        return (int) (Math.log10(num))+1;
    }

}
