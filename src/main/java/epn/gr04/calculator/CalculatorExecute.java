package epn.gr04.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("== Calculator Execute ==");

        Calculator c = new Calculator();
        double add = c.add(5, 3);
        System.out.println("Suma: " + add);

        double subtract = c.subtract(5, 3);
        System.out.println("Resta: " + subtract);
    }
}
