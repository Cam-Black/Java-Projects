import com.qa.results.CalculateResults;

public class DisplayResults {
    public static void main(String[] args) throws Exception {
        CalculateResults jeremy = new CalculateResults("Jeremy", 100, 120, 132);
        System.out.println(jeremy.displayResults());
        CalculateResults steve = new CalculateResults("Steve", 99, 84, 135);
        System.out.println(steve.displayResults());
    }
}