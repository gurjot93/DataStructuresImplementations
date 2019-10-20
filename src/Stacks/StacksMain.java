package Stacks;

/*Main function for Stacks*/
public class StacksMain {
    public static void main(String[] args) {
        Stacks st = new Stacks();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.display();
        st.pop();
        st.display();
        st.push(9);
        st.display();
    }
}
