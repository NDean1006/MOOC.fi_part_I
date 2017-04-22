
import java.util.Scanner;


public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");
        float radius = Integer.parseInt(reader.next());
        
        System.out.print("Circumfrence of the circle: " + (2 * Math.PI * radius));
        
    }
}

