import java.util.*;
public class Main
{
    public static void stockspan(int stocks[], int span[] ){
        Stack<Integer> s = new Stack<>();
        span[0]= 1;
        s.push(0);
        
        for(int i =1; i<stocks.length; i++){
            int currprices = stocks[i]; //aaj ka price
            
            //abh currprices ko comp kro stock ke baaki prices se
            while(!s.isEmpty() && currprices > stocks[s.peek()]){    //stack khali nh hota or sath mai curr price baaki wale prices se bada h
            //s.peak se pehle mene idx nikala uske bad stocks mai dalkar idx par stored val ko hamne excess kr lia
            
            s.pop();
            }
            
            if(s.isEmpty()){
                span[i]=i+1;
            } else {
                int prevhigh = s.peek(); 
                span[i] = i-prevhigh;
            }
            s.push(i);
        }
    }
	public static void main(String[] args) {
	    int stocks [] = {100,80,60,70,60,85,100};
	    int span[] = new int[stocks.length];
	    stockspan(stocks, span);
	    for(int i=0;i<span.length;i++){
	        	System.out.println(span[i]+" ");
	    }
	}
}

