
public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int k =
		System.out.println(printNum(10));

	}

	public static int printNum(int n) {
		// TODO Auto-generated method stub
		System.out.println(n);
		
		if(n==1)
			return 1;
		else
		{
			//System.out.println(printNum(n-1)+n);
			
		    return printNum(n-1)+n;
		}
		
	}

	

}
