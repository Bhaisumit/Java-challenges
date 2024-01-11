import java.util.*;
public class simpleInterest {
   public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("enter principle");
    int p=input.nextInt();
    System.out.println("enter rate of interest");
        int r=input.nextInt();

System.out.println("enter time");    
    int t=input.nextInt();
double answer=(p*r*t)/100;
System.out.println(answer);


   } 
}
