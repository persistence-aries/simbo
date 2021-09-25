
import java.util.Stack;

public class simbo_stack {
	Stack<Integer> stack = new Stack();
	Stack<Integer> maxStack = new Stack();
	
	
	
    public void push(int x) {
        if(maxStack.isEmpty() || x >= maxStack.pop()) {
        	maxStack.push(x);
        }
    	stack.push(x);
    }
    
    public void pop() {
        if(stack.pop().equals(maxStack.pop())){
        	maxStack.pop();
        } 
        stack.pop();
    }
    
    
    public int top() {
        return stack.pop();
    }

    public int getMax() {
        return maxStack.pop();
    }
    
    

}

