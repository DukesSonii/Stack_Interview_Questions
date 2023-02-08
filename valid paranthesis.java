import java.util.*;
public class Main
{
    public static boolean isvalid(String str){
        Stack<Character> s = new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            //opening condn
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            } else {
                //closing
                //iss case mai opening nh aaya sidha closing aagya toh stack wil be empty
                if(s.isEmpty()){
                return false;
                }
                //condn of pair formed
                if( (s.peek() == '(' && ch == ')') 
                || (s.peek() == '{' && ch == '}') 
                || (s.peek() == '[' && ch == ']') ) {
                    s.pop();
                } else {
                    return false;   //successful pair form nh hua toh 
                }
            }
        }
        
        if(s.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
	public static void main(String[] args) {
	    String str = "({})[]";
		System.out.println(isvalid(str));
	}
}

