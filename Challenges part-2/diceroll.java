public class diceroll {
int roll(){
        double random=Math.ceil(Math.random()*6);
        return (int)random;
    }
    public static void main(String[] args) {
        System.out.println("welcome to world of dice game");
        diceroll a=new diceroll();
      System.out.println(a.roll());  

    }
}
