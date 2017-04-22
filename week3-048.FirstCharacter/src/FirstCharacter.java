import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String text = reader.next();
        char firstChar = firstCharacter(text);
        System.out.print("First character: " + firstChar);
        
    }
    
    
    
    public static char firstCharacter(String text){
        char firstChar = text.charAt(0);
        
        
    
    return firstChar;
    }
}
