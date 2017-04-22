
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String text = reader.next();
        int charNum = calculateCharacters(text);
        System.out.print("Number of characters: " + charNum);
        
        // call your method from here
    }
    
    // do here the method
    public static int calculateCharacters(String text){
        int charNum = text.length();
        return charNum; 
    }
}
