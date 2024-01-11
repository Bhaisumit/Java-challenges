import java.util.*;
public class rectangleArea {
 public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("enter length of rectangle");
    int length=input.nextInt();
    System.out.println("enter breadth of rectangle");
    int breadth=input.nextInt();
    int perimeter=2*(length+breadth);
    System.out.println("perimeter of rectangle is " + perimeter);
 }   
}
