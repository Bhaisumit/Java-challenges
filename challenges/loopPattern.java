import java.util.Scanner;

public class loopPattern {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("print pattern using while loop");
        System.out.println("Enter number of rows u want to print");
        int rows=input.nextInt();
        printFirstPattern(rows);
        printSecondPattern(rows);
        printThirdPattern(rows);

    }
    public static void printFirstPattern(int maxRows){

int rows=0;
while (rows<maxRows) {
    // System.out.print("*");
    int i=0;
    while(i<=rows){
        System.out.print(" *");
        i++;
    }
    System.out.println();
    rows++;
}
    }
      public static void printSecondPattern(int maxRows){
int rows=maxRows;
while(rows>0){

int i=0;
while(i<rows){
    System.out.print("* ");
    i++;
}

System.out.println();
rows--;
}

    }
      public static void printThirdPattern(int maxRows){
   int rows=maxRows;
   while(rows>0){

int j=0;
while(j<rows){
    System.out.print("  ");
    j++;
}
int i=0;
while(i<=maxRows-rows){
System.out.print("* ");
i++;
}



System.out.println();
    rows--;
   }



    }

}
