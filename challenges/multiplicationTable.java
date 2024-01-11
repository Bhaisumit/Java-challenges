import java.util.*;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number which u want to peform multiplicatin table");
        int number=input.nextInt();
        System.out.println("now this time , we will use of while loop to perform multiplication table of given number");
        int i=1;
        while(i<=10){
            System.out.println(number + " * " + i + " =" + (number*i));
            i++;
        }
    }
}
