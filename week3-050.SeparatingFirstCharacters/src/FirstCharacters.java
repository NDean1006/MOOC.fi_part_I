import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String text = reader.nextLine();
        
        if(text.length()> 2){
            char firstChar = firstCharacter(text);
            System.out.println("1. character: " + firstChar);
            char secondChar = secondCharacter(text);
            System.out.println("2. character: " + secondChar);
            char thirdChar = thirdCharacter(text);
            System.out.println("3. character: " + thirdChar);
        } 
    }
    public static char firstCharacter(String text){
        char firstChar = text.charAt(0);
    return firstChar;
    }
    public static char secondCharacter(String text){
        char secondChar = text.charAt(1);
    return secondChar;
    }
    public static char thirdCharacter(String text){
        char thirdChar = text.charAt(2);
    return thirdChar;
    }
}
