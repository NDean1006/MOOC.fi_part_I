import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        String i = text;
        if (i.equals(reverse(text))){
        return true;
        }
        else{
        return false;
        }
    }
    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        String charHolder = "";
        int i = text.length()-1;
        
        while (i >= 0){
           charHolder += Character.toString(text.charAt(i));
           i--;
        }
        return charHolder;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
