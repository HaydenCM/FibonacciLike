public class Main {

    public static void main(String[] args){
        FibonacciNumbers fibonacciNumbers1 = new FibonacciNumbers(0, 1, 10);
        fibonacciNumbers1.run();

        FibonacciNumbers fibonacciNumbers2 = new FibonacciNumbers(5, 15, 4);
        fibonacciNumbers2.run();

        FibonacciNumbers fibonacciNumbers3 = new FibonacciNumbers(2, -4, 6);
        fibonacciNumbers3.run();

    }
}
