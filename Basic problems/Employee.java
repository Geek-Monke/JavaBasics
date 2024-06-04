import java.util.*;

class salary {
    private double sal;
    private double nsal;
    private double tax;
    private String grade;

    void input() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the salary :- ");
            sal = in.nextDouble();
            System.out.println("Enter the tax :- ");
            tax = in.nextDouble();
            System.out.println("Enter the grade :- ");
            grade = in.nextLine();
        }
    }

    void output() {
        double t = (sal * tax) / 100;
        nsal = sal - t;
        System.out.println("The the net salary of the employee after the deduction of the tax is :- " + nsal);
        System.out.println("The grade of the employee is :- " + grade);
    }
}

class Employee {
    public static void main(String[] args) {
        salary ob = new salary();
        ob.input();
        ob.output();
    }
}
