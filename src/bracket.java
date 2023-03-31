import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class bracket {
	public static void  ispar(String x)
    {
        // Your code here
        
		
		Stack<Character> s = new Stack();
		LinkedList<String> s1 = new LinkedList();
		ArrayList<String> s2 = new ArrayList();
		s1.add("lalit0");
		s1.add("lalit1");
		s1.add("lalit2");
		s1.add("lalit3");
		s1.add("lalit4");
		s1.remove();
	
		//s1.remove(3);
      for(String str : s1)
    	  System.out.println(str);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ispar("[{}]{}{}()");

	}

}
