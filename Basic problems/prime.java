import java.util.*;

class pm {
    private int n;

    void input() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the Range: ");
            n = in.nextInt();
        }
    }

    void output() {
        int i, j, flag;
        System.out.println("All the Prime numbers within 1 and " + n + " are:");
        for (i = 1; i <= n; i++) {
            if (i == 1 || i == 0)
                continue;
            flag = 1;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.print(i + " ");
        }
    }
}

class prime {
    public static void main(String[] args) {
        pm ob = new pm();
        ob.input();
        ob.output();
    }
}
