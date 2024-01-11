
import java.util.Scanner;


public class greatestOfthree {
    public static void main(String[] args) {
        
Scanner input =new Scanner(System.in);
System.out.println("enter first number");
int first=input.nextInt();
System.out.println("enter second number");
int second =input.nextInt();
System.out.println("enter third number");
int third=input.nextInt();
System.out.println("now , we have to find greatest of three number");
if(first>second && first>third){
    System.out.println("greater number is " + first);
}
else if(second >third){
    System.out.println("greater number is "+ second);

}
else{
    System.out.println("greater number is " + third);
}

    }
}
