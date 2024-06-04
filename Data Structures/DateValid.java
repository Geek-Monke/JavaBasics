import java.util.*;

public class DateValid {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int d, m, y;
        System.out.println("Enter the Date");
        d = in.nextInt();
        System.out.println("Enter the Month");
        m = in.nextInt();
        System.out.println("Enter the Year");
        y = in.nextInt();
        System.out.println("The date entered by you is :- " + d + "/" + m + "/" + y);

        if ((d < 1 || d > 31) || (m < 1 || m > 12)) {
            System.out.println("Date provided is invalid");
        } else {
            System.out.println("The date is valid");
        }
        if ((d >= 1 || d <= 31) && (m >= 1 || m <= 12)) {
            int newd = d + 1;
            System.out.println("The new date is :- " + newd + "/" + m + "/" + y);
        } else {
            System.out.println("Restart the code");
        }
    }

}
