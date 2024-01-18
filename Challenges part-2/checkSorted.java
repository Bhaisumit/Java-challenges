import java.util.Scanner;

public class checkSorted {
   public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("check array is sorted or not");

    int []numArray=ArrayUtility.inputArray();
    boolean isincreasing=isincrease(numArray);
boolean isdecreasing =isdecrease(numArray);
if(isincreasing || isdecreasing){
    System.out.println("elements are in sorted order");
}
else{
    System.out.println("elements are not in sorted order");
}


   } 
   public static boolean isincrease(int []numArray){
    int i=1;
    while(i<numArray.length){
        if(numArray[i]<numArray[i-1]){
return false;
        }
        i++;
    }
    return true;
   }
   public static boolean isdecrease(int [] numArray){
    int i=1;
    while(i<numArray.length){
       if(numArray[i]>numArray[i-1]){
return false;
        }
        i++;
    }

    return true;
   }
}
