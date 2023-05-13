package Java.ApnaCollege.Recursion;

//Calculate Power
public class Recursion7 {
    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xPown1 = calcPower(x, n - 1);
        int xPown = x * xPown1;
        return xPown;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}