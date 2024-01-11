import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        
Scanner sc=new Scanner(System.in);
System.out.println("lets take first input");
int firstinput=sc.nextInt();
System.out.println("lets take second input");
int secondinput=sc.nextInt();
System.out.println("now perform arithmetic operation on these numbers");
System.out.println(" a + b = "+(firstinput+secondinput));
System.out.println(" a + b = "+(firstinput-secondinput));
System.out.println(" a + b = "+(firstinput*secondinput));
System.out.println(" a + b = "+(firstinput/secondinput));
System.out.println(" a + b = "+(firstinput%secondinput));
    }
}
