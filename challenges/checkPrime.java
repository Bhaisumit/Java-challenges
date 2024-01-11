import java.util.*;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number u want to check whtether it is prime of not");
        int number = sc.nextInt();
        boolean isPrime = checkisprime(number);
        if (isPrime) {
            System.out.println("given number " + number + " is prime");
        } else {
            System.out.println("not prime");
        }

    }

    public static boolean checkisprime(int number) {
        int i = 2;
        while (i <= number) {
            if (number % i != 0) {
                return true;
            }

        }
        return false;
    }
}
