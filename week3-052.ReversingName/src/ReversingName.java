import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String text = reader.nextLine();
        System.out.print("In reverse order: ");
        int count = 0;
        int i = text.length()-1;
       
        while (0 <= i){
            char getChar = text.charAt(i);
            i--;
            count++;
            System.out.print(getChar);
            
        }
    }
}
