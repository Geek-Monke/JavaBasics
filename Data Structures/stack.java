import java.util.Scanner;

public class stack {
    private int[] stk = new int[10];
    private int top = -1;
    void push() {
        Scanner in = new Scanner(System.in);
        if (top == 9) {
            System.out.println("Stack overflow");
        } else {
            System.out.println("Enter the element: ");
            top++;
            stk[top] = in.nextInt();
        }
    }
    void pop() {
        if (top == -1) {
            System.out.println("Stack is underflow");
            return;
        }
        System.out.println("Popped data: " + stk[top]);
        top--;
    }
    void display() {
        if (top == -1) {
            System.out.println("Stack is underflow");
            return;
        }
        System.out.println("Stack elements are:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stk[i]);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        stack ob = new stack();
        int ch;
        while (true) {
            System.out.println("1 for push");
            System.out.println("2 for pop");
            System.out.println("3 for display");
            System.out.println("4 to exit");
            System.out.println("Enter the choice:");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    ob.push();
                    break;
                case 2:
                    ob.pop();
                    break;
                case 3:
                    ob.display();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
