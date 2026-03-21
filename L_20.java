import java.util.Stack;

public class L_20 {
    public static void main(String[] args) {
        String s = "{([])}";
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '{' || c == '(' || c == '[') {
                st.push(c);
            } 
            else {
                if (st.isEmpty()) {
                    System.out.println("Invalid");
                    return;
                }

                char top = st.pop();

                if ((c == '}' && top != '{') ||
                    (c == ')' && top != '(') ||
                    (c == ']' && top != '[')) {
                    System.out.println("Invalid");
                    return;
                }
            }
        }

        if (st.isEmpty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
