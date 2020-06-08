package stack;

/* 
 * Stack Implementation using Array.
 * Stack class provides basic functionalities provided by stack class such as pop(),
 * push(), printStack(), isEmpty() and length().
 */

public class Stack {
	
	/*
	 * Required variables are created for the class.
	 * top : Keeps the position of the top of the stack.
	 * MAX_CAPACITY : Initialized with a maximum capacity of 1000.
	 * stackArray : Array used to implement stack.
	 */
	public int top;
	public int stackArray[];
	static final int MAX_CAPACITY = 1000;
	
	/*
	 * Basic Constructor of the Class Stack.
	 * Initializes the value of top and capacity of the array used.
	 */
	public Stack() {
		this.top = -1;
		this.stackArray = new int[MAX_CAPACITY];
	}
	
	/*
	 * Adds the element x to the top of the stack.
	 */
	public void push(int x) {
		if(top>=MAX_CAPACITY-1) {
			System.out.println("Stack Overflow");
		}else {
			stackArray[++top]=x;
		}
	}
	
	/*
	 * Removes the element at the top of the tsack.
	 */
	public void pop() {
		if(top<0) {
			System.out.println("Stack is Empty!!!!");
		}else {
			System.out.println("Pop value="+stackArray[top--]);
		}
	}
	
	/*
	 * Returns the length of the stack.
	 */
	public int length() {
		return top+1;
	}
	
	/*
	 * Checks if stack is empty or not and prints the appropriate message.
	 */
	public void isEmpty() {
		if(top<0) {
			System.out.println("Stack is Empty. Please push some elements!!!"); 
		}else {
			System.out.println("Stack has "+(top+1)+" elements in it!!!");
		}
	}
	
	/*
	 * Prints all the elements of the stack into a readable format.
	 */
	public void printStack() {
		System.out.print("[ ");
		for(int i=0;i<=top;i++) {
			System.out.print(stackArray[i]+" ");
		}
		System.out.print("]");
		System.out.println();
	}

}
