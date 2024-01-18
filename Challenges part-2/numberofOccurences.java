import java.util.Scanner;

 class numberofOccurences {
    public static void main(String[] args) {
        System.out.println("program to print number of occurences of given element");
        Scanner input=new Scanner(System.in);
        int[]numArray = ArrayUtility.inputArray();
        System.out.println("enter element u want to find occurence");
                int findoccurence=input.nextInt();

        int noofOccurence=occurence(numArray,findoccurence);
        System.out.println("number of occurence is " + noofOccurence);

    }
    public static int occurence(int [] numArray,int findoccurence){
         int count=0;
        for(int i=0;i<numArray.length;i++){
           
            if(findoccurence==numArray[i]){
             count++;
            }
        }
return count;
    }
}
