import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
      Scanner input=  new Scanner(System.in);
      System.out.println("Now we gonna find LCM of two numbers");
      System.out.println("Enter first number");
      int first=input.nextInt();
      System.out.println("enter second number");
      int second =input.nextInt();
    int lcms=lcm(first, second);
    System.out.println("lcm of numbers is "   + lcms);
    }
    public static int lcm(int first , int second){
       int i=1;
       while(true){
int factor=first*i;
        if(factor % second==0){
            return factor;
        }
        i++;

       }
    }
}
