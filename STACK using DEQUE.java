import java.util.*;

public class Main
{   static class Stack {
        Deque<Integer> dq = new LinkedList<>();
        
        
        public void push(int data){
            dq.addLast(data);
        }
        
        public int pop(){
            return dq.removeLast();
        }
        
        public int peek(){
            return dq.getLast();
        }
    }
	public static void main(String[] args) {
	    Stack s = new Stack();
	    s.push(1);
	    s.push(2);
	    s.push(3);
	    //ye stack ye jcf wala stack nh h ye stack meri ek class ko implement krke use krna wala stack h
	
		System.out.println("peek = "+s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		
	}
}

