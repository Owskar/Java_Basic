//2)write a program for method overloding

class Add{
	private int num1;
	private int num2;
	private int num3;
	
	
	public void setData(int a,int b,int c){
		num1=a;
		num2=b;
		num3=c;
	}
	public void add(int a,int b){
		int c=a+b;
		System.out.println("addition is :"+c);
	}
	
	public void add(int a, int b,int c){
		int d=a+b+c;
		System.out.println("addition is :"+d);
	}
}

class Q2{
	public static void main(String args[]){
		
		Add s=new Add();
		s.setData(4,5,6);
		s.add(4,5);
		s.add(4,5,6);
		
		
		
		
		
	}
}