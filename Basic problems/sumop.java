import java.util.*;

class sumop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the number :-");
        n = in.nextInt();
        int sumOfSquares = 0;
        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;
        }

        int sum = (n * (n + 1)) / 2;
        int squareOfSum = sum * sum;

        int difference = sumOfSquares - squareOfSum;
        System.out.println("The difference is :- " + difference);
    }
}
