import java.util.*;

class triangle {
    private int a;

    void input() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("enter a number :-");
            a = in.nextInt();
        }
    }

    void output() {
        int i, j;
        for (i = 0; i < a; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

class pattern {
    public static void main(String[] args) {
        triangle ob = new triangle();
        ob.input();
        ob.output();
    }
}