
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("How old are you?");
        int ageOne = Integer.parseInt(reader.next());
        
        if (ageOne >= 18){
            System.out.print("You have reached the age of majority!");
        }else{
            System.out.print("You have not reached the age of majority yet!");
        }
    }
}
