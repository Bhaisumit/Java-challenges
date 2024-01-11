import java.util.*;

public class fahrenhiet {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter fahrenhiet value");
        float F=input.nextFloat();
        float C=(F-32)*5/9;
        System.out.println("Celsius value is " + C);
    }
}
