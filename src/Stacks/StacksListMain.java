package Stacks;

/*Main class for StacksList*/
public class StacksListMain {
    public static void main(String[] args) {
        StackLinkedList stacks = new StackLinkedList();
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        stacks.push(4);
        stacks.push(5);
        stacks.push(6);

        stacks.display();
        stacks.pop();
        stacks.display();
    }
}
