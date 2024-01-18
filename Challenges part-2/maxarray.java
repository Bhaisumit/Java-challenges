import java.util.Scanner;

class maxarray {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("welcome to finding the maximum element");
    int [] arr=ArrayUtility.inputArray();
int max=Integer.MIN_VALUE;
    for (int num:arr){
if(num>max){
    max=num;
}
    }
    System.out.println("maximum number is "+ max);
  }
}
