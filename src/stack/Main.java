package stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack stack = new Stack();
		stack.push(5);
		stack.push(10);
		stack.push(11);
		stack.printStack();
		stack.isEmpty();
		stack.pop();
		stack.printStack();
		System.out.println(stack.length());
		
	}

}
