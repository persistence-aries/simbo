
import java.util.Stack;

public class simbo_stack {
	Stack<Integer> stack = new Stack();
	Stack<Integer> maxStack = new Stack();
	
	
	
    public void push(int x) {
        if(maxStack.isEmpty() || x >= maxStack.peek()) {
        	maxStack.push(x);
        }
    	stack.push(x);
    }
    
    public void pop() {
        if(stack.peek().equals(maxStack.peek())){
        	maxStack.pop();
        } 
        stack.pop();
    }
    
    
    public int top() {
        return stack.peek();
    }

    public int getMax() {
        return maxStack.peek();
    }
    
    

}

