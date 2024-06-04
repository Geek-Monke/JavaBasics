import java.util.*;

class prime3 {
    private int n;

    void input() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            n = sc.nextInt();
        }
    }

    void calc() {
        int i, j, flag;
        System.out.println("All the prime numbers within 1 and "+n+"are : ");
        for (i = 1; i <= n; i++) {
            if (i == 0 || i == 1)
                continue;
            flag = 1;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1){
                System.out.print(i + " ");
            }
        }
    }
}

class primep2 {
    public static void main(String[] args) {
        prime3 obj = new prime3();
        obj.input();
        obj.calc();
    }
}