
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        int guess = -1;
        int count = 0;
        
        while (guess != numberDrawn){
            System.out.print("Guess a number: ");
            int num = Integer.parseInt(reader.nextLine());
            
            if (num != numberDrawn && num < numberDrawn){
                count++;
                guess = num;
                System.out.println("The number is greater, guesses made: " + count);
            }
            if (num != numberDrawn && num > numberDrawn){
                count++;
                guess = num;
                System.out.println("The number is lesser, guesses made: " + count);
            }
            else{
            count++;
            guess = num;
            System.out.print("Congratulations, your guess is correct!");
            break;
            
            }
        
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
