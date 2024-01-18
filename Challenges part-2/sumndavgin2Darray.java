import java.util.Scanner;

public class sumndavgin2Darray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to sum and avg of elements in 2D array");
        int[][]numArray=ArrayUtility.input2DArray();
        long sum = findsum(numArray);
        System.out.println("sum of the elements in 2D array is " + sum);
        double avg=average(numArray);
        System.out.println("Average of array is " + avg);

    }

    public static long findsum(int[][] numArray) {
        int sum = 0, i = 0;
        while (i < numArray.length) {
            int j = 0;
            while (j < numArray[i].length) {
                sum += numArray[i][j];
                j++;

            }
            i++;
        }
        return sum;
    }
    public static double average(int[][]numArray){
        if(numArray.length==0){
            return 0;
        }
        int rows=numArray.length;
        int columns=numArray[0].length;

        return findsum(numArray)/ (rows*columns);
    }
}
