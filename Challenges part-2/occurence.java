import java.util.Scanner;

public class occurence {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("welcome to occurence of each element program");
        int arr[]=ArrayUtility.inputArray();
        System.out.println("enter element which u want to check occurence: ");
        int num=input.nextInt();
        int findoccurence=findoccur(arr,num);
        System.out.println("the count of number is "+ findoccurence + " times");

    }
    public static int findoccur(int []arr,int num){
        int count=0;
        for(int a:arr){
            if(a==num){
                count++;
            }
        }
        return count;
    }
}
