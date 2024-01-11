import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("Welcome to fabonacci series");
       System.out.println("please enter number upto which u want to print the series"); 
       int first=input.nextInt();
  
       System.out.println("here is the fibonacci series ");
       fibonacci(first);
    }
    public static void fibonacci(int num){
        if(num<0){
            return;
        }
                    System.out.print("0 ");

        if(num==0){
            return;
        }

int first=0,second=1;
while(first+second<=num){
    int third=first+second;
    System.out.println(third + " ");
    first=second;
    second=third;

}


    }
}
