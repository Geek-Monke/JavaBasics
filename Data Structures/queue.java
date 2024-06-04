import java.util.*;

public class queue {
    private int ch;
    private int q[] = new int[10];
    private int rear = -1;
    private int front = -1;

    void insert_queue() {
        Scanner in = new Scanner(System.in);
        if (rear == 9) {
            System.out.println("Queue is overflow");
        } else {
            System.out.println("Input the element :- ");
            ch = in.nextInt();
            rear++;
            q[rear] = ch;
        }
    }

    void delete_queue() {
        if (front == rear) {
            System.out.println("Queue is underflow");
        } else {
            front++;
            ch = q[front];
            System.out.println("Element deleted :- " + ch);
        }
    }

    void display_queue() {
        int i;
        if (front == rear) {
            System.out.println("Queue is underflow");
        } else {
            for (i = front + 1; i <= rear; i++)
                System.out.println(q[i]);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        queue ob = new queue();
        int choice;
        while (true) {
            System.out.println("1 for insert queue");
            System.out.println("2 for delete queue");
            System.out.println("3 for display queue");
            System.out.println("4 for exit queue");
            System.out.println("Enter the choice");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    ob.insert_queue();
                    break;
                case 2:
                    ob.delete_queue();
                    break;
                case 3:
                    ob.display_queue();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}