import java.util.Scanner;

public class guessinggame {
    int random;
    guessinggame(){
random=(int)Math.ceil(Math.random()*100);
    }
    int guess(int guessno){
    return guessno-random;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        guessinggame game=new guessinggame();
        System.out.println("welcome to guesssing game .gues number between 1 to 100");
        int guess;
        int result;
        do{
            System.out.println("guess number");
            guess=input.nextInt();
            result=game.guess(guess);
            if(result==0){
                System.out.println("yes u did it");
                return;
            }
            else if(result<0){
                System.out.println("please guess higher");
            }
            else{
                System.out.println("please guess lower");
            }
        }
        while(result!=guess);

    }
}
