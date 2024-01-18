import java.util.Scanner;

class minimumoftwo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("find minimum of two using ternary operator");
        System.out.println("enter first number please");

        int firstnumber=input.nextInt();
        System.out.println("enter second number please");
        int secondnumber=input.nextInt();
        String minoftwo=firstnumber>secondnumber?"second no is minimum ":"first number is minimum";
        System.out.println(minoftwo);
        
    }
}
