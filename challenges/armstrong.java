import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("program of armstron number");
        System.out.println("Please enter the which u want to check that it is armstrong or not");
        int number=input.nextInt();
        boolean isarmstrong=check(number);
        if(isarmstrong){
            System.out.println("it is an armstrong number");
        }
        else{
             System.out.println("it is not an armstrong number");
        }
    }
    public static boolean check(int number) {
        int digits = noOfdigits(number);
        int original = number;
        int armstrongno = 0;
        while (number > 0) {
            int lastdigit = number % 10;
            number/=10;
            int power = power(lastdigit, digits);
            armstrongno += power;
        }
        if (armstrongno == original) {
            return true;
        } else {
            return false;

        }
    }

    public static int power(int number1, int number2) {
        int result = number1;
        int i = 1;
        while (i < number2) {
            result = result * number1;
            i++;
        }

        return result;
    }

    public static int noOfdigits(int number) {
        int digits = 0;
        while (number > 0) {
            digits++;
            number /= 10;

        }
        return digits;
    }
//     public static boolean isarmstrong(int number){
//         int sum=0;
// int originalnum= number;
//         while(number!=0){
//             int lastdigit=number%10;
//             sum+=(lastdigit*lastdigit*lastdigit);
//             number/=10;

//         }
//       if(sum==originalnum){
//         return true;
//       }
//       return false;
//     }
}
