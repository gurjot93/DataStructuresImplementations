package Stacks;

import java.util.Stack;

/*This will implement java inbuilt stacks*/
public class JavaStack {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(2);
        st.push(3);
        System.out.println(st);
        st.pop();
        System.out.println(st);

    }
}
