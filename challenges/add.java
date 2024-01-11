import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("write first number");
        int first_input=sc.nextInt();
        System.out.println("write second number");
        int second_input=sc.nextInt();
        int add=first_input + second_input;
        System.out.println("Addtion of two numbers is");
        System.out.println(add);
    }
}
