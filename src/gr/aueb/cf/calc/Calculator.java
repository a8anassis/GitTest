package gr.aueb.cf.calc;

public class Calculator {

    public static void main(String[] args) {

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int div(int a, int b) {
        if (b == 0) System.out.println("Error");
        return a / b;
    }


    public static int mul(int a, int b) {
        return a * b;
    }
}
