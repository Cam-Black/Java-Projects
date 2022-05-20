public class MathematicalOperations {
    
    private int num;
    
    public MathematicalOperations(int myNum) {
        this.num = myNum;
    }

    public int getNum() {
        return num;
    }

    public int squareANumber() {
        return num * num;
    }

    public int multiplyNum(int multiplier) {
        return num * multiplier;
    }

    public int subtractTwo() {
        return num - 2;
    }
}