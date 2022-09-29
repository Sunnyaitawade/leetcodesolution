//https://leetcode.com/problems/find-the-highest-altitude/
public class FindtheHighestAltitude {
    public static void main(String[] args) {
        int []gain = {-4,-3,-2,-1,4,3,2};//{-5,1,5,0,-7};
        System.out.println(largestAltitude( gain));
    }
    public static int largestAltitude(int[] gain) {

        int max=0;
        int currentPosition=0;

        for (int i = 0; i < gain.length ; i++) {
            currentPosition=currentPosition+gain[i];
            max=Math.max(currentPosition,max);
        }
        return max;
    }
}
