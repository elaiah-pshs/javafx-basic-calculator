public class Model {
    public float calculate(long n1, long n2, String operator) {
        
        switch (operator) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                return n1 / n2;
            default:
                return 0;
        }
    }
}
