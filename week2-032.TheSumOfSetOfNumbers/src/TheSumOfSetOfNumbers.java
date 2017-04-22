
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Until what? ");
        int read = Integer.parseInt(reader.nextLine());
        
        int sum = 1;
        int count = 1;
        
        while (count < read){
        count += 1;
        sum = sum+count;
        } 
        System.out.print("Sum is " + sum);
        

    }
}
