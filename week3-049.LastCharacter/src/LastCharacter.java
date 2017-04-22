
import java.util.Scanner;

public class LastCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String text = reader.nextLine();
        char lastChar = lastCharacter(text);
        System.out.print("Last character: " + lastChar);

    }

    public static char lastCharacter(String text) {
        char lastChar = text.charAt(text.length() - 1);

        return lastChar;
    }
}
