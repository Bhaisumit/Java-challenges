import java.util.Scanner;
import java.lang.Math;

public class numberguess {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to program of number guess game");
double guess;
int number;
        do{
            System.out.println("input your guess between 0 to 10");
             number=input.nextInt();
            guess=Math.floor(Math.random()*10);
        }
        while(number!=guess);
        System.out.println("you have successfully guess the number");

    }
    
}
