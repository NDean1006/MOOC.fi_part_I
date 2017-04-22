
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        
        while (true){
            System.out.print("Type the password: ");
            String passwordVar = reader.nextLine();
            
            if (passwordVar.equals(password)){
            System.out.print("Right!"
                    + "\nThe secret is: jryy qbar!");
            break;
            }
            if (passwordVar != password){
            System.out.print("Wrong!\n");
            }
    
        }
    }
}
