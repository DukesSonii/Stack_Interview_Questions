
import java.util.*;
public class Main
{
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        
        //pehle ele ko remove kia
        int top = s.pop();
        pushAtBottom(s,data);
        
        //stack se jo ele nikala woh wapis push kar denge
        s.push(top);
        
    }
    
    public static void reversestack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reversestack(s);
        pushAtBottom(s,top);
    }
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        
    }
	public static void main(String[] args) {
	    Stack<Integer> s = new Stack<>();
	    s.push(1);
	    s.push(2);
	    s.push(3);
	    //3,2,1
	    reversestack(s);
		printStack(s);
		//1,2,3
	}
}


