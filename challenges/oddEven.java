import java.util.Scanner;

public class oddEven {
        public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=input.nextInt();
        String cal=(number%2==0)?"it is even number":"it is odd number";
        System.out.println(cal);
        // if(number%2==0){
        //     System.out.println("it is an even number");

        // }
        // else{
        //     System.out.println("it is an odd number");
        // }
        }
}
