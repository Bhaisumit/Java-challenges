import java.util.*;


public class triangleArea {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("write breadth of triangle");
        float breadth=input.nextFloat();
        System.out.println("enter height of triangle");
        float height =input.nextFloat();
        System.out.println("area of triangle is " + (breadth*height)/2);
    }
}
