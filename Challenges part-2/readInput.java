import java.util.Scanner;

public class readInput {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("welcome to program of read input until user press exit");
    while(true)
    {
        System.out.println("so, please enter the string ");

        String val=input.next();
        if(val.equalsIgnoreCase("exit"))
        {
            break;

        }
     }
     System.out.println("ohh, i guess u have take wrong input");
    }
      
}
