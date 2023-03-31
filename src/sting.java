
public class sting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="lalit";
		str.concat("bokde");
		String str2="lalit";
		
		System.out.println(str);
		System.out.println(str2);
		StringBuilder string = new StringBuilder(str);
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)=='l')
				string.setCharAt(i, 'a');
		}
		String str1=new String("using Class");
		str1=str1+"  dsafa";
		System.out.println(string);
		

	}

}
