package Java.ApnaCollege.Functions;
import java.util.Scanner;

public class Product {
    public static int product(int a, int b){
        int prdct = a*b;
        return prdct;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int prdct = product(a, b);
            System.out.println("Product of two number is : "+prdct);
        }
    }   
}