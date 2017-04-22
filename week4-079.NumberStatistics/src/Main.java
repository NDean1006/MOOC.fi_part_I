import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        
        NumberStatistics sumAll = new NumberStatistics();       
        NumberStatistics evenAll = new NumberStatistics();
        NumberStatistics oddAll = new NumberStatistics();
        System.out.println("Type numbers: ");
        while (true) {
            int answer = Integer.parseInt(reader.nextLine());                    
            if (answer == -1) {                
                break;
            }
            sumAll.addNumber(answer);
            if (answer % 2 == 0) {
                evenAll.addNumber(answer);
            } else {
                oddAll.addNumber(answer);
            }
        }
        System.out.println("Sum: " + sumAll.sum());
        System.out.println("Sum of even: " + evenAll.sum());
        System.out.println("Sum of odd: " + oddAll.sum());
        
        
    }
}