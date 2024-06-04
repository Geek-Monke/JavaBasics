import java.util.*;

class fibo {
    private int i, n, a = 0, b = 1, c;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        n = sc.nextInt();
    }

    void fibogene() {
        System.out.println(a);
        System.out.println(b);
        for (i = 2; i < n; i++) {
            c = a + b;
            if (c < n) {
                System.out.println(c);
                a = b;
                b = c;
            }
        }
    }
}

class Innerfibo {
    public static void main(String[] args) {
        fibo obj = new fibo();
        obj.input();
        obj.fibogene();
    }
}
