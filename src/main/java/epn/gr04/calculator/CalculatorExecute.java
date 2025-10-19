package epn.gr04.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("== Calculator Execute ==");

        Calculator c = new Calculator();
        double add = c.add(5, 3);
        System.out.println("Suma: " + add);

        double subtract = c.subtract(5, 3);
        System.out.println("Resta: " + subtract);

        double multiply = c.multiply(4, 2);
        System.out.println("Multiplicación: " + multiply);

        double divide = c.divide(10, 2);
        System.out.println("Division: " + divide);

        System.out.println("Code is like humor. When you have to explain it, it’s bad.");
        System.out.println("== It is a Change !! ==");
    }
}
