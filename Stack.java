/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

class Stack {
    
    public int arr[];
    //top points to the point where elements are inserted
    public int top;
    public int size;
    
    //create the stack with capacity given by user
    Stack(int capacity){
        arr = new int[capacity];
        top = -1;
        size = capacity;
        
    }
    
    //inserts or pushes element to top of the stack
    public void push(int x){
        //check if stack is full: 
        if (isFull()){
            System.out.println("Stack is full, can not insert...");
            //exit the code
            System.exit(1);
        }
        arr[++top] = x;
        System.out.print("Stack after inserting " + x + " :");
        displayStack();
    }
    
    //pops the topmost element out of the stack
    public int pop(){
        //check if stack is empty:
        if (isEmpty()){
            System.out.println("Stack is empty, can not pop...");
            return -1;
        }
        else{
            int poppedElement = arr[top--];
            System.out.print("Stack after popping: ");
            displayStack();
            return poppedElement;
        }
    }
    
    //checks if stack is full
    public boolean isFull(){
        return (top+1 == size);
    }
    
    //checks if stack is empty
    public boolean isEmpty(){
        return (top == -1);
    }
    
    //displays the current elements present in the stack
    public void displayStack(){
        for (int i =0; i<=top; i++){
            System.out.print(arr[i]);
            System.out.print("  ");
        }
        System.out.println();
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//create an object of stack class, with size as a parameter
		Stack stack = new Stack(3);
		

		stack.push(0);
        stack.push(1);
        stack.push(2);
        
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
	}
}
