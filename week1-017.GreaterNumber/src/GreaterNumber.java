import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the first number: ");
        int numOne = Integer.parseInt(reader.next());
        
        System.out.print("Type the second number: ");
        int numTwo = Integer.parseInt(reader.next());
        
        if (numOne > numTwo){
        System.out.print("Greater number:" + numOne);
        }
        if (numOne < numTwo){
        System.out.print("Greater number:" + numTwo);
        }else{
        System.out.print("The numbers are equal!");
        }

    }
}
