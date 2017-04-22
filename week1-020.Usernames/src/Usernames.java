
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String nameVar = reader.nextLine();
        
        System.out.print("Type your password: ");
        String passwordVar = reader.nextLine();
        
        if (nameVar.equals("alex") && passwordVar.equals("mightyducks") || nameVar.equals("emily") && passwordVar.equals("cat") ){    
            System.out.print("You are now logged into the system!");
        }
        else{
            System.out.print("Your user name or password was invalid!");
        }
        

    }
}
       
        
