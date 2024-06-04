import java.util.*;

public class binary {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, mid = 0, target, left, right, k = 0;
        System.out.println("Enter the number of elements:");
        n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        left = 0;
        right = n - 1;
        System.out.println("Enter the target value:");
        target = in.nextInt();

        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                k = 1;
                break;
            }
        }

        if (k == 1) {
            System.out.println("The element is present at position: " + (mid + 1));
        } else {
            System.out.println("The search is unsuccessful. Element not found in the array.");
        }
    }
}
