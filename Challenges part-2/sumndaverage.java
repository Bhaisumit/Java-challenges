import java.util.Scanner;



class sumndaverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("we will write code to find sum and average of elemnts of array");

        int[] numArray = ArrayUtility.inputArray();
        System.out.println("bhai chl jaaa");
        long sum = sum(numArray);

        System.out.println("sum of elements of array is " + sum);
              double avg = average(numArray);

        System.out.println("Average of elements of array " + avg);

    }

    public static long sum(int[] numarray) {
        long sum = 0;
        int i = 0;
        while (i < numarray.length) {
            sum += numarray[i];
            i++;
        }
        return sum;
    }

    public static double average(int[] numarray) {
       double sum = sum(numarray);

        return  (sum/numarray.length);

    }
}