
import java.util.*;

class in {
    public int sal;
    public double rate;

    void input() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter salary : ");
            sal = sc.nextInt();
        }
    }

    void incometax() {
        if (sal == 50000) {
            rate = 0;
        } else if (sal > 50000 && sal <= 60000) {
            rate = (sal - 50000) * 0.1;
        } else if (sal > 60000 && sal <= 150000) {
            rate = (sal - 50000) * 0.2;
        } else {
            rate = (sal - 50000) * 0.3;
        }
        System.out.println("The salary of employee is:" + sal);
        System.out.println("The income tax to be paid by employee is:" + rate);
    }
}

class Bank {
    public static void main(String[] args) {
        in obj = new in();
        obj.input();
        obj.incometax();
    }
}
