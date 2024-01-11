import java.util.Scanner;

public class checkNumber{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=input.nextInt();
        if(number>0){
            System.out.println("given number is positive");
        }
        else if(number<0){
            System.out.println("Given number is negative");

        }
        else{
            System.out.println("given number is 0");
        }
    }
}