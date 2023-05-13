package Java.ApnaCollege.Recursion;
//Fibonacci Series

public class Recursion5 {
    public static void printFibo(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        printFibo(b, c, n - 1);
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        int n = 10;
        printFibo(0, 1, n - 2);
    }

}