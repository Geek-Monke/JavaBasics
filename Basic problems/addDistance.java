import java.util.Scanner;

public class addDistance {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int feet1, inch1, feet2, inch2;

            System.out.println("Enter the feet of distance one: ");
            feet1 = in.nextInt();
            System.out.println("Enter the inch of distance one: ");
            inch1 = in.nextInt();

            System.out.println("Enter the feet of distance two: ");
            feet2 = in.nextInt();
            System.out.println("Enter the inch of distance two: ");
            inch2 = in.nextInt();

            int sumFeet = feet1 + feet2;
            int sumInch = inch1 + inch2;

            if (sumInch >= 11) {
                sumFeet += sumInch / 12;
                sumInch = sumInch % 12;
            }

            System.out.println("The added distance is " + sumFeet + " feet " + sumInch + " inch");
        }
    }
}
