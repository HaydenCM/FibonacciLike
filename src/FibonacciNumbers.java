public class FibonacciNumbers implements Fibonacci, Runnable {

    // Fields
    int amountofNumbersInSequence;
    int number1;
    int number2;
    int tempNumber;
    String sequence = "";

    // Constructor
    FibonacciNumbers(int number1, int number2, int amountofNumbersInSequence) {
        this.number1 = number1;
        this.number2 = number2;
        this.amountofNumbersInSequence = amountofNumbersInSequence;
    }

    // Methods
    public void run() {
        for(int i = 0; i < amountofNumbersInSequence; i++) {
            tempNumber = number2;
            number2 = number1 + number2;
            number1 = tempNumber;
            sequence = sequence + " " + tempNumber;
        }
        System.out.println(sequence);
    }
}
