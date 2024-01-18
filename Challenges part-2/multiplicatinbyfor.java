import java.util.Scanner;

public class multiplicatinbyfor {
    public static void main(String[] args) {
        System.out.println("Welcome to multiplication table using for loop");

        Scanner input=new Scanner(System.in);
        System.out.println("please enter the number which u calculate the table");
        int no=input.nextInt();
       


        for(int i=1;i<=10;i++){

System.out.println("multiplication is  "+ no + "* " + i + "= " +no*i);
        }

    }
}
