import java.util.*;

class perimeter {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double area;
            System.out.println("Enter the area of the square :- ");
            area = in.nextDouble();
            double side = Math.sqrt(area);
            double peri;
            peri = 4 * side;
            System.out.println("The perimeter is :- " + peri);
        }
    }
}
