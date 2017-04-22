
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        int i = 0;
        for(int num : list ){
        i+=num;
        }
        return i;
    }
    

    public static double average(ArrayList<Integer> list) {
        double ave = (double)sum(list)/list.size();
        return ave;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}