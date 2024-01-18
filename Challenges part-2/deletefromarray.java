import java.util.Scanner;

class deletefromarray {
    public static void main(String[] args) {
        System.out.println("Welcome to array deletion");
        Scanner input=new Scanner(System.in);
        int []numArray=ArrayUtility.inputArray();
        System.out.println("enter elemnet u want to delete from array");
        int delteelement=input.nextInt();
       int [] newArr= deletefrmarray(numArray,delteelement);
       System.out.println("here is our new array");
       ArrayUtility.displayArray(newArr);
      
    }
    public static int[] deletefrmarray (int[]numArray,int delteelement){
      int occurences=   occurence(numArray,delteelement)  ;
      if(occurences==0)
      return numArray;
      int newsize=numArray.length-occurences;    
int[] newArr=new int[newsize];
int i=0,j=0;
while(i<numArray.length){
    if(numArray[i]!=delteelement){
        newArr[j]=numArray[i];
        j++;
    }
    i++;
}




return newArr;
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
