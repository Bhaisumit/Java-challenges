import java.util.*;

public class sumofDigit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number which u want to calcualte sum of digits ");
        int number=input.nextInt();
        int sumofdigit=sumdigit(number);
        System.out.println("sum of all digito of number " + number + " is " + sumofdigit);

    }
    public static int sumdigit(int number){
        int sum=0;
        while(number!=0){
int lastdigit=number%10;
sum+=lastdigit;
number/=10;
        }
        return sum;
    }
}
