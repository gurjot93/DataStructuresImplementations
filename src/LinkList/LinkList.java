package LinkList;

import sun.awt.image.ImageWatched;

import java.util.List;

//https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/
public class LinkList {

    Node head; //head for list

    class Node
    {
        int data;
        Node next;

        Node(int item)
        {
            data = item; //creating a node for every item
            next=null;
        }
    }
    /* Function to insert in linklist*/
    LinkList insert(LinkList list, int item)
    {
        Node new_node = new Node(item);
        new_node.next=null;

        if(list.head == null)
        {
            list.head=new_node;    //assigning first element in the list

        }
        else
        {
            Node last = list.head;
            while (last.next != null)
            {
                last=last.next;  //traversing to the last node
            }
            last.next = new_node;


        }
        System.out.println(item+" inserted successfully");
        return list;

    }

    LinkList beginingInsert(LinkList list, int data)
    {
        Node new_node = new Node(data);

        if(list.head == null)
        {
            list.head = new_node;
        }
        else
        {
            new_node.next=head;
            head=new_node;
        }
        System.out.println(data+" inserted at the beginning");
        return list;
    }

    LinkList insertAtPosition(LinkList list, int data, int position)
    {
        Node newNode = new Node(data);
        int count=0;
        Node prev = null;
        Node temp = list.head;

        if(position==0)
        {
            newNode.next=list.head;
            head=newNode;
            System.out.println(data+" inserted successfully at position "+position);
        }
        else{


        while(temp!=null && count<position)
        {
            prev = temp;
            temp=temp.next;
            count++;
        }
        if(count == position)
        {
            prev.next=newNode;
            newNode.next=temp;
            System.out.println(data+" inserted successfully at position "+position);
        }
        else
        {
            System.out.println("Data not inserted");
        }
        }
        return list;
    }

    LinkList delete(LinkList list, int item)
    {
        Node node = list.head;
        Node prev = null;
        if(node.data == item)
        {
            list.head=node.next;
            System.out.println(item+" deleted");

        }
        else
        {

            while (node!=null && node.data!=item)
            {
                prev=node;
                node=node.next;
            }
            if(node!=null)
            {
                prev.next=node.next;
                System.out.println(item+" deleted");
            }
            else
            {
                System.out.println("item not found");
            }
        }
        return list;
    }

    //to delete a specific position
    LinkList deleteAtPosition(LinkList list, int position)
    {
        Node node = list.head;
        Node prev = null;
        int count=0;
        if(position == 0 && node !=null)
        {
            System.out.println("Element"+node.data+" at position "+position+" removed.");
            //head to be removed
            list.head = node.next;

        }
        else
        {
            while(node.next!=null & count<position)
            {
                prev=node;
                node=node.next;
                count++;
            }
            if(count==position)
            {
                System.out.println("Element"+node.data+" at position "+position+" removed.");
                prev.next=node.next;
            }
            else
            {
                System.out.println("Element at position "+position+" not found.");
            }
        }
        return list;
    }

    LinkList deleteAtBegin(LinkList list)
    {
        Node node = list.head;
        if(list.head!=null)
        {
            System.out.println(node.data+" deleted from the beginning");
            list.head=node.next;

        }
        else
        {
            System.out.println("empty list");
        }
        return list;
    }

    LinkList deleteAtEnd(LinkList list)
    {
        Node temp = list.head;
        Node prev = null;
        if(list.head==null)
        {
            System.out.println("empty list");
        }
        else
        {
            while(temp.next!=null)
            {
                prev = temp;
                temp=temp.next;
            }

                System.out.println(temp.data+" deleted from the end");
                prev.next=null;

        }
        return list;
    }

    void search(LinkList list, int item)
    {
        Node node = list.head;
        int count =0;
        boolean flag =false;
        if(list.head == null)
        {
            System.out.println("List is empty");
        }
        else
        {
            while(node.next != null)
            {
                if(node.data == item)
                {
                    flag=true;
                    System.out.println(node.data+" found at position "+count);
                    break;
                }
                count++;
                node=node.next;
            }
        }
        if(flag == false)
        {
            System.out.println("Item not found");
        }
    }
    void print(LinkList list)
    {
        Node currentNode = list.head;
        while (currentNode != null)
        {
            System.out.print(currentNode.data+" -> ");
            currentNode=currentNode.next;
        }
    }


}
