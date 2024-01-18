import java.util.Scanner;

public class pallindromearray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("program of pallindrome array");
        int [] numArray=ArrayUtility.inputArray();
        boolean isPalin=isPalindrome(numArray);
if(isPalin){
    System.out.println("YOur array is palindrome");
}
else{
    System.out.println("your array is not palindrome");
}
        
    }
    public static boolean isPalindrome(int[] numArray){
        int i=0;
        while(i<numArray.length/2){
            if(numArray[i]!=numArray[numArray.length-1-i]){
return false;
            }
            i++;
        }
        return true;
    }
}
