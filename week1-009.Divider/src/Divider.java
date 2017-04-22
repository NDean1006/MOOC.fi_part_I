
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Please enter first number ");
        float fOne = Integer.parseInt(reader.nextLine());
        
        System.out.print("Please enter second number ");
        float fTwo = Integer.parseInt(reader.next());
        
        System.out.print("Division: " + fOne + " / " + fTwo + " = " + (fOne / fTwo));

        // Implement your program here. Remember to ask the input from user.
    }
}
