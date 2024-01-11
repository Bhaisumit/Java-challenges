import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number which u want to calculate factorial");
        int number = sc.nextInt();
       int i=1;
       int factorial=1;
        while(i<=number){
factorial=factorial*i;
            i++;
        }
        System.out.println("factoriall of " + number + " is " + factorial);
    }
}
