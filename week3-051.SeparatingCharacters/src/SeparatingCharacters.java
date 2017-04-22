
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String text = reader.nextLine();
        
        int count = 0;
        int i = 0;
        
        
        while (count < text.length()){
            char getChar = text.charAt(i);
            i++;
            count++;
            System.out.println(i + ". character: " + getChar);
        }
    }
}
