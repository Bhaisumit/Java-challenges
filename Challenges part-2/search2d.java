import java.util.Scanner;

public class search2d {
    private static boolean found;
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to 2D search");
        int[][] numArr=ArrayUtility.input2DArray();
        System.out.println("Now enter the number u want to serch in 2D array");
        int num=input.nextInt();
       boolean found = search(numArr,num);
        if(found){
            System.out.println("yes, element is present in 2D array");
        }
        else{
            System.out.println("Sorry, element is not present in 2D array");
        }

    }
    public static boolean search(int[][]numArr, int num){
int i=0;
while(i<numArr.length){
    int j=0;
    while(j<numArr[i].length){
        if(numArr[i][j]==num){
            return true;
        }
        j++;
    }
    i++;
}
        return false;
    }
}
