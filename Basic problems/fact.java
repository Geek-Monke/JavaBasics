import java.util.*;

class num {
    private int a;

    void input() {
        try(Scanner in = new Scanner(System.in);){
        System.out.println("Enter the number whose factorial to be found :- ");
        a = in.nextInt();
        }
    }

    void output() {
        int i, f = 1;
        for (i = 1; i <= a; i++) {
            f = f * i;
        }
        System.out.println("the factorial is :- " + f);
    }
}

class fact {
    public static void main(String[] args) {
        num ob = new num();
        ob.input();
        ob.output();
    }
}