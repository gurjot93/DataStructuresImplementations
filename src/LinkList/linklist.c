#include<stdio.h>
#include<stdlib.h>

struct  node{
    int data;
    struct node *next;
};
struct node *head;

void beginsert()
{
    struct node *ptr, *temp;
    int item;

    ptr=(struct node *) malloc(sizeof(struct node));
    printf("Enter an item to insert at beginning: ");
    scanf("%d",&item);
    ptr->data=item;
    if(ptr==NULL)
    {
        printf("Underflow!\n");
    }
    else
    {
        ptr->next=head;
        head=ptr;
        printf("Item inserted at the beginning.\n");
    }
    

}
void insert()
{
    struct node *ptr, *temp;
    int item;

    ptr= (struct node *) malloc (sizeof(struct node));
    printf("Enter an item to insert at the end: ");
    scanf("%d",&item);
    ptr->data=item;
    if(head==NULL)
    {
        ptr->next = NULL;
        head = ptr;
        printf("Item inserted\n");
    }
    else
    {
        temp=head;
        while(temp->next!=NULL)
        {
            temp=temp->next;
        }
        temp->next=ptr;
        ptr->next=NULL;
        printf("Item inserted\n");
    }
}
void insertAtPosition()
{
    int item,position,count=0,flag=0;
    
    struct node *ptr,*temp,*prev;
    ptr= (struct node *) malloc(sizeof(struct node));
    
    printf("Enter the item to be inserted: ");
    scanf("%d",&item);
    printf("\nEnter the position: ");
    scanf("%d",&position);

    if(ptr==NULL)
    {
        printf("Underflow");
    }
    else{
        ptr->data=item;
        if(position==0)
        {
            ptr->next=head;
            head=ptr;
        }
        else
        {   
            temp = head;
            while(count<position)
            {
                if(temp == NULL)
                {
                    printf("Unable to insert\n");
                    flag=1;
                    break;
                }
                else{
                prev=temp;
                temp=temp->next;
                count=count+1;
                }
            }
            if(flag == 0)
        {   prev->next=ptr;
            ptr->next=temp;
            printf("Item Inserted\n");
        }    
        }
    }


}


void deleteAnElement()
{
    struct node *ptr,*prev,*temp;
    int item;
    ptr = (struct node *) malloc(sizeof(struct node));

    printf("Enter an Item to delete: ");
    scanf("%d",&item);

    if(head==NULL)
    {
        printf("Unable to delete");
    }
    else{
        temp=head;
        if(temp->data==item)
        {
            head=temp->next;
            printf("Item deleted\n");

        }
        else{
        while(temp->data!=item && temp!=NULL)
        {
            prev=temp;
            temp=temp->next;
        }
        if(temp->data==item)
        {
            prev->next=temp->next;
            printf("Item deleted\n");

        }
        }
    }

}

void deleteAtBegin()
{
    struct node *ptr;
    ptr=(struct node *) malloc(sizeof(struct node));
    ptr=head;
    if(head!=NULL)
    {
        head=ptr->next;
        printf("Item deleted from Beginning\n");
    }
    else
    {
        printf("Unable to delete\n");
    }
}

void deleteAtEnd()
{
    struct node *ptr,*temp;
    ptr=(struct node *) malloc(sizeof(struct node));
    ptr=head;
    if(head==NULL)
    {
        printf("unable to delete\n");
    }
    else
    {
        
        while(ptr->next!=NULL)
        {
            temp=ptr;
            ptr=ptr->next;
        }
        temp->next=NULL;
        printf("Last Element Deleted\n");

    }
}

void search()
{
    struct node *ptr;
    int item,count=0;
    ptr=(struct node *) malloc(sizeof(struct node));
    printf("Enter an element to be searched: ");
    scanf("%d",&item);
    if(head==NULL)
    {
        printf("Item not found\n");
    }
    else
    {   
        ptr=head;
        while(ptr->data!=item && ptr->next!=NULL)
        {
            ptr=ptr->next;
            count=count+1;
        }
        if(ptr->data==item)
        {
            printf("Item found at position %d\n",count);
        }
        else
        {
            printf("item not found\n");
        }
    }
}

void display()
{
    struct node *ptr;
    ptr=head;
    if(ptr==NULL)
    {
        printf("Empty LinkedList\n");
    }
    else
    {
        while(ptr != NULL)
        {
            printf("%d -> ",ptr->data);
            ptr=ptr->next;
        }
        printf("\n");
    }
}


int main()
{

 int choice =0;  
    while(choice != 9)   
    {  
        printf("\n\n*********Main Menu*********\n");  
        printf("\nChoose one option from the following list ...\n");  
        printf("\n===============================================\n");  
        printf("\n1.Insert in begining\n2.Insert at last\n3.Insert at any random location\n4.Delete from Beginning\n5.Delete from last\n6.Delete node after specified location\n7.Search for an element\n8.Show\n9.Exit\n");  
        printf("\nEnter your choice?\n");         
        scanf("\n%d",&choice);  
        switch(choice)  
        {  
            case 1:  
            beginsert();      
            break;  
            case 2:  
            insert();         
            break;  
            case 3:  
            insertAtPosition();       
            break;  
            case 4:  
            deleteAtBegin();       
            break;  
            case 5:  
            deleteAtEnd();        
            break;  
            case 6:  
            deleteAnElement();          
            break;  
            case 7:  
            search();         
            break;  
            case 8:  
            display();        
            break;  
            case 9:  
            exit(0);  
            break;  
            default:  
            printf("Please enter valid choice..");  
        }  
    }  
    return 0;

}
