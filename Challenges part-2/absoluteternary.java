import java.util.Scanner;

class absoluteternary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("find absolute value ");
        System.out.println("please enter your number");
        int number=input.nextInt();
        int result=number<=0?-number:number;
        System.out.println("Absolute value is "+ result);
    }
}
