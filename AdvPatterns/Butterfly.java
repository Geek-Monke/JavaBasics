package Java.ApnaCollege.AdvPatterns;

public class Butterfly {
    public static void main(String[] args) {
        int n=4;
        
        //First part
        for (int i = 1; i <=n; i++) {
            //For stars-Left side
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
        
            //For spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //For stars-Roght side
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Second part
        for (int i = n; i >=1; i--) {
            //For stars
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
        
            //For spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //For stars
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
