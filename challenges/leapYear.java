import java.util.*;


public class leapYear {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year which u want to check");
        int year=sc.nextInt();
        System.out.println("now , lets check it is leap year or not!!");
        // if(year%4==0 && (year%400==0 || year%100!=0))
        //                        OR
        if(year%400==0 || (year%4==0 && year%100!=0))
        {
            System.out.println("yes, this given year " + year + " is an leap year");
        }
        else{
            System.out.println("not an leap year");
        }
    }
}
