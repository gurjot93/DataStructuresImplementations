package LinkList;

import java.util.Scanner;

import static java.lang.System.exit;

/*
* Single Link List Implementation
* */
public class LinkedListMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice =0;
        int item, position;
        LinkList list = new LinkList();
        while(choice != 9)
        {
            System.out.println("\n\n*********Main Menu*********\n");
            System.out.println("Choose one option from the following list ...\n");
            System.out.println("===============================================");
            System.out.println("\n1.Insert in begining\n2.Insert at last\n3.Insert at any random location\n4.Delete from Beginning\n5.Delete from last\n6.Delete node after specified location\n7.Search for an element\n8.Show\n9.Exit");
            System.out.println("Enter your choice?\n");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter the element to be inserted");
                    item=sc.nextInt();
                    list.beginingInsert(list,item);
                    break;
                case 2:
                    System.out.println("Enter the element to be inserted");
                    item=sc.nextInt();
                    list.insert(list,item);
                    break;
                case 3:
                    System.out.println("Enter the element to be inserted");
                    item=sc.nextInt();
                    System.out.println("Enter the position");
                    position = sc.nextInt();
                    list.insertAtPosition(list,item,position);
                    break;
                case 4:
                    list.deleteAtBegin(list);
                    break;
                case 5:
                    list.deleteAtEnd(list);
                    break;
                case 6:
                    System.out.println("Enter the item to be deleted");
                    item = sc.nextInt();
                    list.delete(list,item);
                    break;
                case 7:
                    System.out.println("Enter the element to be searched");
                    item=sc.nextInt();
                    list.search(list,item);
                    break;
                case 8:
                    list.print(list);
                    break;
                case 9:
                    exit(0);
                    break;
                default:
                    System.out.println("Please enter valid choice..");
            }
        }


    }
}
