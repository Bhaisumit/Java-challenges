import java.util.Scanner;

public class concatenate {
    public static void main(String[] args) {
        String firstName="sumit";
        String lastName="chandola";
        // String fullName=firstName+ " "+ lastName;
        String fullName=firstName.concat(" ").concat(lastName);
        System.out.println(fullName.toUpperCase());

    }
}
