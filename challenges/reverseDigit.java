import java.util.*;
public class reverseDigit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number which u want to do reverse");
        int number =input.nextInt();
        System.out.println("now we want to reverse the digit");
        int reverse=reverseDigit(number);
        System.out.println("reverse number is " + reverse);
    }
    public static int reverseDigit(int number){
        int reverse=0;
        while(number!=0){
            int lastdigit=number%10;

            reverse=reverse*10+lastdigit;
            number/=10;
        }
        return reverse;
    }
}
