import java.util.*;
public class Main
{
    public static boolean isduplicate(String str){
        Stack<Character> s = new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
        
        //closing
            if(ch == ')'){
                int cnt = 0;
                while(s.peek() != '(') {
                    s.pop();
                    cnt++;
                }
                if(cnt<1){
                    return true;    //duplicate exists
                } else {
                    s.pop();    //opening pair
                } 
            }
            else{
                s.push(ch);      //opening pair, operator, operands 
            }
        }
         return false;       //duplicate dont exists
    }
	public static void main(String[] args) {
	    String str = "((a+b))"; //true
	    String str2 = "(a-b)";   //false
		System.out.println(isduplicate(str));
		System.out.println(isduplicate(str2));
	}
}


