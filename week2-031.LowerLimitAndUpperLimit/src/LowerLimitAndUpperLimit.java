
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.print("First: ");
        int readOne = Integer.parseInt(reader.nextLine());
        
        System.out.print("Last: ");
        int readTwo = Integer.parseInt(reader.nextLine());
        
        int firstNum = readOne;
        int lastNum = readTwo;
        int count = firstNum;
        
        while (count <= lastNum){
            System.out.println(count);
            count = count + 1;
        }
                

    }
}
