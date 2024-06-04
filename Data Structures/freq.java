import java.util.*;

public class freq {
    public static void main(String[] args) {
        String st, st1 = "", st2 = "";
        int i, p, f = 0;
        char ch;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Sentence :- ");
        st = in.nextLine();
        System.out.println("Enter the word to be found :- ");
        st1 = in.nextLine();
        st = st + ' ';
        p = st.length();
        for (i = 0; i < p; i++) {
            ch = st.charAt(i);
            if (ch == ' ') {
                if (st2.equals(st1))
                    f = f + 1;
                st2 = "";
            } else
                st2 = st2 + ch;
        }
        System.out.println("Occurrence of the searched word is :- " + f);
    }
}
