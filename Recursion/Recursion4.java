package Java.ApnaCollege.Recursion;

//Factorial
public class Recursion4 {
    public static int printFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int factn1 = printFactorial(n - 1);
        int n2 = n * factn1;
        return n2;
    }

    public static void main(String[] args) {
        int n = 4;
        int ans = printFactorial(n);
        System.out.println(ans);
    }
}