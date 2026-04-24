public class App {
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
    public int div(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }
    public static void main(String[] args) {
        App c = new App();
        System.out.println("Addition" + c.add(150, 5));
        System.out.println("Subtraction" + c.sub(10, 5));
        System.out.println("Multiplication" + c.mul(10, 5));
        System.out.println("Division" + c.div(10, 5));
    }
}
