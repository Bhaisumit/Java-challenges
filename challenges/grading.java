import java.util.Scanner;
public class grading {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to grading system ");
        System.out.println("Please enter your percentage");
        float percentage=input.nextFloat();
        if(percentage>=90){
            System.out.println("You have got A grade");
        }
        else if(percentage>=80){
            System.out.println("you have got B grade");
            
        }
        else{
            System.out.println("UOU have got C grade");
        }
    }
}
