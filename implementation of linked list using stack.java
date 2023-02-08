import java.util.*;
public class Main
{
    static class Node{  //linke dlist class node
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    static class Stack {
        static Node head = null;
        
        public static boolean isempty() {
                return head == null;    //LL mai ek bh node nh huss case mai ll empty h toh true else false
            }
        
        public static void push(int data){
            Node newNode = new Node(data); 
            if(isempty()){
                head = newNode;
                return;
            }
            
            newNode.next = head;
            head = newNode;
        }
        
        public static int pop(){
            if(isempty()){  //stack kahali h toh -1
                return -1;
            }
            //head ko hata do agle node ko head banado or return krdo
            int top= head.data;
            head = head.next;
            return top;
        }
        
        public static int peek(){
            if(isempty()){  //stack kahali h toh -1
                return -1;
            }
            return head.data;
        }    
    }
    
	public static void main(String[] args) {
	     Stack stack = new Stack();
	     stack.push(1);
	     stack.push(2);
	     stack.push(3);
	     stack.push(4);
	     while(!stack.isempty()){
	         System.out.println(stack.peek());
	         stack.pop();
	     }
	}
}
