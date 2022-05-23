import com.qa.results.CalculateResults;

public class DisplayResults {
    public static void main(String[] args) throws Exception {
        CalculateResults jeremy = new CalculateResults("Jeremy", 99, 120, 148);
        System.out.println(jeremy.displayResults());
        
        CalculateResults steve = new CalculateResults("Steve", 100, 100, 50);
        System.out.println(steve.displayResults());
    }
}