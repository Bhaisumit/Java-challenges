import java.util.*;
public class compoundInterest {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("enter principle");
    int p=input.nextInt();
    System.out.println("enter rate of interest");
        int r=input.nextInt();

System.out.println("enter time");    
    int t=input.nextInt();
double Ci=p*Math.pow((1+r/100),t);
 System.out.println("the compound Interest is " + Ci);
  }  
}
