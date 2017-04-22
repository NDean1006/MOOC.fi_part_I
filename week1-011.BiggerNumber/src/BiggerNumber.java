
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int numOne = Integer.parseInt(reader.next());
        
        System.out.print("Type another number: ");
        int numTwo = Integer.parseInt(reader.next());
        
        int answer = 0;
        if (numOne >= numTwo){
            answer = numOne;
        }else {
        answer = numTwo;
        }            
       
        
        System.out.print("the bigger of the tewo numbers given was: " + answer);
    }
}
