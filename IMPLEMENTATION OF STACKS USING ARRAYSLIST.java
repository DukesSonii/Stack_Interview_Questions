import java.util.*;
public class Main
{
    
        static class Stack {
            static ArrayList<Integer> list = new ArrayList<> ();
            public static boolean isempty() {
                return list.size() == 0;    //aagar ek bh element nh h toh true warna false
            } 
            
            //push
            public static void push(int data){
                list.add(data);
            }
            
            //pop
            public static int pop(){
			if(isempty()){
				return -1;
				}
                int top = list.get(list.size() - 1);    //top ele ko nikala
                list.remove(list.size() - 1);
                return top;
            }
            public static int peek(){
				if(isempty()){
				return -1;
				}
                return list.get(list.size() - 1);    //top ele ko return kr dia
                
            }
    }
    
	public static void main(String[] args) {
	     Stack stack = new Stack();
	     stack.push(1);
	     stack.push(2);
	     stack.push(3);
	     
	     while(!stack.isempty()){
	         System.out.println(stack.peek());
	         stack.pop();
	     }
	}
}
