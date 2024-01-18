import java.util.Scanner;

class sumofpositive {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to sum of positive number program using continue keyword");
        int arr[]=ArrayUtility.inputArray();

     
        int sum=0;
        for(int i=0;i<arr.length;i++){
           
            if(arr[i]<0){
                continue;
            }
            sum+=arr[i];
        }
        System.out.println("the sum of elements is " + sum);
    }
}
