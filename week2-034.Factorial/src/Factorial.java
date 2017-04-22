import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.next());
        
        int count = 1;
        int factorial = 1;
        
        while (count <= number){
            factorial *= count;
            count++;
        }
        System.out.println("Factorial is " + factorial);
                
                }
}
