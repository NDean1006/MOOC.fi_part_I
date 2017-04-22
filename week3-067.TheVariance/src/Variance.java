import java.util.ArrayList;

public class Variance {
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

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double avg = average(list);
        double var = 0;
        for (int i : list) {
            var += (double) Math.pow((i) - avg, 2);
        }
        var /= (list.size() - 1);
        return var;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
