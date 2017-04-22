
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.print("Up to what number? ");
        int read = Integer.parseInt(reader.next());
        int num = 1;
        
        while (num <= read){
            System.out.println(num);
            num = num +1;
        
        
        
        }
        
        
    }
}
