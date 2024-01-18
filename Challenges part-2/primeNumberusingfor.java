import java.util.Scanner;

public class primeNumberusingfor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to prime number programe using for loop");
        System.out.println("please enter the number u want to check it is prime or not");

        int number=input.nextInt();
        for(int i=2;i<number;i++){
if(number%i==0){
    System.out.println("it is not prime number");
    return;
}


    }
    System.out.println("it is a prime number");
    
    }
}
