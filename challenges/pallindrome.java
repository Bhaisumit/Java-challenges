import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pallindrome program");
        System.out.println("enter the number u want to check that it is palindrom or not ");
        int number = input.nextInt();
        boolean checkpalindrome = check(number);
        if (checkpalindrome) {
            System.out.println("yes, it is ann pallindrome number");
        } else {
            System.out.println("no, it is not an pallindrome number");
        }
    }

    // public static boolean check(int number){

    // }
    public static boolean check(int number){
    int reverse=0;
    int original=number;
    while(number!=0){
    int lastdigit=number%10;

    reverse=reverse*10+lastdigit;
    number/=10;
    }
 return original==reverse;

}
}
