import java.util.Scanner;

public class merge2array {
    public static void main(String[] args) {
        System.out.println("welcome to merging sorted arrays\n");
        Scanner input=new Scanner(System.in);
        int [] arr1=ArrayUtility.inputArray();
        int [] arr2=ArrayUtility.inputArray();
int[] newarray=new int[arr1.length + arr2.length];
        int i=0;
        int k=0;
        int j=0;
        while(i<arr1.length || j<arr2.length){


        
if(j==arr2.length || (i<arr1.length && arr1[i]<arr2[j])){
newarray[k]=arr1[i];
i++;
k++;
}
else{
    newarray[k]=arr2[j];
    j++;
    k++;
}
            }
 
            ArrayUtility.displayArray(newarray);
        }

}
