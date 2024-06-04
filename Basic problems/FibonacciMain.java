import java.util.Scanner;

class FibonacciGenerator {
    private int n, a = 0, b = 1, c, i;

    void input() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the value of n:");
            n = in.nextInt();
        }
    }

    void generateFibonacci() {
        System.out.println(a);
        System.out.println(b);
        for (i = 2; i < n; i++) {
            c = a + b;
                if(c<n){
                    System.out.println(c);
                    a = b;
                    b = c;
            }
        }
    }
}

public class FibonacciMain {
    public static void main(String[] args) {
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();
        fibonacciGenerator.input();
        fibonacciGenerator.generateFibonacci();
    }
}
