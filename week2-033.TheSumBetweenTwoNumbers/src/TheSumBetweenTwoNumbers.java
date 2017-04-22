
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("First: ");
        int firstNum = Integer.parseInt(reader.nextLine());
        
        System.out.print("Last: ");
        int lastNum = Integer.parseInt(reader.nextLine());
        
        int count = firstNum;
        int sum = firstNum;
        
        while (count < lastNum){
        count++;
        sum = sum + count;
        }
        System.out.print("The sum is " + sum);
        
        
    }
}
