public class App {
    public static void main(String[] args) throws Exception {
        
        MathematicalOperations myNumber = new MathematicalOperations(5);

        System.out.println(myNumber.getNum());

        System.out.println(myNumber.getNum() + " Squared = " + myNumber.squareANumber());

        System.out.println(myNumber.subtractTwo());

        System.out.println(myNumber.multiplyNum(5));

        System.out.println(myNumber.subtractTwo());
    }
}