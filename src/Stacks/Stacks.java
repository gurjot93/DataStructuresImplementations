package Stacks;


/*Array implementations for Stacks*/
public class Stacks {

    int top;
    int max =10;
    int[] stack = new int[max];

    Stacks(){
        top=-1;
    }
    void push(int item)
    {
        if(top == max-1)
        {
            System.out.println("Overflow");
        }
        else
        {
            top+=1;
            stack[top]=item;
            System.out.println("Element "+item+" inserted successfully");
        }
    }
    void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            System.out.println("Element "+ stack[top]+ " deleted");
            top = top -1;

        }

    }
    void display()
    {
        System.out.print("Stack is :");
        for(int i = 0 ; i < max ; i++)
        {
            System.out.print(stack[i]+" ");
        }

    }
}
