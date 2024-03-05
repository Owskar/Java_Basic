class stest{
	public static void main(String []args){
		dostuff();
		System.out.println("Hiiii");
	}
	public static void dostuff(){
		domorestuff();
		System.out.println("hello");
	}
	public static void domorestuff(){
		System.out.println(10/0);
	}
}