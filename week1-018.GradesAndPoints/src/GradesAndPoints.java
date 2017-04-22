
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type points [0-60]: ");
        int numOne = Integer.parseInt(reader.next());
        
        if (numOne >= 50){
            System.out.print("Grade: " + 5);
            
        }
        if (numOne >= 45 && numOne < 50){
            System.out.print("Grade: " + 4);
        }
        if (numOne >= 40 && numOne < 45){
            System.out.print("Grade: " + 3);
        }
        if (numOne >= 35 && numOne < 40){
            System.out.print("Grade: " + 2);
        }
        if (numOne >= 30 && numOne < 35){
            System.out.print("Grade: " + 1);
        }
        if (numOne >= 0 && numOne < 30){
       
            System.out.print("Grade: failed");
        }
            
        
        
    }
}
    
