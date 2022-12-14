public class MaximumPopulationYear {
    public static void main(String[] args) {
        int [][]logs = {{1993,1999},{2000,2010}};
        System.out.println(maximumPopulation(logs));
    }

    //Using brute force apporach
    public static int maximumPopulation(int[][] logs) {

        int [] arr =new int[101];
        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0]; j < logs[i][1]; j++) {
              arr[j-1950]++;
            }
        }
        int maxVal=0;
        int maxYear=0;
        for (int i = 0; i < 101; i++) {
            if(maxVal<arr[i]){
               maxVal=arr[i];
               maxYear=i+1950;
            }
        }
        return maxYear;
    }

    //Using running sum approche
    public static int maximumPopulation2(int[][] logs) {

        int [] arr =new int[101];
        for (int i = 0; i < logs.length; i++) {

                arr[logs[i][0]-1950]++;
                arr[logs[i][1]-1950]--;

        }
        int maxVal=0;
        int maxYear=0;
        for (int i = 0; i < 101; i++) {
            if(maxVal<arr[i]){
                maxVal=arr[i];
                maxYear=i+1950;
            }
        }
        return maxYear;
    }
}
