import java.util.*;

class palin {
    private String a;
    private String revst = "";
    private int l;

    void input() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the String :- ");
            a = in.nextLine();
        }
        l = a.length();
    }

    void check() {
        int i;
        for (i = l - 1; i >= 0; i--) {
            revst = revst + a.charAt(i);
        }
        if (a.equals(revst)) {
            System.out.println("The string is palindrome"); // Fix the typo here
        } else {
            System.out.println("The string is not palindrome"); // Fix the typo here
        }
    }
}

class palindrome {
    public static void main(String[] args) {
        palin ob = new palin();
        ob.input();
        ob.check();
    }
}
