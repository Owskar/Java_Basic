// Overriding

class BaseClass{
	public void Method(){
		System.out.println("I am base class ");
	}
}

class Child extends BaseClass{
	public void Method(){
		System.out.println("I am child class ");
	}
}

class stest{
	public static void main(String args[]){
		Child c1=new Child();
		c1.Method();
		
		
		BaseClass b1=new BaseClass();
		b1.Method();
	}
}