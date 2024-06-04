import java.util.*;

class simp {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double p, r, t;
            float i;
            System.out.println("Enter the Principal :- ");
            p = in.nextDouble();
            System.out.println("Enter the rate :- ");
            r = in.nextDouble();
            System.out.println("Enter the Time in months :- ");
            t = in.nextDouble();
            double year;
            year = t / 12;
            i = (p * r * year) / 100.00;
        }
        System.out.println("The simple interest is :- " + i);

    }
}