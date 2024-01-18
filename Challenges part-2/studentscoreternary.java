import java.util.Scanner;

/**
 * studentscoreternary
 */
public class studentscoreternary {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to program of calculation of student score by ternary method");
        System.out.println("please enter your marks");
        int marks=input.nextInt();
        String result=findscore(marks);
        System.out.println("the student score is "+ result);
    }
    public static String findscore(int marks){
        return marks>80?"HIGH":(marks>50?"Moderate":"Low");
    }
}