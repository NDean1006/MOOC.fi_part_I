
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("How old are you? ");
        int numOne =Integer.parseInt(reader.next());
        
        if (numOne >= 0 && numOne < 121){
        System.out.print("OK");
        }else{
        System.out.print("Impossible!");
        }
     

    }
}
