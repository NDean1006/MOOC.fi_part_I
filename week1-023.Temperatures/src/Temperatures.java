
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        while (true){
        System.out.print("Type tempurature data: ");
        double number = Double.parseDouble(reader.nextLine());
        
        if (number > -31 && number < 41) {
            Graph.addNumber(number);
        }
        
        }
        // Write your code here. 

        // Graph is used as follows:
        //Graph.addNumber(7);
        // value = 13.5;
        //Graph.addNumber(value);
        //value = 3;
        //Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}