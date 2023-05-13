package Java.ApnaCollege.Recursion;
//Fibonacci series with i
public class Recursion6 {
    public static void printFibo(int a, int b, int i, int n) {
        if(i==n){
            return;
        }
        int c = a + b;
        System.out.print(c+" ");
        printFibo(b, c, i+1, n);
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        int n = 10;
        printFibo(a, b, 0, n-2);
    }
}