import java.util.*;

public class sumOddnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("number of terms u want to calculate odd sum");
        int numbers=sc.nextInt();
        int sumofOdd=sumofOdd(numbers);
System.out.println("sum of odd numbers is " + sumofOdd);
        // System.out.println("now first of all take 1 to 10 inputs");
        // while (i <= 10) {
        //     int input = sc.nextInt();
        //     if (input % 2 == 1) {
        //         sum += input;
        //     }
        //     i++;
        // }
        // System.out.println("sum of odd numbers is " + sum);

    }
    public static int sumofOdd(int number){
        int sum=0;
        int i=1;
        while(i<=number){
            
sum+=i;
i+=2;

        }
    
return sum;
    }
}
