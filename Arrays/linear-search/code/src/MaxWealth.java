//https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {
        int [][]accounts = {{2,8,7},{7,1,3},{1,9,5}};//{{1,2,3},{3,2,1}};//
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int max =0;
        for (int i = 0; i < accounts.length; i++) {
            int wealthSum =0;
            for (int j = 0; j <accounts[i].length ; j++) {
                wealthSum =wealthSum+accounts[i][j];
            }
            if(max<wealthSum){
                max =wealthSum;
            }
        }
        return max;
    }
}
