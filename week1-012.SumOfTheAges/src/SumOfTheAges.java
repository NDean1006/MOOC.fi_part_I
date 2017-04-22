
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String nameOne = reader.next();
        
        System.out.print("Type your age: ");
        int ageOne = Integer.parseInt(reader.next());
        
        System.out.print("Type your name: ");
        String nameTwo = reader.next();
        System.out.print("Type your age: ");
        int ageTwo = Integer.parseInt(reader.next());
        
        System.out.print(nameOne + " and "+ nameTwo + " are " + (ageOne + ageTwo)+ " years old in total.");
       
    }
}
