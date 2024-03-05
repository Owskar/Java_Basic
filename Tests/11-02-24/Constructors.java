//7) write a program for paramiterized constructor create 2 obj

class Constructors{
	private int a;
	private int b;
	private String c;
	
	
	public void Constructors(int a,int b){
		System.out.println(a+"is first number ");
		System.out.println(b+"is second number ");
	}
	public void Constructors(int a,String b){
		System.out.println(a+"is first number ");
		System.out.println(b+"is String ");
	}
	
	
}

class con{
	Constructors c1;
	c1=new Constructors();
	c1.Constructors(4,5);
	
	Constructors c2;
	c2= new Constructors();
	
	c2.Constructors(1,"owskar");
}