import java.util.Scanner;

public class palindromerecursion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to pallindrome program using recursion");
        String str=input.next();
        boolean check=checkpalindrome(str);
        if(check){
            System.out.println("it is pallindrome");
        }
        else{
            System.out.println("it is not pallindrome");
        }
    }
    public static boolean checkpalindrome(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
              return false;
        }
        else{
            i++;
            j--;
        }
        
        }
        return true;
    //   coding is the process in which you have to make your fried  it     `34
    }
}
