
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a year: ");
        int yearVar = Integer.parseInt(reader.next());
        
        int leapCheckOne = yearVar % 4; 
        int leapCheckTwo = yearVar % 100;
        int leapCheckThree = yearVar % 400;
        
        if (leapCheckOne == 0){
            if (leapCheckTwo == 0 && leapCheckThree == 0 ){
                System.out.print("The year is a leap year.");
            }
            if (leapCheckTwo != 0 && leapCheckThree != 0 ){
                System.out.print("The year is a leap year.");
            }
            if (leapCheckTwo == 0 && leapCheckThree != 0 ){
                System.out.print("The year is not a leap year.");
            }
        
        }else {
            System.out.print("The year is not a leap year.");
    
    }

    }
}
