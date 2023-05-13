package Java.ApnaCollege.AdvPatterns;
import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        //int n;
        System.out.print("Enter your limit : ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            
            //First part
            for (int i = 1; i <=n; i++) {
                //For stars-Left side
                //For spaces
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=n;j++){
                    System.out.print("*");
                }
            System.out.println();
            }
        }
    }
    
}
