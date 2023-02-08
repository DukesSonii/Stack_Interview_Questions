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
	public static void main(String[] args) {
	   Stack<Integer> s = new Stack<>(); 
	   s.push(1);
	   s.push(2);
	   s.push(3);
	     
	   pushAtBottom(s,4);
	    while(!s.isEmpty()){      //jab tak stack khatam nh ho jata
	        System.out.println(s.pop());
	    }
	}
}


