import java.util.Scanner;

public class sumdiagonalelement {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int[][]numArr=ArrayUtility.input2DArray();
        System.out.println("calculate sum of diagonal elements");
long sumDiagonal=sumofdiagnl(numArr);
System.out.println("sum of diagonal elements of array is "+ sumDiagonal);

    }
    public static long sumofdiagnl(int[][]numArr){
        long leftSum=sumofleftdiagnl(numArr);
        long rightSum=sumofrightdiagnl(numArr);
        long sum=leftSum+rightSum;
if(numArr.length%2 !=0 ){
    int ind=numArr.length/2;
    sum-=numArr[ind][ind];
}
        return sum;
    }
    public static long sumofleftdiagnl(int[][]numArr){
        long sum=0;
        int i=0;
        while(i<numArr.length){
          sum+=numArr[i][i];
            i++;
        }
        return sum;
    }
    public static long sumofrightdiagnl(int[][]numArr){
        long sum=0;
        int i=0;
        while(i<numArr.length){
            int col=numArr.length-1-i;
            sum+=numArr[i][col];
            i++;
        }
        return sum;
    }
   
}
