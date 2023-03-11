package Unit02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {
    static Integer mynumber = ThreadLocalRandom.current().nextInt(0, 100 + 1);
    static Integer tries = 0;
    /*
       magic number = ?
     "  Please type in your name: "name"  "
       optional = easy: 1-5, medium: 1-8, hard: 1-12, extra hard: 1-20
     "  Please type your number  "
       Number should be valid, else quite the game
     "  Answer: your number is too low or to high  "
     "  OR  Congrats "name", you quessed the right number  "
       optional: 2 chances (without loop)
       optional: 5 chances (with loop)
       optional: you almost got it (you missed the number by 1 or 2)
        */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type in your name: ");
        String name=scanner.nextLine();

        System.out.println("Please choose mode and type it in: easy, medium, hard, heavy");
        String mode=scanner.nextLine();

        if (mode.matches("easy")){
            System.out.println("Please type in your number between 1-5:");}
        else if (mode.matches("medium")) {
            System.out.println("Please type in your number between 1-8:");}
        else if (mode.matches("hard")){
            System.out.println("Please type in your number between 1-12:");}
        else if (mode.matches("heavy")) {
            System.out.println("Please type in your number between 1-20:");}
        else System.out.println("Falsche eingabe");
        int number = scanner.nextInt();

            if (mode.matches("easy") && (number >= 1 && number <=5)) {
                System.out.println("Your number is valid");}
            else if (mode.matches("medium") && (number >= 1 && number <=8)) {
                System.out.println("Your number is valid");}
            else if (mode.matches("hard") && (number >= 1 && number <=12)) {
                System.out.println("Your number is valid");}
            else if (mode.matches("heavy") && (number >= 1 && number <=20)) {
                System.out.println("Your number is valid");}
            else System.out.println("Your number is not valid, closing the game...");









    }
}
