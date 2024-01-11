import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number which u want to calculate GCD");
        System.out.println("Enter first number");
        int first = input.nextInt();
        System.out.println("Enter second number");
        int second = input.nextInt();

        int gcd = calculategcd(first, second);
        System.out.println("the gcd of two number " + first + " and " + second + " is " + gcd);
    }

    public static int calculategcd(int first, int second) {
        // int i = 1;
        // int ans=0;
        // while (i<=first) {
        //     if (first % i == 0 && second % i == 0) {
        //         ans = i;
        //     }
        //    i++;

        // }
        // return ans;

        int gcd=1;
        int i=2;
int least =least(first,second);
while(i<=least){
    if(first%i==0 && second%i==0){
        gcd=i;
 
    }
     i++;
  
}
        return gcd;

    }
    public static int least(int num1, int num2){
        if(num1>num2){
            return num2;
        }
        else{
            return num1;
        }
    }
}
