//program 1

import java.util.*;

class number {
    private int a;
    private int b;

    void input() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the first number");
            a = in.nextInt();
            System.out.println("Enter the second number");
            b = in.nextInt();
        }
    }

    void output() {
        int c;
        System.out.println("Before swap numbers are " + a + " and " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After swap the numbers are " + a + " and " + b);
    }
}

class swap {
    public static void main(String[] args) {
        number ob = new number();
        ob.input();
        ob.output();
    }
}
