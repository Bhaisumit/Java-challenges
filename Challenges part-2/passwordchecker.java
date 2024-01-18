import java.util.Scanner;

class passwordchecker {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to password checker");
       String password;
        do{
            System.out.println("Enter the password");
             password=input.next();
        }
        while(!passwordcheck(password));
        System.out.println("thanks for entering a valid password");
        // boolean pswrdchecker=passwordcheck(password);
        // if(pswrdchecker){
        //     System.out.println("your passwrod is corrct");

        // }
        // else{
        //     System.out.println("your passwrd may not be valid");
        // }

    }
    static boolean passwordcheck(String password){
        if(password.length()<9){
            return true;
        }
        return false;
    }
}
