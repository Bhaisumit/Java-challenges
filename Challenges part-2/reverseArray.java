import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[]numArray=ArrayUtility.inputArray();
        reverse(numArray);
        System.out.println("rversed array is ");
        ArrayUtility.displayArray(numArray);
    }
    public static void reverse(int[] numArray){
        int i=0;
        while(i<numArray.length/2){
            int swap =numArray[i];
            numArray[i]=numArray[(numArray.length-1)-i];
            numArray[(numArray.length-1)-i]=swap;
            i++;
        }
    }
}
