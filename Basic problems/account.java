import java.util.*;

class banking {
    private int ch, total, d, w;

    void input() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the amount :- ");
            total = in.nextInt();
        }
    }

    void check() {
        try (Scanner in = new Scanner(System.in)) {
            ch = 0; // Initialize ch to enter the loop
            while (ch < 4) {
                System.out.println("Enter 1 for deposit");
                System.out.println("Enter 2 for withdraw");
                System.out.println("Enter 3 for current balance");
                System.out.println("Enter 4 to exit");
                System.out.println("Enter your choice");
                ch = in.nextInt();

                switch (ch) {
                    case 1:
                        System.out.println("Enter the amount you will deposit");
                        d = in.nextInt();
                        total += d;
                        System.out.println("The updated amount is :- " + total);
                        break;
                    case 2:
                        System.out.println("Enter the amount you will withdraw");
                        w = in.nextInt();
                        total -= w;
                        System.out.println("The updated amount is :- " + total);
                        break;
                    case 3:
                        System.out.println("The current balance of the account :- " + total);
                        break;
                    case 4:
                        System.out.println("Exiting the program.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                        break;
                }
            }
        }
    }
}

class account {
    public static void main(String args[]) {
        banking ob = new banking();
        ob.input();
        ob.check();
    }
}