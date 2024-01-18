import java.util.Scanner;

class checkoddeven  {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("program of even or odd by ternary operator");
        int number=input.nextInt();
        boolean isEven=isEven(number);
        if(isEven){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is oodd");
        }
    }
    public static boolean isEven(int number){
        boolean answer;
        return answer=number%2==0?true:false;
    }
}
