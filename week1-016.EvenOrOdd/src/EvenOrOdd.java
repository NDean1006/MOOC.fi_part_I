
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int numOne = Integer.parseInt(reader.next());
        
        if (numOne < 0 ){
            numOne = numOne * -1;
            }
   
        int oddCheck = numOne % 2;
             
        if (oddCheck > 0){
        System.out.print("Number " + numOne + " is odd.");
        }else {
        System.out.print("Number " + numOne + " is even.");
        }

        // NOTE:
        // Parity of a value can be easily checked with modulo-operator %.
        // Test the following:
        // System.out.println( 1%2 );
        // System.out.println( 2%2 );
        // System.out.println( 3%2 );
        // System.out.println( 4%2 );
        // System.out.println( 5%2 );
        // System.out.println( 6%2 );
        // System.out.println( 7%2 );
        // int value = 8
        // System.out.println( value%2 );

    }
}
