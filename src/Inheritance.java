class A{
	
	/*
	 * A() { System.out.println("In A"); }
	 */
	
	public  void print()
	{
		System.out.println("In A print method");
	}
}

class B extends A{
	/*
	 * B(){ System.out.println("In B"); }
	 */
	
	public  void print()
	{
		super.print();
		System.out.println("In B print method");
	}
}




public class Inheritance {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		A a=new A();
		B b=new B();
		
		a.print();
		b.print();
		
	}

}
