/*

A number-guessing game.

*/
import java.util.Scanner;



public class Game {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Greetings!");
    System.out.println("What's your name?");
    String player = input.nextLine();
    System.out.println("Hello there, " + player);
  }

}
