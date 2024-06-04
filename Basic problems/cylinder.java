import java.util.*;

class cylinder {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double r, h;
            double pi = 3.14;
            System.out.println("Enter the value of the radius :- ");
            r = in.nextDouble();
            System.out.println("Enter the height of the cylinder :- ");
            h = in.nextDouble();
            double area = (2 * (pi * r * h)) + 2 * (pi * r * r);
            System.out.println("The area of the cylinder is :- " + area);
        }
    }

}