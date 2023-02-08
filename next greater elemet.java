import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
	    int arr[] = {6,8,0,1,3};
	    Stack<Integer> s = new Stack<>();
	    int nextgreater[] = new int[arr.length];
	                                                               //s.peak nai 4 aayaga or arr[s.peak] se no. aajayaga
	    for(int i=arr.length-1; i>=0; i--){                        //s.peak par idx h or arr me jake mujhe uss idx ko search krna hoga
	        while(!s.isEmpty() && arr[s.peek()] <= arr[i]){     //idx push kro ele ko nh s.peek mai 4 or andar 3 for 3
	            s.pop();
	        }
	        
	       //2 ifelse
	       if(s.isEmpty()){     
	           nextgreater[i] = -1;                    
	       } else{                            
	           nextgreater[i] = arr[s.peek()];     //s.peak par idx h mujhe no. store krna h arr[s.peak()]
	       }                       //taki arr ke andar idx pe jake jo bh val h usko nextgreater banade  
	       
	       //push the ele
	       s.push(i);   //idx ko push krdo
	       
	     }
	     for(int i=0;i<nextgreater.length;i++){
	        	System.out.println(nextgreater[i]+" ");
	    }
	    System.out.println();
	}
}

/*from this code many questions can come like
next greater right
next greater left- sirf loop badal do   for(int i=1; i<arr.length; i++)
next smaller right- arr[s.peek()] <= arr[i]) reverse this i.e arr[s.peek()] >= arr[i]) 
next smaller left- reverse the loop + condn i.e for(int i=1; i<arr.length; i++) and arr[s.peek()] >= arr[i] 


