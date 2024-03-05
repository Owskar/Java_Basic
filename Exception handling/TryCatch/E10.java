class sum{
	public void add(int a,int b){
		int s=a+b;
		System.out.println("Addition is "+s);
	}
}

class etest{
	public static void main(String args[]){
		sum s1;
		s1=new sum();
		s1.add(25.5,10);
	}
}