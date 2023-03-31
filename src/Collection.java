import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).equals("Ravi"))
				list.remove(i);
			System.out.println("Before = "+i);
			System.out.println(list.get(i));
			System.out.println("After = "+i);
		}
		for(int i=0;i<list.size();i++)
		{
			//System.out.println(list.get(i));
		}
	}

}
