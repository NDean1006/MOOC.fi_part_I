
import nhlstats.NHLStatistics;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        //sorts top ten by points
        //System.out.print("Sort by points");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        //sorts top 25 by penalties
        //System.out.print("Sort by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        //stats for Crosby 
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        //Sats for Flyers
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        
        //players for Ducks
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
        
        
        
    }
}
