
import java.util.*;

public class oddEvenbitwise {
    public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
    System.out.println("given number is");
    int number=input.nextInt();
    if((number&1)==1){
        System.out.println("given no. is odd");
    }
    else{
        System.out.println("given number is even");
    }
    }
  
}
