/*

A number-guessing game.

*/
import java.util.Scanner;
import java.util.Random;




public class Game {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    System.out.println("Greetings!");
    System.out.println("What's your name?");
    String player = input.nextLine();
    System.out.println("Hello there, " + player);
    int number = rand.nextInt(100);
    boolean guessNumber = true;
    while (guessNumber) {
      System.out.println("Guess the number between 1 and 100 ");
      int number1 = input.nextInt();
      // guessNumber = false;
      if (number == number1) {
        System.out.println("Good job! you guess the number ");
        guessNumber = false;
      }
      if (number < number1) {
        System.out.println("Your guess is too high!, keep guessing ");
    }
      else {
        System.out.println("Your guess is too low, keep guessing ");
    }
    }
  }
}