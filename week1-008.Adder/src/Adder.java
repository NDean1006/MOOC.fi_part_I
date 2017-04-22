
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Please enter first number ");
        int fOne = Integer.parseInt(reader.nextLine());
        
        System.out.print("Please enter second number ");
        int fTwo = Integer.parseInt(reader.next());
        
        System.out.print("Sum of numbers: " + (fOne + fTwo));
    }
}
