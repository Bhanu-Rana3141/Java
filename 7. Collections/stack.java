import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println("st: " + st);
        System.out.println("top : " + st.peek());

        System.out.println("popped ele: " + st.pop());

        System.out.println("st: " + st);
        System.out.println("top : " + st.peek());
    }
}
