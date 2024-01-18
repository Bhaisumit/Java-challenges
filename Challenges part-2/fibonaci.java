import java.util.Scanner;

public class fibonaci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to fibonacci series program");
        System.out.println("enter number upto which u want to print series");
        int number=input.nextInt();
        for(int i=0;i<number;i++){
            System.out.println(fibonacci(i)+ " ");

        }
        
    }
    public static int fibonacci(int position){
        if(position==0)
        return 0;
        if(position==1)
        return 1;
     else{
        return fibonacci(position-1)+fibonacci(position -2);
     }
    }
}
