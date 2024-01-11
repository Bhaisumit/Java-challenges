import java.util.*;

public class bitwise {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("first number is");
        int first=input.nextInt();
        System.out.println("Second number is");
        int second =input.nextInt();
        System.out.println("now, we ill perform different bitweise operation on  given two numbers");
        int bitwiseAnd=first & second;
        System.out.println("bitwise AND of two numbers is " + bitwiseAnd);
        int bitwiseOr=first^second;
        System.out.println("the bitwise XOR of two numbers is " + bitwiseOr );
        int bitwiseNot=~first ;
        System.out.println("bitwise compliment of two numbers is "+ bitwiseNot);
    }
}
