import java.util.*;

public class agecalculator{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ente uour age");
        int age=input.nextInt();

        System.out.println("now make a age calculator");
        if(age<13){
            System.out.println(
                "ohh, u ra a child "
            );

        
        }
        else if(age<20){
            System.out.println("u r a teen ");

        }
        else if(age<60){
            System.out.println("sorry , u r an adult");



        }
        else{
            System.out.println("u r an senior");
        }

    }
}