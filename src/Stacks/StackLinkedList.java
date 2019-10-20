package Stacks;

import static java.lang.System.exit;

/*Linked List implementation for stacks */
public class StackLinkedList {

    class Node
    {
        int data;
        Node next; //this means reference
    }

    Node top;   //global top variable
    StackLinkedList(){
        top = null;
    }
    void push(int item)
    {
        Node node = new Node();
        if(node == null)
        {
            System.out.println("overfull");
        }
        else
            {
            node.data=item;
            node.next=top;
            top=node;

        }
    }
    void pop()
    {
        if(top == null)
        {
            System.out.println("empty");
        }
        else
        {
            top=top.next;
            System.out.println("Item popped");
        }
    }
    void display()
    {
        if(top == null)
        {
            System.out.println("empty");


        }
        else
        {
            Node temp = top;
            while(temp!=null)
            {
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
        }

    }
}

