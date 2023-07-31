import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(4);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        st.push(3);
        st.push(2);
        System.out.println(st.pop());
    }
}
